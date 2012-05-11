grammar nopC;

options {
    backtrack=true;
    memoize=true;
    k=2;
}

@header {
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeMap;
import src.*;
}

@members {
    TreeMap<String, FunctionDefinition> functionTable = new TreeMap<String, FunctionDefinition>();
    HashMap<String, String> varTable = new HashMap<String, String>();

		GenericStatement hackStore1;
}

cFile returns [GenericStatement ret]
@init{
HashMap<String, String> scope = new HashMap<String, String>();
GenericStatement cFile = new GenericStatement(scope, functionTable, varTable);
}
	: 
	globalFunctionOrStatement[cFile]+{$ret = $globalFunctionOrStatement.ret;}
	;


// Parent wird nur weitergeschoben, weil das nur ne art Weiche ist. 
globalFunctionOrStatement [GenericStatement parent] returns [GenericStatement ret]
	:
	(typeSpecifier NAME ('=' | ';' | ',')) => globalVariableDeclaration[parent] {$ret = $globalVariableDeclaration.ret;}
	| (typeSpecifier NAME  '(') => functionDefinition[parent]
	;

globalVariableDeclaration [GenericStatement parent] returns [GenericStatement ret]
	:
	// hier wird noch das cFile als parent weitergereicht
	typeSpecifier globalVariableDeclarationList[parent] ';' {System.out.println($globalVariableDeclaration.text);}
	;
	
// Sollte matchen: 
// foo= 1;
// foo, bar = 1, baz = 2;
// foo; 
// foo, bar;
globalVariableDeclarationList[GenericStatement parent] returns [GenericStatement ret]
	:
	(n1 = NAME('=' w1 = WERT)?){parent.addVarToScope($n1.text, $w1.text);} (',' (n2 = NAME('=' w2 = WERT)?){parent.addVarToScope($n2.text, $w2.text);})*   
	;

variableDeclaration[GenericStatement parent] returns [GenericStatement ret]
	:
	typeSpecifier variableDeclarationList[parent] ';' {System.out.println($variableDeclaration.text);}
	;
	
variableDeclarationList[GenericStatement parent] returns [GenericStatement ret]
	:	
	// scope bekommt erstmal nur den text und null, weil das ergebniss zur laufzeit erzeugt wird und wir nur mal platz brauchen
	(n1 = NAME ('=' expression[parent])?){parent.addVarToScope($n1.text, null);} (',' (n2 = NAME ('=' expression[parent])?){parent.addVarToScope($n2.text, null);})*   
	;


functionDefinition[GenericStatement parent] returns [GenericStatement ret]
@init{
FunctionDefinition functionDefinition = new FunctionDefinition(parent.getScope(), functionTable, varTable);
}
	:
		typeSpecifier NAME '(' parameterList[functionDefinition] ')' '{' statement[functionDefinition]* '}' {System.out.println($functionDefinition.text); functionDefinition.addFun($NAME.text);}
	;
	

parameterList[FunctionDefinition parent]
	: 
		(typeSpecifier (n1 = NAME){parent.addParam($n1.text);} (',' typeSpecifier (n2 = NAME){parent.addParam($n2.text);} )*)?
	;

codeBlock [GenericStatement parent]
	:
	'{'statement[parent]*'}'
	| statement[parent]
	
	;
	
statement[GenericStatement parent]
@init {
	hackStore1 = parent; // We cannot pass parent to functionCall or assignment directly, as there is a synpred rule involved during backtracking which does not take parameters. Therefore we store it in a global variable to access the variable through this later
}
	:
		  ( functionCall[null] ';')
		 	( assignment[null] ';'	)
		| variableDeclaration[parent]
		| selection_statement[parent]
	  | iteration_statement[parent]
	  | jump_statement[parent]
	  | expression_statement[parent]
	;
	
	
selection_statement [GenericStatement parent]
@init{
ScopedStatement selection_statement_if = new ScopedStatement(parent.getScope(), functionTable, varTable);
ScopedStatement selection_statement_else = new ScopedStatement(parent.getScope(), functionTable, varTable);
}
	: 'if' '(' expression[parent] ')' codeBlock[selection_statement_if] (options {k=1; backtrack=false;}:'else' codeBlock[selection_statement_else])?
	;

iteration_statement [GenericStatement parent]
@init{
ScopedStatement iteration_statement = new ScopedStatement(parent.getScope(), functionTable, varTable);
}
	: 'while' '(' expression[parent] ')' codeBlock[iteration_statement]
	| 'for' '(' expression_statement[parent] expression_statement[parent] expression[parent]? ')' codeBlock[iteration_statement]
	;
	
expression_statement [GenericStatement parent]
	: ';'
	| expression[parent] ';'
	;

jump_statement [GenericStatement parent]
	: 'goto' NAME ';'
	| 'continue' ';'
	| 'break' ';'
	| 'return' ';'
	| 'return' expression[parent] ';'
	;

functionCall [GenericStatement parent]
@init {
	GenericStatement p = parent; 
	
	if (p == null) {
		 p = hackStore1;
	}
	
	FunctionDefinition fun = null;
}
	: 
	NAME '(' {fun = functionTable.get($NAME.text); System.out.println(functionTable.get($NAME.text).getLabel());} variableList[p, fun] ')' 
	;
	
variableList[GenericStatement parent, FunctionDefinition fun]
	:
		NAME? (',' NAME)*
	;

assignment[GenericStatement parent]
@init {
	GenericStatement p = parent; 
	
	if (p == null) {
		 p = hackStore1;
	}
}
	:
		NAME assignmentOperator expression[p]
	;



assignmentOperator
	: '='
	| '*='
	| '/='
	| '%='
	| '+='
	| '-='
	| '<<='
	| '>>='
	| '&='
	| '^='
	| '|='
	;

	expression[GenericStatement parent]
		: logical_or_expression[parent] ('?' expression[parent] ':' expression[parent])?
		;

	logical_or_expression[GenericStatement parent]
		: logical_and_expression[parent] ('||' logical_and_expression[parent])*
		;

	logical_and_expression[GenericStatement parent]
		: inclusive_or_expression[parent] ('&&' inclusive_or_expression[parent])*
		;

	inclusive_or_expression[GenericStatement parent]
		: exclusive_or_expression[parent] ('|' exclusive_or_expression[parent])*
		;

	exclusive_or_expression[GenericStatement parent]
		: and_expression[parent] ('^' and_expression[parent])*
		;

	and_expression[GenericStatement parent]
		: equality_expression[parent] ('&' equality_expression[parent])*
		;
	equality_expression[GenericStatement parent]
		: relational_expression[parent] (('=='|'!=') relational_expression[parent])*
		;

	relational_expression[GenericStatement parent]
		: shift_expression[parent] (('<'|'>'|'<='|'>=') shift_expression[parent])*
		;

	shift_expression[GenericStatement parent]
		: additive_expression[parent] (('<<'|'>>') additive_expression[parent])*
		;
		
	additive_expression[GenericStatement parent]
		: (multiplicative_expression[parent]) ('+' multiplicative_expression[parent] | '-' multiplicative_expression[parent])*
		;

	multiplicative_expression[GenericStatement parent]
		: (unary_expression[parent]) ('*' unary_expression[parent] | '/' unary_expression[parent] | '%' unary_expression[parent])*
		;

unary_expression[GenericStatement parent]
	: postfix_expression[parent]
	| '++' unary_expression[parent]
	| '--' unary_expression[parent]
	;

postfix_expression[GenericStatement parent]
	:   primary_expression[parent]
        ( '++'
        | '--'
        )*
	;

primary_expression[GenericStatement parent]
	: NAME
	| '(' expression[parent] ')' // TODO: backpatch parent
	| functionCall[parent]
	| WERT
	;
			
	
	
WERT
	: 
		'0'..'9'+ 
	;
	
NAME
	:	
	LETTER (LETTER|'0'..'9')*
	;

fragment
LETTER
	:	'$'
	|	'A'..'Z'
	|	'a'..'z'
	|	'_'
	;

	
// Joa, kann nur ints
typeSpecifier 
	: 
		'int'
		| 'void'
		| 'bool'
	;
	
	
WS:(' '|'\t'|'\n'|'\r'){skip();};

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
	

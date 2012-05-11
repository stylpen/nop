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
    TreeMap<String, String> functionTable = new TreeMap<String, String>();
    HashMap<String, String> varTable = new HashMap<String, String>();
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
	(n1 = NAME ('=' expression)?){parent.addVarToScope($n1.text, null);} (',' (n2 = NAME ('=' expression)?){parent.addVarToScope($n2.text, null);})*   
	;


functionDefinition[GenericStatement parent] returns [GenericStatement ret]
@init{
ScopedStatement functionDefinition = new ScopedStatement(parent.getScope(), functionTable, varTable);
}
	:
		typeSpecifier NAME '(' parameterList[functionDefinition] ')' '{' statement[functionDefinition]* '}' {System.out.println($functionDefinition.text); functionDefinition.addFun($NAME.text);}
	;
	

parameterList[GenericStatement parent]
	: 
		(typeSpecifier (n1 = NAME){parent.addVarToScope($n1.text, null);} (',' typeSpecifier (n2 = NAME){parent.addVarToScope($n2.text, null);} )*)?
	;

codeBlock
	:
	'{'statement[null]*'}'
	| statement[null]
	
	;
	
statement[GenericStatement parent]
	:
		  (functionCall ';')
		| ( assignment ';'	)
		| variableDeclaration[parent]
		| selection_statement
	  | iteration_statement
	  | jump_statement
	  | expression_statement
	;
	
	
selection_statement
	: 'if' '(' expression ')' codeBlock (options {k=1; backtrack=false;}:'else' codeBlock)?
	;

iteration_statement
	: 'while' '(' expression ')' codeBlock
	| 'for' '(' expression_statement expression_statement expression? ')' codeBlock
	;
	
expression_statement
	: ';'
	| expression ';'
	;

jump_statement
	: 'goto' NAME ';'
	| 'continue' ';'
	| 'break' ';'
	| 'return' ';'
	| 'return' expression ';'
	;

functionCall
	: 
	NAME '(' variableList ')' 
		{
			System.out.println("In functionTable gefunden " + functionTable.get($NAME.text)); 
		}
	;
	
variableList
	:
		NAME? (',' NAME)*
	;

assignment 
	:
		NAME assignmentOperator expression
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

	expression
		: logical_or_expression ('?' expression ':' expression)?
		;

	logical_or_expression
		: logical_and_expression ('||' logical_and_expression)*
		;

	logical_and_expression
		: inclusive_or_expression ('&&' inclusive_or_expression)*
		;

	inclusive_or_expression
		: exclusive_or_expression ('|' exclusive_or_expression)*
		;

	exclusive_or_expression
		: and_expression ('^' and_expression)*
		;

	and_expression
		: equality_expression ('&' equality_expression)*
		;
	equality_expression
		: relational_expression (('=='|'!=') relational_expression)*
		;

	relational_expression
		: shift_expression (('<'|'>'|'<='|'>=') shift_expression)*
		;

	shift_expression
		: additive_expression (('<<'|'>>') additive_expression)*
		;
		
	additive_expression
		: (multiplicative_expression) ('+' multiplicative_expression | '-' multiplicative_expression)*
		;

	multiplicative_expression
		: (unary_expression) ('*' unary_expression | '/' unary_expression | '%' unary_expression)*
		;

unary_expression
	: postfix_expression
	| '++' unary_expression
	| '--' unary_expression
	;

postfix_expression
	:   primary_expression
        (   '[' expression ']' //werden wir nie brauchen
        |   '++'
        |   '--'
        )*
	;

primary_expression
	: NAME
//	| constant
	| '(' expression ')'
	| functionCall
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
	

grammar nopC;

options {
    backtrack=true;
    memoize=true;
    k=2;
}

@header {
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.HashSet;
}

@members
{
	TreeMap<String, String> functionTable = new TreeMap<String, String>();
	HashSet<String> varTable = new HashSet<String>();
}

//scope Symbols {
//	Set types;
//}

// TODO: 
//	logicalExpression



cFile
//	scope Symbols; // entire file is a scope
//	@init {
// 	$Symbols::types = new HashSet();
//	}
	: 
	globalFunctionOrStatement +
	;

globalFunctionOrStatement
	:
	(typeSpecifier NAME ('=' | ';' | ',')) => globalVariableDeclaration 
	| (typeSpecifier NAME  '(') => functionDefinition
	;

globalVariableDeclaration 
	:
	typeSpecifier globalVariableDeclarationList ';' {System.out.println($globalVariableDeclaration.text);}
	;
	
// Sollte matchen: 
// foo= 1;
// foo, bar = 1, baz = 2;
// foo; 
// foo, bar;
globalVariableDeclarationList
	:
	NAME ('=' WERT)? (',' NAME ('=' WERT)?)*   
	;


variableDeclaration 
	:
	typeSpecifier variableDeclarationList ';' {System.out.println($variableDeclaration.text);}
	;
	
variableDeclarationList
	:
	NAME ('=' expression)? (',' NAME ('=' expression)?)*   
	;


functionDefinition
	:
		typeSpecifier NAME '(' parameterList ')' '{' statement* '}' {System.out.println($functionDefinition.text); functionTable.put($NAME.text, "istDa");}
	;
	

parameterList 
	: 
		(typeSpecifier NAME (',' typeSpecifier NAME)*)?
	;

codeBlock
	:
	'{'statement*'}'
	| statement
	
	;
	
statement
	:
		  (functionCall ';')
		| ( assignment ';'	)
		| variableDeclaration
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
	

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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
}


// REGISTER USAGE
// X - RETURN VALUES
// Y - SECOND OPERAND, which is the first operand pushed to stack
// B - TEMPORARY BOOLEAN RESULTS

@members {
    TreeMap<String, FunctionDefinition> functionTable = new TreeMap<String, FunctionDefinition>();
    HashMap<String, String> varTable = new HashMap<String, String>();
    GenericStatement hackStore1;

    FileWriter fstream;
    BufferedWriter out;
    String version = "0.0000000000000001";
    int loopCounter = 0;



    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

		void startWritingASM () {
			try {
			fstream = new FileWriter("asm.txt");
			out = new BufferedWriter(fstream);
			writeInit();	// sets pc to start label
			 } catch (Exception e) {
				System.err.println("Error: " + e.getMessage());
			}
		}
		
		void stopWritingASM () {
			try {
			out.close();
			 } catch (Exception e) {
				System.err.println("Error: " + e.getMessage());
			}
		}
	
		void writeASM (String str) {
			try{
		  	out.write(str);
		  }catch (Exception e){
		  	System.err.println("Error: " + e.getMessage());
		  }
		}
		
		void writeSetRegToMemory(String reg, String varname, HashMap<String, String> scope) {
			writeASM("SET [" + scope.get(varname) + "], " + reg + "\n" );
		}
		
	  /*	
		void copyVariableParameterToFunction(String varname, HashMap<String, String> scope, int parameterCounter, FunctionDefinition targetFunction) {
			String varLabel = scope.get(varname);
			String targetLabel = targetFunction.getParameterLabelByPosition(parameterCounter);
			writeASM("SET [" + targetLabel + "], [" + varLabel + "]\n" );
		}
		
		void copyImmidiateParameterToFunction(String immidiateValue, int parameterCounter, FunctionDefinition targetFunction) {
			String targetLabel = targetFunction.getParameterLabelByPosition(parameterCounter);
			writeASM("SET [" + targetLabel + "], " + immidiateValue + "\n" );
		}
		*/
   void popParameters(FunctionDefinition fun){
			writeASM("SET I, POP\n"); // save ip
			int count = fun.getNumberOfParameters();
			String targetLabel;
			while(count >= 0){
				  targetLabel = fun.getParameterLabelByPosition(count--);
					writeASM("SET [" + targetLabel + "], " + "POP\n" );
			} 
			writeASM("SET PUSH, I\n"); // restore ip
	 }
		
		
		void writeSetImmidiateToReg(String reg, String immidiate) {
			writeASM("SET " + reg + ", " + immidiate + "\n" );
		}
		
		void writeSetVarToReg(String reg, String varname, HashMap<String, String> scope) {
			writeASM("SET " + reg + ", [" + scope.get(varname) + "]\n" );
		}
		
		
		String getNewLoopCounter(){
		  return "" + loopCounter++;		  
		}
		
		
		void writeInit () {
			writeASM("\n;COMPILED BY NOPC VERSION " + version + " ON " + getDateTime() +  " \n");
			writeASM(";NOPC WAS WRITTEN BY STEPHAN WYPLER AND ALEXANDER RUST\n");
			writeASM(";SEE https://github.com/stylpen/nop FOR MORE INFORMATION\n\n");
			writeASM(";BEGIN ASM\n");			
			writeASM("SET PC, START \n");
		}
				
		void writeDSEG () {
			System.out.println("Writing DSEG");
			writeASM("; BEGIN DSEG\n");
			
			for (String label : varTable.keySet()) {
				writeASM(":" + label + " dat " +  String.format("0x\%04x", Integer.parseInt(varTable.get(label))) + "\n");				
			}
			writeASM(":START JSR " + functionTable.get("main").getLabel() + "\n");				// Writes jump to main function so we can set pc to START at the beginning wihtout knowing where the main function will be
		}
}

cFile returns [GenericStatement ret]
@init{
HashMap<String, String> scope = new HashMap<String, String>();
GenericStatement cFile = new GenericStatement(scope, functionTable, varTable);
startWritingASM();
}
  : 
  globalFunctionOrStatement[cFile]+{writeDSEG(); stopWritingASM();}
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
  (n1 = NAME ('=' expression[parent])?){parent.addVarToScope($n1.text, null); writeSetRegToMemory("X", $n1.text, parent.getScope());     } (',' (n2 = NAME ('=' expression[parent])?){parent.addVarToScope($n2.text, null);})*   
  ;


functionDefinition[GenericStatement parent] returns [GenericStatement ret]
@init{
FunctionDefinition functionDefinition = new FunctionDefinition(parent.getScope(), functionTable, varTable);
}
  :
    typeSpecifier
		NAME {functionDefinition.addFun($NAME.text); writeASM(":" + functionDefinition.getLabel() + "\n"); } 
		'('
		parameterList[functionDefinition] 
		')'
		'{' {popParameters(functionDefinition);}
		statement[functionDefinition]* 
		'}'
		
		{System.out.println($functionDefinition.text); }
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
    | ( assignment[null] ';'	)
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
  | expression[parent] ';' {System.out.println("DORT");	}

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
  NAME '(' {fun = functionTable.get($NAME.text);} functionCallArgumentList[p, fun] ')' {writeASM("JSR " + fun.getLabel() + "\n");}
  ;



functionCallArgumentList[GenericStatement parent, FunctionDefinition fun]
  :
      (
					n1 = NAME {writeSetVarToReg("PUSH", $n1.text, parent.getScope());} 
				| functionCall[parent] {writeSetVarToReg("PUSH", fun.getName(), parent.getScope());}
				| w1 = WERT {writeSetImmidiateToReg("PUSH", $w1.text);}
			)? 
			(','
			  (
						n2 = NAME {writeSetVarToReg("PUSH", $n2.text, parent.getScope());} 
					| functionCall[parent] {writeSetVarToReg("PUSH", fun.getName(), parent.getScope());} 
					| w2 = WERT {writeSetImmidiateToReg("PUSH", $w2.text);}
				)
			)*
  ;

assignment[GenericStatement parent]
@init {
  GenericStatement p = parent;
  if (p == null) { p = hackStore1;}
} 
  :
    NAME ( 	 '=' expression[p] {writeSetRegToMemory("X", $NAME.text, p.getScope()); }
					| '*=' expression[p] {writeSetVarToReg("Y", $NAME.text, p.getScope()); writeASM("MUL X, Y\n"); writeSetRegToMemory("X", $NAME.text, p.getScope()); }
					| '/=' expression[p] {writeSetVarToReg("Y", $NAME.text, p.getScope()); writeASM("DIV Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", $NAME.text, p.getScope()); }
					| '%=' expression[p] {writeSetVarToReg("Y", $NAME.text, p.getScope()); writeASM("MOD Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", $NAME.text, p.getScope()); }
					| '+=' expression[p] {writeSetVarToReg("Y", $NAME.text, p.getScope()); writeASM("ADD X, Y\n"); writeSetRegToMemory("X", $NAME.text, p.getScope()); }
					| '-=' expression[p] {writeSetVarToReg("Y", $NAME.text, p.getScope()); writeASM("SUB Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", $NAME.text, p.getScope()); }
					| '<<='expression[p] {writeSetVarToReg("Y", $NAME.text, p.getScope()); writeASM("SHL Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", $NAME.text, p.getScope()); }
					| '>>='expression[p] {writeSetVarToReg("Y", $NAME.text, p.getScope()); writeASM("SHR Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", $NAME.text, p.getScope()); }
					| '&=' expression[p] {writeSetVarToReg("Y", $NAME.text, p.getScope()); writeASM("AND X, Y\n"); writeSetRegToMemory("X", $NAME.text, p.getScope()); }
					| '^=' expression[p] {writeSetVarToReg("Y", $NAME.text, p.getScope()); writeASM("XOR X, Y\n"); writeSetRegToMemory("X", $NAME.text, p.getScope()); }
					| '|=' expression[p] {writeSetVarToReg("Y", $NAME.text, p.getScope()); writeASM("BOR X, Y\n"); writeSetRegToMemory("X", $NAME.text, p.getScope()); }
				 )
  ;	

	expression[GenericStatement parent]
	@init{
	    String label = "";
	}
		: logical_or_expression[parent] 
			(
				'?' {label = getNewLoopCounter(); writeASM("IFE X, 0\n   SET PC, ELSE" + label + "\n");} 
				expression[parent]
				{writeASM("SET PC, END" + label + "\n");}
				':'{writeASM(":ELSE" + label + "\n");}
				expression[parent]
				{writeASM(":END" + label + "\n");}
			)?
		;

	logical_or_expression[GenericStatement parent]
		: logical_and_expression[parent] 
			(
				'||' {writeASM("SET PUSH, X\n");}	logical_and_expression[parent] {writeASM("SET Y, POP \n OR X, Y\nIFG X, 0\n   SET X, 1\n");}
			)*
		;

	logical_and_expression[GenericStatement parent]
		: inclusive_or_expression[parent] 
			(
				'&&' {writeASM("SET PUSH, X\n");} inclusive_or_expression[parent] {writeASM("SET Y, POP \nIFG Y, 0\n   SET Y, FFFF\nAND X, Y\nIFG X, 0\n   SET X, 1\n");}
			)*
		;

	inclusive_or_expression[GenericStatement parent]
		: exclusive_or_expression[parent] 
			(
				'|' {writeASM("SET PUSH, X\n");} exclusive_or_expression[parent] {writeASM("SET Y, POP \nOR X, Y\n");}
			)*
		;

	exclusive_or_expression[GenericStatement parent]
		: and_expression[parent] 
		(
			'^' {writeASM("SET PUSH, X\n");} and_expression[parent] {writeASM("SET Y, POP \nXOR X, Y\n");}
		)*
		;

	and_expression[GenericStatement parent]
		: equality_expression[parent] 
		(
			'&' {writeASM("SET PUSH, X\n");} equality_expression[parent] 	{writeASM("SET Y, POP \nAND X, Y\n");}
		)*
		;
		
	equality_expression[GenericStatement parent]
		: relational_expression[parent] 
			(
				'==' {writeASM("SET PUSH, X\n");} relational_expression[parent] {writeASM("SET B, 0\nSET Y, POP \nIFE	 X, Y\n   SET B, 1\nSET X, B\n");}
			 |'!=' {writeASM("SET PUSH, X\n");} relational_expression[parent] {writeASM("SET B, 0\nSET Y, POP \nIFN  X, Y\n   SET B, 1\nSET X, B\n");}
				
			)*
		;

	relational_expression[GenericStatement parent]
		: shift_expression[parent] 
			(
					 '<' {writeASM("SET PUSH, X\n");} shift_expression[parent]  {writeASM("SET B, 0\nSET Y, POP \nIFG X, Y\n   SET B, 1\nSET X, B\n");} 
					|'>' {writeASM("SET PUSH, X\n");} shift_expression[parent]  {writeASM("SET B, 0\nSET Y, POP \nIFG Y, X\n   SET B, 1\nSET X, B\n");} 
					|'<=' {writeASM("SET PUSH, X\n");} shift_expression[parent] {writeASM("SET B, 0\nSET Y, POP \nIFG X, Y\n   SET B, 1\nIFE X, Y\n    SET B, 1\nSET X, B\n" );}  
					|'>=' {writeASM("SET PUSH, X\n");} shift_expression[parent] {writeASM("SET B, 0\nSET Y, POP \nIFG Y, X\n   SET B, 1\nIFE X, Y\n    SET B, 1\nSET X, B\n" );}  				
			)*
		;

	shift_expression[GenericStatement parent]
		: additive_expression[parent] 
		(
				'<<' {writeASM("SET PUSH, X\n");} additive_expression[parent] {writeASM("SET Y, POP \nSHL Y, X\nSET X, Y\n");}
			| '>>' {writeASM("SET PUSH, X\n");} additive_expression[parent] {writeASM("SET Y, POP \nSHR Y, X\nSET X, Y\n");} 
		)*
		;
		
	additive_expression[GenericStatement parent]
		: (multiplicative_expression[parent]) 
			(
					'+' {writeASM("SET PUSH, X\n");} multiplicative_expression[parent] {writeASM("SET Y, POP \nADD X, Y\n");} 
				| '-' {writeASM("SET PUSH, X\n");} multiplicative_expression[parent] {writeASM("SET Y, POP \nSUB Y, X\nSET X, Y \n");} 
			)*
		;

	multiplicative_expression[GenericStatement parent]
		: (unary_expression[parent]) 
			 (
					'*' {writeASM("SET PUSH, X\n");} unary_expression[parent] {writeASM("SET Y, POP \nMUL X, Y\n");} 
				| '/' {writeASM("SET PUSH, X\n");} unary_expression[parent] {writeASM("SET Y, POP \nDIV Y, X\nSET X, Y \n");} 
				| '%' {writeASM("SET PUSH, X\n");} unary_expression[parent] {writeASM("SET Y, POP \nMOD Y, X\nSET X, Y \n");}
			 )*
		;
		

// murks murks
// rettet varname für so sachen wie x++, ++x etc. damit wir das ergebniss wieder zurück in den memory schreiben können
unary_expression[GenericStatement parent]
  : p = postfix_expression[parent] 
  | '++' unary_expression[parent]{writeASM("ADD X, 1\n"); if ($p.varname != null) {writeSetRegToMemory("X", $p.varname, parent.getScope()); }}
  | '--' unary_expression[parent]{writeASM("SUB X, 1\n"); if ($p.varname != null) {writeSetRegToMemory("X", $p.varname, parent.getScope()); }}
  ;

postfix_expression[GenericStatement parent] returns [String varname]
  :   p = primary_expression[parent]
        ( '++' {writeASM("ADD X, 1\n"); if ($p.varname != null) {writeSetRegToMemory("X", $p.varname, parent.getScope()); }}
        | '--' {writeASM("SUB X, 1\n"); if ($p.varname != null) {writeSetRegToMemory("X", $p.varname, parent.getScope()); }}
        )*
      {$varname = $p.varname;}
  ;

primary_expression[GenericStatement parent] returns [String varname]
  : NAME {writeSetVarToReg("X", $NAME.text, parent.getScope()); $varname = $NAME.text;}
  | '(' expression[parent] ')' // TODO: backpatch parent
  | functionCall[parent]
  | WERT {writeSetImmidiateToReg("X", $WERT.text);}
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


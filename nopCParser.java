// $ANTLR 3.4 nopC.g 2012-05-13 16:36:49

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


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class nopCParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "LETTER", "LINE_COMMENT", "NAME", "WERT", "WS", "'!='", "'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'/'", "'/='", "':'", "';'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'>>='", "'?'", "'^'", "'^='", "'bool'", "'break'", "'continue'", "'else'", "'for'", "'goto'", "'if'", "'int'", "'return'", "'void'", "'while'", "'{'", "'|'", "'|='", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int COMMENT=4;
    public static final int LETTER=5;
    public static final int LINE_COMMENT=6;
    public static final int NAME=7;
    public static final int WERT=8;
    public static final int WS=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public nopCParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public nopCParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[106+1];
         

    }

    public String[] getTokenNames() { return nopCParser.tokenNames; }
    public String getGrammarFileName() { return "nopC.g"; }


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
    				writeASM(":" + label + " dat " +  String.format("0x%04x", Integer.parseInt(varTable.get(label))) + "\n");				
    			}
    			writeASM(":START JSR " + functionTable.get("main").getLabel() + "\n");				// Writes jump to main function so we can set pc to START at the beginning wihtout knowing where the main function will be
    		}



    // $ANTLR start "cFile"
    // nopC.g:123:1: cFile returns [GenericStatement ret] : ( globalFunctionOrStatement[cFile] )+ ;
    public final GenericStatement cFile() throws RecognitionException {
        GenericStatement ret = null;

        int cFile_StartIndex = input.index();


        HashMap<String, String> scope = new HashMap<String, String>();
        GenericStatement cFile = new GenericStatement(scope, functionTable, varTable);
        startWritingASM();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ret; }

            // nopC.g:129:3: ( ( globalFunctionOrStatement[cFile] )+ )
            // nopC.g:130:3: ( globalFunctionOrStatement[cFile] )+
            {
            // nopC.g:130:3: ( globalFunctionOrStatement[cFile] )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==44||LA1_0==51||LA1_0==53) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // nopC.g:130:3: globalFunctionOrStatement[cFile]
            	    {
            	    pushFollow(FOLLOW_globalFunctionOrStatement_in_cFile73);
            	    globalFunctionOrStatement(cFile);

            	    state._fsp--;
            	    if (state.failed) return ret;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ret;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            if ( state.backtracking==0 ) {writeDSEG(); stopWritingASM();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, cFile_StartIndex); }

        }
        return ret;
    }
    // $ANTLR end "cFile"



    // $ANTLR start "globalFunctionOrStatement"
    // nopC.g:135:1: globalFunctionOrStatement[GenericStatement parent] returns [GenericStatement ret] : ( ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration[parent] | ( typeSpecifier NAME '(' )=> functionDefinition[parent] );
    public final GenericStatement globalFunctionOrStatement(GenericStatement parent) throws RecognitionException {
        GenericStatement ret = null;

        int globalFunctionOrStatement_StartIndex = input.index();

        nopCParser.globalVariableDeclaration_return globalVariableDeclaration1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ret; }

            // nopC.g:136:3: ( ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration[parent] | ( typeSpecifier NAME '(' )=> functionDefinition[parent] )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==44||LA2_0==51||LA2_0==53) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==NAME) ) {
                    int LA2_2 = input.LA(3);

                    if ( (synpred4_nopC()) ) {
                        alt2=1;
                    }
                    else if ( (synpred5_nopC()) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ret;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ret;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ret;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // nopC.g:137:3: ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration[parent]
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_globalFunctionOrStatement119);
                    globalVariableDeclaration1=globalVariableDeclaration(parent);

                    state._fsp--;
                    if (state.failed) return ret;

                    if ( state.backtracking==0 ) {ret = (globalVariableDeclaration1!=null?globalVariableDeclaration1.ret:null);}

                    }
                    break;
                case 2 :
                    // nopC.g:138:5: ( typeSpecifier NAME '(' )=> functionDefinition[parent]
                    {
                    pushFollow(FOLLOW_functionDefinition_in_globalFunctionOrStatement139);
                    functionDefinition(parent);

                    state._fsp--;
                    if (state.failed) return ret;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, globalFunctionOrStatement_StartIndex); }

        }
        return ret;
    }
    // $ANTLR end "globalFunctionOrStatement"


    public static class globalVariableDeclaration_return extends ParserRuleReturnScope {
        public GenericStatement ret;
    };


    // $ANTLR start "globalVariableDeclaration"
    // nopC.g:141:1: globalVariableDeclaration[GenericStatement parent] returns [GenericStatement ret] : typeSpecifier globalVariableDeclarationList[parent] ';' ;
    public final nopCParser.globalVariableDeclaration_return globalVariableDeclaration(GenericStatement parent) throws RecognitionException {
        nopCParser.globalVariableDeclaration_return retval = new nopCParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);

        int globalVariableDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // nopC.g:142:3: ( typeSpecifier globalVariableDeclarationList[parent] ';' )
            // nopC.g:144:3: typeSpecifier globalVariableDeclarationList[parent] ';'
            {
            pushFollow(FOLLOW_typeSpecifier_in_globalVariableDeclaration164);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;

            pushFollow(FOLLOW_globalVariableDeclarationList_in_globalVariableDeclaration166);
            globalVariableDeclarationList(parent);

            state._fsp--;
            if (state.failed) return retval;

            match(input,30,FOLLOW_30_in_globalVariableDeclaration169); if (state.failed) return retval;

            if ( state.backtracking==0 ) {System.out.println(input.toString(retval.start,input.LT(-1)));}

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, globalVariableDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "globalVariableDeclaration"



    // $ANTLR start "globalVariableDeclarationList"
    // nopC.g:152:1: globalVariableDeclarationList[GenericStatement parent] returns [GenericStatement ret] : (n1= NAME ( '=' w1= WERT )? ) ( ',' (n2= NAME ( '=' w2= WERT )? ) )* ;
    public final GenericStatement globalVariableDeclarationList(GenericStatement parent) throws RecognitionException {
        GenericStatement ret = null;

        int globalVariableDeclarationList_StartIndex = input.index();

        Token n1=null;
        Token w1=null;
        Token n2=null;
        Token w2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ret; }

            // nopC.g:153:3: ( (n1= NAME ( '=' w1= WERT )? ) ( ',' (n2= NAME ( '=' w2= WERT )? ) )* )
            // nopC.g:154:3: (n1= NAME ( '=' w1= WERT )? ) ( ',' (n2= NAME ( '=' w2= WERT )? ) )*
            {
            // nopC.g:154:3: (n1= NAME ( '=' w1= WERT )? )
            // nopC.g:154:4: n1= NAME ( '=' w1= WERT )?
            {
            n1=(Token)match(input,NAME,FOLLOW_NAME_in_globalVariableDeclarationList201); if (state.failed) return ret;

            // nopC.g:154:13: ( '=' w1= WERT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // nopC.g:154:14: '=' w1= WERT
                    {
                    match(input,35,FOLLOW_35_in_globalVariableDeclarationList203); if (state.failed) return ret;

                    w1=(Token)match(input,WERT,FOLLOW_WERT_in_globalVariableDeclarationList209); if (state.failed) return ret;

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {parent.addVarToScope((n1!=null?n1.getText():null), (w1!=null?w1.getText():null));}

            // nopC.g:154:74: ( ',' (n2= NAME ( '=' w2= WERT )? ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // nopC.g:154:75: ',' (n2= NAME ( '=' w2= WERT )? )
            	    {
            	    match(input,23,FOLLOW_23_in_globalVariableDeclarationList216); if (state.failed) return ret;

            	    // nopC.g:154:79: (n2= NAME ( '=' w2= WERT )? )
            	    // nopC.g:154:80: n2= NAME ( '=' w2= WERT )?
            	    {
            	    n2=(Token)match(input,NAME,FOLLOW_NAME_in_globalVariableDeclarationList223); if (state.failed) return ret;

            	    // nopC.g:154:89: ( '=' w2= WERT )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==35) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // nopC.g:154:90: '=' w2= WERT
            	            {
            	            match(input,35,FOLLOW_35_in_globalVariableDeclarationList225); if (state.failed) return ret;

            	            w2=(Token)match(input,WERT,FOLLOW_WERT_in_globalVariableDeclarationList231); if (state.failed) return ret;

            	            }
            	            break;

            	    }


            	    }


            	    if ( state.backtracking==0 ) {parent.addVarToScope((n2!=null?n2.getText():null), (w2!=null?w2.getText():null));}

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, globalVariableDeclarationList_StartIndex); }

        }
        return ret;
    }
    // $ANTLR end "globalVariableDeclarationList"


    public static class variableDeclaration_return extends ParserRuleReturnScope {
        public GenericStatement ret;
    };


    // $ANTLR start "variableDeclaration"
    // nopC.g:157:1: variableDeclaration[GenericStatement parent] returns [GenericStatement ret] : typeSpecifier variableDeclarationList[parent] ';' ;
    public final nopCParser.variableDeclaration_return variableDeclaration(GenericStatement parent) throws RecognitionException {
        nopCParser.variableDeclaration_return retval = new nopCParser.variableDeclaration_return();
        retval.start = input.LT(1);

        int variableDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // nopC.g:158:3: ( typeSpecifier variableDeclarationList[parent] ';' )
            // nopC.g:159:3: typeSpecifier variableDeclarationList[parent] ';'
            {
            pushFollow(FOLLOW_typeSpecifier_in_variableDeclaration260);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;

            pushFollow(FOLLOW_variableDeclarationList_in_variableDeclaration262);
            variableDeclarationList(parent);

            state._fsp--;
            if (state.failed) return retval;

            match(input,30,FOLLOW_30_in_variableDeclaration265); if (state.failed) return retval;

            if ( state.backtracking==0 ) {System.out.println(input.toString(retval.start,input.LT(-1)));}

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, variableDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"



    // $ANTLR start "variableDeclarationList"
    // nopC.g:162:1: variableDeclarationList[GenericStatement parent] returns [GenericStatement ret] : (n1= NAME ( '=' expression[parent] )? ) ( ',' (n2= NAME ( '=' expression[parent] )? ) )* ;
    public final GenericStatement variableDeclarationList(GenericStatement parent) throws RecognitionException {
        GenericStatement ret = null;

        int variableDeclarationList_StartIndex = input.index();

        Token n1=null;
        Token n2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ret; }

            // nopC.g:163:3: ( (n1= NAME ( '=' expression[parent] )? ) ( ',' (n2= NAME ( '=' expression[parent] )? ) )* )
            // nopC.g:165:3: (n1= NAME ( '=' expression[parent] )? ) ( ',' (n2= NAME ( '=' expression[parent] )? ) )*
            {
            // nopC.g:165:3: (n1= NAME ( '=' expression[parent] )? )
            // nopC.g:165:4: n1= NAME ( '=' expression[parent] )?
            {
            n1=(Token)match(input,NAME,FOLLOW_NAME_in_variableDeclarationList296); if (state.failed) return ret;

            // nopC.g:165:14: ( '=' expression[parent] )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // nopC.g:165:15: '=' expression[parent]
                    {
                    match(input,35,FOLLOW_35_in_variableDeclarationList299); if (state.failed) return ret;

                    pushFollow(FOLLOW_expression_in_variableDeclarationList301);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ret;

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {parent.addVarToScope((n1!=null?n1.getText():null), null); writeSetRegToMemory("X", (n1!=null?n1.getText():null), parent.getScope());     }

            // nopC.g:165:140: ( ',' (n2= NAME ( '=' expression[parent] )? ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // nopC.g:165:141: ',' (n2= NAME ( '=' expression[parent] )? )
            	    {
            	    match(input,23,FOLLOW_23_in_variableDeclarationList309); if (state.failed) return ret;

            	    // nopC.g:165:145: (n2= NAME ( '=' expression[parent] )? )
            	    // nopC.g:165:146: n2= NAME ( '=' expression[parent] )?
            	    {
            	    n2=(Token)match(input,NAME,FOLLOW_NAME_in_variableDeclarationList316); if (state.failed) return ret;

            	    // nopC.g:165:156: ( '=' expression[parent] )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==35) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // nopC.g:165:157: '=' expression[parent]
            	            {
            	            match(input,35,FOLLOW_35_in_variableDeclarationList319); if (state.failed) return ret;

            	            pushFollow(FOLLOW_expression_in_variableDeclarationList321);
            	            expression(parent);

            	            state._fsp--;
            	            if (state.failed) return ret;

            	            }
            	            break;

            	    }


            	    }


            	    if ( state.backtracking==0 ) {parent.addVarToScope((n2!=null?n2.getText():null), null);}

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, variableDeclarationList_StartIndex); }

        }
        return ret;
    }
    // $ANTLR end "variableDeclarationList"


    public static class functionDefinition_return extends ParserRuleReturnScope {
        public GenericStatement ret;
    };


    // $ANTLR start "functionDefinition"
    // nopC.g:169:1: functionDefinition[GenericStatement parent] returns [GenericStatement ret] : typeSpecifier NAME '(' parameterList[functionDefinition] ')' '{' ( statement[functionDefinition] )* '}' ;
    public final nopCParser.functionDefinition_return functionDefinition(GenericStatement parent) throws RecognitionException {
        nopCParser.functionDefinition_return retval = new nopCParser.functionDefinition_return();
        retval.start = input.LT(1);

        int functionDefinition_StartIndex = input.index();

        Token NAME2=null;


        FunctionDefinition functionDefinition = new FunctionDefinition(parent.getScope(), functionTable, varTable);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // nopC.g:173:3: ( typeSpecifier NAME '(' parameterList[functionDefinition] ')' '{' ( statement[functionDefinition] )* '}' )
            // nopC.g:174:5: typeSpecifier NAME '(' parameterList[functionDefinition] ')' '{' ( statement[functionDefinition] )* '}'
            {
            pushFollow(FOLLOW_typeSpecifier_in_functionDefinition358);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;

            NAME2=(Token)match(input,NAME,FOLLOW_NAME_in_functionDefinition362); if (state.failed) return retval;

            if ( state.backtracking==0 ) {functionDefinition.addFun((NAME2!=null?NAME2.getText():null)); writeASM(":" + functionDefinition.getLabel() + "\n"); }

            match(input,16,FOLLOW_16_in_functionDefinition369); if (state.failed) return retval;

            pushFollow(FOLLOW_parameterList_in_functionDefinition373);
            parameterList(functionDefinition);

            state._fsp--;
            if (state.failed) return retval;

            match(input,17,FOLLOW_17_in_functionDefinition379); if (state.failed) return retval;

            match(input,55,FOLLOW_55_in_functionDefinition383); if (state.failed) return retval;

            if ( state.backtracking==0 ) {popParameters(functionDefinition);}

            // nopC.g:180:3: ( statement[functionDefinition] )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= NAME && LA9_0 <= WERT)||LA9_0==16||LA9_0==21||LA9_0==25||LA9_0==30||(LA9_0 >= 44 && LA9_0 <= 46)||(LA9_0 >= 48 && LA9_0 <= 54)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // nopC.g:180:3: statement[functionDefinition]
            	    {
            	    pushFollow(FOLLOW_statement_in_functionDefinition389);
            	    statement(functionDefinition);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            if ( state.backtracking==0 ) {writeASM("SET PC, POP\n");}

            match(input,59,FOLLOW_59_in_functionDefinition404); if (state.failed) return retval;

            if ( state.backtracking==0 ) {System.out.println(input.toString(retval.start,input.LT(-1))); }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, functionDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionDefinition"



    // $ANTLR start "parameterList"
    // nopC.g:188:1: parameterList[FunctionDefinition parent] : ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )? ;
    public final void parameterList(FunctionDefinition parent) throws RecognitionException {
        int parameterList_StartIndex = input.index();

        Token n1=null;
        Token n2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }

            // nopC.g:189:3: ( ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )? )
            // nopC.g:190:5: ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )?
            {
            // nopC.g:190:5: ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44||LA11_0==51||LA11_0==53) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // nopC.g:190:6: typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )*
                    {
                    pushFollow(FOLLOW_typeSpecifier_in_parameterList432);
                    typeSpecifier();

                    state._fsp--;
                    if (state.failed) return ;

                    // nopC.g:190:20: (n1= NAME )
                    // nopC.g:190:21: n1= NAME
                    {
                    n1=(Token)match(input,NAME,FOLLOW_NAME_in_parameterList439); if (state.failed) return ;

                    }


                    if ( state.backtracking==0 ) {parent.addParam((n1!=null?n1.getText():null));}

                    // nopC.g:190:60: ( ',' typeSpecifier (n2= NAME ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==23) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // nopC.g:190:61: ',' typeSpecifier (n2= NAME )
                    	    {
                    	    match(input,23,FOLLOW_23_in_parameterList444); if (state.failed) return ;

                    	    pushFollow(FOLLOW_typeSpecifier_in_parameterList446);
                    	    typeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    // nopC.g:190:79: (n2= NAME )
                    	    // nopC.g:190:80: n2= NAME
                    	    {
                    	    n2=(Token)match(input,NAME,FOLLOW_NAME_in_parameterList453); if (state.failed) return ;

                    	    }


                    	    if ( state.backtracking==0 ) {parent.addParam((n2!=null?n2.getText():null));}

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parameterList_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "parameterList"



    // $ANTLR start "codeBlock"
    // nopC.g:193:1: codeBlock[GenericStatement parent] : ( '{' ( statement[parent] )* '}' | statement[parent] );
    public final void codeBlock(GenericStatement parent) throws RecognitionException {
        int codeBlock_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }

            // nopC.g:194:3: ( '{' ( statement[parent] )* '}' | statement[parent] )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==55) ) {
                alt13=1;
            }
            else if ( ((LA13_0 >= NAME && LA13_0 <= WERT)||LA13_0==16||LA13_0==21||LA13_0==25||LA13_0==30||(LA13_0 >= 44 && LA13_0 <= 46)||(LA13_0 >= 48 && LA13_0 <= 54)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // nopC.g:195:3: '{' ( statement[parent] )* '}'
                    {
                    match(input,55,FOLLOW_55_in_codeBlock477); if (state.failed) return ;

                    // nopC.g:195:6: ( statement[parent] )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= NAME && LA12_0 <= WERT)||LA12_0==16||LA12_0==21||LA12_0==25||LA12_0==30||(LA12_0 >= 44 && LA12_0 <= 46)||(LA12_0 >= 48 && LA12_0 <= 54)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // nopC.g:195:6: statement[parent]
                    	    {
                    	    pushFollow(FOLLOW_statement_in_codeBlock478);
                    	    statement(parent);

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    match(input,59,FOLLOW_59_in_codeBlock481); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:196:5: statement[parent]
                    {
                    pushFollow(FOLLOW_statement_in_codeBlock487);
                    statement(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, codeBlock_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "codeBlock"



    // $ANTLR start "statement"
    // nopC.g:200:1: statement[GenericStatement parent] : ( ( functionCall[null] ';' ) | ( assignment[null] ';' ) | variableDeclaration[parent] | selection_statement[parent] | iteration_statement[parent] | jump_statement[parent] | expression_statement[parent] );
    public final void statement(GenericStatement parent) throws RecognitionException {
        int statement_StartIndex = input.index();


          hackStore1 = parent; // We cannot pass parent to functionCall or assignment directly, as there is a synpred rule involved during backtracking which does not take parameters. Therefore we store it in a global variable to access the variable through this later

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }

            // nopC.g:204:3: ( ( functionCall[null] ';' ) | ( assignment[null] ';' ) | variableDeclaration[parent] | selection_statement[parent] | iteration_statement[parent] | jump_statement[parent] | expression_statement[parent] )
            int alt14=7;
            switch ( input.LA(1) ) {
            case NAME:
                {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    int LA14_15 = input.LA(3);

                    if ( (synpred17_nopC()) ) {
                        alt14=1;
                    }
                    else if ( (true) ) {
                        alt14=7;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 15, input);

                        throw nvae;

                    }
                    }
                    break;
                case 12:
                case 15:
                case 19:
                case 22:
                case 26:
                case 28:
                case 33:
                case 35:
                case 40:
                case 43:
                case 57:
                    {
                    alt14=2;
                    }
                    break;
                case 10:
                case 11:
                case 13:
                case 14:
                case 18:
                case 20:
                case 21:
                case 24:
                case 25:
                case 27:
                case 30:
                case 31:
                case 32:
                case 34:
                case 36:
                case 37:
                case 38:
                case 39:
                case 41:
                case 42:
                case 56:
                case 58:
                    {
                    alt14=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }

                }
                break;
            case 44:
            case 51:
            case 53:
                {
                alt14=3;
                }
                break;
            case 50:
                {
                alt14=4;
                }
                break;
            case 48:
            case 54:
                {
                alt14=5;
                }
                break;
            case 45:
            case 46:
            case 49:
            case 52:
                {
                alt14=6;
                }
                break;
            case WERT:
            case 16:
            case 21:
            case 25:
            case 30:
                {
                alt14=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // nopC.g:205:7: ( functionCall[null] ';' )
                    {
                    // nopC.g:205:7: ( functionCall[null] ';' )
                    // nopC.g:205:9: functionCall[null] ';'
                    {
                    pushFollow(FOLLOW_functionCall_in_statement516);
                    functionCall(null);

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_statement519); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // nopC.g:206:7: ( assignment[null] ';' )
                    {
                    // nopC.g:206:7: ( assignment[null] ';' )
                    // nopC.g:206:9: assignment[null] ';'
                    {
                    pushFollow(FOLLOW_assignment_in_statement530);
                    assignment(null);

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_statement533); if (state.failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // nopC.g:207:7: variableDeclaration[parent]
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_statement543);
                    variableDeclaration(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // nopC.g:208:7: selection_statement[parent]
                    {
                    pushFollow(FOLLOW_selection_statement_in_statement552);
                    selection_statement(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // nopC.g:209:7: iteration_statement[parent]
                    {
                    pushFollow(FOLLOW_iteration_statement_in_statement561);
                    iteration_statement(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // nopC.g:210:7: jump_statement[parent]
                    {
                    pushFollow(FOLLOW_jump_statement_in_statement570);
                    jump_statement(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // nopC.g:211:7: expression_statement[parent]
                    {
                    pushFollow(FOLLOW_expression_statement_in_statement579);
                    expression_statement(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "selection_statement"
    // nopC.g:215:1: selection_statement[GenericStatement parent] : 'if' '(' expression[parent] ')' codeBlock[selection_statement_if] ( options {k=1; backtrack=false; } : 'else' codeBlock[selection_statement_else] )? ;
    public final void selection_statement(GenericStatement parent) throws RecognitionException {
        int selection_statement_StartIndex = input.index();


        ScopedStatement selection_statement_if = new ScopedStatement(parent.getScope(), functionTable, varTable);
        ScopedStatement selection_statement_else = new ScopedStatement(parent.getScope(), functionTable, varTable);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // nopC.g:220:3: ( 'if' '(' expression[parent] ')' codeBlock[selection_statement_if] ( options {k=1; backtrack=false; } : 'else' codeBlock[selection_statement_else] )? )
            // nopC.g:220:5: 'if' '(' expression[parent] ')' codeBlock[selection_statement_if] ( options {k=1; backtrack=false; } : 'else' codeBlock[selection_statement_else] )?
            {
            match(input,50,FOLLOW_50_in_selection_statement600); if (state.failed) return ;

            match(input,16,FOLLOW_16_in_selection_statement602); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_selection_statement604);
            expression(parent);

            state._fsp--;
            if (state.failed) return ;

            match(input,17,FOLLOW_17_in_selection_statement607); if (state.failed) return ;

            pushFollow(FOLLOW_codeBlock_in_selection_statement609);
            codeBlock(selection_statement_if);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:220:71: ( options {k=1; backtrack=false; } : 'else' codeBlock[selection_statement_else] )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                int LA15_1 = input.LA(2);

                if ( (true) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // nopC.g:220:104: 'else' codeBlock[selection_statement_else]
                    {
                    match(input,47,FOLLOW_47_in_selection_statement625); if (state.failed) return ;

                    pushFollow(FOLLOW_codeBlock_in_selection_statement627);
                    codeBlock(selection_statement_else);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, selection_statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "selection_statement"



    // $ANTLR start "iteration_statement"
    // nopC.g:223:1: iteration_statement[GenericStatement parent] : ( 'while' '(' expression[parent] ')' codeBlock[iteration_statement] | 'for' '(' ( expression_statement[parent] | assignment[parent] ';' ) expression_statement[parent] ( expression[parent] )? ')' codeBlock[iteration_statement] );
    public final void iteration_statement(GenericStatement parent) throws RecognitionException {
        int iteration_statement_StartIndex = input.index();


        ScopedStatement iteration_statement = new ScopedStatement(parent.getScope(), functionTable, varTable);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

            // nopC.g:227:3: ( 'while' '(' expression[parent] ')' codeBlock[iteration_statement] | 'for' '(' ( expression_statement[parent] | assignment[parent] ';' ) expression_statement[parent] ( expression[parent] )? ')' codeBlock[iteration_statement] )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==54) ) {
                alt18=1;
            }
            else if ( (LA18_0==48) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // nopC.g:227:5: 'while' '(' expression[parent] ')' codeBlock[iteration_statement]
                    {
                    match(input,54,FOLLOW_54_in_iteration_statement649); if (state.failed) return ;

                    match(input,16,FOLLOW_16_in_iteration_statement651); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_iteration_statement653);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,17,FOLLOW_17_in_iteration_statement656); if (state.failed) return ;

                    pushFollow(FOLLOW_codeBlock_in_iteration_statement658);
                    codeBlock(iteration_statement);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:228:5: 'for' '(' ( expression_statement[parent] | assignment[parent] ';' ) expression_statement[parent] ( expression[parent] )? ')' codeBlock[iteration_statement]
                    {
                    match(input,48,FOLLOW_48_in_iteration_statement665); if (state.failed) return ;

                    match(input,16,FOLLOW_16_in_iteration_statement667); if (state.failed) return ;

                    // nopC.g:228:15: ( expression_statement[parent] | assignment[parent] ';' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==WERT||LA16_0==16||LA16_0==21||LA16_0==25||LA16_0==30) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==NAME) ) {
                        int LA16_2 = input.LA(2);

                        if ( ((LA16_2 >= 10 && LA16_2 <= 11)||(LA16_2 >= 13 && LA16_2 <= 14)||LA16_2==16||LA16_2==18||(LA16_2 >= 20 && LA16_2 <= 21)||(LA16_2 >= 24 && LA16_2 <= 25)||LA16_2==27||(LA16_2 >= 30 && LA16_2 <= 32)||LA16_2==34||(LA16_2 >= 36 && LA16_2 <= 39)||(LA16_2 >= 41 && LA16_2 <= 42)||LA16_2==56||LA16_2==58) ) {
                            alt16=1;
                        }
                        else if ( (LA16_2==12||LA16_2==15||LA16_2==19||LA16_2==22||LA16_2==26||LA16_2==28||LA16_2==33||LA16_2==35||LA16_2==40||LA16_2==43||LA16_2==57) ) {
                            alt16=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 2, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;

                    }
                    switch (alt16) {
                        case 1 :
                            // nopC.g:228:16: expression_statement[parent]
                            {
                            pushFollow(FOLLOW_expression_statement_in_iteration_statement670);
                            expression_statement(parent);

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // nopC.g:228:47: assignment[parent] ';'
                            {
                            pushFollow(FOLLOW_assignment_in_iteration_statement675);
                            assignment(parent);

                            state._fsp--;
                            if (state.failed) return ;

                            match(input,30,FOLLOW_30_in_iteration_statement678); if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_statement_in_iteration_statement681);
                    expression_statement(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    // nopC.g:228:100: ( expression[parent] )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0 >= NAME && LA17_0 <= WERT)||LA17_0==16||LA17_0==21||LA17_0==25) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // nopC.g:228:100: expression[parent]
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement684);
                            expression(parent);

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,17,FOLLOW_17_in_iteration_statement688); if (state.failed) return ;

                    pushFollow(FOLLOW_codeBlock_in_iteration_statement690);
                    codeBlock(iteration_statement);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, iteration_statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "iteration_statement"



    // $ANTLR start "expression_statement"
    // nopC.g:231:1: expression_statement[GenericStatement parent] : ( ';' | expression[parent] ';' );
    public final void expression_statement(GenericStatement parent) throws RecognitionException {
        int expression_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }

            // nopC.g:232:3: ( ';' | expression[parent] ';' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            else if ( ((LA19_0 >= NAME && LA19_0 <= WERT)||LA19_0==16||LA19_0==21||LA19_0==25) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // nopC.g:232:5: ';'
                    {
                    match(input,30,FOLLOW_30_in_expression_statement706); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:233:5: expression[parent] ';'
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement712);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_expression_statement715); if (state.failed) return ;

                    if ( state.backtracking==0 ) {System.out.println("DORT");	}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, expression_statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "expression_statement"



    // $ANTLR start "jump_statement"
    // nopC.g:237:1: jump_statement[GenericStatement parent] : ( 'goto' NAME ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression[parent] ';' );
    public final void jump_statement(GenericStatement parent) throws RecognitionException {
        int jump_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // nopC.g:238:3: ( 'goto' NAME ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression[parent] ';' )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt20=1;
                }
                break;
            case 46:
                {
                alt20=2;
                }
                break;
            case 45:
                {
                alt20=3;
                }
                break;
            case 52:
                {
                int LA20_4 = input.LA(2);

                if ( (LA20_4==30) ) {
                    alt20=4;
                }
                else if ( ((LA20_4 >= NAME && LA20_4 <= WERT)||LA20_4==16||LA20_4==21||LA20_4==25) ) {
                    alt20=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // nopC.g:238:5: 'goto' NAME ';'
                    {
                    match(input,49,FOLLOW_49_in_jump_statement733); if (state.failed) return ;

                    match(input,NAME,FOLLOW_NAME_in_jump_statement735); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement737); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:239:5: 'continue' ';'
                    {
                    match(input,46,FOLLOW_46_in_jump_statement743); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement745); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // nopC.g:240:5: 'break' ';'
                    {
                    match(input,45,FOLLOW_45_in_jump_statement751); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement753); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // nopC.g:241:5: 'return' ';'
                    {
                    match(input,52,FOLLOW_52_in_jump_statement759); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement761); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // nopC.g:242:5: 'return' expression[parent] ';'
                    {
                    match(input,52,FOLLOW_52_in_jump_statement767); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_jump_statement769);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement772); if (state.failed) return ;

                    if ( state.backtracking==0 ) {System.out.println(parent); FunctionDefinition fun = (FunctionDefinition) parent; System.out.println(fun.getName()); writeSetRegToMemory("X", fun.getName(), fun.getScope()); fun.printScope();}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, jump_statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "jump_statement"



    // $ANTLR start "functionCall"
    // nopC.g:245:1: functionCall[GenericStatement parent] : NAME '(' functionCallArgumentList[p, fun] ')' ;
    public final void functionCall(GenericStatement parent) throws RecognitionException {
        int functionCall_StartIndex = input.index();

        Token NAME3=null;


          GenericStatement p = parent; 

          if (p == null) {
             p = hackStore1;
          }

          FunctionDefinition fun = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }

            // nopC.g:255:3: ( NAME '(' functionCallArgumentList[p, fun] ')' )
            // nopC.g:256:3: NAME '(' functionCallArgumentList[p, fun] ')'
            {
            NAME3=(Token)match(input,NAME,FOLLOW_NAME_in_functionCall796); if (state.failed) return ;

            match(input,16,FOLLOW_16_in_functionCall798); if (state.failed) return ;

            if ( state.backtracking==0 ) {fun = functionTable.get((NAME3!=null?NAME3.getText():null));}

            pushFollow(FOLLOW_functionCallArgumentList_in_functionCall802);
            functionCallArgumentList(p, fun);

            state._fsp--;
            if (state.failed) return ;

            match(input,17,FOLLOW_17_in_functionCall805); if (state.failed) return ;

            if ( state.backtracking==0 ) {writeASM("JSR " + fun.getLabel() + "\n");}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, functionCall_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "functionCall"



    // $ANTLR start "functionCallArgumentList"
    // nopC.g:261:1: functionCallArgumentList[GenericStatement parent, FunctionDefinition fun] : (n1= NAME | functionCall[parent] |w1= WERT )? ( ',' (n2= NAME | functionCall[parent] |w2= WERT ) )* ;
    public final void functionCallArgumentList(GenericStatement parent, FunctionDefinition fun) throws RecognitionException {
        int functionCallArgumentList_StartIndex = input.index();

        Token n1=null;
        Token w1=null;
        Token n2=null;
        Token w2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

            // nopC.g:262:3: ( (n1= NAME | functionCall[parent] |w1= WERT )? ( ',' (n2= NAME | functionCall[parent] |w2= WERT ) )* )
            // nopC.g:263:7: (n1= NAME | functionCall[parent] |w1= WERT )? ( ',' (n2= NAME | functionCall[parent] |w2= WERT ) )*
            {
            // nopC.g:263:7: (n1= NAME | functionCall[parent] |w1= WERT )?
            int alt21=4;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==NAME) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==16) ) {
                    alt21=2;
                }
                else if ( (LA21_1==17||LA21_1==23) ) {
                    alt21=1;
                }
            }
            else if ( (LA21_0==WERT) ) {
                alt21=3;
            }
            switch (alt21) {
                case 1 :
                    // nopC.g:264:6: n1= NAME
                    {
                    n1=(Token)match(input,NAME,FOLLOW_NAME_in_functionCallArgumentList840); if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeSetVarToReg("PUSH", (n1!=null?n1.getText():null), parent.getScope());}

                    }
                    break;
                case 2 :
                    // nopC.g:265:7: functionCall[parent]
                    {
                    pushFollow(FOLLOW_functionCall_in_functionCallArgumentList851);
                    functionCall(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeSetVarToReg("PUSH", fun.getName(), parent.getScope());}

                    }
                    break;
                case 3 :
                    // nopC.g:266:7: w1= WERT
                    {
                    w1=(Token)match(input,WERT,FOLLOW_WERT_in_functionCallArgumentList866); if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeSetImmidiateToReg("PUSH", (w1!=null?w1.getText():null));}

                    }
                    break;

            }


            // nopC.g:268:4: ( ',' (n2= NAME | functionCall[parent] |w2= WERT ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // nopC.g:268:5: ',' (n2= NAME | functionCall[parent] |w2= WERT )
            	    {
            	    match(input,23,FOLLOW_23_in_functionCallArgumentList881); if (state.failed) return ;

            	    // nopC.g:269:6: (n2= NAME | functionCall[parent] |w2= WERT )
            	    int alt22=3;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==NAME) ) {
            	        int LA22_1 = input.LA(2);

            	        if ( (LA22_1==16) ) {
            	            alt22=2;
            	        }
            	        else if ( (LA22_1==17||LA22_1==23) ) {
            	            alt22=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 22, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else if ( (LA22_0==WERT) ) {
            	        alt22=3;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // nopC.g:270:7: n2= NAME
            	            {
            	            n2=(Token)match(input,NAME,FOLLOW_NAME_in_functionCallArgumentList900); if (state.failed) return ;

            	            if ( state.backtracking==0 ) {writeSetVarToReg("PUSH", (n2!=null?n2.getText():null), parent.getScope());}

            	            }
            	            break;
            	        case 2 :
            	            // nopC.g:271:8: functionCall[parent]
            	            {
            	            pushFollow(FOLLOW_functionCall_in_functionCallArgumentList912);
            	            functionCall(parent);

            	            state._fsp--;
            	            if (state.failed) return ;

            	            if ( state.backtracking==0 ) {writeSetVarToReg("PUSH", fun.getName(), parent.getScope());}

            	            }
            	            break;
            	        case 3 :
            	            // nopC.g:272:8: w2= WERT
            	            {
            	            w2=(Token)match(input,WERT,FOLLOW_WERT_in_functionCallArgumentList929); if (state.failed) return ;

            	            if ( state.backtracking==0 ) {writeSetImmidiateToReg("PUSH", (w2!=null?w2.getText():null));}

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, functionCallArgumentList_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "functionCallArgumentList"



    // $ANTLR start "assignment"
    // nopC.g:277:1: assignment[GenericStatement parent] : NAME ( '=' expression[p] | '*=' expression[p] | '/=' expression[p] | '%=' expression[p] | '+=' expression[p] | '-=' expression[p] | '<<=' expression[p] | '>>=' expression[p] | '&=' expression[p] | '^=' expression[p] | '|=' expression[p] ) ;
    public final void assignment(GenericStatement parent) throws RecognitionException {
        int assignment_StartIndex = input.index();

        Token NAME4=null;


          GenericStatement p = parent;
          if (p == null) { p = hackStore1;}

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // nopC.g:282:3: ( NAME ( '=' expression[p] | '*=' expression[p] | '/=' expression[p] | '%=' expression[p] | '+=' expression[p] | '-=' expression[p] | '<<=' expression[p] | '>>=' expression[p] | '&=' expression[p] | '^=' expression[p] | '|=' expression[p] ) )
            // nopC.g:283:5: NAME ( '=' expression[p] | '*=' expression[p] | '/=' expression[p] | '%=' expression[p] | '+=' expression[p] | '-=' expression[p] | '<<=' expression[p] | '>>=' expression[p] | '&=' expression[p] | '^=' expression[p] | '|=' expression[p] )
            {
            NAME4=(Token)match(input,NAME,FOLLOW_NAME_in_assignment967); if (state.failed) return ;

            // nopC.g:283:10: ( '=' expression[p] | '*=' expression[p] | '/=' expression[p] | '%=' expression[p] | '+=' expression[p] | '-=' expression[p] | '<<=' expression[p] | '>>=' expression[p] | '&=' expression[p] | '^=' expression[p] | '|=' expression[p] )
            int alt24=11;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt24=1;
                }
                break;
            case 19:
                {
                alt24=2;
                }
                break;
            case 28:
                {
                alt24=3;
                }
                break;
            case 12:
                {
                alt24=4;
                }
                break;
            case 22:
                {
                alt24=5;
                }
                break;
            case 26:
                {
                alt24=6;
                }
                break;
            case 33:
                {
                alt24=7;
                }
                break;
            case 40:
                {
                alt24=8;
                }
                break;
            case 15:
                {
                alt24=9;
                }
                break;
            case 43:
                {
                alt24=10;
                }
                break;
            case 57:
                {
                alt24=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // nopC.g:283:14: '=' expression[p]
                    {
                    match(input,35,FOLLOW_35_in_assignment973); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_assignment975);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 2 :
                    // nopC.g:284:8: '*=' expression[p]
                    {
                    match(input,19,FOLLOW_19_in_assignment987); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_assignment989);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("MUL X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 3 :
                    // nopC.g:285:8: '/=' expression[p]
                    {
                    match(input,28,FOLLOW_28_in_assignment1001); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_assignment1003);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("DIV Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 4 :
                    // nopC.g:286:8: '%=' expression[p]
                    {
                    match(input,12,FOLLOW_12_in_assignment1015); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_assignment1017);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("MOD Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 5 :
                    // nopC.g:287:8: '+=' expression[p]
                    {
                    match(input,22,FOLLOW_22_in_assignment1029); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_assignment1031);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("ADD X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 6 :
                    // nopC.g:288:8: '-=' expression[p]
                    {
                    match(input,26,FOLLOW_26_in_assignment1043); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_assignment1045);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("SUB Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 7 :
                    // nopC.g:289:8: '<<=' expression[p]
                    {
                    match(input,33,FOLLOW_33_in_assignment1057); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_assignment1058);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("SHL Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 8 :
                    // nopC.g:290:8: '>>=' expression[p]
                    {
                    match(input,40,FOLLOW_40_in_assignment1070); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_assignment1071);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("SHR Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 9 :
                    // nopC.g:291:8: '&=' expression[p]
                    {
                    match(input,15,FOLLOW_15_in_assignment1083); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_assignment1085);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("AND X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 10 :
                    // nopC.g:292:8: '^=' expression[p]
                    {
                    match(input,43,FOLLOW_43_in_assignment1097); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_assignment1099);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("XOR X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 11 :
                    // nopC.g:293:8: '|=' expression[p]
                    {
                    match(input,57,FOLLOW_57_in_assignment1111); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_assignment1113);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("BOR X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, assignment_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "expression"
    // nopC.g:297:2: expression[GenericStatement parent] : logical_or_expression[parent] ( '?' expression[parent] ':' expression[parent] )? ;
    public final void expression(GenericStatement parent) throws RecognitionException {
        int expression_StartIndex = input.index();


        	    String label = "";
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // nopC.g:301:3: ( logical_or_expression[parent] ( '?' expression[parent] ':' expression[parent] )? )
            // nopC.g:301:5: logical_or_expression[parent] ( '?' expression[parent] ':' expression[parent] )?
            {
            pushFollow(FOLLOW_logical_or_expression_in_expression1144);
            logical_or_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:302:4: ( '?' expression[parent] ':' expression[parent] )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // nopC.g:303:5: '?' expression[parent] ':' expression[parent]
                    {
                    match(input,41,FOLLOW_41_in_expression1157); if (state.failed) return ;

                    if ( state.backtracking==0 ) {label = getNewLoopCounter(); writeASM("IFE X, 0\n   SET PC, ELSE" + label + "\n");}

                    pushFollow(FOLLOW_expression_in_expression1166);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeASM("SET PC, END" + label + "\n");}

                    match(input,29,FOLLOW_29_in_expression1179); if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeASM(":ELSE" + label + "\n");}

                    pushFollow(FOLLOW_expression_in_expression1186);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeASM(":END" + label + "\n");}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "logical_or_expression"
    // nopC.g:312:2: logical_or_expression[GenericStatement parent] : logical_and_expression[parent] ( '||' logical_and_expression[parent] )* ;
    public final void logical_or_expression(GenericStatement parent) throws RecognitionException {
        int logical_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // nopC.g:313:3: ( logical_and_expression[parent] ( '||' logical_and_expression[parent] )* )
            // nopC.g:313:5: logical_and_expression[parent] ( '||' logical_and_expression[parent] )*
            {
            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1214);
            logical_and_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:314:4: ( '||' logical_and_expression[parent] )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==58) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // nopC.g:315:5: '||' logical_and_expression[parent]
            	    {
            	    match(input,58,FOLLOW_58_in_logical_or_expression1227); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1231);
            	    logical_and_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \n OR X, Y\nIFG X, 0\n   SET X, 1\n");}

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, logical_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "logical_or_expression"



    // $ANTLR start "logical_and_expression"
    // nopC.g:319:2: logical_and_expression[GenericStatement parent] : inclusive_or_expression[parent] ( '&&' inclusive_or_expression[parent] )* ;
    public final void logical_and_expression(GenericStatement parent) throws RecognitionException {
        int logical_and_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // nopC.g:320:3: ( inclusive_or_expression[parent] ( '&&' inclusive_or_expression[parent] )* )
            // nopC.g:320:5: inclusive_or_expression[parent] ( '&&' inclusive_or_expression[parent] )*
            {
            pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1255);
            inclusive_or_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:321:4: ( '&&' inclusive_or_expression[parent] )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==13) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // nopC.g:322:5: '&&' inclusive_or_expression[parent]
            	    {
            	    match(input,13,FOLLOW_13_in_logical_and_expression1268); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1272);
            	    inclusive_or_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nIFG Y, 0\n   SET Y, FFFF\nAND X, Y\nIFG X, 0\n   SET X, 1\n");}

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, logical_and_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "logical_and_expression"



    // $ANTLR start "inclusive_or_expression"
    // nopC.g:326:2: inclusive_or_expression[GenericStatement parent] : exclusive_or_expression[parent] ( '|' exclusive_or_expression[parent] )* ;
    public final void inclusive_or_expression(GenericStatement parent) throws RecognitionException {
        int inclusive_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // nopC.g:327:3: ( exclusive_or_expression[parent] ( '|' exclusive_or_expression[parent] )* )
            // nopC.g:327:5: exclusive_or_expression[parent] ( '|' exclusive_or_expression[parent] )*
            {
            pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1296);
            exclusive_or_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:328:4: ( '|' exclusive_or_expression[parent] )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==56) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // nopC.g:329:5: '|' exclusive_or_expression[parent]
            	    {
            	    match(input,56,FOLLOW_56_in_inclusive_or_expression1309); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1313);
            	    exclusive_or_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nOR X, Y\n");}

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, inclusive_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "inclusive_or_expression"



    // $ANTLR start "exclusive_or_expression"
    // nopC.g:333:2: exclusive_or_expression[GenericStatement parent] : and_expression[parent] ( '^' and_expression[parent] )* ;
    public final void exclusive_or_expression(GenericStatement parent) throws RecognitionException {
        int exclusive_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // nopC.g:334:3: ( and_expression[parent] ( '^' and_expression[parent] )* )
            // nopC.g:334:5: and_expression[parent] ( '^' and_expression[parent] )*
            {
            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1337);
            and_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:335:3: ( '^' and_expression[parent] )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==42) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // nopC.g:336:4: '^' and_expression[parent]
            	    {
            	    match(input,42,FOLLOW_42_in_exclusive_or_expression1348); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1352);
            	    and_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nXOR X, Y\n");}

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, exclusive_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "exclusive_or_expression"



    // $ANTLR start "and_expression"
    // nopC.g:340:2: and_expression[GenericStatement parent] : equality_expression[parent] ( '&' equality_expression[parent] )* ;
    public final void and_expression(GenericStatement parent) throws RecognitionException {
        int and_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // nopC.g:341:3: ( equality_expression[parent] ( '&' equality_expression[parent] )* )
            // nopC.g:341:5: equality_expression[parent] ( '&' equality_expression[parent] )*
            {
            pushFollow(FOLLOW_equality_expression_in_and_expression1375);
            equality_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:342:3: ( '&' equality_expression[parent] )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==14) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // nopC.g:343:4: '&' equality_expression[parent]
            	    {
            	    match(input,14,FOLLOW_14_in_and_expression1386); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_equality_expression_in_and_expression1390);
            	    equality_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nAND X, Y\n");}

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, and_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "and_expression"



    // $ANTLR start "equality_expression"
    // nopC.g:347:2: equality_expression[GenericStatement parent] : relational_expression[parent] ( '==' relational_expression[parent] | '!=' relational_expression[parent] )* ;
    public final void equality_expression(GenericStatement parent) throws RecognitionException {
        int equality_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }

            // nopC.g:348:3: ( relational_expression[parent] ( '==' relational_expression[parent] | '!=' relational_expression[parent] )* )
            // nopC.g:348:5: relational_expression[parent] ( '==' relational_expression[parent] | '!=' relational_expression[parent] )*
            {
            pushFollow(FOLLOW_relational_expression_in_equality_expression1416);
            relational_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:349:4: ( '==' relational_expression[parent] | '!=' relational_expression[parent] )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==36) ) {
                    alt31=1;
                }
                else if ( (LA31_0==10) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // nopC.g:350:5: '==' relational_expression[parent]
            	    {
            	    match(input,36,FOLLOW_36_in_equality_expression1429); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1433);
            	    relational_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFE	 X, Y\n   SET B, 1\nSET X, B\n");}

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:351:6: '!=' relational_expression[parent]
            	    {
            	    match(input,10,FOLLOW_10_in_equality_expression1443); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1447);
            	    relational_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFN  X, Y\n   SET B, 1\nSET X, B\n");}

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, equality_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "equality_expression"



    // $ANTLR start "relational_expression"
    // nopC.g:356:2: relational_expression[GenericStatement parent] : shift_expression[parent] ( '<' shift_expression[parent] | '>' shift_expression[parent] | '<=' shift_expression[parent] | '>=' shift_expression[parent] )* ;
    public final void relational_expression(GenericStatement parent) throws RecognitionException {
        int relational_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }

            // nopC.g:357:3: ( shift_expression[parent] ( '<' shift_expression[parent] | '>' shift_expression[parent] | '<=' shift_expression[parent] | '>=' shift_expression[parent] )* )
            // nopC.g:357:5: shift_expression[parent] ( '<' shift_expression[parent] | '>' shift_expression[parent] | '<=' shift_expression[parent] | '>=' shift_expression[parent] )*
            {
            pushFollow(FOLLOW_shift_expression_in_relational_expression1476);
            shift_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:358:4: ( '<' shift_expression[parent] | '>' shift_expression[parent] | '<=' shift_expression[parent] | '>=' shift_expression[parent] )*
            loop32:
            do {
                int alt32=5;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    alt32=1;
                    }
                    break;
                case 37:
                    {
                    alt32=2;
                    }
                    break;
                case 34:
                    {
                    alt32=3;
                    }
                    break;
                case 38:
                    {
                    alt32=4;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // nopC.g:359:7: '<' shift_expression[parent]
            	    {
            	    match(input,31,FOLLOW_31_in_relational_expression1491); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1495);
            	    shift_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFG X, Y\n   SET B, 1\nSET X, B\n");}

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:360:7: '>' shift_expression[parent]
            	    {
            	    match(input,37,FOLLOW_37_in_relational_expression1508); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1512);
            	    shift_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFG Y, X\n   SET B, 1\nSET X, B\n");}

            	    }
            	    break;
            	case 3 :
            	    // nopC.g:361:7: '<=' shift_expression[parent]
            	    {
            	    match(input,34,FOLLOW_34_in_relational_expression1525); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1529);
            	    shift_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFG X, Y\n   SET B, 1\nIFE X, Y\n    SET B, 1\nSET X, B\n" );}

            	    }
            	    break;
            	case 4 :
            	    // nopC.g:362:7: '>=' shift_expression[parent]
            	    {
            	    match(input,38,FOLLOW_38_in_relational_expression1542); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1546);
            	    shift_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFG Y, X\n   SET B, 1\nIFE X, Y\n    SET B, 1\nSET X, B\n" );}

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, relational_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "relational_expression"



    // $ANTLR start "shift_expression"
    // nopC.g:366:2: shift_expression[GenericStatement parent] : additive_expression[parent] ( '<<' additive_expression[parent] | '>>' additive_expression[parent] )* ;
    public final void shift_expression(GenericStatement parent) throws RecognitionException {
        int shift_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }

            // nopC.g:367:3: ( additive_expression[parent] ( '<<' additive_expression[parent] | '>>' additive_expression[parent] )* )
            // nopC.g:367:5: additive_expression[parent] ( '<<' additive_expression[parent] | '>>' additive_expression[parent] )*
            {
            pushFollow(FOLLOW_additive_expression_in_shift_expression1576);
            additive_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:368:3: ( '<<' additive_expression[parent] | '>>' additive_expression[parent] )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==32) ) {
                    alt33=1;
                }
                else if ( (LA33_0==39) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // nopC.g:369:5: '<<' additive_expression[parent]
            	    {
            	    match(input,32,FOLLOW_32_in_shift_expression1588); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_additive_expression_in_shift_expression1592);
            	    additive_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nSHL Y, X\nSET X, Y\n");}

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:370:6: '>>' additive_expression[parent]
            	    {
            	    match(input,39,FOLLOW_39_in_shift_expression1602); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_additive_expression_in_shift_expression1606);
            	    additive_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nSHR Y, X\nSET X, Y\n");}

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, shift_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "shift_expression"



    // $ANTLR start "additive_expression"
    // nopC.g:374:2: additive_expression[GenericStatement parent] : ( multiplicative_expression[parent] ) ( '+' multiplicative_expression[parent] | '-' multiplicative_expression[parent] )* ;
    public final void additive_expression(GenericStatement parent) throws RecognitionException {
        int additive_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }

            // nopC.g:375:3: ( ( multiplicative_expression[parent] ) ( '+' multiplicative_expression[parent] | '-' multiplicative_expression[parent] )* )
            // nopC.g:375:5: ( multiplicative_expression[parent] ) ( '+' multiplicative_expression[parent] | '-' multiplicative_expression[parent] )*
            {
            // nopC.g:375:5: ( multiplicative_expression[parent] )
            // nopC.g:375:6: multiplicative_expression[parent]
            {
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1633);
            multiplicative_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            }


            // nopC.g:376:4: ( '+' multiplicative_expression[parent] | '-' multiplicative_expression[parent] )*
            loop34:
            do {
                int alt34=3;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==20) ) {
                    alt34=1;
                }
                else if ( (LA34_0==24) ) {
                    alt34=2;
                }


                switch (alt34) {
            	case 1 :
            	    // nopC.g:377:6: '+' multiplicative_expression[parent]
            	    {
            	    match(input,20,FOLLOW_20_in_additive_expression1648); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1652);
            	    multiplicative_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nADD X, Y\n");}

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:378:7: '-' multiplicative_expression[parent]
            	    {
            	    match(input,24,FOLLOW_24_in_additive_expression1664); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1668);
            	    multiplicative_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nSUB Y, X\nSET X, Y \n");}

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, additive_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "additive_expression"



    // $ANTLR start "multiplicative_expression"
    // nopC.g:382:2: multiplicative_expression[GenericStatement parent] : ( unary_expression[parent] ) ( '*' unary_expression[parent] | '/' unary_expression[parent] | '%' unary_expression[parent] )* ;
    public final void multiplicative_expression(GenericStatement parent) throws RecognitionException {
        int multiplicative_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }

            // nopC.g:383:3: ( ( unary_expression[parent] ) ( '*' unary_expression[parent] | '/' unary_expression[parent] | '%' unary_expression[parent] )* )
            // nopC.g:383:5: ( unary_expression[parent] ) ( '*' unary_expression[parent] | '/' unary_expression[parent] | '%' unary_expression[parent] )*
            {
            // nopC.g:383:5: ( unary_expression[parent] )
            // nopC.g:383:6: unary_expression[parent]
            {
            pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1694);
            unary_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            }


            // nopC.g:384:5: ( '*' unary_expression[parent] | '/' unary_expression[parent] | '%' unary_expression[parent] )*
            loop35:
            do {
                int alt35=4;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt35=1;
                    }
                    break;
                case 27:
                    {
                    alt35=2;
                    }
                    break;
                case 11:
                    {
                    alt35=3;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // nopC.g:385:6: '*' unary_expression[parent]
            	    {
            	    match(input,18,FOLLOW_18_in_multiplicative_expression1710); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1714);
            	    unary_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nMUL X, Y\n");}

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:386:7: '/' unary_expression[parent]
            	    {
            	    match(input,27,FOLLOW_27_in_multiplicative_expression1726); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1730);
            	    unary_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nDIV Y, X\nSET X, Y \n");}

            	    }
            	    break;
            	case 3 :
            	    // nopC.g:387:7: '%' unary_expression[parent]
            	    {
            	    match(input,11,FOLLOW_11_in_multiplicative_expression1742); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1746);
            	    unary_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nMOD Y, X\nSET X, Y \n");}

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, multiplicative_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "multiplicative_expression"



    // $ANTLR start "unary_expression"
    // nopC.g:394:1: unary_expression[GenericStatement parent] : (p= postfix_expression[parent] | '++' unary_expression[parent] | '--' unary_expression[parent] );
    public final void unary_expression(GenericStatement parent) throws RecognitionException {
        int unary_expression_StartIndex = input.index();

        String p =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }

            // nopC.g:395:3: (p= postfix_expression[parent] | '++' unary_expression[parent] | '--' unary_expression[parent] )
            int alt36=3;
            switch ( input.LA(1) ) {
            case NAME:
            case WERT:
            case 16:
                {
                alt36=1;
                }
                break;
            case 21:
                {
                alt36=2;
                }
                break;
            case 25:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // nopC.g:395:5: p= postfix_expression[parent]
                    {
                    pushFollow(FOLLOW_postfix_expression_in_unary_expression1779);
                    p=postfix_expression(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:396:5: '++' unary_expression[parent]
                    {
                    match(input,21,FOLLOW_21_in_unary_expression1787); if (state.failed) return ;

                    pushFollow(FOLLOW_unary_expression_in_unary_expression1789);
                    unary_expression(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeASM("ADD X, 1\n"); if (p != null) {writeSetRegToMemory("X", p, parent.getScope()); }}

                    }
                    break;
                case 3 :
                    // nopC.g:397:5: '--' unary_expression[parent]
                    {
                    match(input,25,FOLLOW_25_in_unary_expression1797); if (state.failed) return ;

                    pushFollow(FOLLOW_unary_expression_in_unary_expression1799);
                    unary_expression(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeASM("SUB X, 1\n"); if (p != null) {writeSetRegToMemory("X", p, parent.getScope()); }}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, unary_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "unary_expression"



    // $ANTLR start "postfix_expression"
    // nopC.g:400:1: postfix_expression[GenericStatement parent] returns [String varname] : p= primary_expression[parent] ( '++' | '--' )* ;
    public final String postfix_expression(GenericStatement parent) throws RecognitionException {
        String varname = null;

        int postfix_expression_StartIndex = input.index();

        String p =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return varname; }

            // nopC.g:401:3: (p= primary_expression[parent] ( '++' | '--' )* )
            // nopC.g:401:7: p= primary_expression[parent] ( '++' | '--' )*
            {
            pushFollow(FOLLOW_primary_expression_in_postfix_expression1825);
            p=primary_expression(parent);

            state._fsp--;
            if (state.failed) return varname;

            // nopC.g:402:9: ( '++' | '--' )*
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==21) ) {
                    alt37=1;
                }
                else if ( (LA37_0==25) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // nopC.g:402:11: '++'
            	    {
            	    match(input,21,FOLLOW_21_in_postfix_expression1838); if (state.failed) return varname;

            	    if ( state.backtracking==0 ) {writeASM("ADD X, 1\n"); if (p != null) {writeSetRegToMemory("X", p, parent.getScope()); }}

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:403:11: '--'
            	    {
            	    match(input,25,FOLLOW_25_in_postfix_expression1852); if (state.failed) return varname;

            	    if ( state.backtracking==0 ) {writeASM("SUB X, 1\n"); if (p != null) {writeSetRegToMemory("X", p, parent.getScope()); }}

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            if ( state.backtracking==0 ) {varname = p;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, postfix_expression_StartIndex); }

        }
        return varname;
    }
    // $ANTLR end "postfix_expression"



    // $ANTLR start "primary_expression"
    // nopC.g:408:1: primary_expression[GenericStatement parent] returns [String varname] : ( NAME | '(' expression[parent] ')' | functionCall[parent] | WERT );
    public final String primary_expression(GenericStatement parent) throws RecognitionException {
        String varname = null;

        int primary_expression_StartIndex = input.index();

        Token NAME5=null;
        Token WERT6=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return varname; }

            // nopC.g:409:3: ( NAME | '(' expression[parent] ')' | functionCall[parent] | WERT )
            int alt38=4;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==16) ) {
                    alt38=3;
                }
                else if ( (LA38_1==EOF||(LA38_1 >= 10 && LA38_1 <= 11)||(LA38_1 >= 13 && LA38_1 <= 14)||(LA38_1 >= 17 && LA38_1 <= 18)||(LA38_1 >= 20 && LA38_1 <= 21)||(LA38_1 >= 23 && LA38_1 <= 25)||LA38_1==27||(LA38_1 >= 29 && LA38_1 <= 32)||LA38_1==34||(LA38_1 >= 36 && LA38_1 <= 39)||(LA38_1 >= 41 && LA38_1 <= 42)||LA38_1==56||LA38_1==58) ) {
                    alt38=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return varname;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;

                }
                }
                break;
            case 16:
                {
                alt38=2;
                }
                break;
            case WERT:
                {
                alt38=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return varname;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // nopC.g:409:5: NAME
                    {
                    NAME5=(Token)match(input,NAME,FOLLOW_NAME_in_primary_expression1891); if (state.failed) return varname;

                    if ( state.backtracking==0 ) {writeSetVarToReg("X", (NAME5!=null?NAME5.getText():null), parent.getScope()); varname = (NAME5!=null?NAME5.getText():null);}

                    }
                    break;
                case 2 :
                    // nopC.g:410:5: '(' expression[parent] ')'
                    {
                    match(input,16,FOLLOW_16_in_primary_expression1899); if (state.failed) return varname;

                    pushFollow(FOLLOW_expression_in_primary_expression1901);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return varname;

                    match(input,17,FOLLOW_17_in_primary_expression1904); if (state.failed) return varname;

                    }
                    break;
                case 3 :
                    // nopC.g:411:5: functionCall[parent]
                    {
                    pushFollow(FOLLOW_functionCall_in_primary_expression1911);
                    functionCall(parent);

                    state._fsp--;
                    if (state.failed) return varname;

                    }
                    break;
                case 4 :
                    // nopC.g:412:5: WERT
                    {
                    WERT6=(Token)match(input,WERT,FOLLOW_WERT_in_primary_expression1918); if (state.failed) return varname;

                    if ( state.backtracking==0 ) {writeSetImmidiateToReg("X", (WERT6!=null?WERT6.getText():null));}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, primary_expression_StartIndex); }

        }
        return varname;
    }
    // $ANTLR end "primary_expression"



    // $ANTLR start "typeSpecifier"
    // nopC.g:435:1: typeSpecifier : ( 'int' | 'void' | 'bool' );
    public final void typeSpecifier() throws RecognitionException {
        int typeSpecifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }

            // nopC.g:436:3: ( 'int' | 'void' | 'bool' )
            // nopC.g:
            {
            if ( input.LA(1)==44||input.LA(1)==51||input.LA(1)==53 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, typeSpecifier_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "typeSpecifier"

    // $ANTLR start synpred4_nopC
    public final void synpred4_nopC_fragment() throws RecognitionException {
        // nopC.g:137:3: ( typeSpecifier NAME ( '=' | ';' | ',' ) )
        // nopC.g:137:4: typeSpecifier NAME ( '=' | ';' | ',' )
        {
        pushFollow(FOLLOW_typeSpecifier_in_synpred4_nopC100);
        typeSpecifier();

        state._fsp--;
        if (state.failed) return ;

        match(input,NAME,FOLLOW_NAME_in_synpred4_nopC102); if (state.failed) return ;

        if ( input.LA(1)==23||input.LA(1)==30||input.LA(1)==35 ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred4_nopC

    // $ANTLR start synpred5_nopC
    public final void synpred5_nopC_fragment() throws RecognitionException {
        // nopC.g:138:5: ( typeSpecifier NAME '(' )
        // nopC.g:138:6: typeSpecifier NAME '('
        {
        pushFollow(FOLLOW_typeSpecifier_in_synpred5_nopC129);
        typeSpecifier();

        state._fsp--;
        if (state.failed) return ;

        match(input,NAME,FOLLOW_NAME_in_synpred5_nopC131); if (state.failed) return ;

        match(input,16,FOLLOW_16_in_synpred5_nopC134); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_nopC

    // $ANTLR start synpred17_nopC
    public final void synpred17_nopC_fragment() throws RecognitionException {
        // nopC.g:205:7: ( ( functionCall[null] ';' ) )
        // nopC.g:205:7: ( functionCall[null] ';' )
        {
        // nopC.g:205:7: ( functionCall[null] ';' )
        // nopC.g:205:9: functionCall[null] ';'
        {
        pushFollow(FOLLOW_functionCall_in_synpred17_nopC516);
        functionCall(null);

        state._fsp--;
        if (state.failed) return ;

        match(input,30,FOLLOW_30_in_synpred17_nopC519); if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred17_nopC

    // Delegated rules

    public final boolean synpred17_nopC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_nopC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_nopC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_nopC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_nopC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_nopC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_globalFunctionOrStatement_in_cFile73 = new BitSet(new long[]{0x0028100000000002L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_globalFunctionOrStatement119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_globalFunctionOrStatement139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_globalVariableDeclaration164 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_globalVariableDeclarationList_in_globalVariableDeclaration166 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_globalVariableDeclaration169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_globalVariableDeclarationList201 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_globalVariableDeclarationList203 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WERT_in_globalVariableDeclarationList209 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_globalVariableDeclarationList216 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_globalVariableDeclarationList223 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_globalVariableDeclarationList225 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WERT_in_globalVariableDeclarationList231 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_typeSpecifier_in_variableDeclaration260 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_variableDeclarationList_in_variableDeclaration262 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_variableDeclaration265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_variableDeclarationList296 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_variableDeclarationList299 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_variableDeclarationList301 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_variableDeclarationList309 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_variableDeclarationList316 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_variableDeclarationList319 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_variableDeclarationList321 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_typeSpecifier_in_functionDefinition358 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_functionDefinition362 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDefinition369 = new BitSet(new long[]{0x0028100000020000L});
    public static final BitSet FOLLOW_parameterList_in_functionDefinition373 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionDefinition379 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_functionDefinition383 = new BitSet(new long[]{0x087F700042210180L});
    public static final BitSet FOLLOW_statement_in_functionDefinition389 = new BitSet(new long[]{0x087F700042210180L});
    public static final BitSet FOLLOW_59_in_functionDefinition404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_parameterList432 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_parameterList439 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_parameterList444 = new BitSet(new long[]{0x0028100000000000L});
    public static final BitSet FOLLOW_typeSpecifier_in_parameterList446 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_parameterList453 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_55_in_codeBlock477 = new BitSet(new long[]{0x087F700042210180L});
    public static final BitSet FOLLOW_statement_in_codeBlock478 = new BitSet(new long[]{0x087F700042210180L});
    public static final BitSet FOLLOW_59_in_codeBlock481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_codeBlock487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement516 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement530 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_statement543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_selection_statement600 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_selection_statement602 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_selection_statement604 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_selection_statement607 = new BitSet(new long[]{0x00FF700042210180L});
    public static final BitSet FOLLOW_codeBlock_in_selection_statement609 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_selection_statement625 = new BitSet(new long[]{0x00FF700042210180L});
    public static final BitSet FOLLOW_codeBlock_in_selection_statement627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_iteration_statement649 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_iteration_statement651 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_iteration_statement653 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_iteration_statement656 = new BitSet(new long[]{0x00FF700042210180L});
    public static final BitSet FOLLOW_codeBlock_in_iteration_statement658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_iteration_statement665 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_iteration_statement667 = new BitSet(new long[]{0x0000000042210180L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement670 = new BitSet(new long[]{0x0000000042210180L});
    public static final BitSet FOLLOW_assignment_in_iteration_statement675 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_iteration_statement678 = new BitSet(new long[]{0x0000000042210180L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement681 = new BitSet(new long[]{0x0000000002230180L});
    public static final BitSet FOLLOW_expression_in_iteration_statement684 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_iteration_statement688 = new BitSet(new long[]{0x00FF700042210180L});
    public static final BitSet FOLLOW_codeBlock_in_iteration_statement690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_expression_statement706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement712 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_expression_statement715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_jump_statement733 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_jump_statement735 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_jump_statement743 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_jump_statement751 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_jump_statement759 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_jump_statement767 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_jump_statement769 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_functionCall796 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionCall798 = new BitSet(new long[]{0x0000000000820180L});
    public static final BitSet FOLLOW_functionCallArgumentList_in_functionCall802 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionCall805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_functionCallArgumentList840 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallArgumentList851 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_WERT_in_functionCallArgumentList866 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_functionCallArgumentList881 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_NAME_in_functionCallArgumentList900 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallArgumentList912 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_WERT_in_functionCallArgumentList929 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_NAME_in_assignment967 = new BitSet(new long[]{0x0200090A14489000L});
    public static final BitSet FOLLOW_35_in_assignment973 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_assignment987 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_assignment1001 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_assignment1015 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_assignment1029 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_assignment1043 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_assignment1057 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_assignment1070 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_assignment1083 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_assignment1097 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_assignment1111 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_expression1144 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_expression1157 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_expression1166 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_expression1179 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_expression1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1214 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_logical_or_expression1227 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1231 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1255 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_logical_and_expression1268 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1272 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1296 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_inclusive_or_expression1309 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1313 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1337 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_exclusive_or_expression1348 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1352 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression1375 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_and_expression1386 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression1390 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1416 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_36_in_equality_expression1429 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1433 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_10_in_equality_expression1443 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1447 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1476 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_31_in_relational_expression1491 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1495 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_37_in_relational_expression1508 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1512 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_34_in_relational_expression1525 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1529 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_38_in_relational_expression1542 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1546 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1576 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_32_in_shift_expression1588 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1592 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_39_in_shift_expression1602 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1606 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1633 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_20_in_additive_expression1648 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1652 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_24_in_additive_expression1664 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1668 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1694 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_18_in_multiplicative_expression1710 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1714 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_27_in_multiplicative_expression1726 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1730 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_11_in_multiplicative_expression1742 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1746 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_unary_expression1787 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_unary_expression1797 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression1825 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_21_in_postfix_expression1838 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_25_in_postfix_expression1852 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_NAME_in_primary_expression1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_primary_expression1899 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_primary_expression1901 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_primary_expression1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primary_expression1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WERT_in_primary_expression1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_synpred4_nopC100 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_synpred4_nopC102 = new BitSet(new long[]{0x0000000840800000L});
    public static final BitSet FOLLOW_set_in_synpred4_nopC104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_synpred5_nopC129 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_synpred5_nopC131 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred5_nopC134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_synpred17_nopC516 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred17_nopC519 = new BitSet(new long[]{0x0000000000000002L});

}
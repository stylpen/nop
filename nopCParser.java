// $ANTLR 3.4 nopC.g 2012-05-13 12:31:14

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
    				writeASM(":" + label + " dat " +  String.format("%04x", Integer.parseInt(varTable.get(label))) + "\n");				
    			}
    			writeASM(":START JSR " + functionTable.get("main").getLabel() + "\n");				// Writes jump to main function so we can set pc to START at the beginning wihtout knowing where the main function will be
    		}
    		
    		
    		
    		
    		




    // $ANTLR start "cFile"
    // nopC.g:116:1: cFile returns [GenericStatement ret] : ( globalFunctionOrStatement[cFile] )+ ;
    public final GenericStatement cFile() throws RecognitionException {
        GenericStatement ret = null;

        int cFile_StartIndex = input.index();


        HashMap<String, String> scope = new HashMap<String, String>();
        GenericStatement cFile = new GenericStatement(scope, functionTable, varTable);
        startWritingASM();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ret; }

            // nopC.g:122:3: ( ( globalFunctionOrStatement[cFile] )+ )
            // nopC.g:123:3: ( globalFunctionOrStatement[cFile] )+
            {
            // nopC.g:123:3: ( globalFunctionOrStatement[cFile] )+
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
            	    // nopC.g:123:3: globalFunctionOrStatement[cFile]
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
    // nopC.g:128:1: globalFunctionOrStatement[GenericStatement parent] returns [GenericStatement ret] : ( ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration[parent] | ( typeSpecifier NAME '(' )=> functionDefinition[parent] );
    public final GenericStatement globalFunctionOrStatement(GenericStatement parent) throws RecognitionException {
        GenericStatement ret = null;

        int globalFunctionOrStatement_StartIndex = input.index();

        nopCParser.globalVariableDeclaration_return globalVariableDeclaration1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ret; }

            // nopC.g:129:3: ( ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration[parent] | ( typeSpecifier NAME '(' )=> functionDefinition[parent] )
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
                    // nopC.g:130:3: ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration[parent]
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_globalFunctionOrStatement119);
                    globalVariableDeclaration1=globalVariableDeclaration(parent);

                    state._fsp--;
                    if (state.failed) return ret;

                    if ( state.backtracking==0 ) {ret = (globalVariableDeclaration1!=null?globalVariableDeclaration1.ret:null);}

                    }
                    break;
                case 2 :
                    // nopC.g:131:5: ( typeSpecifier NAME '(' )=> functionDefinition[parent]
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
    // nopC.g:134:1: globalVariableDeclaration[GenericStatement parent] returns [GenericStatement ret] : typeSpecifier globalVariableDeclarationList[parent] ';' ;
    public final nopCParser.globalVariableDeclaration_return globalVariableDeclaration(GenericStatement parent) throws RecognitionException {
        nopCParser.globalVariableDeclaration_return retval = new nopCParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);

        int globalVariableDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // nopC.g:135:3: ( typeSpecifier globalVariableDeclarationList[parent] ';' )
            // nopC.g:137:3: typeSpecifier globalVariableDeclarationList[parent] ';'
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
    // nopC.g:145:1: globalVariableDeclarationList[GenericStatement parent] returns [GenericStatement ret] : (n1= NAME ( '=' w1= WERT )? ) ( ',' (n2= NAME ( '=' w2= WERT )? ) )* ;
    public final GenericStatement globalVariableDeclarationList(GenericStatement parent) throws RecognitionException {
        GenericStatement ret = null;

        int globalVariableDeclarationList_StartIndex = input.index();

        Token n1=null;
        Token w1=null;
        Token n2=null;
        Token w2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ret; }

            // nopC.g:146:3: ( (n1= NAME ( '=' w1= WERT )? ) ( ',' (n2= NAME ( '=' w2= WERT )? ) )* )
            // nopC.g:147:3: (n1= NAME ( '=' w1= WERT )? ) ( ',' (n2= NAME ( '=' w2= WERT )? ) )*
            {
            // nopC.g:147:3: (n1= NAME ( '=' w1= WERT )? )
            // nopC.g:147:4: n1= NAME ( '=' w1= WERT )?
            {
            n1=(Token)match(input,NAME,FOLLOW_NAME_in_globalVariableDeclarationList201); if (state.failed) return ret;

            // nopC.g:147:13: ( '=' w1= WERT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // nopC.g:147:14: '=' w1= WERT
                    {
                    match(input,35,FOLLOW_35_in_globalVariableDeclarationList203); if (state.failed) return ret;

                    w1=(Token)match(input,WERT,FOLLOW_WERT_in_globalVariableDeclarationList209); if (state.failed) return ret;

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {parent.addVarToScope((n1!=null?n1.getText():null), (w1!=null?w1.getText():null));}

            // nopC.g:147:74: ( ',' (n2= NAME ( '=' w2= WERT )? ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // nopC.g:147:75: ',' (n2= NAME ( '=' w2= WERT )? )
            	    {
            	    match(input,23,FOLLOW_23_in_globalVariableDeclarationList216); if (state.failed) return ret;

            	    // nopC.g:147:79: (n2= NAME ( '=' w2= WERT )? )
            	    // nopC.g:147:80: n2= NAME ( '=' w2= WERT )?
            	    {
            	    n2=(Token)match(input,NAME,FOLLOW_NAME_in_globalVariableDeclarationList223); if (state.failed) return ret;

            	    // nopC.g:147:89: ( '=' w2= WERT )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==35) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // nopC.g:147:90: '=' w2= WERT
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
    // nopC.g:150:1: variableDeclaration[GenericStatement parent] returns [GenericStatement ret] : typeSpecifier variableDeclarationList[parent] ';' ;
    public final nopCParser.variableDeclaration_return variableDeclaration(GenericStatement parent) throws RecognitionException {
        nopCParser.variableDeclaration_return retval = new nopCParser.variableDeclaration_return();
        retval.start = input.LT(1);

        int variableDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // nopC.g:151:3: ( typeSpecifier variableDeclarationList[parent] ';' )
            // nopC.g:152:3: typeSpecifier variableDeclarationList[parent] ';'
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
    // nopC.g:155:1: variableDeclarationList[GenericStatement parent] returns [GenericStatement ret] : (n1= NAME ( '=' expression[parent] )? ) ( ',' (n2= NAME ( '=' expression[parent] )? ) )* ;
    public final GenericStatement variableDeclarationList(GenericStatement parent) throws RecognitionException {
        GenericStatement ret = null;

        int variableDeclarationList_StartIndex = input.index();

        Token n1=null;
        Token n2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ret; }

            // nopC.g:156:3: ( (n1= NAME ( '=' expression[parent] )? ) ( ',' (n2= NAME ( '=' expression[parent] )? ) )* )
            // nopC.g:158:3: (n1= NAME ( '=' expression[parent] )? ) ( ',' (n2= NAME ( '=' expression[parent] )? ) )*
            {
            // nopC.g:158:3: (n1= NAME ( '=' expression[parent] )? )
            // nopC.g:158:4: n1= NAME ( '=' expression[parent] )?
            {
            n1=(Token)match(input,NAME,FOLLOW_NAME_in_variableDeclarationList296); if (state.failed) return ret;

            // nopC.g:158:14: ( '=' expression[parent] )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // nopC.g:158:15: '=' expression[parent]
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

            // nopC.g:158:140: ( ',' (n2= NAME ( '=' expression[parent] )? ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // nopC.g:158:141: ',' (n2= NAME ( '=' expression[parent] )? )
            	    {
            	    match(input,23,FOLLOW_23_in_variableDeclarationList309); if (state.failed) return ret;

            	    // nopC.g:158:145: (n2= NAME ( '=' expression[parent] )? )
            	    // nopC.g:158:146: n2= NAME ( '=' expression[parent] )?
            	    {
            	    n2=(Token)match(input,NAME,FOLLOW_NAME_in_variableDeclarationList316); if (state.failed) return ret;

            	    // nopC.g:158:156: ( '=' expression[parent] )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==35) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // nopC.g:158:157: '=' expression[parent]
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
    // nopC.g:162:1: functionDefinition[GenericStatement parent] returns [GenericStatement ret] : typeSpecifier NAME '(' parameterList[functionDefinition] ')' '{' ( statement[functionDefinition] )* '}' ;
    public final nopCParser.functionDefinition_return functionDefinition(GenericStatement parent) throws RecognitionException {
        nopCParser.functionDefinition_return retval = new nopCParser.functionDefinition_return();
        retval.start = input.LT(1);

        int functionDefinition_StartIndex = input.index();

        Token NAME2=null;


        FunctionDefinition functionDefinition = new FunctionDefinition(parent.getScope(), functionTable, varTable);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // nopC.g:166:3: ( typeSpecifier NAME '(' parameterList[functionDefinition] ')' '{' ( statement[functionDefinition] )* '}' )
            // nopC.g:167:5: typeSpecifier NAME '(' parameterList[functionDefinition] ')' '{' ( statement[functionDefinition] )* '}'
            {
            pushFollow(FOLLOW_typeSpecifier_in_functionDefinition358);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;

            NAME2=(Token)match(input,NAME,FOLLOW_NAME_in_functionDefinition360); if (state.failed) return retval;

            if ( state.backtracking==0 ) {functionDefinition.addFun((NAME2!=null?NAME2.getText():null)); writeASM(functionDefinition.getLabel() + ": \n"); }

            match(input,16,FOLLOW_16_in_functionDefinition364); if (state.failed) return retval;

            pushFollow(FOLLOW_parameterList_in_functionDefinition366);
            parameterList(functionDefinition);

            state._fsp--;
            if (state.failed) return retval;

            match(input,17,FOLLOW_17_in_functionDefinition369); if (state.failed) return retval;

            match(input,55,FOLLOW_55_in_functionDefinition371); if (state.failed) return retval;

            // nopC.g:167:162: ( statement[functionDefinition] )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= NAME && LA9_0 <= WERT)||LA9_0==16||LA9_0==21||LA9_0==25||LA9_0==30||(LA9_0 >= 44 && LA9_0 <= 46)||(LA9_0 >= 48 && LA9_0 <= 54)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // nopC.g:167:162: statement[functionDefinition]
            	    {
            	    pushFollow(FOLLOW_statement_in_functionDefinition373);
            	    statement(functionDefinition);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match(input,59,FOLLOW_59_in_functionDefinition377); if (state.failed) return retval;

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
    // nopC.g:171:1: parameterList[FunctionDefinition parent] : ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )? ;
    public final void parameterList(FunctionDefinition parent) throws RecognitionException {
        int parameterList_StartIndex = input.index();

        Token n1=null;
        Token n2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }

            // nopC.g:172:3: ( ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )? )
            // nopC.g:173:5: ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )?
            {
            // nopC.g:173:5: ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44||LA11_0==51||LA11_0==53) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // nopC.g:173:6: typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )*
                    {
                    pushFollow(FOLLOW_typeSpecifier_in_parameterList400);
                    typeSpecifier();

                    state._fsp--;
                    if (state.failed) return ;

                    // nopC.g:173:20: (n1= NAME )
                    // nopC.g:173:21: n1= NAME
                    {
                    n1=(Token)match(input,NAME,FOLLOW_NAME_in_parameterList407); if (state.failed) return ;

                    }


                    if ( state.backtracking==0 ) {parent.addParam((n1!=null?n1.getText():null));}

                    // nopC.g:173:60: ( ',' typeSpecifier (n2= NAME ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==23) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // nopC.g:173:61: ',' typeSpecifier (n2= NAME )
                    	    {
                    	    match(input,23,FOLLOW_23_in_parameterList412); if (state.failed) return ;

                    	    pushFollow(FOLLOW_typeSpecifier_in_parameterList414);
                    	    typeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    // nopC.g:173:79: (n2= NAME )
                    	    // nopC.g:173:80: n2= NAME
                    	    {
                    	    n2=(Token)match(input,NAME,FOLLOW_NAME_in_parameterList421); if (state.failed) return ;

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
    // nopC.g:176:1: codeBlock[GenericStatement parent] : ( '{' ( statement[parent] )* '}' | statement[parent] );
    public final void codeBlock(GenericStatement parent) throws RecognitionException {
        int codeBlock_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }

            // nopC.g:177:3: ( '{' ( statement[parent] )* '}' | statement[parent] )
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
                    // nopC.g:178:3: '{' ( statement[parent] )* '}'
                    {
                    match(input,55,FOLLOW_55_in_codeBlock445); if (state.failed) return ;

                    // nopC.g:178:6: ( statement[parent] )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= NAME && LA12_0 <= WERT)||LA12_0==16||LA12_0==21||LA12_0==25||LA12_0==30||(LA12_0 >= 44 && LA12_0 <= 46)||(LA12_0 >= 48 && LA12_0 <= 54)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // nopC.g:178:6: statement[parent]
                    	    {
                    	    pushFollow(FOLLOW_statement_in_codeBlock446);
                    	    statement(parent);

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    match(input,59,FOLLOW_59_in_codeBlock449); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:179:5: statement[parent]
                    {
                    pushFollow(FOLLOW_statement_in_codeBlock455);
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
    // nopC.g:183:1: statement[GenericStatement parent] : ( ( functionCall[null] ';' ) | ( assignment[null] ';' ) | variableDeclaration[parent] | selection_statement[parent] | iteration_statement[parent] | jump_statement[parent] | expression_statement[parent] );
    public final void statement(GenericStatement parent) throws RecognitionException {
        int statement_StartIndex = input.index();


          hackStore1 = parent; // We cannot pass parent to functionCall or assignment directly, as there is a synpred rule involved during backtracking which does not take parameters. Therefore we store it in a global variable to access the variable through this later

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }

            // nopC.g:187:3: ( ( functionCall[null] ';' ) | ( assignment[null] ';' ) | variableDeclaration[parent] | selection_statement[parent] | iteration_statement[parent] | jump_statement[parent] | expression_statement[parent] )
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
                    // nopC.g:188:7: ( functionCall[null] ';' )
                    {
                    // nopC.g:188:7: ( functionCall[null] ';' )
                    // nopC.g:188:9: functionCall[null] ';'
                    {
                    pushFollow(FOLLOW_functionCall_in_statement484);
                    functionCall(null);

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_statement487); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // nopC.g:189:7: ( assignment[null] ';' )
                    {
                    // nopC.g:189:7: ( assignment[null] ';' )
                    // nopC.g:189:9: assignment[null] ';'
                    {
                    pushFollow(FOLLOW_assignment_in_statement498);
                    assignment(null);

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_statement501); if (state.failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // nopC.g:190:7: variableDeclaration[parent]
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_statement511);
                    variableDeclaration(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // nopC.g:191:7: selection_statement[parent]
                    {
                    pushFollow(FOLLOW_selection_statement_in_statement520);
                    selection_statement(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // nopC.g:192:7: iteration_statement[parent]
                    {
                    pushFollow(FOLLOW_iteration_statement_in_statement529);
                    iteration_statement(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // nopC.g:193:7: jump_statement[parent]
                    {
                    pushFollow(FOLLOW_jump_statement_in_statement538);
                    jump_statement(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // nopC.g:194:7: expression_statement[parent]
                    {
                    pushFollow(FOLLOW_expression_statement_in_statement547);
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
    // nopC.g:198:1: selection_statement[GenericStatement parent] : 'if' '(' expression[parent] ')' codeBlock[selection_statement_if] ( options {k=1; backtrack=false; } : 'else' codeBlock[selection_statement_else] )? ;
    public final void selection_statement(GenericStatement parent) throws RecognitionException {
        int selection_statement_StartIndex = input.index();


        ScopedStatement selection_statement_if = new ScopedStatement(parent.getScope(), functionTable, varTable);
        ScopedStatement selection_statement_else = new ScopedStatement(parent.getScope(), functionTable, varTable);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // nopC.g:203:3: ( 'if' '(' expression[parent] ')' codeBlock[selection_statement_if] ( options {k=1; backtrack=false; } : 'else' codeBlock[selection_statement_else] )? )
            // nopC.g:203:5: 'if' '(' expression[parent] ')' codeBlock[selection_statement_if] ( options {k=1; backtrack=false; } : 'else' codeBlock[selection_statement_else] )?
            {
            match(input,50,FOLLOW_50_in_selection_statement568); if (state.failed) return ;

            match(input,16,FOLLOW_16_in_selection_statement570); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_selection_statement572);
            expression(parent);

            state._fsp--;
            if (state.failed) return ;

            match(input,17,FOLLOW_17_in_selection_statement575); if (state.failed) return ;

            pushFollow(FOLLOW_codeBlock_in_selection_statement577);
            codeBlock(selection_statement_if);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:203:71: ( options {k=1; backtrack=false; } : 'else' codeBlock[selection_statement_else] )?
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
                    // nopC.g:203:104: 'else' codeBlock[selection_statement_else]
                    {
                    match(input,47,FOLLOW_47_in_selection_statement593); if (state.failed) return ;

                    pushFollow(FOLLOW_codeBlock_in_selection_statement595);
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
    // nopC.g:206:1: iteration_statement[GenericStatement parent] : ( 'while' '(' expression[parent] ')' codeBlock[iteration_statement] | 'for' '(' expression_statement[parent] expression_statement[parent] ( expression[parent] )? ')' codeBlock[iteration_statement] );
    public final void iteration_statement(GenericStatement parent) throws RecognitionException {
        int iteration_statement_StartIndex = input.index();


        ScopedStatement iteration_statement = new ScopedStatement(parent.getScope(), functionTable, varTable);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

            // nopC.g:210:3: ( 'while' '(' expression[parent] ')' codeBlock[iteration_statement] | 'for' '(' expression_statement[parent] expression_statement[parent] ( expression[parent] )? ')' codeBlock[iteration_statement] )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==54) ) {
                alt17=1;
            }
            else if ( (LA17_0==48) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // nopC.g:210:5: 'while' '(' expression[parent] ')' codeBlock[iteration_statement]
                    {
                    match(input,54,FOLLOW_54_in_iteration_statement617); if (state.failed) return ;

                    match(input,16,FOLLOW_16_in_iteration_statement619); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_iteration_statement621);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,17,FOLLOW_17_in_iteration_statement624); if (state.failed) return ;

                    pushFollow(FOLLOW_codeBlock_in_iteration_statement626);
                    codeBlock(iteration_statement);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:211:5: 'for' '(' expression_statement[parent] expression_statement[parent] ( expression[parent] )? ')' codeBlock[iteration_statement]
                    {
                    match(input,48,FOLLOW_48_in_iteration_statement633); if (state.failed) return ;

                    match(input,16,FOLLOW_16_in_iteration_statement635); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_statement_in_iteration_statement637);
                    expression_statement(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expression_statement_in_iteration_statement640);
                    expression_statement(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    // nopC.g:211:73: ( expression[parent] )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0 >= NAME && LA16_0 <= WERT)||LA16_0==16||LA16_0==21||LA16_0==25) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // nopC.g:211:73: expression[parent]
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement643);
                            expression(parent);

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,17,FOLLOW_17_in_iteration_statement647); if (state.failed) return ;

                    pushFollow(FOLLOW_codeBlock_in_iteration_statement649);
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
    // nopC.g:214:1: expression_statement[GenericStatement parent] : ( ';' | expression[parent] ';' );
    public final void expression_statement(GenericStatement parent) throws RecognitionException {
        int expression_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }

            // nopC.g:215:3: ( ';' | expression[parent] ';' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            else if ( ((LA18_0 >= NAME && LA18_0 <= WERT)||LA18_0==16||LA18_0==21||LA18_0==25) ) {
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
                    // nopC.g:215:5: ';'
                    {
                    match(input,30,FOLLOW_30_in_expression_statement665); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:216:5: expression[parent] ';'
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement671);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_expression_statement674); if (state.failed) return ;

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
    // nopC.g:220:1: jump_statement[GenericStatement parent] : ( 'goto' NAME ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression[parent] ';' );
    public final void jump_statement(GenericStatement parent) throws RecognitionException {
        int jump_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // nopC.g:221:3: ( 'goto' NAME ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression[parent] ';' )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt19=1;
                }
                break;
            case 46:
                {
                alt19=2;
                }
                break;
            case 45:
                {
                alt19=3;
                }
                break;
            case 52:
                {
                int LA19_4 = input.LA(2);

                if ( (LA19_4==30) ) {
                    alt19=4;
                }
                else if ( ((LA19_4 >= NAME && LA19_4 <= WERT)||LA19_4==16||LA19_4==21||LA19_4==25) ) {
                    alt19=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // nopC.g:221:5: 'goto' NAME ';'
                    {
                    match(input,49,FOLLOW_49_in_jump_statement692); if (state.failed) return ;

                    match(input,NAME,FOLLOW_NAME_in_jump_statement694); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement696); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:222:5: 'continue' ';'
                    {
                    match(input,46,FOLLOW_46_in_jump_statement702); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement704); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // nopC.g:223:5: 'break' ';'
                    {
                    match(input,45,FOLLOW_45_in_jump_statement710); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement712); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // nopC.g:224:5: 'return' ';'
                    {
                    match(input,52,FOLLOW_52_in_jump_statement718); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement720); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // nopC.g:225:5: 'return' expression[parent] ';'
                    {
                    match(input,52,FOLLOW_52_in_jump_statement726); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_jump_statement728);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement731); if (state.failed) return ;

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
    // nopC.g:228:1: functionCall[GenericStatement parent] : NAME '(' functionCallArgumentList[p, fun] ')' ;
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

            // nopC.g:238:3: ( NAME '(' functionCallArgumentList[p, fun] ')' )
            // nopC.g:239:3: NAME '(' functionCallArgumentList[p, fun] ')'
            {
            NAME3=(Token)match(input,NAME,FOLLOW_NAME_in_functionCall754); if (state.failed) return ;

            match(input,16,FOLLOW_16_in_functionCall756); if (state.failed) return ;

            if ( state.backtracking==0 ) {fun = functionTable.get((NAME3!=null?NAME3.getText():null));}

            pushFollow(FOLLOW_functionCallArgumentList_in_functionCall760);
            functionCallArgumentList(p, fun);

            state._fsp--;
            if (state.failed) return ;

            match(input,17,FOLLOW_17_in_functionCall763); if (state.failed) return ;

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
    // nopC.g:242:1: functionCallArgumentList[GenericStatement parent, FunctionDefinition fun] : ( NAME | functionCall[parent] | WERT )? ( ',' ( NAME | functionCall[parent] | WERT ) )* ;
    public final void functionCallArgumentList(GenericStatement parent, FunctionDefinition fun) throws RecognitionException {
        int functionCallArgumentList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

            // nopC.g:243:3: ( ( NAME | functionCall[parent] | WERT )? ( ',' ( NAME | functionCall[parent] | WERT ) )* )
            // nopC.g:244:7: ( NAME | functionCall[parent] | WERT )? ( ',' ( NAME | functionCall[parent] | WERT ) )*
            {
            // nopC.g:244:7: ( NAME | functionCall[parent] | WERT )?
            int alt20=4;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NAME) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==16) ) {
                    alt20=2;
                }
                else if ( (LA20_1==17||LA20_1==23) ) {
                    alt20=1;
                }
            }
            else if ( (LA20_0==WERT) ) {
                alt20=3;
            }
            switch (alt20) {
                case 1 :
                    // nopC.g:244:8: NAME
                    {
                    match(input,NAME,FOLLOW_NAME_in_functionCallArgumentList785); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:244:15: functionCall[parent]
                    {
                    pushFollow(FOLLOW_functionCall_in_functionCallArgumentList789);
                    functionCall(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // nopC.g:244:38: WERT
                    {
                    match(input,WERT,FOLLOW_WERT_in_functionCallArgumentList794); if (state.failed) return ;

                    }
                    break;

            }


            // nopC.g:244:45: ( ',' ( NAME | functionCall[parent] | WERT ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // nopC.g:244:46: ',' ( NAME | functionCall[parent] | WERT )
            	    {
            	    match(input,23,FOLLOW_23_in_functionCallArgumentList799); if (state.failed) return ;

            	    // nopC.g:244:50: ( NAME | functionCall[parent] | WERT )
            	    int alt21=3;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==NAME) ) {
            	        int LA21_1 = input.LA(2);

            	        if ( (LA21_1==16) ) {
            	            alt21=2;
            	        }
            	        else if ( (LA21_1==17||LA21_1==23) ) {
            	            alt21=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 21, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else if ( (LA21_0==WERT) ) {
            	        alt21=3;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // nopC.g:244:51: NAME
            	            {
            	            match(input,NAME,FOLLOW_NAME_in_functionCallArgumentList802); if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // nopC.g:244:58: functionCall[parent]
            	            {
            	            pushFollow(FOLLOW_functionCall_in_functionCallArgumentList806);
            	            functionCall(parent);

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // nopC.g:244:81: WERT
            	            {
            	            match(input,WERT,FOLLOW_WERT_in_functionCallArgumentList811); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // nopC.g:247:1: assignment[GenericStatement parent] : NAME assignmentOperator expression[p] ;
    public final void assignment(GenericStatement parent) throws RecognitionException {
        int assignment_StartIndex = input.index();

        Token NAME4=null;


          GenericStatement p = parent; 

          if (p == null) {
             p = hackStore1;
          }

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // nopC.g:255:3: ( NAME assignmentOperator expression[p] )
            // nopC.g:256:5: NAME assignmentOperator expression[p]
            {
            NAME4=(Token)match(input,NAME,FOLLOW_NAME_in_assignment837); if (state.failed) return ;

            if ( state.backtracking==0 ) {System.out.println("HIER: " + (NAME4!=null?NAME4.getText():null));}

            pushFollow(FOLLOW_assignmentOperator_in_assignment841);
            assignmentOperator();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_assignment843);
            expression(p);

            state._fsp--;
            if (state.failed) return ;

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



    // $ANTLR start "assignmentOperator"
    // nopC.g:262:1: assignmentOperator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
    public final void assignmentOperator() throws RecognitionException {
        int assignmentOperator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // nopC.g:263:2: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
            // nopC.g:
            {
            if ( input.LA(1)==12||input.LA(1)==15||input.LA(1)==19||input.LA(1)==22||input.LA(1)==26||input.LA(1)==28||input.LA(1)==33||input.LA(1)==35||input.LA(1)==40||input.LA(1)==43||input.LA(1)==57 ) {
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
            if ( state.backtracking>0 ) { memoize(input, 18, assignmentOperator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "assignmentOperator"



    // $ANTLR start "expression"
    // nopC.g:276:2: expression[GenericStatement parent] : logical_or_expression[parent] ( '?' expression[parent] ':' expression[parent] )? ;
    public final void expression(GenericStatement parent) throws RecognitionException {
        int expression_StartIndex = input.index();


        	    String label = "";
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // nopC.g:280:3: ( logical_or_expression[parent] ( '?' expression[parent] ':' expression[parent] )? )
            // nopC.g:280:5: logical_or_expression[parent] ( '?' expression[parent] ':' expression[parent] )?
            {
            pushFollow(FOLLOW_logical_or_expression_in_expression928);
            logical_or_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:281:4: ( '?' expression[parent] ':' expression[parent] )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // nopC.g:282:5: '?' expression[parent] ':' expression[parent]
                    {
                    match(input,41,FOLLOW_41_in_expression941); if (state.failed) return ;

                    if ( state.backtracking==0 ) {label = getNewLoopCounter(); writeASM("IFE X, 0\n   SET PC, ELSE" + label + "\n");}

                    pushFollow(FOLLOW_expression_in_expression950);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeASM("SET PC, END" + label + "\n");}

                    match(input,29,FOLLOW_29_in_expression963); if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeASM(":ELSE" + label + "\n");}

                    pushFollow(FOLLOW_expression_in_expression970);
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
            if ( state.backtracking>0 ) { memoize(input, 19, expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "logical_or_expression"
    // nopC.g:291:2: logical_or_expression[GenericStatement parent] : logical_and_expression[parent] ( '||' logical_and_expression[parent] )* ;
    public final void logical_or_expression(GenericStatement parent) throws RecognitionException {
        int logical_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // nopC.g:292:3: ( logical_and_expression[parent] ( '||' logical_and_expression[parent] )* )
            // nopC.g:292:5: logical_and_expression[parent] ( '||' logical_and_expression[parent] )*
            {
            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression998);
            logical_and_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:293:4: ( '||' logical_and_expression[parent] )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==58) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // nopC.g:294:5: '||' logical_and_expression[parent]
            	    {
            	    match(input,58,FOLLOW_58_in_logical_or_expression1011); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1015);
            	    logical_and_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \n OR X, Y\nIFG X, 0\n   SET X, 1\n");}

            	    }
            	    break;

            	default :
            	    break loop24;
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
            if ( state.backtracking>0 ) { memoize(input, 20, logical_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "logical_or_expression"



    // $ANTLR start "logical_and_expression"
    // nopC.g:298:2: logical_and_expression[GenericStatement parent] : inclusive_or_expression[parent] ( '&&' inclusive_or_expression[parent] )* ;
    public final void logical_and_expression(GenericStatement parent) throws RecognitionException {
        int logical_and_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // nopC.g:299:3: ( inclusive_or_expression[parent] ( '&&' inclusive_or_expression[parent] )* )
            // nopC.g:299:5: inclusive_or_expression[parent] ( '&&' inclusive_or_expression[parent] )*
            {
            pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1039);
            inclusive_or_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:300:4: ( '&&' inclusive_or_expression[parent] )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==13) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // nopC.g:301:5: '&&' inclusive_or_expression[parent]
            	    {
            	    match(input,13,FOLLOW_13_in_logical_and_expression1052); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1056);
            	    inclusive_or_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nIFG Y, 0\n   SET Y, FFFF\n AND X, Y\nIFG X, 0\n   SET X, 1\n");}

            	    }
            	    break;

            	default :
            	    break loop25;
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
            if ( state.backtracking>0 ) { memoize(input, 21, logical_and_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "logical_and_expression"



    // $ANTLR start "inclusive_or_expression"
    // nopC.g:305:2: inclusive_or_expression[GenericStatement parent] : exclusive_or_expression[parent] ( '|' exclusive_or_expression[parent] )* ;
    public final void inclusive_or_expression(GenericStatement parent) throws RecognitionException {
        int inclusive_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // nopC.g:306:3: ( exclusive_or_expression[parent] ( '|' exclusive_or_expression[parent] )* )
            // nopC.g:306:5: exclusive_or_expression[parent] ( '|' exclusive_or_expression[parent] )*
            {
            pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1080);
            exclusive_or_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:307:4: ( '|' exclusive_or_expression[parent] )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==56) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // nopC.g:308:5: '|' exclusive_or_expression[parent]
            	    {
            	    match(input,56,FOLLOW_56_in_inclusive_or_expression1093); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1097);
            	    exclusive_or_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nOR X, Y\n");}

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
            if ( state.backtracking>0 ) { memoize(input, 22, inclusive_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "inclusive_or_expression"



    // $ANTLR start "exclusive_or_expression"
    // nopC.g:312:2: exclusive_or_expression[GenericStatement parent] : and_expression[parent] ( '^' and_expression[parent] )* ;
    public final void exclusive_or_expression(GenericStatement parent) throws RecognitionException {
        int exclusive_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // nopC.g:313:3: ( and_expression[parent] ( '^' and_expression[parent] )* )
            // nopC.g:313:5: and_expression[parent] ( '^' and_expression[parent] )*
            {
            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1121);
            and_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:314:3: ( '^' and_expression[parent] )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==42) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // nopC.g:315:4: '^' and_expression[parent]
            	    {
            	    match(input,42,FOLLOW_42_in_exclusive_or_expression1132); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1136);
            	    and_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nXOR X, Y\n");}

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
            if ( state.backtracking>0 ) { memoize(input, 23, exclusive_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "exclusive_or_expression"



    // $ANTLR start "and_expression"
    // nopC.g:319:2: and_expression[GenericStatement parent] : equality_expression[parent] ( '&' equality_expression[parent] )* ;
    public final void and_expression(GenericStatement parent) throws RecognitionException {
        int and_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }

            // nopC.g:320:3: ( equality_expression[parent] ( '&' equality_expression[parent] )* )
            // nopC.g:320:5: equality_expression[parent] ( '&' equality_expression[parent] )*
            {
            pushFollow(FOLLOW_equality_expression_in_and_expression1159);
            equality_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:321:3: ( '&' equality_expression[parent] )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // nopC.g:322:4: '&' equality_expression[parent]
            	    {
            	    match(input,14,FOLLOW_14_in_and_expression1170); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_equality_expression_in_and_expression1174);
            	    equality_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nAND X, Y\n");}

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
            if ( state.backtracking>0 ) { memoize(input, 24, and_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "and_expression"



    // $ANTLR start "equality_expression"
    // nopC.g:326:2: equality_expression[GenericStatement parent] : relational_expression[parent] ( '==' relational_expression[parent] | '!=' relational_expression[parent] )* ;
    public final void equality_expression(GenericStatement parent) throws RecognitionException {
        int equality_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }

            // nopC.g:327:3: ( relational_expression[parent] ( '==' relational_expression[parent] | '!=' relational_expression[parent] )* )
            // nopC.g:327:5: relational_expression[parent] ( '==' relational_expression[parent] | '!=' relational_expression[parent] )*
            {
            pushFollow(FOLLOW_relational_expression_in_equality_expression1200);
            relational_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:328:4: ( '==' relational_expression[parent] | '!=' relational_expression[parent] )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==36) ) {
                    alt29=1;
                }
                else if ( (LA29_0==10) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // nopC.g:329:5: '==' relational_expression[parent]
            	    {
            	    match(input,36,FOLLOW_36_in_equality_expression1213); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1217);
            	    relational_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFE	 X, Y\n   SET B, 1\nSET X, B\n");}

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:330:6: '!=' relational_expression[parent]
            	    {
            	    match(input,10,FOLLOW_10_in_equality_expression1227); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1231);
            	    relational_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFN  X, Y\n   SET B, 1\nSET X, B\n");}

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
            if ( state.backtracking>0 ) { memoize(input, 25, equality_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "equality_expression"



    // $ANTLR start "relational_expression"
    // nopC.g:335:2: relational_expression[GenericStatement parent] : shift_expression[parent] ( '<' shift_expression[parent] | '>' shift_expression[parent] | '<=' shift_expression[parent] | '>=' shift_expression[parent] )* ;
    public final void relational_expression(GenericStatement parent) throws RecognitionException {
        int relational_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }

            // nopC.g:336:3: ( shift_expression[parent] ( '<' shift_expression[parent] | '>' shift_expression[parent] | '<=' shift_expression[parent] | '>=' shift_expression[parent] )* )
            // nopC.g:336:5: shift_expression[parent] ( '<' shift_expression[parent] | '>' shift_expression[parent] | '<=' shift_expression[parent] | '>=' shift_expression[parent] )*
            {
            pushFollow(FOLLOW_shift_expression_in_relational_expression1260);
            shift_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:337:4: ( '<' shift_expression[parent] | '>' shift_expression[parent] | '<=' shift_expression[parent] | '>=' shift_expression[parent] )*
            loop30:
            do {
                int alt30=5;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    alt30=1;
                    }
                    break;
                case 37:
                    {
                    alt30=2;
                    }
                    break;
                case 34:
                    {
                    alt30=3;
                    }
                    break;
                case 38:
                    {
                    alt30=4;
                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // nopC.g:338:7: '<' shift_expression[parent]
            	    {
            	    match(input,31,FOLLOW_31_in_relational_expression1275); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1279);
            	    shift_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFG X, Y\n   SET B, 1\nSET X, B\n");}

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:339:7: '>' shift_expression[parent]
            	    {
            	    match(input,37,FOLLOW_37_in_relational_expression1292); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1296);
            	    shift_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFG Y, X\n   SET B, 1\nSET X, B\n");}

            	    }
            	    break;
            	case 3 :
            	    // nopC.g:340:7: '<=' shift_expression[parent]
            	    {
            	    match(input,34,FOLLOW_34_in_relational_expression1309); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1313);
            	    shift_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFG X, Y\n   SET B, 1\nIFE X, Y\n    SET B, 1\nSET X, B\n" );}

            	    }
            	    break;
            	case 4 :
            	    // nopC.g:341:7: '>=' shift_expression[parent]
            	    {
            	    match(input,38,FOLLOW_38_in_relational_expression1326); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1330);
            	    shift_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFG Y, X\n   SET B, 1\nIFE X, Y\n    SET B, 1\nSET X, B\n" );}

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
            if ( state.backtracking>0 ) { memoize(input, 26, relational_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "relational_expression"



    // $ANTLR start "shift_expression"
    // nopC.g:345:2: shift_expression[GenericStatement parent] : additive_expression[parent] ( '<<' additive_expression[parent] | '>>' additive_expression[parent] )* ;
    public final void shift_expression(GenericStatement parent) throws RecognitionException {
        int shift_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }

            // nopC.g:346:3: ( additive_expression[parent] ( '<<' additive_expression[parent] | '>>' additive_expression[parent] )* )
            // nopC.g:346:5: additive_expression[parent] ( '<<' additive_expression[parent] | '>>' additive_expression[parent] )*
            {
            pushFollow(FOLLOW_additive_expression_in_shift_expression1360);
            additive_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:347:3: ( '<<' additive_expression[parent] | '>>' additive_expression[parent] )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==32) ) {
                    alt31=1;
                }
                else if ( (LA31_0==39) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // nopC.g:348:5: '<<' additive_expression[parent]
            	    {
            	    match(input,32,FOLLOW_32_in_shift_expression1372); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_additive_expression_in_shift_expression1376);
            	    additive_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nSHL Y, X\n SET X, Y\n");}

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:349:6: '>>' additive_expression[parent]
            	    {
            	    match(input,39,FOLLOW_39_in_shift_expression1386); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_additive_expression_in_shift_expression1390);
            	    additive_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nSHR Y, X\n SET X, Y\n");}

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
            if ( state.backtracking>0 ) { memoize(input, 27, shift_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "shift_expression"



    // $ANTLR start "additive_expression"
    // nopC.g:353:2: additive_expression[GenericStatement parent] : ( multiplicative_expression[parent] ) ( '+' multiplicative_expression[parent] | '-' multiplicative_expression[parent] )* ;
    public final void additive_expression(GenericStatement parent) throws RecognitionException {
        int additive_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }

            // nopC.g:354:3: ( ( multiplicative_expression[parent] ) ( '+' multiplicative_expression[parent] | '-' multiplicative_expression[parent] )* )
            // nopC.g:354:5: ( multiplicative_expression[parent] ) ( '+' multiplicative_expression[parent] | '-' multiplicative_expression[parent] )*
            {
            // nopC.g:354:5: ( multiplicative_expression[parent] )
            // nopC.g:354:6: multiplicative_expression[parent]
            {
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1417);
            multiplicative_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            }


            // nopC.g:355:4: ( '+' multiplicative_expression[parent] | '-' multiplicative_expression[parent] )*
            loop32:
            do {
                int alt32=3;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==20) ) {
                    alt32=1;
                }
                else if ( (LA32_0==24) ) {
                    alt32=2;
                }


                switch (alt32) {
            	case 1 :
            	    // nopC.g:356:6: '+' multiplicative_expression[parent]
            	    {
            	    match(input,20,FOLLOW_20_in_additive_expression1432); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1436);
            	    multiplicative_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nADD X, Y\n");}

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:357:7: '-' multiplicative_expression[parent]
            	    {
            	    match(input,24,FOLLOW_24_in_additive_expression1448); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1452);
            	    multiplicative_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nSUB Y, X\n SET X, Y \n");}

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
            if ( state.backtracking>0 ) { memoize(input, 28, additive_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "additive_expression"



    // $ANTLR start "multiplicative_expression"
    // nopC.g:361:2: multiplicative_expression[GenericStatement parent] : ( unary_expression[parent] ) ( '*' unary_expression[parent] | '/' unary_expression[parent] | '%' unary_expression[parent] )* ;
    public final void multiplicative_expression(GenericStatement parent) throws RecognitionException {
        int multiplicative_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }

            // nopC.g:362:3: ( ( unary_expression[parent] ) ( '*' unary_expression[parent] | '/' unary_expression[parent] | '%' unary_expression[parent] )* )
            // nopC.g:362:5: ( unary_expression[parent] ) ( '*' unary_expression[parent] | '/' unary_expression[parent] | '%' unary_expression[parent] )*
            {
            // nopC.g:362:5: ( unary_expression[parent] )
            // nopC.g:362:6: unary_expression[parent]
            {
            pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1478);
            unary_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            }


            // nopC.g:363:5: ( '*' unary_expression[parent] | '/' unary_expression[parent] | '%' unary_expression[parent] )*
            loop33:
            do {
                int alt33=4;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt33=1;
                    }
                    break;
                case 27:
                    {
                    alt33=2;
                    }
                    break;
                case 11:
                    {
                    alt33=3;
                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // nopC.g:364:6: '*' unary_expression[parent]
            	    {
            	    match(input,18,FOLLOW_18_in_multiplicative_expression1494); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1498);
            	    unary_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nMUL X, Y\n");}

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:365:7: '/' unary_expression[parent]
            	    {
            	    match(input,27,FOLLOW_27_in_multiplicative_expression1510); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1514);
            	    unary_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nDIV Y, X\n SET X, Y \n");}

            	    }
            	    break;
            	case 3 :
            	    // nopC.g:366:7: '%' unary_expression[parent]
            	    {
            	    match(input,11,FOLLOW_11_in_multiplicative_expression1526); if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1530);
            	    unary_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nMOD Y, X\n SET X, Y \n");}

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
            if ( state.backtracking>0 ) { memoize(input, 29, multiplicative_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "multiplicative_expression"



    // $ANTLR start "unary_expression"
    // nopC.g:373:1: unary_expression[GenericStatement parent] : (p= postfix_expression[parent] | '++' unary_expression[parent] | '--' unary_expression[parent] );
    public final void unary_expression(GenericStatement parent) throws RecognitionException {
        int unary_expression_StartIndex = input.index();

        String p =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }

            // nopC.g:374:3: (p= postfix_expression[parent] | '++' unary_expression[parent] | '--' unary_expression[parent] )
            int alt34=3;
            switch ( input.LA(1) ) {
            case NAME:
            case WERT:
            case 16:
                {
                alt34=1;
                }
                break;
            case 21:
                {
                alt34=2;
                }
                break;
            case 25:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // nopC.g:374:5: p= postfix_expression[parent]
                    {
                    pushFollow(FOLLOW_postfix_expression_in_unary_expression1563);
                    p=postfix_expression(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:375:5: '++' unary_expression[parent]
                    {
                    match(input,21,FOLLOW_21_in_unary_expression1571); if (state.failed) return ;

                    pushFollow(FOLLOW_unary_expression_in_unary_expression1573);
                    unary_expression(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {writeASM("ADD X, 1\n"); if (p != null) {writeSetRegToMemory("X", p, parent.getScope()); }}

                    }
                    break;
                case 3 :
                    // nopC.g:376:5: '--' unary_expression[parent]
                    {
                    match(input,25,FOLLOW_25_in_unary_expression1581); if (state.failed) return ;

                    pushFollow(FOLLOW_unary_expression_in_unary_expression1583);
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
            if ( state.backtracking>0 ) { memoize(input, 30, unary_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "unary_expression"



    // $ANTLR start "postfix_expression"
    // nopC.g:379:1: postfix_expression[GenericStatement parent] returns [String varname] : p= primary_expression[parent] ( '++' | '--' )* ;
    public final String postfix_expression(GenericStatement parent) throws RecognitionException {
        String varname = null;

        int postfix_expression_StartIndex = input.index();

        String p =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return varname; }

            // nopC.g:380:3: (p= primary_expression[parent] ( '++' | '--' )* )
            // nopC.g:380:7: p= primary_expression[parent] ( '++' | '--' )*
            {
            pushFollow(FOLLOW_primary_expression_in_postfix_expression1609);
            p=primary_expression(parent);

            state._fsp--;
            if (state.failed) return varname;

            // nopC.g:381:9: ( '++' | '--' )*
            loop35:
            do {
                int alt35=3;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==21) ) {
                    alt35=1;
                }
                else if ( (LA35_0==25) ) {
                    alt35=2;
                }


                switch (alt35) {
            	case 1 :
            	    // nopC.g:381:11: '++'
            	    {
            	    match(input,21,FOLLOW_21_in_postfix_expression1622); if (state.failed) return varname;

            	    if ( state.backtracking==0 ) {writeASM("ADD X, 1\n"); if (p != null) {writeSetRegToMemory("X", p, parent.getScope()); }}

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:382:11: '--'
            	    {
            	    match(input,25,FOLLOW_25_in_postfix_expression1636); if (state.failed) return varname;

            	    if ( state.backtracking==0 ) {writeASM("SUB X, 1\n"); if (p != null) {writeSetRegToMemory("X", p, parent.getScope()); }}

            	    }
            	    break;

            	default :
            	    break loop35;
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
            if ( state.backtracking>0 ) { memoize(input, 31, postfix_expression_StartIndex); }

        }
        return varname;
    }
    // $ANTLR end "postfix_expression"



    // $ANTLR start "primary_expression"
    // nopC.g:387:1: primary_expression[GenericStatement parent] returns [String varname] : ( NAME | '(' expression[parent] ')' | functionCall[parent] | WERT );
    public final String primary_expression(GenericStatement parent) throws RecognitionException {
        String varname = null;

        int primary_expression_StartIndex = input.index();

        Token NAME5=null;
        Token WERT6=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return varname; }

            // nopC.g:388:3: ( NAME | '(' expression[parent] ')' | functionCall[parent] | WERT )
            int alt36=4;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==16) ) {
                    alt36=3;
                }
                else if ( (LA36_1==EOF||(LA36_1 >= 10 && LA36_1 <= 11)||(LA36_1 >= 13 && LA36_1 <= 14)||(LA36_1 >= 17 && LA36_1 <= 18)||(LA36_1 >= 20 && LA36_1 <= 21)||(LA36_1 >= 23 && LA36_1 <= 25)||LA36_1==27||(LA36_1 >= 29 && LA36_1 <= 32)||LA36_1==34||(LA36_1 >= 36 && LA36_1 <= 39)||(LA36_1 >= 41 && LA36_1 <= 42)||LA36_1==56||LA36_1==58) ) {
                    alt36=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return varname;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;

                }
                }
                break;
            case 16:
                {
                alt36=2;
                }
                break;
            case WERT:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return varname;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // nopC.g:388:5: NAME
                    {
                    NAME5=(Token)match(input,NAME,FOLLOW_NAME_in_primary_expression1675); if (state.failed) return varname;

                    if ( state.backtracking==0 ) {writeSetVarToReg("X", (NAME5!=null?NAME5.getText():null), parent.getScope()); varname = (NAME5!=null?NAME5.getText():null);}

                    }
                    break;
                case 2 :
                    // nopC.g:389:5: '(' expression[parent] ')'
                    {
                    match(input,16,FOLLOW_16_in_primary_expression1683); if (state.failed) return varname;

                    pushFollow(FOLLOW_expression_in_primary_expression1685);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return varname;

                    match(input,17,FOLLOW_17_in_primary_expression1688); if (state.failed) return varname;

                    }
                    break;
                case 3 :
                    // nopC.g:390:5: functionCall[parent]
                    {
                    pushFollow(FOLLOW_functionCall_in_primary_expression1695);
                    functionCall(parent);

                    state._fsp--;
                    if (state.failed) return varname;

                    }
                    break;
                case 4 :
                    // nopC.g:391:5: WERT
                    {
                    WERT6=(Token)match(input,WERT,FOLLOW_WERT_in_primary_expression1702); if (state.failed) return varname;

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
            if ( state.backtracking>0 ) { memoize(input, 32, primary_expression_StartIndex); }

        }
        return varname;
    }
    // $ANTLR end "primary_expression"



    // $ANTLR start "typeSpecifier"
    // nopC.g:414:1: typeSpecifier : ( 'int' | 'void' | 'bool' );
    public final void typeSpecifier() throws RecognitionException {
        int typeSpecifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }

            // nopC.g:415:3: ( 'int' | 'void' | 'bool' )
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
            if ( state.backtracking>0 ) { memoize(input, 33, typeSpecifier_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "typeSpecifier"

    // $ANTLR start synpred4_nopC
    public final void synpred4_nopC_fragment() throws RecognitionException {
        // nopC.g:130:3: ( typeSpecifier NAME ( '=' | ';' | ',' ) )
        // nopC.g:130:4: typeSpecifier NAME ( '=' | ';' | ',' )
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
        // nopC.g:131:5: ( typeSpecifier NAME '(' )
        // nopC.g:131:6: typeSpecifier NAME '('
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
        // nopC.g:188:7: ( ( functionCall[null] ';' ) )
        // nopC.g:188:7: ( functionCall[null] ';' )
        {
        // nopC.g:188:7: ( functionCall[null] ';' )
        // nopC.g:188:9: functionCall[null] ';'
        {
        pushFollow(FOLLOW_functionCall_in_synpred17_nopC484);
        functionCall(null);

        state._fsp--;
        if (state.failed) return ;

        match(input,30,FOLLOW_30_in_synpred17_nopC487); if (state.failed) return ;

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
    public static final BitSet FOLLOW_NAME_in_functionDefinition360 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDefinition364 = new BitSet(new long[]{0x0028100000020000L});
    public static final BitSet FOLLOW_parameterList_in_functionDefinition366 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionDefinition369 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_functionDefinition371 = new BitSet(new long[]{0x087F700042210180L});
    public static final BitSet FOLLOW_statement_in_functionDefinition373 = new BitSet(new long[]{0x087F700042210180L});
    public static final BitSet FOLLOW_59_in_functionDefinition377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_parameterList400 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_parameterList407 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_parameterList412 = new BitSet(new long[]{0x0028100000000000L});
    public static final BitSet FOLLOW_typeSpecifier_in_parameterList414 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_parameterList421 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_55_in_codeBlock445 = new BitSet(new long[]{0x087F700042210180L});
    public static final BitSet FOLLOW_statement_in_codeBlock446 = new BitSet(new long[]{0x087F700042210180L});
    public static final BitSet FOLLOW_59_in_codeBlock449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_codeBlock455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement484 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement498 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_statement511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_selection_statement568 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_selection_statement570 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_selection_statement572 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_selection_statement575 = new BitSet(new long[]{0x00FF700042210180L});
    public static final BitSet FOLLOW_codeBlock_in_selection_statement577 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_selection_statement593 = new BitSet(new long[]{0x00FF700042210180L});
    public static final BitSet FOLLOW_codeBlock_in_selection_statement595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_iteration_statement617 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_iteration_statement619 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_iteration_statement621 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_iteration_statement624 = new BitSet(new long[]{0x00FF700042210180L});
    public static final BitSet FOLLOW_codeBlock_in_iteration_statement626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_iteration_statement633 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_iteration_statement635 = new BitSet(new long[]{0x0000000042210180L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement637 = new BitSet(new long[]{0x0000000042210180L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement640 = new BitSet(new long[]{0x0000000002230180L});
    public static final BitSet FOLLOW_expression_in_iteration_statement643 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_iteration_statement647 = new BitSet(new long[]{0x00FF700042210180L});
    public static final BitSet FOLLOW_codeBlock_in_iteration_statement649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_expression_statement665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement671 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_expression_statement674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_jump_statement692 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_jump_statement694 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_jump_statement702 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_jump_statement710 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_jump_statement718 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_jump_statement726 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_jump_statement728 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_functionCall754 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionCall756 = new BitSet(new long[]{0x0000000000820180L});
    public static final BitSet FOLLOW_functionCallArgumentList_in_functionCall760 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionCall763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_functionCallArgumentList785 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallArgumentList789 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_WERT_in_functionCallArgumentList794 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_functionCallArgumentList799 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_NAME_in_functionCallArgumentList802 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallArgumentList806 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_WERT_in_functionCallArgumentList811 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_NAME_in_assignment837 = new BitSet(new long[]{0x0200090A14489000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignment841 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_expression928 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_expression941 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_expression950 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_expression963 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_expression970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression998 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_logical_or_expression1011 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1015 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1039 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_logical_and_expression1052 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1056 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1080 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_inclusive_or_expression1093 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1097 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1121 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_exclusive_or_expression1132 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1136 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression1159 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_and_expression1170 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression1174 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1200 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_36_in_equality_expression1213 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1217 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_10_in_equality_expression1227 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1231 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1260 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_31_in_relational_expression1275 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1279 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_37_in_relational_expression1292 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1296 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_34_in_relational_expression1309 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1313 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_38_in_relational_expression1326 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1330 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1360 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_32_in_shift_expression1372 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1376 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_39_in_shift_expression1386 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1390 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1417 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_20_in_additive_expression1432 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1436 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_24_in_additive_expression1448 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1452 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1478 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_18_in_multiplicative_expression1494 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1498 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_27_in_multiplicative_expression1510 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1514 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_11_in_multiplicative_expression1526 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1530 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_unary_expression1571 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_unary_expression1581 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression1609 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_21_in_postfix_expression1622 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_25_in_postfix_expression1636 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_NAME_in_primary_expression1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_primary_expression1683 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_primary_expression1685 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_primary_expression1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primary_expression1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WERT_in_primary_expression1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_synpred4_nopC100 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_synpred4_nopC102 = new BitSet(new long[]{0x0000000840800000L});
    public static final BitSet FOLLOW_set_in_synpred4_nopC104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_synpred5_nopC129 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_synpred5_nopC131 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred5_nopC134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_synpred17_nopC484 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred17_nopC487 = new BitSet(new long[]{0x0000000000000002L});

}
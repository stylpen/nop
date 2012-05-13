// $ANTLR 3.4 /home/stephan/workspace/nop/nopC.g 2012-05-13 18:32:07

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

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class nopCParser extends DebugParser {
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


public static final String[] ruleNames = new String[] {
    "invalidRule", "synpred53_nopC", "synpred52_nopC", "logical_and_expression", 
    "synpred25_nopC", "synpred48_nopC", "jump_statement", "synpred24_nopC", 
    "synpred55_nopC", "synpred6_nopC", "synpred67_nopC", "synpred23_nopC", 
    "synpred26_nopC", "synpred3_nopC", "synpred69_nopC", "cFile", "typeSpecifier", 
    "synpred60_nopC", "synpred66_nopC", "parameterList", "synpred10_nopC", 
    "synpred32_nopC", "functionCall", "primary_expression", "synpred2_nopC", 
    "inclusive_or_expression", "synpred41_nopC", "synpred17_nopC", "synpred33_nopC", 
    "synpred43_nopC", "synpred65_nopC", "synpred37_nopC", "synpred54_nopC", 
    "relational_expression", "functionDefinition", "synpred36_nopC", "synpred47_nopC", 
    "synpred59_nopC", "variableDeclaration", "synpred72_nopC", "synpred73_nopC", 
    "selection_statement", "synpred49_nopC", "expression", "synpred19_nopC", 
    "synpred15_nopC", "and_expression", "synpred46_nopC", "synpred8_nopC", 
    "synpred4_nopC", "assignment", "synpred45_nopC", "synpred58_nopC", "synpred63_nopC", 
    "synpred11_nopC", "synpred12_nopC", "equality_expression", "expression_statement", 
    "exclusive_or_expression", "synpred27_nopC", "globalFunctionOrStatement", 
    "synpred64_nopC", "logical_or_expression", "synpred7_nopC", "synpred50_nopC", 
    "statement", "multiplicative_expression", "synpred51_nopC", "synpred21_nopC", 
    "synpred39_nopC", "synpred20_nopC", "synpred35_nopC", "synpred14_nopC", 
    "synpred38_nopC", "synpred74_nopC", "synpred29_nopC", "synpred31_nopC", 
    "synpred40_nopC", "variableDeclarationList", "additive_expression", 
    "synpred44_nopC", "synpred42_nopC", "synpred57_nopC", "synpred61_nopC", 
    "globalVariableDeclaration", "synpred62_nopC", "synpred13_nopC", "postfix_expression", 
    "codeBlock", "synpred16_nopC", "synpred30_nopC", "globalVariableDeclarationList", 
    "synpred9_nopC", "synpred34_nopC", "synpred22_nopC", "synpred1_nopC", 
    "synpred28_nopC", "synpred5_nopC", "unary_expression", "shift_expression", 
    "synpred56_nopC", "synpred71_nopC", "synpred68_nopC", "functionCallArgumentList", 
    "iteration_statement", "synpred70_nopC", "synpred18_nopC"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, true, false, false, false, false, false, false, false, false, 
        false, false, false, true, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public nopCParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public nopCParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[106+1];
         

        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public nopCParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
    this.state.ruleMemo = new HashMap[106+1];
     

}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return nopCParser.tokenNames; }
    public String getGrammarFileName() { return "/home/stephan/workspace/nop/nopC.g"; }


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
    // /home/stephan/workspace/nop/nopC.g:123:1: cFile returns [GenericStatement ret] : ( globalFunctionOrStatement[cFile] )+ ;
    public final GenericStatement cFile() throws RecognitionException {
        GenericStatement ret = null;

        int cFile_StartIndex = input.index();


        HashMap<String, String> scope = new HashMap<String, String>();
        GenericStatement cFile = new GenericStatement(scope, functionTable, varTable);
        startWritingASM();

        try { dbg.enterRule(getGrammarFileName(), "cFile");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ret; }

            // /home/stephan/workspace/nop/nopC.g:129:3: ( ( globalFunctionOrStatement[cFile] )+ )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:130:3: ( globalFunctionOrStatement[cFile] )+
            {
            dbg.location(130,3);
            // /home/stephan/workspace/nop/nopC.g:130:3: ( globalFunctionOrStatement[cFile] )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==44||LA1_0==51||LA1_0==53) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:130:3: globalFunctionOrStatement[cFile]
            	    {
            	    dbg.location(130,3);
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
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(130,36);
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
        dbg.location(131, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cFile");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ret;
    }
    // $ANTLR end "cFile"



    // $ANTLR start "globalFunctionOrStatement"
    // /home/stephan/workspace/nop/nopC.g:135:1: globalFunctionOrStatement[GenericStatement parent] returns [GenericStatement ret] : ( ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration[parent] | ( typeSpecifier NAME '(' )=> functionDefinition[parent] );
    public final GenericStatement globalFunctionOrStatement(GenericStatement parent) throws RecognitionException {
        GenericStatement ret = null;

        int globalFunctionOrStatement_StartIndex = input.index();

        nopCParser.globalVariableDeclaration_return globalVariableDeclaration1 =null;


        try { dbg.enterRule(getGrammarFileName(), "globalFunctionOrStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ret; }

            // /home/stephan/workspace/nop/nopC.g:136:3: ( ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration[parent] | ( typeSpecifier NAME '(' )=> functionDefinition[parent] )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

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

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ret;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ret;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:137:3: ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration[parent]
                    {
                    dbg.location(137,45);
                    pushFollow(FOLLOW_globalVariableDeclaration_in_globalFunctionOrStatement119);
                    globalVariableDeclaration1=globalVariableDeclaration(parent);

                    state._fsp--;
                    if (state.failed) return ret;
                    dbg.location(137,79);
                    if ( state.backtracking==0 ) {ret = (globalVariableDeclaration1!=null?globalVariableDeclaration1.ret:null);}

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/stephan/workspace/nop/nopC.g:138:5: ( typeSpecifier NAME '(' )=> functionDefinition[parent]
                    {
                    dbg.location(138,34);
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
        dbg.location(139, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "globalFunctionOrStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ret;
    }
    // $ANTLR end "globalFunctionOrStatement"


    public static class globalVariableDeclaration_return extends ParserRuleReturnScope {
        public GenericStatement ret;
    };


    // $ANTLR start "globalVariableDeclaration"
    // /home/stephan/workspace/nop/nopC.g:141:1: globalVariableDeclaration[GenericStatement parent] returns [GenericStatement ret] : typeSpecifier globalVariableDeclarationList[parent] ';' ;
    public final nopCParser.globalVariableDeclaration_return globalVariableDeclaration(GenericStatement parent) throws RecognitionException {
        nopCParser.globalVariableDeclaration_return retval = new nopCParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);

        int globalVariableDeclaration_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "globalVariableDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // /home/stephan/workspace/nop/nopC.g:142:3: ( typeSpecifier globalVariableDeclarationList[parent] ';' )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:144:3: typeSpecifier globalVariableDeclarationList[parent] ';'
            {
            dbg.location(144,3);
            pushFollow(FOLLOW_typeSpecifier_in_globalVariableDeclaration164);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(144,17);
            pushFollow(FOLLOW_globalVariableDeclarationList_in_globalVariableDeclaration166);
            globalVariableDeclarationList(parent);

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(144,55);
            match(input,30,FOLLOW_30_in_globalVariableDeclaration169); if (state.failed) return retval;
            dbg.location(144,59);
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
        dbg.location(145, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "globalVariableDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "globalVariableDeclaration"



    // $ANTLR start "globalVariableDeclarationList"
    // /home/stephan/workspace/nop/nopC.g:152:1: globalVariableDeclarationList[GenericStatement parent] returns [GenericStatement ret] : (n1= NAME ( '=' w1= WERT )? ) ( ',' (n2= NAME ( '=' w2= WERT )? ) )* ;
    public final GenericStatement globalVariableDeclarationList(GenericStatement parent) throws RecognitionException {
        GenericStatement ret = null;

        int globalVariableDeclarationList_StartIndex = input.index();

        Token n1=null;
        Token w1=null;
        Token n2=null;
        Token w2=null;

        try { dbg.enterRule(getGrammarFileName(), "globalVariableDeclarationList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(152, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ret; }

            // /home/stephan/workspace/nop/nopC.g:153:3: ( (n1= NAME ( '=' w1= WERT )? ) ( ',' (n2= NAME ( '=' w2= WERT )? ) )* )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:154:3: (n1= NAME ( '=' w1= WERT )? ) ( ',' (n2= NAME ( '=' w2= WERT )? ) )*
            {
            dbg.location(154,3);
            // /home/stephan/workspace/nop/nopC.g:154:3: (n1= NAME ( '=' w1= WERT )? )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:154:4: n1= NAME ( '=' w1= WERT )?
            {
            dbg.location(154,7);
            n1=(Token)match(input,NAME,FOLLOW_NAME_in_globalVariableDeclarationList201); if (state.failed) return ret;
            dbg.location(154,13);
            // /home/stephan/workspace/nop/nopC.g:154:13: ( '=' w1= WERT )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:154:14: '=' w1= WERT
                    {
                    dbg.location(154,14);
                    match(input,35,FOLLOW_35_in_globalVariableDeclarationList203); if (state.failed) return ret;
                    dbg.location(154,21);
                    w1=(Token)match(input,WERT,FOLLOW_WERT_in_globalVariableDeclarationList209); if (state.failed) return ret;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}


            }

            dbg.location(154,30);
            if ( state.backtracking==0 ) {parent.addVarToScope((n1!=null?n1.getText():null), (w1!=null?w1.getText():null));}
            dbg.location(154,74);
            // /home/stephan/workspace/nop/nopC.g:154:74: ( ',' (n2= NAME ( '=' w2= WERT )? ) )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:154:75: ',' (n2= NAME ( '=' w2= WERT )? )
            	    {
            	    dbg.location(154,75);
            	    match(input,23,FOLLOW_23_in_globalVariableDeclarationList216); if (state.failed) return ret;
            	    dbg.location(154,79);
            	    // /home/stephan/workspace/nop/nopC.g:154:79: (n2= NAME ( '=' w2= WERT )? )
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:154:80: n2= NAME ( '=' w2= WERT )?
            	    {
            	    dbg.location(154,83);
            	    n2=(Token)match(input,NAME,FOLLOW_NAME_in_globalVariableDeclarationList223); if (state.failed) return ret;
            	    dbg.location(154,89);
            	    // /home/stephan/workspace/nop/nopC.g:154:89: ( '=' w2= WERT )?
            	    int alt4=2;
            	    try { dbg.enterSubRule(4);
            	    try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==35) ) {
            	        alt4=1;
            	    }
            	    } finally {dbg.exitDecision(4);}

            	    switch (alt4) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/stephan/workspace/nop/nopC.g:154:90: '=' w2= WERT
            	            {
            	            dbg.location(154,90);
            	            match(input,35,FOLLOW_35_in_globalVariableDeclarationList225); if (state.failed) return ret;
            	            dbg.location(154,97);
            	            w2=(Token)match(input,WERT,FOLLOW_WERT_in_globalVariableDeclarationList231); if (state.failed) return ret;

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(4);}


            	    }

            	    dbg.location(154,106);
            	    if ( state.backtracking==0 ) {parent.addVarToScope((n2!=null?n2.getText():null), (w2!=null?w2.getText():null));}

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}


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
        dbg.location(155, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "globalVariableDeclarationList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ret;
    }
    // $ANTLR end "globalVariableDeclarationList"


    public static class variableDeclaration_return extends ParserRuleReturnScope {
        public GenericStatement ret;
    };


    // $ANTLR start "variableDeclaration"
    // /home/stephan/workspace/nop/nopC.g:157:1: variableDeclaration[GenericStatement parent] returns [GenericStatement ret] : typeSpecifier variableDeclarationList[parent] ';' ;
    public final nopCParser.variableDeclaration_return variableDeclaration(GenericStatement parent) throws RecognitionException {
        nopCParser.variableDeclaration_return retval = new nopCParser.variableDeclaration_return();
        retval.start = input.LT(1);

        int variableDeclaration_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "variableDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // /home/stephan/workspace/nop/nopC.g:158:3: ( typeSpecifier variableDeclarationList[parent] ';' )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:159:3: typeSpecifier variableDeclarationList[parent] ';'
            {
            dbg.location(159,3);
            pushFollow(FOLLOW_typeSpecifier_in_variableDeclaration260);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(159,17);
            pushFollow(FOLLOW_variableDeclarationList_in_variableDeclaration262);
            variableDeclarationList(parent);

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(159,49);
            match(input,30,FOLLOW_30_in_variableDeclaration265); if (state.failed) return retval;
            dbg.location(159,53);
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
        dbg.location(160, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variableDeclaration"



    // $ANTLR start "variableDeclarationList"
    // /home/stephan/workspace/nop/nopC.g:162:1: variableDeclarationList[GenericStatement parent] returns [GenericStatement ret] : n1= NAME ( '=' expression[parent] )? ( ',' n2= NAME ( '=' expression[parent] )? )* ;
    public final GenericStatement variableDeclarationList(GenericStatement parent) throws RecognitionException {
        GenericStatement ret = null;

        int variableDeclarationList_StartIndex = input.index();

        Token n1=null;
        Token n2=null;

        try { dbg.enterRule(getGrammarFileName(), "variableDeclarationList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(162, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ret; }

            // /home/stephan/workspace/nop/nopC.g:163:3: (n1= NAME ( '=' expression[parent] )? ( ',' n2= NAME ( '=' expression[parent] )? )* )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:165:3: n1= NAME ( '=' expression[parent] )? ( ',' n2= NAME ( '=' expression[parent] )? )*
            {
            dbg.location(165,6);
            n1=(Token)match(input,NAME,FOLLOW_NAME_in_variableDeclarationList295); if (state.failed) return ret;
            dbg.location(165,13);
            if ( state.backtracking==0 ) {parent.addVarToScope((n1!=null?n1.getText():null), null);}
            dbg.location(166,3);
            // /home/stephan/workspace/nop/nopC.g:166:3: ( '=' expression[parent] )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:167:5: '=' expression[parent]
                    {
                    dbg.location(167,5);
                    match(input,35,FOLLOW_35_in_variableDeclarationList307); if (state.failed) return ret;
                    dbg.location(168,5);
                    pushFollow(FOLLOW_expression_in_variableDeclarationList314);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ret;
                    dbg.location(168,24);
                    if ( state.backtracking==0 ) {writeSetRegToMemory("X", (n1!=null?n1.getText():null), parent.getScope());}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(171,3);
            // /home/stephan/workspace/nop/nopC.g:171:3: ( ',' n2= NAME ( '=' expression[parent] )? )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:172:5: ',' n2= NAME ( '=' expression[parent] )?
            	    {
            	    dbg.location(172,5);
            	    match(input,23,FOLLOW_23_in_variableDeclarationList336); if (state.failed) return ret;
            	    dbg.location(173,8);
            	    n2=(Token)match(input,NAME,FOLLOW_NAME_in_variableDeclarationList347); if (state.failed) return ret;
            	    dbg.location(173,15);
            	    if ( state.backtracking==0 ) {parent.addVarToScope((n2!=null?n2.getText():null), null);}
            	    dbg.location(174,5);
            	    // /home/stephan/workspace/nop/nopC.g:174:5: ( '=' expression[parent] )?
            	    int alt7=2;
            	    try { dbg.enterSubRule(7);
            	    try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==35) ) {
            	        alt7=1;
            	    }
            	    } finally {dbg.exitDecision(7);}

            	    switch (alt7) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/stephan/workspace/nop/nopC.g:175:7: '=' expression[parent]
            	            {
            	            dbg.location(175,7);
            	            match(input,35,FOLLOW_35_in_variableDeclarationList363); if (state.failed) return ret;
            	            dbg.location(176,7);
            	            pushFollow(FOLLOW_expression_in_variableDeclarationList372);
            	            expression(parent);

            	            state._fsp--;
            	            if (state.failed) return ret;
            	            dbg.location(176,26);
            	            if ( state.backtracking==0 ) {writeSetRegToMemory("X", (n2!=null?n2.getText():null), parent.getScope());}

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(7);}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}


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
        dbg.location(179, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableDeclarationList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ret;
    }
    // $ANTLR end "variableDeclarationList"


    public static class functionDefinition_return extends ParserRuleReturnScope {
        public GenericStatement ret;
    };


    // $ANTLR start "functionDefinition"
    // /home/stephan/workspace/nop/nopC.g:182:1: functionDefinition[GenericStatement parent] returns [GenericStatement ret] : typeSpecifier NAME '(' parameterList[functionDefinition] ')' '{' ( statement[functionDefinition] )* '}' ;
    public final nopCParser.functionDefinition_return functionDefinition(GenericStatement parent) throws RecognitionException {
        nopCParser.functionDefinition_return retval = new nopCParser.functionDefinition_return();
        retval.start = input.LT(1);

        int functionDefinition_StartIndex = input.index();

        Token NAME2=null;


        FunctionDefinition functionDefinition = new FunctionDefinition(parent.getScope(), functionTable, varTable);

        try { dbg.enterRule(getGrammarFileName(), "functionDefinition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(182, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // /home/stephan/workspace/nop/nopC.g:186:3: ( typeSpecifier NAME '(' parameterList[functionDefinition] ')' '{' ( statement[functionDefinition] )* '}' )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:187:5: typeSpecifier NAME '(' parameterList[functionDefinition] ')' '{' ( statement[functionDefinition] )* '}'
            {
            dbg.location(187,5);
            pushFollow(FOLLOW_typeSpecifier_in_functionDefinition419);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(188,3);
            NAME2=(Token)match(input,NAME,FOLLOW_NAME_in_functionDefinition423); if (state.failed) return retval;
            dbg.location(188,8);
            if ( state.backtracking==0 ) {functionDefinition.addFun((NAME2!=null?NAME2.getText():null)); writeASM(":" + functionDefinition.getLabel() + "\n"); }
            dbg.location(189,3);
            match(input,16,FOLLOW_16_in_functionDefinition430); if (state.failed) return retval;
            dbg.location(190,3);
            pushFollow(FOLLOW_parameterList_in_functionDefinition434);
            parameterList(functionDefinition);

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(191,3);
            match(input,17,FOLLOW_17_in_functionDefinition440); if (state.failed) return retval;
            dbg.location(192,3);
            match(input,55,FOLLOW_55_in_functionDefinition444); if (state.failed) return retval;
            dbg.location(192,7);
            if ( state.backtracking==0 ) {popParameters(functionDefinition);}
            dbg.location(193,3);
            // /home/stephan/workspace/nop/nopC.g:193:3: ( statement[functionDefinition] )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= NAME && LA9_0 <= WERT)||LA9_0==16||LA9_0==21||LA9_0==25||LA9_0==30||(LA9_0 >= 44 && LA9_0 <= 46)||(LA9_0 >= 48 && LA9_0 <= 54)) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:193:3: statement[functionDefinition]
            	    {
            	    dbg.location(193,3);
            	    pushFollow(FOLLOW_statement_in_functionDefinition450);
            	    statement(functionDefinition);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}

            dbg.location(194,7);
            if ( state.backtracking==0 ) {writeASM("SET PC, POP\n");}
            dbg.location(195,3);
            match(input,59,FOLLOW_59_in_functionDefinition465); if (state.failed) return retval;
            dbg.location(197,3);
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
        dbg.location(198, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionDefinition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "functionDefinition"



    // $ANTLR start "parameterList"
    // /home/stephan/workspace/nop/nopC.g:201:1: parameterList[FunctionDefinition parent] : ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )? ;
    public final void parameterList(FunctionDefinition parent) throws RecognitionException {
        int parameterList_StartIndex = input.index();

        Token n1=null;
        Token n2=null;

        try { dbg.enterRule(getGrammarFileName(), "parameterList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(201, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:202:3: ( ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )? )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:203:5: ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )?
            {
            dbg.location(203,5);
            // /home/stephan/workspace/nop/nopC.g:203:5: ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==44||LA11_0==51||LA11_0==53) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:203:6: typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )*
                    {
                    dbg.location(203,6);
                    pushFollow(FOLLOW_typeSpecifier_in_parameterList493);
                    typeSpecifier();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(203,20);
                    // /home/stephan/workspace/nop/nopC.g:203:20: (n1= NAME )
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:203:21: n1= NAME
                    {
                    dbg.location(203,24);
                    n1=(Token)match(input,NAME,FOLLOW_NAME_in_parameterList500); if (state.failed) return ;

                    }

                    dbg.location(203,31);
                    if ( state.backtracking==0 ) {parent.addParam((n1!=null?n1.getText():null));}
                    dbg.location(203,60);
                    // /home/stephan/workspace/nop/nopC.g:203:60: ( ',' typeSpecifier (n2= NAME ) )*
                    try { dbg.enterSubRule(10);

                    loop10:
                    do {
                        int alt10=2;
                        try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==23) ) {
                            alt10=1;
                        }


                        } finally {dbg.exitDecision(10);}

                        switch (alt10) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/stephan/workspace/nop/nopC.g:203:61: ',' typeSpecifier (n2= NAME )
                    	    {
                    	    dbg.location(203,61);
                    	    match(input,23,FOLLOW_23_in_parameterList505); if (state.failed) return ;
                    	    dbg.location(203,65);
                    	    pushFollow(FOLLOW_typeSpecifier_in_parameterList507);
                    	    typeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;
                    	    dbg.location(203,79);
                    	    // /home/stephan/workspace/nop/nopC.g:203:79: (n2= NAME )
                    	    dbg.enterAlt(1);

                    	    // /home/stephan/workspace/nop/nopC.g:203:80: n2= NAME
                    	    {
                    	    dbg.location(203,83);
                    	    n2=(Token)match(input,NAME,FOLLOW_NAME_in_parameterList514); if (state.failed) return ;

                    	    }

                    	    dbg.location(203,90);
                    	    if ( state.backtracking==0 ) {parent.addParam((n2!=null?n2.getText():null));}

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(10);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}


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
        dbg.location(204, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parameterList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "parameterList"



    // $ANTLR start "codeBlock"
    // /home/stephan/workspace/nop/nopC.g:206:1: codeBlock[GenericStatement parent] : ( '{' ( statement[parent] )* '}' | statement[parent] );
    public final void codeBlock(GenericStatement parent) throws RecognitionException {
        int codeBlock_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "codeBlock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(206, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:207:3: ( '{' ( statement[parent] )* '}' | statement[parent] )
            int alt13=2;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:208:3: '{' ( statement[parent] )* '}'
                    {
                    dbg.location(208,3);
                    match(input,55,FOLLOW_55_in_codeBlock538); if (state.failed) return ;
                    dbg.location(208,6);
                    // /home/stephan/workspace/nop/nopC.g:208:6: ( statement[parent] )*
                    try { dbg.enterSubRule(12);

                    loop12:
                    do {
                        int alt12=2;
                        try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= NAME && LA12_0 <= WERT)||LA12_0==16||LA12_0==21||LA12_0==25||LA12_0==30||(LA12_0 >= 44 && LA12_0 <= 46)||(LA12_0 >= 48 && LA12_0 <= 54)) ) {
                            alt12=1;
                        }


                        } finally {dbg.exitDecision(12);}

                        switch (alt12) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/stephan/workspace/nop/nopC.g:208:6: statement[parent]
                    	    {
                    	    dbg.location(208,6);
                    	    pushFollow(FOLLOW_statement_in_codeBlock539);
                    	    statement(parent);

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(12);}

                    dbg.location(208,24);
                    match(input,59,FOLLOW_59_in_codeBlock542); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/stephan/workspace/nop/nopC.g:209:5: statement[parent]
                    {
                    dbg.location(209,5);
                    pushFollow(FOLLOW_statement_in_codeBlock548);
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
        dbg.location(211, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "codeBlock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "codeBlock"



    // $ANTLR start "statement"
    // /home/stephan/workspace/nop/nopC.g:213:1: statement[GenericStatement parent] : ( ( functionCall[null] ';' ) | ( assignment[null] ';' ) | variableDeclaration[parent] | selection_statement[parent] | iteration_statement[parent] | jump_statement[parent] | expression_statement[parent] );
    public final void statement(GenericStatement parent) throws RecognitionException {
        int statement_StartIndex = input.index();


          hackStore1 = parent; // We cannot pass parent to functionCall or assignment directly, as there is a synpred rule involved during backtracking which does not take parameters. Therefore we store it in a global variable to access the variable through this later

        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(213, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:217:3: ( ( functionCall[null] ';' ) | ( assignment[null] ';' ) | variableDeclaration[parent] | selection_statement[parent] | iteration_statement[parent] | jump_statement[parent] | expression_statement[parent] )
            int alt14=7;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

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

                        dbg.recognitionException(nvae);
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

                    dbg.recognitionException(nvae);
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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:218:7: ( functionCall[null] ';' )
                    {
                    dbg.location(218,7);
                    // /home/stephan/workspace/nop/nopC.g:218:7: ( functionCall[null] ';' )
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:218:9: functionCall[null] ';'
                    {
                    dbg.location(218,9);
                    pushFollow(FOLLOW_functionCall_in_statement577);
                    functionCall(null);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(218,28);
                    match(input,30,FOLLOW_30_in_statement580); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/stephan/workspace/nop/nopC.g:219:7: ( assignment[null] ';' )
                    {
                    dbg.location(219,7);
                    // /home/stephan/workspace/nop/nopC.g:219:7: ( assignment[null] ';' )
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:219:9: assignment[null] ';'
                    {
                    dbg.location(219,9);
                    pushFollow(FOLLOW_assignment_in_statement591);
                    assignment(null);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(219,26);
                    match(input,30,FOLLOW_30_in_statement594); if (state.failed) return ;

                    }


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/stephan/workspace/nop/nopC.g:220:7: variableDeclaration[parent]
                    {
                    dbg.location(220,7);
                    pushFollow(FOLLOW_variableDeclaration_in_statement604);
                    variableDeclaration(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/stephan/workspace/nop/nopC.g:221:7: selection_statement[parent]
                    {
                    dbg.location(221,7);
                    pushFollow(FOLLOW_selection_statement_in_statement613);
                    selection_statement(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/stephan/workspace/nop/nopC.g:222:7: iteration_statement[parent]
                    {
                    dbg.location(222,7);
                    pushFollow(FOLLOW_iteration_statement_in_statement622);
                    iteration_statement(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/stephan/workspace/nop/nopC.g:223:7: jump_statement[parent]
                    {
                    dbg.location(223,7);
                    pushFollow(FOLLOW_jump_statement_in_statement631);
                    jump_statement(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/stephan/workspace/nop/nopC.g:224:7: expression_statement[parent]
                    {
                    dbg.location(224,7);
                    pushFollow(FOLLOW_expression_statement_in_statement640);
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
        dbg.location(225, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "selection_statement"
    // /home/stephan/workspace/nop/nopC.g:228:1: selection_statement[GenericStatement parent] : 'if' '(' expression[parent] ')' codeBlock[selection_statement_if] ( options {k=1; backtrack=false; } : 'else' codeBlock[selection_statement_else] )? ;
    public final void selection_statement(GenericStatement parent) throws RecognitionException {
        int selection_statement_StartIndex = input.index();


        ScopedStatement selection_statement_if = new ScopedStatement(parent.getScope(), functionTable, varTable);
        ScopedStatement selection_statement_else = new ScopedStatement(parent.getScope(), functionTable, varTable);
        String label = "";

        try { dbg.enterRule(getGrammarFileName(), "selection_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(228, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:234:3: ( 'if' '(' expression[parent] ')' codeBlock[selection_statement_if] ( options {k=1; backtrack=false; } : 'else' codeBlock[selection_statement_else] )? )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:234:5: 'if' '(' expression[parent] ')' codeBlock[selection_statement_if] ( options {k=1; backtrack=false; } : 'else' codeBlock[selection_statement_else] )?
            {
            dbg.location(234,5);
            match(input,50,FOLLOW_50_in_selection_statement661); if (state.failed) return ;
            dbg.location(234,10);
            match(input,16,FOLLOW_16_in_selection_statement663); if (state.failed) return ;
            dbg.location(234,14);
            pushFollow(FOLLOW_expression_in_selection_statement665);
            expression(parent);

            state._fsp--;
            if (state.failed) return ;
            dbg.location(234,33);
            match(input,17,FOLLOW_17_in_selection_statement668); if (state.failed) return ;
            dbg.location(234,37);
            if ( state.backtracking==0 ) {label = getNewLoopCounter(); writeASM("IFE X, 0\n   SET PC, ELSE" + label + "\n");}
            dbg.location(235,3);
            pushFollow(FOLLOW_codeBlock_in_selection_statement675);
            codeBlock(selection_statement_if);

            state._fsp--;
            if (state.failed) return ;
            dbg.location(235,37);
            if ( state.backtracking==0 ) {writeASM("SET PC, END" + label + "\n:ELSE" + label + "\n");}
            dbg.location(236,3);
            // /home/stephan/workspace/nop/nopC.g:236:3: ( options {k=1; backtrack=false; } : 'else' codeBlock[selection_statement_else] )?
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                int LA15_1 = input.LA(2);

                if ( (true) ) {
                    alt15=1;
                }
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:237:3: 'else' codeBlock[selection_statement_else]
                    {
                    dbg.location(237,3);
                    match(input,47,FOLLOW_47_in_selection_statement698); if (state.failed) return ;
                    dbg.location(238,3);
                    pushFollow(FOLLOW_codeBlock_in_selection_statement703);
                    codeBlock(selection_statement_else);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(238,41);
            if ( state.backtracking==0 ) {writeASM(":END" + label + "\n");}

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
        dbg.location(239, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "selection_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "selection_statement"



    // $ANTLR start "iteration_statement"
    // /home/stephan/workspace/nop/nopC.g:241:1: iteration_statement[GenericStatement parent] : ( 'while' '(' expression[parent] ')' codeBlock[iteration_statement] | 'for' '(' ( expression_statement[parent] | assignment[parent] ';' ) expression_statement[parent] ( expression[parent] )? ')' codeBlock[iteration_statement] );
    public final void iteration_statement(GenericStatement parent) throws RecognitionException {
        int iteration_statement_StartIndex = input.index();


        ScopedStatement iteration_statement = new ScopedStatement(parent.getScope(), functionTable, varTable);

        try { dbg.enterRule(getGrammarFileName(), "iteration_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(241, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:245:3: ( 'while' '(' expression[parent] ')' codeBlock[iteration_statement] | 'for' '(' ( expression_statement[parent] | assignment[parent] ';' ) expression_statement[parent] ( expression[parent] )? ')' codeBlock[iteration_statement] )
            int alt18=2;
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:245:5: 'while' '(' expression[parent] ')' codeBlock[iteration_statement]
                    {
                    dbg.location(245,5);
                    match(input,54,FOLLOW_54_in_iteration_statement727); if (state.failed) return ;
                    dbg.location(245,13);
                    match(input,16,FOLLOW_16_in_iteration_statement729); if (state.failed) return ;
                    dbg.location(245,17);
                    pushFollow(FOLLOW_expression_in_iteration_statement731);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(245,36);
                    match(input,17,FOLLOW_17_in_iteration_statement734); if (state.failed) return ;
                    dbg.location(245,40);
                    pushFollow(FOLLOW_codeBlock_in_iteration_statement736);
                    codeBlock(iteration_statement);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/stephan/workspace/nop/nopC.g:246:5: 'for' '(' ( expression_statement[parent] | assignment[parent] ';' ) expression_statement[parent] ( expression[parent] )? ')' codeBlock[iteration_statement]
                    {
                    dbg.location(246,5);
                    match(input,48,FOLLOW_48_in_iteration_statement743); if (state.failed) return ;
                    dbg.location(246,11);
                    match(input,16,FOLLOW_16_in_iteration_statement745); if (state.failed) return ;
                    dbg.location(246,15);
                    // /home/stephan/workspace/nop/nopC.g:246:15: ( expression_statement[parent] | assignment[parent] ';' )
                    int alt16=2;
                    try { dbg.enterSubRule(16);
                    try { dbg.enterDecision(16, decisionCanBacktrack[16]);

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

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(16);}

                    switch (alt16) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/stephan/workspace/nop/nopC.g:246:16: expression_statement[parent]
                            {
                            dbg.location(246,16);
                            pushFollow(FOLLOW_expression_statement_in_iteration_statement748);
                            expression_statement(parent);

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/stephan/workspace/nop/nopC.g:246:47: assignment[parent] ';'
                            {
                            dbg.location(246,47);
                            pushFollow(FOLLOW_assignment_in_iteration_statement753);
                            assignment(parent);

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(246,66);
                            match(input,30,FOLLOW_30_in_iteration_statement756); if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(246,71);
                    pushFollow(FOLLOW_expression_statement_in_iteration_statement759);
                    expression_statement(parent);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(246,100);
                    // /home/stephan/workspace/nop/nopC.g:246:100: ( expression[parent] )?
                    int alt17=2;
                    try { dbg.enterSubRule(17);
                    try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0 >= NAME && LA17_0 <= WERT)||LA17_0==16||LA17_0==21||LA17_0==25) ) {
                        alt17=1;
                    }
                    } finally {dbg.exitDecision(17);}

                    switch (alt17) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/stephan/workspace/nop/nopC.g:246:100: expression[parent]
                            {
                            dbg.location(246,100);
                            pushFollow(FOLLOW_expression_in_iteration_statement762);
                            expression(parent);

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(17);}

                    dbg.location(246,120);
                    match(input,17,FOLLOW_17_in_iteration_statement766); if (state.failed) return ;
                    dbg.location(246,124);
                    pushFollow(FOLLOW_codeBlock_in_iteration_statement768);
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
        dbg.location(247, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "iteration_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "iteration_statement"



    // $ANTLR start "expression_statement"
    // /home/stephan/workspace/nop/nopC.g:249:1: expression_statement[GenericStatement parent] : ( ';' | expression[parent] ';' );
    public final void expression_statement(GenericStatement parent) throws RecognitionException {
        int expression_statement_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "expression_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(249, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:250:3: ( ';' | expression[parent] ';' )
            int alt19=2;
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:250:5: ';'
                    {
                    dbg.location(250,5);
                    match(input,30,FOLLOW_30_in_expression_statement784); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/stephan/workspace/nop/nopC.g:251:5: expression[parent] ';'
                    {
                    dbg.location(251,5);
                    pushFollow(FOLLOW_expression_in_expression_statement790);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(251,24);
                    match(input,30,FOLLOW_30_in_expression_statement793); if (state.failed) return ;
                    dbg.location(251,28);
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
        dbg.location(253, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expression_statement"



    // $ANTLR start "jump_statement"
    // /home/stephan/workspace/nop/nopC.g:255:1: jump_statement[GenericStatement parent] : ( 'goto' NAME ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression[parent] ';' );
    public final void jump_statement(GenericStatement parent) throws RecognitionException {
        int jump_statement_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "jump_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(255, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:256:3: ( 'goto' NAME ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression[parent] ';' )
            int alt20=5;
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

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

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:256:5: 'goto' NAME ';'
                    {
                    dbg.location(256,5);
                    match(input,49,FOLLOW_49_in_jump_statement811); if (state.failed) return ;
                    dbg.location(256,12);
                    match(input,NAME,FOLLOW_NAME_in_jump_statement813); if (state.failed) return ;
                    dbg.location(256,17);
                    match(input,30,FOLLOW_30_in_jump_statement815); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/stephan/workspace/nop/nopC.g:257:5: 'continue' ';'
                    {
                    dbg.location(257,5);
                    match(input,46,FOLLOW_46_in_jump_statement821); if (state.failed) return ;
                    dbg.location(257,16);
                    match(input,30,FOLLOW_30_in_jump_statement823); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/stephan/workspace/nop/nopC.g:258:5: 'break' ';'
                    {
                    dbg.location(258,5);
                    match(input,45,FOLLOW_45_in_jump_statement829); if (state.failed) return ;
                    dbg.location(258,13);
                    match(input,30,FOLLOW_30_in_jump_statement831); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/stephan/workspace/nop/nopC.g:259:5: 'return' ';'
                    {
                    dbg.location(259,5);
                    match(input,52,FOLLOW_52_in_jump_statement837); if (state.failed) return ;
                    dbg.location(259,14);
                    match(input,30,FOLLOW_30_in_jump_statement839); if (state.failed) return ;
                    dbg.location(259,17);
                    if ( state.backtracking==0 ) {writeASM("SET PC, POP\n");}

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/stephan/workspace/nop/nopC.g:260:5: 'return' expression[parent] ';'
                    {
                    dbg.location(260,5);
                    match(input,52,FOLLOW_52_in_jump_statement846); if (state.failed) return ;
                    dbg.location(260,14);
                    pushFollow(FOLLOW_expression_in_jump_statement848);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(260,33);
                    match(input,30,FOLLOW_30_in_jump_statement851); if (state.failed) return ;
                    dbg.location(260,36);
                    if ( state.backtracking==0 ) {FunctionDefinition fun = (FunctionDefinition) parent; writeSetRegToMemory("X", fun.getName(), fun.getScope());}

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
        dbg.location(261, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "jump_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "jump_statement"



    // $ANTLR start "functionCall"
    // /home/stephan/workspace/nop/nopC.g:263:1: functionCall[GenericStatement parent] : NAME '(' functionCallArgumentList[p, fun] ')' ;
    public final void functionCall(GenericStatement parent) throws RecognitionException {
        int functionCall_StartIndex = input.index();

        Token NAME3=null;


          GenericStatement p = parent; 

          if (p == null) {
             p = hackStore1;
          }

          FunctionDefinition fun = null;

        try { dbg.enterRule(getGrammarFileName(), "functionCall");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(263, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:273:3: ( NAME '(' functionCallArgumentList[p, fun] ')' )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:274:3: NAME '(' functionCallArgumentList[p, fun] ')'
            {
            dbg.location(274,3);
            NAME3=(Token)match(input,NAME,FOLLOW_NAME_in_functionCall875); if (state.failed) return ;
            dbg.location(274,8);
            match(input,16,FOLLOW_16_in_functionCall877); if (state.failed) return ;
            dbg.location(274,12);
            if ( state.backtracking==0 ) {fun = functionTable.get((NAME3!=null?NAME3.getText():null));}
            dbg.location(274,51);
            pushFollow(FOLLOW_functionCallArgumentList_in_functionCall881);
            functionCallArgumentList(p, fun);

            state._fsp--;
            if (state.failed) return ;
            dbg.location(274,84);
            match(input,17,FOLLOW_17_in_functionCall884); if (state.failed) return ;
            dbg.location(274,88);
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
        dbg.location(275, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionCall");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "functionCall"



    // $ANTLR start "functionCallArgumentList"
    // /home/stephan/workspace/nop/nopC.g:279:1: functionCallArgumentList[GenericStatement parent, FunctionDefinition fun] : (n1= NAME | functionCall[parent] |w1= WERT )? ( ',' (n2= NAME | functionCall[parent] |w2= WERT ) )* ;
    public final void functionCallArgumentList(GenericStatement parent, FunctionDefinition fun) throws RecognitionException {
        int functionCallArgumentList_StartIndex = input.index();

        Token n1=null;
        Token w1=null;
        Token n2=null;
        Token w2=null;

        try { dbg.enterRule(getGrammarFileName(), "functionCallArgumentList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(279, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:280:3: ( (n1= NAME | functionCall[parent] |w1= WERT )? ( ',' (n2= NAME | functionCall[parent] |w2= WERT ) )* )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:281:7: (n1= NAME | functionCall[parent] |w1= WERT )? ( ',' (n2= NAME | functionCall[parent] |w2= WERT ) )*
            {
            dbg.location(281,7);
            // /home/stephan/workspace/nop/nopC.g:281:7: (n1= NAME | functionCall[parent] |w1= WERT )?
            int alt21=4;
            try { dbg.enterSubRule(21);
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

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
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:282:6: n1= NAME
                    {
                    dbg.location(282,9);
                    n1=(Token)match(input,NAME,FOLLOW_NAME_in_functionCallArgumentList919); if (state.failed) return ;
                    dbg.location(282,16);
                    if ( state.backtracking==0 ) {writeSetVarToReg("PUSH", (n1!=null?n1.getText():null), parent.getScope());}

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/stephan/workspace/nop/nopC.g:283:7: functionCall[parent]
                    {
                    dbg.location(283,7);
                    pushFollow(FOLLOW_functionCall_in_functionCallArgumentList930);
                    functionCall(parent);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(283,28);
                    if ( state.backtracking==0 ) {writeSetVarToReg("PUSH", fun.getName(), parent.getScope());}

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/stephan/workspace/nop/nopC.g:284:7: w1= WERT
                    {
                    dbg.location(284,10);
                    w1=(Token)match(input,WERT,FOLLOW_WERT_in_functionCallArgumentList945); if (state.failed) return ;
                    dbg.location(284,17);
                    if ( state.backtracking==0 ) {writeSetImmidiateToReg("PUSH", (w1!=null?w1.getText():null));}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(21);}

            dbg.location(286,4);
            // /home/stephan/workspace/nop/nopC.g:286:4: ( ',' (n2= NAME | functionCall[parent] |w2= WERT ) )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23, decisionCanBacktrack[23]);

                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:286:5: ',' (n2= NAME | functionCall[parent] |w2= WERT )
            	    {
            	    dbg.location(286,5);
            	    match(input,23,FOLLOW_23_in_functionCallArgumentList960); if (state.failed) return ;
            	    dbg.location(287,6);
            	    // /home/stephan/workspace/nop/nopC.g:287:6: (n2= NAME | functionCall[parent] |w2= WERT )
            	    int alt22=3;
            	    try { dbg.enterSubRule(22);
            	    try { dbg.enterDecision(22, decisionCanBacktrack[22]);

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

            	            dbg.recognitionException(nvae);
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

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }
            	    } finally {dbg.exitDecision(22);}

            	    switch (alt22) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/stephan/workspace/nop/nopC.g:288:7: n2= NAME
            	            {
            	            dbg.location(288,10);
            	            n2=(Token)match(input,NAME,FOLLOW_NAME_in_functionCallArgumentList979); if (state.failed) return ;
            	            dbg.location(288,17);
            	            if ( state.backtracking==0 ) {writeSetVarToReg("PUSH", (n2!=null?n2.getText():null), parent.getScope());}

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /home/stephan/workspace/nop/nopC.g:289:8: functionCall[parent]
            	            {
            	            dbg.location(289,8);
            	            pushFollow(FOLLOW_functionCall_in_functionCallArgumentList991);
            	            functionCall(parent);

            	            state._fsp--;
            	            if (state.failed) return ;
            	            dbg.location(289,29);
            	            if ( state.backtracking==0 ) {writeSetVarToReg("PUSH", fun.getName(), parent.getScope());}

            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // /home/stephan/workspace/nop/nopC.g:290:8: w2= WERT
            	            {
            	            dbg.location(290,11);
            	            w2=(Token)match(input,WERT,FOLLOW_WERT_in_functionCallArgumentList1008); if (state.failed) return ;
            	            dbg.location(290,18);
            	            if ( state.backtracking==0 ) {writeSetImmidiateToReg("PUSH", (w2!=null?w2.getText():null));}

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(22);}


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);
            } finally {dbg.exitSubRule(23);}


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
        dbg.location(293, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionCallArgumentList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "functionCallArgumentList"



    // $ANTLR start "assignment"
    // /home/stephan/workspace/nop/nopC.g:295:1: assignment[GenericStatement parent] : NAME ( '=' expression[p] | '*=' expression[p] | '/=' expression[p] | '%=' expression[p] | '+=' expression[p] | '-=' expression[p] | '<<=' expression[p] | '>>=' expression[p] | '&=' expression[p] | '^=' expression[p] | '|=' expression[p] ) ;
    public final void assignment(GenericStatement parent) throws RecognitionException {
        int assignment_StartIndex = input.index();

        Token NAME4=null;


          GenericStatement p = parent;
          if (p == null) { p = hackStore1;}

        try { dbg.enterRule(getGrammarFileName(), "assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(295, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:300:3: ( NAME ( '=' expression[p] | '*=' expression[p] | '/=' expression[p] | '%=' expression[p] | '+=' expression[p] | '-=' expression[p] | '<<=' expression[p] | '>>=' expression[p] | '&=' expression[p] | '^=' expression[p] | '|=' expression[p] ) )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:301:5: NAME ( '=' expression[p] | '*=' expression[p] | '/=' expression[p] | '%=' expression[p] | '+=' expression[p] | '-=' expression[p] | '<<=' expression[p] | '>>=' expression[p] | '&=' expression[p] | '^=' expression[p] | '|=' expression[p] )
            {
            dbg.location(301,5);
            NAME4=(Token)match(input,NAME,FOLLOW_NAME_in_assignment1046); if (state.failed) return ;
            dbg.location(301,10);
            // /home/stephan/workspace/nop/nopC.g:301:10: ( '=' expression[p] | '*=' expression[p] | '/=' expression[p] | '%=' expression[p] | '+=' expression[p] | '-=' expression[p] | '<<=' expression[p] | '>>=' expression[p] | '&=' expression[p] | '^=' expression[p] | '|=' expression[p] )
            int alt24=11;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24, decisionCanBacktrack[24]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:301:14: '=' expression[p]
                    {
                    dbg.location(301,14);
                    match(input,35,FOLLOW_35_in_assignment1052); if (state.failed) return ;
                    dbg.location(301,18);
                    pushFollow(FOLLOW_expression_in_assignment1054);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(301,32);
                    if ( state.backtracking==0 ) {writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/stephan/workspace/nop/nopC.g:302:8: '*=' expression[p]
                    {
                    dbg.location(302,8);
                    match(input,19,FOLLOW_19_in_assignment1066); if (state.failed) return ;
                    dbg.location(302,13);
                    pushFollow(FOLLOW_expression_in_assignment1068);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(302,27);
                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("MUL X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/stephan/workspace/nop/nopC.g:303:8: '/=' expression[p]
                    {
                    dbg.location(303,8);
                    match(input,28,FOLLOW_28_in_assignment1080); if (state.failed) return ;
                    dbg.location(303,13);
                    pushFollow(FOLLOW_expression_in_assignment1082);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(303,27);
                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("DIV Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/stephan/workspace/nop/nopC.g:304:8: '%=' expression[p]
                    {
                    dbg.location(304,8);
                    match(input,12,FOLLOW_12_in_assignment1094); if (state.failed) return ;
                    dbg.location(304,13);
                    pushFollow(FOLLOW_expression_in_assignment1096);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(304,27);
                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("MOD Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/stephan/workspace/nop/nopC.g:305:8: '+=' expression[p]
                    {
                    dbg.location(305,8);
                    match(input,22,FOLLOW_22_in_assignment1108); if (state.failed) return ;
                    dbg.location(305,13);
                    pushFollow(FOLLOW_expression_in_assignment1110);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(305,27);
                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("ADD X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/stephan/workspace/nop/nopC.g:306:8: '-=' expression[p]
                    {
                    dbg.location(306,8);
                    match(input,26,FOLLOW_26_in_assignment1122); if (state.failed) return ;
                    dbg.location(306,13);
                    pushFollow(FOLLOW_expression_in_assignment1124);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(306,27);
                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("SUB Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/stephan/workspace/nop/nopC.g:307:8: '<<=' expression[p]
                    {
                    dbg.location(307,8);
                    match(input,33,FOLLOW_33_in_assignment1136); if (state.failed) return ;
                    dbg.location(307,13);
                    pushFollow(FOLLOW_expression_in_assignment1137);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(307,27);
                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("SHL Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/stephan/workspace/nop/nopC.g:308:8: '>>=' expression[p]
                    {
                    dbg.location(308,8);
                    match(input,40,FOLLOW_40_in_assignment1149); if (state.failed) return ;
                    dbg.location(308,13);
                    pushFollow(FOLLOW_expression_in_assignment1150);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(308,27);
                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("SHR Y, X	\nSET X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /home/stephan/workspace/nop/nopC.g:309:8: '&=' expression[p]
                    {
                    dbg.location(309,8);
                    match(input,15,FOLLOW_15_in_assignment1162); if (state.failed) return ;
                    dbg.location(309,13);
                    pushFollow(FOLLOW_expression_in_assignment1164);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(309,27);
                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("AND X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /home/stephan/workspace/nop/nopC.g:310:8: '^=' expression[p]
                    {
                    dbg.location(310,8);
                    match(input,43,FOLLOW_43_in_assignment1176); if (state.failed) return ;
                    dbg.location(310,13);
                    pushFollow(FOLLOW_expression_in_assignment1178);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(310,27);
                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("XOR X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /home/stephan/workspace/nop/nopC.g:311:8: '|=' expression[p]
                    {
                    dbg.location(311,8);
                    match(input,57,FOLLOW_57_in_assignment1190); if (state.failed) return ;
                    dbg.location(311,13);
                    pushFollow(FOLLOW_expression_in_assignment1192);
                    expression(p);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(311,27);
                    if ( state.backtracking==0 ) {writeSetVarToReg("Y", (NAME4!=null?NAME4.getText():null), p.getScope()); writeASM("BOR X, Y\n"); writeSetRegToMemory("X", (NAME4!=null?NAME4.getText():null), p.getScope()); }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}


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
        dbg.location(313, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "expression"
    // /home/stephan/workspace/nop/nopC.g:315:2: expression[GenericStatement parent] : logical_or_expression[parent] ( '?' expression[parent] ':' expression[parent] )? ;
    public final void expression(GenericStatement parent) throws RecognitionException {
        int expression_StartIndex = input.index();


        	    String label = "";
        	
        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(315, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:319:3: ( logical_or_expression[parent] ( '?' expression[parent] ':' expression[parent] )? )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:319:5: logical_or_expression[parent] ( '?' expression[parent] ':' expression[parent] )?
            {
            dbg.location(319,5);
            pushFollow(FOLLOW_logical_or_expression_in_expression1223);
            logical_or_expression(parent);

            state._fsp--;
            if (state.failed) return ;
            dbg.location(320,4);
            // /home/stephan/workspace/nop/nopC.g:320:4: ( '?' expression[parent] ':' expression[parent] )?
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:321:5: '?' expression[parent] ':' expression[parent]
                    {
                    dbg.location(321,5);
                    match(input,41,FOLLOW_41_in_expression1236); if (state.failed) return ;
                    dbg.location(321,9);
                    if ( state.backtracking==0 ) {label = getNewLoopCounter(); writeASM("IFE X, 0\n   SET PC, ELSE" + label + "\n");}
                    dbg.location(322,5);
                    pushFollow(FOLLOW_expression_in_expression1245);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(323,5);
                    if ( state.backtracking==0 ) {writeASM("SET PC, END" + label + "\n");}
                    dbg.location(324,5);
                    match(input,29,FOLLOW_29_in_expression1258); if (state.failed) return ;
                    dbg.location(324,8);
                    if ( state.backtracking==0 ) {writeASM(":ELSE" + label + "\n");}
                    dbg.location(325,5);
                    pushFollow(FOLLOW_expression_in_expression1265);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(326,5);
                    if ( state.backtracking==0 ) {writeASM(":END" + label + "\n");}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}


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
        dbg.location(328, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "logical_or_expression"
    // /home/stephan/workspace/nop/nopC.g:330:2: logical_or_expression[GenericStatement parent] : logical_and_expression[parent] ( '||' logical_and_expression[parent] )* ;
    public final void logical_or_expression(GenericStatement parent) throws RecognitionException {
        int logical_or_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "logical_or_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(330, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:331:3: ( logical_and_expression[parent] ( '||' logical_and_expression[parent] )* )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:331:5: logical_and_expression[parent] ( '||' logical_and_expression[parent] )*
            {
            dbg.location(331,5);
            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1293);
            logical_and_expression(parent);

            state._fsp--;
            if (state.failed) return ;
            dbg.location(332,4);
            // /home/stephan/workspace/nop/nopC.g:332:4: ( '||' logical_and_expression[parent] )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26, decisionCanBacktrack[26]);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==58) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:333:5: '||' logical_and_expression[parent]
            	    {
            	    dbg.location(333,5);
            	    match(input,58,FOLLOW_58_in_logical_or_expression1306); if (state.failed) return ;
            	    dbg.location(333,10);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(333,39);
            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1310);
            	    logical_and_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(333,70);
            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \n OR X, Y\nIFG X, 0\n   SET X, 1\n");}

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}


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
        dbg.location(335, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "logical_or_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "logical_or_expression"



    // $ANTLR start "logical_and_expression"
    // /home/stephan/workspace/nop/nopC.g:337:2: logical_and_expression[GenericStatement parent] : inclusive_or_expression[parent] ( '&&' inclusive_or_expression[parent] )* ;
    public final void logical_and_expression(GenericStatement parent) throws RecognitionException {
        int logical_and_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "logical_and_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(337, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:338:3: ( inclusive_or_expression[parent] ( '&&' inclusive_or_expression[parent] )* )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:338:5: inclusive_or_expression[parent] ( '&&' inclusive_or_expression[parent] )*
            {
            dbg.location(338,5);
            pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1334);
            inclusive_or_expression(parent);

            state._fsp--;
            if (state.failed) return ;
            dbg.location(339,4);
            // /home/stephan/workspace/nop/nopC.g:339:4: ( '&&' inclusive_or_expression[parent] )*
            try { dbg.enterSubRule(27);

            loop27:
            do {
                int alt27=2;
                try { dbg.enterDecision(27, decisionCanBacktrack[27]);

                int LA27_0 = input.LA(1);

                if ( (LA27_0==13) ) {
                    alt27=1;
                }


                } finally {dbg.exitDecision(27);}

                switch (alt27) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:340:5: '&&' inclusive_or_expression[parent]
            	    {
            	    dbg.location(340,5);
            	    match(input,13,FOLLOW_13_in_logical_and_expression1347); if (state.failed) return ;
            	    dbg.location(340,10);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(340,39);
            	    pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1351);
            	    inclusive_or_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(340,71);
            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nIFG Y, 0\n   SET Y, FFFF\nAND X, Y\nIFG X, 0\n   SET X, 1\n");}

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);
            } finally {dbg.exitSubRule(27);}


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
        dbg.location(342, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "logical_and_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "logical_and_expression"



    // $ANTLR start "inclusive_or_expression"
    // /home/stephan/workspace/nop/nopC.g:344:2: inclusive_or_expression[GenericStatement parent] : exclusive_or_expression[parent] ( '|' exclusive_or_expression[parent] )* ;
    public final void inclusive_or_expression(GenericStatement parent) throws RecognitionException {
        int inclusive_or_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "inclusive_or_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(344, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:345:3: ( exclusive_or_expression[parent] ( '|' exclusive_or_expression[parent] )* )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:345:5: exclusive_or_expression[parent] ( '|' exclusive_or_expression[parent] )*
            {
            dbg.location(345,5);
            pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1375);
            exclusive_or_expression(parent);

            state._fsp--;
            if (state.failed) return ;
            dbg.location(346,4);
            // /home/stephan/workspace/nop/nopC.g:346:4: ( '|' exclusive_or_expression[parent] )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28, decisionCanBacktrack[28]);

                int LA28_0 = input.LA(1);

                if ( (LA28_0==56) ) {
                    alt28=1;
                }


                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:347:5: '|' exclusive_or_expression[parent]
            	    {
            	    dbg.location(347,5);
            	    match(input,56,FOLLOW_56_in_inclusive_or_expression1388); if (state.failed) return ;
            	    dbg.location(347,9);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(347,38);
            	    pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1392);
            	    exclusive_or_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(347,70);
            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nOR X, Y\n");}

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);
            } finally {dbg.exitSubRule(28);}


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
        dbg.location(349, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inclusive_or_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inclusive_or_expression"



    // $ANTLR start "exclusive_or_expression"
    // /home/stephan/workspace/nop/nopC.g:351:2: exclusive_or_expression[GenericStatement parent] : and_expression[parent] ( '^' and_expression[parent] )* ;
    public final void exclusive_or_expression(GenericStatement parent) throws RecognitionException {
        int exclusive_or_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "exclusive_or_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(351, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:352:3: ( and_expression[parent] ( '^' and_expression[parent] )* )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:352:5: and_expression[parent] ( '^' and_expression[parent] )*
            {
            dbg.location(352,5);
            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1416);
            and_expression(parent);

            state._fsp--;
            if (state.failed) return ;
            dbg.location(353,3);
            // /home/stephan/workspace/nop/nopC.g:353:3: ( '^' and_expression[parent] )*
            try { dbg.enterSubRule(29);

            loop29:
            do {
                int alt29=2;
                try { dbg.enterDecision(29, decisionCanBacktrack[29]);

                int LA29_0 = input.LA(1);

                if ( (LA29_0==42) ) {
                    alt29=1;
                }


                } finally {dbg.exitDecision(29);}

                switch (alt29) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:354:4: '^' and_expression[parent]
            	    {
            	    dbg.location(354,4);
            	    match(input,42,FOLLOW_42_in_exclusive_or_expression1427); if (state.failed) return ;
            	    dbg.location(354,8);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(354,37);
            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1431);
            	    and_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(354,60);
            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nXOR X, Y\n");}

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);
            } finally {dbg.exitSubRule(29);}


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
        dbg.location(356, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exclusive_or_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "exclusive_or_expression"



    // $ANTLR start "and_expression"
    // /home/stephan/workspace/nop/nopC.g:358:2: and_expression[GenericStatement parent] : equality_expression[parent] ( '&' equality_expression[parent] )* ;
    public final void and_expression(GenericStatement parent) throws RecognitionException {
        int and_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "and_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(358, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:359:3: ( equality_expression[parent] ( '&' equality_expression[parent] )* )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:359:5: equality_expression[parent] ( '&' equality_expression[parent] )*
            {
            dbg.location(359,5);
            pushFollow(FOLLOW_equality_expression_in_and_expression1454);
            equality_expression(parent);

            state._fsp--;
            if (state.failed) return ;
            dbg.location(360,3);
            // /home/stephan/workspace/nop/nopC.g:360:3: ( '&' equality_expression[parent] )*
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30, decisionCanBacktrack[30]);

                int LA30_0 = input.LA(1);

                if ( (LA30_0==14) ) {
                    alt30=1;
                }


                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:361:4: '&' equality_expression[parent]
            	    {
            	    dbg.location(361,4);
            	    match(input,14,FOLLOW_14_in_and_expression1465); if (state.failed) return ;
            	    dbg.location(361,8);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(361,37);
            	    pushFollow(FOLLOW_equality_expression_in_and_expression1469);
            	    equality_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(361,66);
            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nAND X, Y\n");}

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);
            } finally {dbg.exitSubRule(30);}


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
        dbg.location(363, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "and_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "and_expression"



    // $ANTLR start "equality_expression"
    // /home/stephan/workspace/nop/nopC.g:365:2: equality_expression[GenericStatement parent] : relational_expression[parent] ( '==' relational_expression[parent] | '!=' relational_expression[parent] )* ;
    public final void equality_expression(GenericStatement parent) throws RecognitionException {
        int equality_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "equality_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(365, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:366:3: ( relational_expression[parent] ( '==' relational_expression[parent] | '!=' relational_expression[parent] )* )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:366:5: relational_expression[parent] ( '==' relational_expression[parent] | '!=' relational_expression[parent] )*
            {
            dbg.location(366,5);
            pushFollow(FOLLOW_relational_expression_in_equality_expression1495);
            relational_expression(parent);

            state._fsp--;
            if (state.failed) return ;
            dbg.location(367,4);
            // /home/stephan/workspace/nop/nopC.g:367:4: ( '==' relational_expression[parent] | '!=' relational_expression[parent] )*
            try { dbg.enterSubRule(31);

            loop31:
            do {
                int alt31=3;
                try { dbg.enterDecision(31, decisionCanBacktrack[31]);

                int LA31_0 = input.LA(1);

                if ( (LA31_0==36) ) {
                    alt31=1;
                }
                else if ( (LA31_0==10) ) {
                    alt31=2;
                }


                } finally {dbg.exitDecision(31);}

                switch (alt31) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:368:5: '==' relational_expression[parent]
            	    {
            	    dbg.location(368,5);
            	    match(input,36,FOLLOW_36_in_equality_expression1508); if (state.failed) return ;
            	    dbg.location(368,10);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(368,39);
            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1512);
            	    relational_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(368,69);
            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFE	 X, Y\n   SET B, 1\nSET X, B\n");}

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/stephan/workspace/nop/nopC.g:369:6: '!=' relational_expression[parent]
            	    {
            	    dbg.location(369,6);
            	    match(input,10,FOLLOW_10_in_equality_expression1522); if (state.failed) return ;
            	    dbg.location(369,11);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(369,40);
            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1526);
            	    relational_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(369,70);
            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFN  X, Y\n   SET B, 1\nSET X, B\n");}

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);
            } finally {dbg.exitSubRule(31);}


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
        dbg.location(372, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equality_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "equality_expression"



    // $ANTLR start "relational_expression"
    // /home/stephan/workspace/nop/nopC.g:374:2: relational_expression[GenericStatement parent] : shift_expression[parent] ( '<' shift_expression[parent] | '>' shift_expression[parent] | '<=' shift_expression[parent] | '>=' shift_expression[parent] )* ;
    public final void relational_expression(GenericStatement parent) throws RecognitionException {
        int relational_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "relational_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(374, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:375:3: ( shift_expression[parent] ( '<' shift_expression[parent] | '>' shift_expression[parent] | '<=' shift_expression[parent] | '>=' shift_expression[parent] )* )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:375:5: shift_expression[parent] ( '<' shift_expression[parent] | '>' shift_expression[parent] | '<=' shift_expression[parent] | '>=' shift_expression[parent] )*
            {
            dbg.location(375,5);
            pushFollow(FOLLOW_shift_expression_in_relational_expression1555);
            shift_expression(parent);

            state._fsp--;
            if (state.failed) return ;
            dbg.location(376,4);
            // /home/stephan/workspace/nop/nopC.g:376:4: ( '<' shift_expression[parent] | '>' shift_expression[parent] | '<=' shift_expression[parent] | '>=' shift_expression[parent] )*
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=5;
                try { dbg.enterDecision(32, decisionCanBacktrack[32]);

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

                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:377:7: '<' shift_expression[parent]
            	    {
            	    dbg.location(377,7);
            	    match(input,31,FOLLOW_31_in_relational_expression1570); if (state.failed) return ;
            	    dbg.location(377,11);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(377,40);
            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1574);
            	    shift_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(377,66);
            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFG X, Y\n   SET B, 1\nSET X, B\n");}

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/stephan/workspace/nop/nopC.g:378:7: '>' shift_expression[parent]
            	    {
            	    dbg.location(378,7);
            	    match(input,37,FOLLOW_37_in_relational_expression1587); if (state.failed) return ;
            	    dbg.location(378,11);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(378,40);
            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1591);
            	    shift_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(378,66);
            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFG Y, X\n   SET B, 1\nSET X, B\n");}

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /home/stephan/workspace/nop/nopC.g:379:7: '<=' shift_expression[parent]
            	    {
            	    dbg.location(379,7);
            	    match(input,34,FOLLOW_34_in_relational_expression1604); if (state.failed) return ;
            	    dbg.location(379,12);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(379,41);
            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1608);
            	    shift_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(379,66);
            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFG X, Y\n   SET B, 1\nIFE X, Y\n    SET B, 1\nSET X, B\n" );}

            	    }
            	    break;
            	case 4 :
            	    dbg.enterAlt(4);

            	    // /home/stephan/workspace/nop/nopC.g:380:7: '>=' shift_expression[parent]
            	    {
            	    dbg.location(380,7);
            	    match(input,38,FOLLOW_38_in_relational_expression1621); if (state.failed) return ;
            	    dbg.location(380,12);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(380,41);
            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1625);
            	    shift_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(380,66);
            	    if ( state.backtracking==0 ) {writeASM("SET B, 0\nSET Y, POP \nIFG Y, X\n   SET B, 1\nIFE X, Y\n    SET B, 1\nSET X, B\n" );}

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);
            } finally {dbg.exitSubRule(32);}


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
        dbg.location(382, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relational_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "relational_expression"



    // $ANTLR start "shift_expression"
    // /home/stephan/workspace/nop/nopC.g:384:2: shift_expression[GenericStatement parent] : additive_expression[parent] ( '<<' additive_expression[parent] | '>>' additive_expression[parent] )* ;
    public final void shift_expression(GenericStatement parent) throws RecognitionException {
        int shift_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "shift_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(384, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:385:3: ( additive_expression[parent] ( '<<' additive_expression[parent] | '>>' additive_expression[parent] )* )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:385:5: additive_expression[parent] ( '<<' additive_expression[parent] | '>>' additive_expression[parent] )*
            {
            dbg.location(385,5);
            pushFollow(FOLLOW_additive_expression_in_shift_expression1655);
            additive_expression(parent);

            state._fsp--;
            if (state.failed) return ;
            dbg.location(386,3);
            // /home/stephan/workspace/nop/nopC.g:386:3: ( '<<' additive_expression[parent] | '>>' additive_expression[parent] )*
            try { dbg.enterSubRule(33);

            loop33:
            do {
                int alt33=3;
                try { dbg.enterDecision(33, decisionCanBacktrack[33]);

                int LA33_0 = input.LA(1);

                if ( (LA33_0==32) ) {
                    alt33=1;
                }
                else if ( (LA33_0==39) ) {
                    alt33=2;
                }


                } finally {dbg.exitDecision(33);}

                switch (alt33) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:387:5: '<<' additive_expression[parent]
            	    {
            	    dbg.location(387,5);
            	    match(input,32,FOLLOW_32_in_shift_expression1667); if (state.failed) return ;
            	    dbg.location(387,10);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(387,39);
            	    pushFollow(FOLLOW_additive_expression_in_shift_expression1671);
            	    additive_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(387,67);
            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nSHL Y, X\nSET X, Y\n");}

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/stephan/workspace/nop/nopC.g:388:6: '>>' additive_expression[parent]
            	    {
            	    dbg.location(388,6);
            	    match(input,39,FOLLOW_39_in_shift_expression1681); if (state.failed) return ;
            	    dbg.location(388,11);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(388,40);
            	    pushFollow(FOLLOW_additive_expression_in_shift_expression1685);
            	    additive_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(388,68);
            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nSHR Y, X\nSET X, Y\n");}

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);
            } finally {dbg.exitSubRule(33);}


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
        dbg.location(390, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "shift_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "shift_expression"



    // $ANTLR start "additive_expression"
    // /home/stephan/workspace/nop/nopC.g:392:2: additive_expression[GenericStatement parent] : ( multiplicative_expression[parent] ) ( '+' multiplicative_expression[parent] | '-' multiplicative_expression[parent] )* ;
    public final void additive_expression(GenericStatement parent) throws RecognitionException {
        int additive_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "additive_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(392, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:393:3: ( ( multiplicative_expression[parent] ) ( '+' multiplicative_expression[parent] | '-' multiplicative_expression[parent] )* )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:393:5: ( multiplicative_expression[parent] ) ( '+' multiplicative_expression[parent] | '-' multiplicative_expression[parent] )*
            {
            dbg.location(393,5);
            // /home/stephan/workspace/nop/nopC.g:393:5: ( multiplicative_expression[parent] )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:393:6: multiplicative_expression[parent]
            {
            dbg.location(393,6);
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1712);
            multiplicative_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(394,4);
            // /home/stephan/workspace/nop/nopC.g:394:4: ( '+' multiplicative_expression[parent] | '-' multiplicative_expression[parent] )*
            try { dbg.enterSubRule(34);

            loop34:
            do {
                int alt34=3;
                try { dbg.enterDecision(34, decisionCanBacktrack[34]);

                int LA34_0 = input.LA(1);

                if ( (LA34_0==20) ) {
                    alt34=1;
                }
                else if ( (LA34_0==24) ) {
                    alt34=2;
                }


                } finally {dbg.exitDecision(34);}

                switch (alt34) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:395:6: '+' multiplicative_expression[parent]
            	    {
            	    dbg.location(395,6);
            	    match(input,20,FOLLOW_20_in_additive_expression1727); if (state.failed) return ;
            	    dbg.location(395,10);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(395,39);
            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1731);
            	    multiplicative_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(395,73);
            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nADD X, Y\n");}

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/stephan/workspace/nop/nopC.g:396:7: '-' multiplicative_expression[parent]
            	    {
            	    dbg.location(396,7);
            	    match(input,24,FOLLOW_24_in_additive_expression1743); if (state.failed) return ;
            	    dbg.location(396,11);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(396,40);
            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1747);
            	    multiplicative_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(396,74);
            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nSUB Y, X\nSET X, Y \n");}

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);
            } finally {dbg.exitSubRule(34);}


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
        dbg.location(398, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "additive_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "additive_expression"



    // $ANTLR start "multiplicative_expression"
    // /home/stephan/workspace/nop/nopC.g:400:2: multiplicative_expression[GenericStatement parent] : ( unary_expression[parent] ) ( '*' unary_expression[parent] | '/' unary_expression[parent] | '%' unary_expression[parent] )* ;
    public final void multiplicative_expression(GenericStatement parent) throws RecognitionException {
        int multiplicative_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "multiplicative_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(400, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:401:3: ( ( unary_expression[parent] ) ( '*' unary_expression[parent] | '/' unary_expression[parent] | '%' unary_expression[parent] )* )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:401:5: ( unary_expression[parent] ) ( '*' unary_expression[parent] | '/' unary_expression[parent] | '%' unary_expression[parent] )*
            {
            dbg.location(401,5);
            // /home/stephan/workspace/nop/nopC.g:401:5: ( unary_expression[parent] )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:401:6: unary_expression[parent]
            {
            dbg.location(401,6);
            pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1773);
            unary_expression(parent);

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(402,5);
            // /home/stephan/workspace/nop/nopC.g:402:5: ( '*' unary_expression[parent] | '/' unary_expression[parent] | '%' unary_expression[parent] )*
            try { dbg.enterSubRule(35);

            loop35:
            do {
                int alt35=4;
                try { dbg.enterDecision(35, decisionCanBacktrack[35]);

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

                } finally {dbg.exitDecision(35);}

                switch (alt35) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:403:6: '*' unary_expression[parent]
            	    {
            	    dbg.location(403,6);
            	    match(input,18,FOLLOW_18_in_multiplicative_expression1789); if (state.failed) return ;
            	    dbg.location(403,10);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(403,39);
            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1793);
            	    unary_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(403,64);
            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nMUL X, Y\n");}

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/stephan/workspace/nop/nopC.g:404:7: '/' unary_expression[parent]
            	    {
            	    dbg.location(404,7);
            	    match(input,27,FOLLOW_27_in_multiplicative_expression1805); if (state.failed) return ;
            	    dbg.location(404,11);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(404,40);
            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1809);
            	    unary_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(404,65);
            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nDIV Y, X\nSET X, Y \n");}

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /home/stephan/workspace/nop/nopC.g:405:7: '%' unary_expression[parent]
            	    {
            	    dbg.location(405,7);
            	    match(input,11,FOLLOW_11_in_multiplicative_expression1821); if (state.failed) return ;
            	    dbg.location(405,11);
            	    if ( state.backtracking==0 ) {writeASM("SET PUSH, X\n");}
            	    dbg.location(405,40);
            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1825);
            	    unary_expression(parent);

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(405,65);
            	    if ( state.backtracking==0 ) {writeASM("SET Y, POP \nMOD Y, X\nSET X, Y \n");}

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);
            } finally {dbg.exitSubRule(35);}


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
        dbg.location(407, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multiplicative_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "multiplicative_expression"



    // $ANTLR start "unary_expression"
    // /home/stephan/workspace/nop/nopC.g:412:1: unary_expression[GenericStatement parent] returns [String varname] : (p= postfix_expression[parent] | '++' u= unary_expression[parent] | '--' u= unary_expression[parent] );
    public final String unary_expression(GenericStatement parent) throws RecognitionException {
        String varname = null;

        int unary_expression_StartIndex = input.index();

        String p =null;

        String u =null;


        try { dbg.enterRule(getGrammarFileName(), "unary_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(412, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return varname; }

            // /home/stephan/workspace/nop/nopC.g:413:3: (p= postfix_expression[parent] | '++' u= unary_expression[parent] | '--' u= unary_expression[parent] )
            int alt36=3;
            try { dbg.enterDecision(36, decisionCanBacktrack[36]);

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
                if (state.backtracking>0) {state.failed=true; return varname;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:413:5: p= postfix_expression[parent]
                    {
                    dbg.location(413,7);
                    pushFollow(FOLLOW_postfix_expression_in_unary_expression1862);
                    p=postfix_expression(parent);

                    state._fsp--;
                    if (state.failed) return varname;
                    dbg.location(413,36);
                    if ( state.backtracking==0 ) {varname = p;}

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/stephan/workspace/nop/nopC.g:414:5: '++' u= unary_expression[parent]
                    {
                    dbg.location(414,5);
                    match(input,21,FOLLOW_21_in_unary_expression1871); if (state.failed) return varname;
                    dbg.location(414,12);
                    pushFollow(FOLLOW_unary_expression_in_unary_expression1877);
                    u=unary_expression(parent);

                    state._fsp--;
                    if (state.failed) return varname;
                    dbg.location(414,38);
                    if ( state.backtracking==0 ) {writeASM("ADD X, 1\n"); if (u != null) {writeSetRegToMemory("X", u, parent.getScope()); }}

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/stephan/workspace/nop/nopC.g:415:5: '--' u= unary_expression[parent]
                    {
                    dbg.location(415,5);
                    match(input,25,FOLLOW_25_in_unary_expression1885); if (state.failed) return varname;
                    dbg.location(415,12);
                    pushFollow(FOLLOW_unary_expression_in_unary_expression1891);
                    u=unary_expression(parent);

                    state._fsp--;
                    if (state.failed) return varname;
                    dbg.location(415,38);
                    if ( state.backtracking==0 ) {writeASM("SUB X, 1\n"); if (u != null) {writeSetRegToMemory("X", u, parent.getScope()); }}

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
        dbg.location(416, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unary_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return varname;
    }
    // $ANTLR end "unary_expression"



    // $ANTLR start "postfix_expression"
    // /home/stephan/workspace/nop/nopC.g:418:1: postfix_expression[GenericStatement parent] returns [String varname] : p= primary_expression[parent] ( '++' | '--' )* ;
    public final String postfix_expression(GenericStatement parent) throws RecognitionException {
        String varname = null;

        int postfix_expression_StartIndex = input.index();

        String p =null;


        try { dbg.enterRule(getGrammarFileName(), "postfix_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(418, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return varname; }

            // /home/stephan/workspace/nop/nopC.g:419:3: (p= primary_expression[parent] ( '++' | '--' )* )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:419:7: p= primary_expression[parent] ( '++' | '--' )*
            {
            dbg.location(419,9);
            pushFollow(FOLLOW_primary_expression_in_postfix_expression1917);
            p=primary_expression(parent);

            state._fsp--;
            if (state.failed) return varname;
            dbg.location(420,9);
            // /home/stephan/workspace/nop/nopC.g:420:9: ( '++' | '--' )*
            try { dbg.enterSubRule(37);

            loop37:
            do {
                int alt37=3;
                try { dbg.enterDecision(37, decisionCanBacktrack[37]);

                int LA37_0 = input.LA(1);

                if ( (LA37_0==21) ) {
                    alt37=1;
                }
                else if ( (LA37_0==25) ) {
                    alt37=2;
                }


                } finally {dbg.exitDecision(37);}

                switch (alt37) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/stephan/workspace/nop/nopC.g:420:11: '++'
            	    {
            	    dbg.location(420,11);
            	    match(input,21,FOLLOW_21_in_postfix_expression1930); if (state.failed) return varname;
            	    dbg.location(420,16);
            	    if ( state.backtracking==0 ) {writeASM("ADD X, 1\n"); if (p != null) {writeSetRegToMemory("X", p, parent.getScope()); }}

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/stephan/workspace/nop/nopC.g:421:11: '--'
            	    {
            	    dbg.location(421,11);
            	    match(input,25,FOLLOW_25_in_postfix_expression1944); if (state.failed) return varname;
            	    dbg.location(421,16);
            	    if ( state.backtracking==0 ) {writeASM("SUB X, 1\n"); if (p != null) {writeSetRegToMemory("X", p, parent.getScope()); }}

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);
            } finally {dbg.exitSubRule(37);}

            dbg.location(423,7);
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
        dbg.location(424, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "postfix_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return varname;
    }
    // $ANTLR end "postfix_expression"



    // $ANTLR start "primary_expression"
    // /home/stephan/workspace/nop/nopC.g:426:1: primary_expression[GenericStatement parent] returns [String varname] : ( NAME | '(' expression[parent] ')' | functionCall[parent] | WERT );
    public final String primary_expression(GenericStatement parent) throws RecognitionException {
        String varname = null;

        int primary_expression_StartIndex = input.index();

        Token NAME5=null;
        Token WERT6=null;

        try { dbg.enterRule(getGrammarFileName(), "primary_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(426, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return varname; }

            // /home/stephan/workspace/nop/nopC.g:427:3: ( NAME | '(' expression[parent] ')' | functionCall[parent] | WERT )
            int alt38=4;
            try { dbg.enterDecision(38, decisionCanBacktrack[38]);

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

                    dbg.recognitionException(nvae);
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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(38);}

            switch (alt38) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/stephan/workspace/nop/nopC.g:427:5: NAME
                    {
                    dbg.location(427,5);
                    NAME5=(Token)match(input,NAME,FOLLOW_NAME_in_primary_expression1983); if (state.failed) return varname;
                    dbg.location(427,10);
                    if ( state.backtracking==0 ) {writeSetVarToReg("X", (NAME5!=null?NAME5.getText():null), parent.getScope()); varname = (NAME5!=null?NAME5.getText():null);}

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/stephan/workspace/nop/nopC.g:428:5: '(' expression[parent] ')'
                    {
                    dbg.location(428,5);
                    match(input,16,FOLLOW_16_in_primary_expression1991); if (state.failed) return varname;
                    dbg.location(428,9);
                    pushFollow(FOLLOW_expression_in_primary_expression1993);
                    expression(parent);

                    state._fsp--;
                    if (state.failed) return varname;
                    dbg.location(428,28);
                    match(input,17,FOLLOW_17_in_primary_expression1996); if (state.failed) return varname;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/stephan/workspace/nop/nopC.g:429:5: functionCall[parent]
                    {
                    dbg.location(429,5);
                    pushFollow(FOLLOW_functionCall_in_primary_expression2003);
                    functionCall(parent);

                    state._fsp--;
                    if (state.failed) return varname;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/stephan/workspace/nop/nopC.g:430:5: WERT
                    {
                    dbg.location(430,5);
                    WERT6=(Token)match(input,WERT,FOLLOW_WERT_in_primary_expression2010); if (state.failed) return varname;
                    dbg.location(430,10);
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
        dbg.location(431, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primary_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return varname;
    }
    // $ANTLR end "primary_expression"



    // $ANTLR start "typeSpecifier"
    // /home/stephan/workspace/nop/nopC.g:453:1: typeSpecifier : ( 'int' | 'void' | 'bool' );
    public final void typeSpecifier() throws RecognitionException {
        int typeSpecifier_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "typeSpecifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(453, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }

            // /home/stephan/workspace/nop/nopC.g:454:3: ( 'int' | 'void' | 'bool' )
            dbg.enterAlt(1);

            // /home/stephan/workspace/nop/nopC.g:
            {
            dbg.location(454,3);
            if ( input.LA(1)==44||input.LA(1)==51||input.LA(1)==53 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(458, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeSpecifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "typeSpecifier"

    // $ANTLR start synpred4_nopC
    public final void synpred4_nopC_fragment() throws RecognitionException {
        // /home/stephan/workspace/nop/nopC.g:137:3: ( typeSpecifier NAME ( '=' | ';' | ',' ) )
        dbg.enterAlt(1);

        // /home/stephan/workspace/nop/nopC.g:137:4: typeSpecifier NAME ( '=' | ';' | ',' )
        {
        dbg.location(137,4);
        pushFollow(FOLLOW_typeSpecifier_in_synpred4_nopC100);
        typeSpecifier();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(137,18);
        match(input,NAME,FOLLOW_NAME_in_synpred4_nopC102); if (state.failed) return ;
        dbg.location(137,23);
        if ( input.LA(1)==23||input.LA(1)==30||input.LA(1)==35 ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            dbg.recognitionException(mse);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred4_nopC

    // $ANTLR start synpred5_nopC
    public final void synpred5_nopC_fragment() throws RecognitionException {
        // /home/stephan/workspace/nop/nopC.g:138:5: ( typeSpecifier NAME '(' )
        dbg.enterAlt(1);

        // /home/stephan/workspace/nop/nopC.g:138:6: typeSpecifier NAME '('
        {
        dbg.location(138,6);
        pushFollow(FOLLOW_typeSpecifier_in_synpred5_nopC129);
        typeSpecifier();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(138,20);
        match(input,NAME,FOLLOW_NAME_in_synpred5_nopC131); if (state.failed) return ;
        dbg.location(138,26);
        match(input,16,FOLLOW_16_in_synpred5_nopC134); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_nopC

    // $ANTLR start synpred17_nopC
    public final void synpred17_nopC_fragment() throws RecognitionException {
        // /home/stephan/workspace/nop/nopC.g:218:7: ( ( functionCall[null] ';' ) )
        dbg.enterAlt(1);

        // /home/stephan/workspace/nop/nopC.g:218:7: ( functionCall[null] ';' )
        {
        dbg.location(218,7);
        // /home/stephan/workspace/nop/nopC.g:218:7: ( functionCall[null] ';' )
        dbg.enterAlt(1);

        // /home/stephan/workspace/nop/nopC.g:218:9: functionCall[null] ';'
        {
        dbg.location(218,9);
        pushFollow(FOLLOW_functionCall_in_synpred17_nopC577);
        functionCall(null);

        state._fsp--;
        if (state.failed) return ;
        dbg.location(218,28);
        match(input,30,FOLLOW_30_in_synpred17_nopC580); if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred17_nopC

    // Delegated rules

    public final boolean synpred4_nopC() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred4_nopC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_nopC() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred5_nopC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_nopC() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred17_nopC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
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
    public static final BitSet FOLLOW_NAME_in_variableDeclarationList295 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_variableDeclarationList307 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_variableDeclarationList314 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_variableDeclarationList336 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_variableDeclarationList347 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_variableDeclarationList363 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_variableDeclarationList372 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_typeSpecifier_in_functionDefinition419 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_functionDefinition423 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDefinition430 = new BitSet(new long[]{0x0028100000020000L});
    public static final BitSet FOLLOW_parameterList_in_functionDefinition434 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionDefinition440 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_functionDefinition444 = new BitSet(new long[]{0x087F700042210180L});
    public static final BitSet FOLLOW_statement_in_functionDefinition450 = new BitSet(new long[]{0x087F700042210180L});
    public static final BitSet FOLLOW_59_in_functionDefinition465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_parameterList493 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_parameterList500 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_parameterList505 = new BitSet(new long[]{0x0028100000000000L});
    public static final BitSet FOLLOW_typeSpecifier_in_parameterList507 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_parameterList514 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_55_in_codeBlock538 = new BitSet(new long[]{0x087F700042210180L});
    public static final BitSet FOLLOW_statement_in_codeBlock539 = new BitSet(new long[]{0x087F700042210180L});
    public static final BitSet FOLLOW_59_in_codeBlock542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_codeBlock548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement577 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement591 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_statement604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_selection_statement661 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_selection_statement663 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_selection_statement665 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_selection_statement668 = new BitSet(new long[]{0x00FF700042210180L});
    public static final BitSet FOLLOW_codeBlock_in_selection_statement675 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_selection_statement698 = new BitSet(new long[]{0x00FF700042210180L});
    public static final BitSet FOLLOW_codeBlock_in_selection_statement703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_iteration_statement727 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_iteration_statement729 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_iteration_statement731 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_iteration_statement734 = new BitSet(new long[]{0x00FF700042210180L});
    public static final BitSet FOLLOW_codeBlock_in_iteration_statement736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_iteration_statement743 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_iteration_statement745 = new BitSet(new long[]{0x0000000042210180L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement748 = new BitSet(new long[]{0x0000000042210180L});
    public static final BitSet FOLLOW_assignment_in_iteration_statement753 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_iteration_statement756 = new BitSet(new long[]{0x0000000042210180L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement759 = new BitSet(new long[]{0x0000000002230180L});
    public static final BitSet FOLLOW_expression_in_iteration_statement762 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_iteration_statement766 = new BitSet(new long[]{0x00FF700042210180L});
    public static final BitSet FOLLOW_codeBlock_in_iteration_statement768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_expression_statement784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement790 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_expression_statement793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_jump_statement811 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_jump_statement813 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_jump_statement821 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_jump_statement829 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_jump_statement837 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_jump_statement846 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_jump_statement848 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_functionCall875 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionCall877 = new BitSet(new long[]{0x0000000000820180L});
    public static final BitSet FOLLOW_functionCallArgumentList_in_functionCall881 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionCall884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_functionCallArgumentList919 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallArgumentList930 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_WERT_in_functionCallArgumentList945 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_functionCallArgumentList960 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_NAME_in_functionCallArgumentList979 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_functionCall_in_functionCallArgumentList991 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_WERT_in_functionCallArgumentList1008 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_NAME_in_assignment1046 = new BitSet(new long[]{0x0200090A14489000L});
    public static final BitSet FOLLOW_35_in_assignment1052 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_assignment1066 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_assignment1080 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_assignment1094 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_assignment1108 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_assignment1122 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_assignment1136 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_assignment1149 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_assignment1162 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_assignment1176 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_assignment1190 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_expression1223 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_expression1236 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_expression1245 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_expression1258 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_expression1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1293 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_logical_or_expression1306 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1310 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1334 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_logical_and_expression1347 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1351 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1375 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_inclusive_or_expression1388 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1392 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1416 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_exclusive_or_expression1427 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1431 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression1454 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_and_expression1465 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression1469 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1495 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_36_in_equality_expression1508 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1512 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_10_in_equality_expression1522 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1526 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1555 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_31_in_relational_expression1570 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1574 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_37_in_relational_expression1587 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1591 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_34_in_relational_expression1604 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1608 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_38_in_relational_expression1621 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1625 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1655 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_32_in_shift_expression1667 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1671 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_39_in_shift_expression1681 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1685 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1712 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_20_in_additive_expression1727 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1731 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_24_in_additive_expression1743 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1747 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1773 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_18_in_multiplicative_expression1789 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1793 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_27_in_multiplicative_expression1805 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1809 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_11_in_multiplicative_expression1821 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1825 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_unary_expression1871 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_unary_expression1885 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression1917 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_21_in_postfix_expression1930 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_25_in_postfix_expression1944 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_NAME_in_primary_expression1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_primary_expression1991 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_primary_expression1993 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_primary_expression1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primary_expression2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WERT_in_primary_expression2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_synpred4_nopC100 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_synpred4_nopC102 = new BitSet(new long[]{0x0000000840800000L});
    public static final BitSet FOLLOW_set_in_synpred4_nopC104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_synpred5_nopC129 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_synpred5_nopC131 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred5_nopC134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_synpred17_nopC577 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred17_nopC580 = new BitSet(new long[]{0x0000000000000002L});

}
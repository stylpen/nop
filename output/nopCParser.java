// $ANTLR 3.4 /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g 2012-05-09 12:56:15

import java.util.Set;
import java.util.HashSet;
import java.util.TreeMap;


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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "LETTER", "LINE_COMMENT", "NAME", "WERT", "WS", "'!='", "'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'/'", "'/='", "':'", "';'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'>>='", "'?'", "'['", "']'", "'^'", "'^='", "'bool'", "'break'", "'continue'", "'else'", "'for'", "'goto'", "'if'", "'int'", "'return'", "'void'", "'while'", "'{'", "'|'", "'|='", "'||'", "'}'"
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
    public static final int T__60=60;
    public static final int T__61=61;
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
    "invalidRule", "assignmentOperator", "synpred23_nopC", "synpred48_nopC", 
    "synpred53_nopC", "variableDeclaration", "synpred36_nopC", "synpred19_nopC", 
    "synpred21_nopC", "synpred34_nopC", "synpred57_nopC", "synpred45_nopC", 
    "synpred4_nopC", "synpred42_nopC", "synpred27_nopC", "multiplicative_expression", 
    "postfix_expression", "synpred11_nopC", "synpred22_nopC", "synpred9_nopC", 
    "synpred12_nopC", "synpred1_nopC", "synpred37_nopC", "variableList", 
    "synpred20_nopC", "typeSpecifier", "shift_expression", "synpred24_nopC", 
    "and_expression", "logical_and_expression", "synpred17_nopC", "synpred15_nopC", 
    "unary_expression", "selection_statement", "synpred28_nopC", "statement", 
    "jump_statement", "synpred51_nopC", "primary_expression", "synpred14_nopC", 
    "synpred16_nopC", "synpred39_nopC", "synpred30_nopC", "synpred52_nopC", 
    "relational_expression", "synpred32_nopC", "synpred38_nopC", "synpred69_nopC", 
    "synpred40_nopC", "iteration_statement", "synpred46_nopC", "exclusive_or_expression", 
    "synpred33_nopC", "parameterList", "variableDeclarationList", "synpred54_nopC", 
    "synpred62_nopC", "inclusive_or_expression", "synpred66_nopC", "additive_expression", 
    "synpred70_nopC", "synpred5_nopC", "globalVariableDeclaration", "expression", 
    "synpred56_nopC", "synpred55_nopC", "synpred31_nopC", "synpred43_nopC", 
    "synpred3_nopC", "synpred7_nopC", "functionDefinition", "synpred25_nopC", 
    "synpred50_nopC", "synpred63_nopC", "synpred44_nopC", "synpred6_nopC", 
    "synpred13_nopC", "synpred47_nopC", "synpred8_nopC", "cFile", "synpred58_nopC", 
    "globalFunctionOrStatement", "synpred64_nopC", "synpred26_nopC", "synpred41_nopC", 
    "synpred61_nopC", "synpred29_nopC", "synpred60_nopC", "logical_or_expression", 
    "expression_statement", "synpred67_nopC", "synpred49_nopC", "assignment", 
    "equality_expression", "synpred35_nopC", "synpred68_nopC", "synpred18_nopC", 
    "synpred10_nopC", "synpred2_nopC", "synpred59_nopC", "globalVariableDeclarationList", 
    "functionCall", "codeBlock", "synpred65_nopC"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, true, false, false, false, false, false, false, false, false, 
        false, false, false, true, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false
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
        this.state.ruleMemo = new HashMap[103+1];
         

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
    this.state.ruleMemo = new HashMap[103+1];
     

}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return nopCParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g"; }


    	TreeMap<String, String> functionTable = new TreeMap<String, String>();
    	TreeMap<String, Float> varTable = new TreeMap<String, Float>();



    // $ANTLR start "cFile"
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:30:1: cFile : ( globalFunctionOrStatement )+ ;
    public final void cFile() throws RecognitionException {
        int cFile_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "cFile");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:35:2: ( ( globalFunctionOrStatement )+ )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:36:2: ( globalFunctionOrStatement )+
            {
            dbg.location(36,2);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:36:2: ( globalFunctionOrStatement )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==46||LA1_0==53||LA1_0==55) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:36:2: globalFunctionOrStatement
            	    {
            	    dbg.location(36,2);
            	    pushFollow(FOLLOW_globalFunctionOrStatement_in_cFile70);
            	    globalFunctionOrStatement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


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
        dbg.location(37, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cFile");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cFile"



    // $ANTLR start "globalFunctionOrStatement"
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:39:1: globalFunctionOrStatement : ( ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration | ( typeSpecifier NAME '(' )=> functionDefinition );
    public final void globalFunctionOrStatement() throws RecognitionException {
        int globalFunctionOrStatement_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "globalFunctionOrStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:40:2: ( ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration | ( typeSpecifier NAME '(' )=> functionDefinition )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==46||LA2_0==53||LA2_0==55) ) {
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
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:41:2: ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration
                    {
                    dbg.location(41,44);
                    pushFollow(FOLLOW_globalVariableDeclaration_in_globalFunctionOrStatement104);
                    globalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:42:4: ( typeSpecifier NAME '(' )=> functionDefinition
                    {
                    dbg.location(42,33);
                    pushFollow(FOLLOW_functionDefinition_in_globalFunctionOrStatement121);
                    functionDefinition();

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
            if ( state.backtracking>0 ) { memoize(input, 2, globalFunctionOrStatement_StartIndex); }

        }
        dbg.location(43, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "globalFunctionOrStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "globalFunctionOrStatement"


    public static class globalVariableDeclaration_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "globalVariableDeclaration"
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:45:1: globalVariableDeclaration : typeSpecifier globalVariableDeclarationList ';' ;
    public final nopCParser.globalVariableDeclaration_return globalVariableDeclaration() throws RecognitionException {
        nopCParser.globalVariableDeclaration_return retval = new nopCParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);

        int globalVariableDeclaration_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "globalVariableDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:46:2: ( typeSpecifier globalVariableDeclarationList ';' )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:47:2: typeSpecifier globalVariableDeclarationList ';'
            {
            dbg.location(47,2);
            pushFollow(FOLLOW_typeSpecifier_in_globalVariableDeclaration134);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(47,16);
            pushFollow(FOLLOW_globalVariableDeclarationList_in_globalVariableDeclaration136);
            globalVariableDeclarationList();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(47,46);
            match(input,30,FOLLOW_30_in_globalVariableDeclaration138); if (state.failed) return retval;
            dbg.location(47,50);
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
        dbg.location(48, 1);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:55:1: globalVariableDeclarationList : NAME ( '=' WERT )? ( ',' NAME ( '=' WERT )? )* ;
    public final void globalVariableDeclarationList() throws RecognitionException {
        int globalVariableDeclarationList_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "globalVariableDeclarationList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:56:2: ( NAME ( '=' WERT )? ( ',' NAME ( '=' WERT )? )* )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:57:2: NAME ( '=' WERT )? ( ',' NAME ( '=' WERT )? )*
            {
            dbg.location(57,2);
            match(input,NAME,FOLLOW_NAME_in_globalVariableDeclarationList158); if (state.failed) return ;
            dbg.location(57,7);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:57:7: ( '=' WERT )?
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

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:57:8: '=' WERT
                    {
                    dbg.location(57,8);
                    match(input,35,FOLLOW_35_in_globalVariableDeclarationList161); if (state.failed) return ;
                    dbg.location(57,12);
                    match(input,WERT,FOLLOW_WERT_in_globalVariableDeclarationList163); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(57,19);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:57:19: ( ',' NAME ( '=' WERT )? )*
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

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:57:20: ',' NAME ( '=' WERT )?
            	    {
            	    dbg.location(57,20);
            	    match(input,23,FOLLOW_23_in_globalVariableDeclarationList168); if (state.failed) return ;
            	    dbg.location(57,24);
            	    match(input,NAME,FOLLOW_NAME_in_globalVariableDeclarationList170); if (state.failed) return ;
            	    dbg.location(57,29);
            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:57:29: ( '=' WERT )?
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

            	            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:57:30: '=' WERT
            	            {
            	            dbg.location(57,30);
            	            match(input,35,FOLLOW_35_in_globalVariableDeclarationList173); if (state.failed) return ;
            	            dbg.location(57,34);
            	            match(input,WERT,FOLLOW_WERT_in_globalVariableDeclarationList175); if (state.failed) return ;

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(4);}


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
        dbg.location(58, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "globalVariableDeclarationList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "globalVariableDeclarationList"


    public static class variableDeclaration_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "variableDeclaration"
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:61:1: variableDeclaration : typeSpecifier variableDeclarationList ';' ;
    public final nopCParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        nopCParser.variableDeclaration_return retval = new nopCParser.variableDeclaration_return();
        retval.start = input.LT(1);

        int variableDeclaration_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "variableDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:62:2: ( typeSpecifier variableDeclarationList ';' )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:63:2: typeSpecifier variableDeclarationList ';'
            {
            dbg.location(63,2);
            pushFollow(FOLLOW_typeSpecifier_in_variableDeclaration196);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(63,16);
            pushFollow(FOLLOW_variableDeclarationList_in_variableDeclaration198);
            variableDeclarationList();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(63,40);
            match(input,30,FOLLOW_30_in_variableDeclaration200); if (state.failed) return retval;
            dbg.location(63,44);
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
        dbg.location(64, 1);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:66:1: variableDeclarationList : NAME ( '=' expression )? ( ',' NAME ( '=' expression )? )* ;
    public final void variableDeclarationList() throws RecognitionException {
        int variableDeclarationList_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "variableDeclarationList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:67:2: ( NAME ( '=' expression )? ( ',' NAME ( '=' expression )? )* )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:68:2: NAME ( '=' expression )? ( ',' NAME ( '=' expression )? )*
            {
            dbg.location(68,2);
            match(input,NAME,FOLLOW_NAME_in_variableDeclarationList215); if (state.failed) return ;
            dbg.location(68,7);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:68:7: ( '=' expression )?
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

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:68:8: '=' expression
                    {
                    dbg.location(68,8);
                    match(input,35,FOLLOW_35_in_variableDeclarationList218); if (state.failed) return ;
                    dbg.location(68,12);
                    pushFollow(FOLLOW_expression_in_variableDeclarationList220);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(68,25);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:68:25: ( ',' NAME ( '=' expression )? )*
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

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:68:26: ',' NAME ( '=' expression )?
            	    {
            	    dbg.location(68,26);
            	    match(input,23,FOLLOW_23_in_variableDeclarationList225); if (state.failed) return ;
            	    dbg.location(68,30);
            	    match(input,NAME,FOLLOW_NAME_in_variableDeclarationList227); if (state.failed) return ;
            	    dbg.location(68,35);
            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:68:35: ( '=' expression )?
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

            	            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:68:36: '=' expression
            	            {
            	            dbg.location(68,36);
            	            match(input,35,FOLLOW_35_in_variableDeclarationList230); if (state.failed) return ;
            	            dbg.location(68,40);
            	            pushFollow(FOLLOW_expression_in_variableDeclarationList232);
            	            expression();

            	            state._fsp--;
            	            if (state.failed) return ;

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
        dbg.location(69, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableDeclarationList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "variableDeclarationList"


    public static class functionDefinition_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "functionDefinition"
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:72:1: functionDefinition : typeSpecifier NAME '(' parameterList ')' '{' ( statement )* '}' ;
    public final nopCParser.functionDefinition_return functionDefinition() throws RecognitionException {
        nopCParser.functionDefinition_return retval = new nopCParser.functionDefinition_return();
        retval.start = input.LT(1);

        int functionDefinition_StartIndex = input.index();

        Token NAME1=null;

        try { dbg.enterRule(getGrammarFileName(), "functionDefinition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:73:2: ( typeSpecifier NAME '(' parameterList ')' '{' ( statement )* '}' )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:74:3: typeSpecifier NAME '(' parameterList ')' '{' ( statement )* '}'
            {
            dbg.location(74,3);
            pushFollow(FOLLOW_typeSpecifier_in_functionDefinition253);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(74,17);
            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_functionDefinition255); if (state.failed) return retval;
            dbg.location(74,22);
            match(input,16,FOLLOW_16_in_functionDefinition257); if (state.failed) return retval;
            dbg.location(74,26);
            pushFollow(FOLLOW_parameterList_in_functionDefinition259);
            parameterList();

            state._fsp--;
            if (state.failed) return retval;
            dbg.location(74,40);
            match(input,17,FOLLOW_17_in_functionDefinition261); if (state.failed) return retval;
            dbg.location(74,44);
            match(input,57,FOLLOW_57_in_functionDefinition263); if (state.failed) return retval;
            dbg.location(74,48);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:74:48: ( statement )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= NAME && LA9_0 <= WERT)||LA9_0==16||LA9_0==21||LA9_0==25||LA9_0==30||(LA9_0 >= 46 && LA9_0 <= 48)||(LA9_0 >= 50 && LA9_0 <= 56)) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:74:48: statement
            	    {
            	    dbg.location(74,48);
            	    pushFollow(FOLLOW_statement_in_functionDefinition265);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}

            dbg.location(74,59);
            match(input,61,FOLLOW_61_in_functionDefinition268); if (state.failed) return retval;
            dbg.location(74,63);
            if ( state.backtracking==0 ) {System.out.println(input.toString(retval.start,input.LT(-1))); functionTable.put((NAME1!=null?NAME1.getText():null), "istDa");}

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
        dbg.location(75, 1);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:78:1: parameterList : ( typeSpecifier NAME ( ',' typeSpecifier NAME )* )? ;
    public final void parameterList() throws RecognitionException {
        int parameterList_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "parameterList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:79:2: ( ( typeSpecifier NAME ( ',' typeSpecifier NAME )* )? )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:80:3: ( typeSpecifier NAME ( ',' typeSpecifier NAME )* )?
            {
            dbg.location(80,3);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:80:3: ( typeSpecifier NAME ( ',' typeSpecifier NAME )* )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==46||LA11_0==53||LA11_0==55) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:80:4: typeSpecifier NAME ( ',' typeSpecifier NAME )*
                    {
                    dbg.location(80,4);
                    pushFollow(FOLLOW_typeSpecifier_in_parameterList288);
                    typeSpecifier();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(80,18);
                    match(input,NAME,FOLLOW_NAME_in_parameterList290); if (state.failed) return ;
                    dbg.location(80,23);
                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:80:23: ( ',' typeSpecifier NAME )*
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

                    	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:80:24: ',' typeSpecifier NAME
                    	    {
                    	    dbg.location(80,24);
                    	    match(input,23,FOLLOW_23_in_parameterList293); if (state.failed) return ;
                    	    dbg.location(80,28);
                    	    pushFollow(FOLLOW_typeSpecifier_in_parameterList295);
                    	    typeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;
                    	    dbg.location(80,42);
                    	    match(input,NAME,FOLLOW_NAME_in_parameterList297); if (state.failed) return ;

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
        dbg.location(81, 1);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:83:1: codeBlock : ( '{' ( statement )* '}' | statement );
    public final void codeBlock() throws RecognitionException {
        int codeBlock_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "codeBlock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:84:2: ( '{' ( statement )* '}' | statement )
            int alt13=2;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==57) ) {
                alt13=1;
            }
            else if ( ((LA13_0 >= NAME && LA13_0 <= WERT)||LA13_0==16||LA13_0==21||LA13_0==25||LA13_0==30||(LA13_0 >= 46 && LA13_0 <= 48)||(LA13_0 >= 50 && LA13_0 <= 56)) ) {
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

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:85:2: '{' ( statement )* '}'
                    {
                    dbg.location(85,2);
                    match(input,57,FOLLOW_57_in_codeBlock313); if (state.failed) return ;
                    dbg.location(85,5);
                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:85:5: ( statement )*
                    try { dbg.enterSubRule(12);

                    loop12:
                    do {
                        int alt12=2;
                        try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= NAME && LA12_0 <= WERT)||LA12_0==16||LA12_0==21||LA12_0==25||LA12_0==30||(LA12_0 >= 46 && LA12_0 <= 48)||(LA12_0 >= 50 && LA12_0 <= 56)) ) {
                            alt12=1;
                        }


                        } finally {dbg.exitDecision(12);}

                        switch (alt12) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:85:5: statement
                    	    {
                    	    dbg.location(85,5);
                    	    pushFollow(FOLLOW_statement_in_codeBlock314);
                    	    statement();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(12);}

                    dbg.location(85,15);
                    match(input,61,FOLLOW_61_in_codeBlock316); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:86:4: statement
                    {
                    dbg.location(86,4);
                    pushFollow(FOLLOW_statement_in_codeBlock321);
                    statement();

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
        dbg.location(88, 1);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:90:1: statement : ( ( functionCall ';' ) | ( assignment ';' ) | variableDeclaration | selection_statement | iteration_statement | jump_statement | expression_statement );
    public final void statement() throws RecognitionException {
        int statement_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(90, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:91:2: ( ( functionCall ';' ) | ( assignment ';' ) | variableDeclaration | selection_statement | iteration_statement | jump_statement | expression_statement )
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
                case 45:
                case 59:
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
                case 44:
                case 58:
                case 60:
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
            case 46:
            case 53:
            case 55:
                {
                alt14=3;
                }
                break;
            case 52:
                {
                alt14=4;
                }
                break;
            case 50:
            case 56:
                {
                alt14=5;
                }
                break;
            case 47:
            case 48:
            case 51:
            case 54:
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

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:92:5: ( functionCall ';' )
                    {
                    dbg.location(92,5);
                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:92:5: ( functionCall ';' )
                    dbg.enterAlt(1);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:92:6: functionCall ';'
                    {
                    dbg.location(92,6);
                    pushFollow(FOLLOW_functionCall_in_statement340);
                    functionCall();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(92,19);
                    match(input,30,FOLLOW_30_in_statement342); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:93:5: ( assignment ';' )
                    {
                    dbg.location(93,5);
                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:93:5: ( assignment ';' )
                    dbg.enterAlt(1);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:93:7: assignment ';'
                    {
                    dbg.location(93,7);
                    pushFollow(FOLLOW_assignment_in_statement351);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(93,18);
                    match(input,30,FOLLOW_30_in_statement353); if (state.failed) return ;

                    }


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:94:5: variableDeclaration
                    {
                    dbg.location(94,5);
                    pushFollow(FOLLOW_variableDeclaration_in_statement361);
                    variableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:95:5: selection_statement
                    {
                    dbg.location(95,5);
                    pushFollow(FOLLOW_selection_statement_in_statement367);
                    selection_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:96:6: iteration_statement
                    {
                    dbg.location(96,6);
                    pushFollow(FOLLOW_iteration_statement_in_statement374);
                    iteration_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:97:6: jump_statement
                    {
                    dbg.location(97,6);
                    pushFollow(FOLLOW_jump_statement_in_statement381);
                    jump_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:98:6: expression_statement
                    {
                    dbg.location(98,6);
                    pushFollow(FOLLOW_expression_statement_in_statement388);
                    expression_statement();

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
        dbg.location(99, 1);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:102:1: selection_statement : 'if' '(' expression ')' codeBlock ( options {k=1; backtrack=false; } : 'else' codeBlock )? ;
    public final void selection_statement() throws RecognitionException {
        int selection_statement_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "selection_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:103:2: ( 'if' '(' expression ')' codeBlock ( options {k=1; backtrack=false; } : 'else' codeBlock )? )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:103:4: 'if' '(' expression ')' codeBlock ( options {k=1; backtrack=false; } : 'else' codeBlock )?
            {
            dbg.location(103,4);
            match(input,52,FOLLOW_52_in_selection_statement402); if (state.failed) return ;
            dbg.location(103,9);
            match(input,16,FOLLOW_16_in_selection_statement404); if (state.failed) return ;
            dbg.location(103,13);
            pushFollow(FOLLOW_expression_in_selection_statement406);
            expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(103,24);
            match(input,17,FOLLOW_17_in_selection_statement408); if (state.failed) return ;
            dbg.location(103,28);
            pushFollow(FOLLOW_codeBlock_in_selection_statement410);
            codeBlock();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(103,38);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:103:38: ( options {k=1; backtrack=false; } : 'else' codeBlock )?
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==49) ) {
                int LA15_1 = input.LA(2);

                if ( (true) ) {
                    alt15=1;
                }
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:103:71: 'else' codeBlock
                    {
                    dbg.location(103,71);
                    match(input,49,FOLLOW_49_in_selection_statement425); if (state.failed) return ;
                    dbg.location(103,78);
                    pushFollow(FOLLOW_codeBlock_in_selection_statement427);
                    codeBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}


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
        dbg.location(104, 1);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:106:1: iteration_statement : ( 'while' '(' expression ')' codeBlock | 'for' '(' expression_statement expression_statement ( expression )? ')' codeBlock );
    public final void iteration_statement() throws RecognitionException {
        int iteration_statement_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "iteration_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:107:2: ( 'while' '(' expression ')' codeBlock | 'for' '(' expression_statement expression_statement ( expression )? ')' codeBlock )
            int alt17=2;
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==56) ) {
                alt17=1;
            }
            else if ( (LA17_0==50) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:107:4: 'while' '(' expression ')' codeBlock
                    {
                    dbg.location(107,4);
                    match(input,56,FOLLOW_56_in_iteration_statement440); if (state.failed) return ;
                    dbg.location(107,12);
                    match(input,16,FOLLOW_16_in_iteration_statement442); if (state.failed) return ;
                    dbg.location(107,16);
                    pushFollow(FOLLOW_expression_in_iteration_statement444);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(107,27);
                    match(input,17,FOLLOW_17_in_iteration_statement446); if (state.failed) return ;
                    dbg.location(107,31);
                    pushFollow(FOLLOW_codeBlock_in_iteration_statement448);
                    codeBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:108:4: 'for' '(' expression_statement expression_statement ( expression )? ')' codeBlock
                    {
                    dbg.location(108,4);
                    match(input,50,FOLLOW_50_in_iteration_statement453); if (state.failed) return ;
                    dbg.location(108,10);
                    match(input,16,FOLLOW_16_in_iteration_statement455); if (state.failed) return ;
                    dbg.location(108,14);
                    pushFollow(FOLLOW_expression_statement_in_iteration_statement457);
                    expression_statement();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(108,35);
                    pushFollow(FOLLOW_expression_statement_in_iteration_statement459);
                    expression_statement();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(108,56);
                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:108:56: ( expression )?
                    int alt16=2;
                    try { dbg.enterSubRule(16);
                    try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0 >= NAME && LA16_0 <= WERT)||LA16_0==16||LA16_0==21||LA16_0==25) ) {
                        alt16=1;
                    }
                    } finally {dbg.exitDecision(16);}

                    switch (alt16) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:108:56: expression
                            {
                            dbg.location(108,56);
                            pushFollow(FOLLOW_expression_in_iteration_statement461);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(108,68);
                    match(input,17,FOLLOW_17_in_iteration_statement464); if (state.failed) return ;
                    dbg.location(108,72);
                    pushFollow(FOLLOW_codeBlock_in_iteration_statement466);
                    codeBlock();

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
        dbg.location(109, 1);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:111:1: expression_statement : ( ';' | expression ';' );
    public final void expression_statement() throws RecognitionException {
        int expression_statement_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "expression_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(111, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:112:2: ( ';' | expression ';' )
            int alt18=2;
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:112:4: ';'
                    {
                    dbg.location(112,4);
                    match(input,30,FOLLOW_30_in_expression_statement478); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:113:4: expression ';'
                    {
                    dbg.location(113,4);
                    pushFollow(FOLLOW_expression_in_expression_statement483);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(113,15);
                    match(input,30,FOLLOW_30_in_expression_statement485); if (state.failed) return ;

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
        dbg.location(114, 1);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:116:1: jump_statement : ( 'goto' NAME ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' );
    public final void jump_statement() throws RecognitionException {
        int jump_statement_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "jump_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:117:2: ( 'goto' NAME ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' )
            int alt19=5;
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            switch ( input.LA(1) ) {
            case 51:
                {
                alt19=1;
                }
                break;
            case 48:
                {
                alt19=2;
                }
                break;
            case 47:
                {
                alt19=3;
                }
                break;
            case 54:
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

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            default:
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

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:117:4: 'goto' NAME ';'
                    {
                    dbg.location(117,4);
                    match(input,51,FOLLOW_51_in_jump_statement496); if (state.failed) return ;
                    dbg.location(117,11);
                    match(input,NAME,FOLLOW_NAME_in_jump_statement498); if (state.failed) return ;
                    dbg.location(117,16);
                    match(input,30,FOLLOW_30_in_jump_statement500); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:118:4: 'continue' ';'
                    {
                    dbg.location(118,4);
                    match(input,48,FOLLOW_48_in_jump_statement505); if (state.failed) return ;
                    dbg.location(118,15);
                    match(input,30,FOLLOW_30_in_jump_statement507); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:119:4: 'break' ';'
                    {
                    dbg.location(119,4);
                    match(input,47,FOLLOW_47_in_jump_statement512); if (state.failed) return ;
                    dbg.location(119,12);
                    match(input,30,FOLLOW_30_in_jump_statement514); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:120:4: 'return' ';'
                    {
                    dbg.location(120,4);
                    match(input,54,FOLLOW_54_in_jump_statement519); if (state.failed) return ;
                    dbg.location(120,13);
                    match(input,30,FOLLOW_30_in_jump_statement521); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:121:4: 'return' expression ';'
                    {
                    dbg.location(121,4);
                    match(input,54,FOLLOW_54_in_jump_statement526); if (state.failed) return ;
                    dbg.location(121,13);
                    pushFollow(FOLLOW_expression_in_jump_statement528);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(121,24);
                    match(input,30,FOLLOW_30_in_jump_statement530); if (state.failed) return ;

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
        dbg.location(122, 1);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:124:1: functionCall : NAME '(' variableList ')' ;
    public final void functionCall() throws RecognitionException {
        int functionCall_StartIndex = input.index();

        Token NAME2=null;

        try { dbg.enterRule(getGrammarFileName(), "functionCall");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:125:2: ( NAME '(' variableList ')' )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:126:2: NAME '(' variableList ')'
            {
            dbg.location(126,2);
            NAME2=(Token)match(input,NAME,FOLLOW_NAME_in_functionCall543); if (state.failed) return ;
            dbg.location(126,7);
            match(input,16,FOLLOW_16_in_functionCall545); if (state.failed) return ;
            dbg.location(126,11);
            pushFollow(FOLLOW_variableList_in_functionCall547);
            variableList();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(126,24);
            match(input,17,FOLLOW_17_in_functionCall549); if (state.failed) return ;
            dbg.location(127,3);
            if ( state.backtracking==0 ) {
            			System.out.println("In functionTable gefunden " + functionTable.get((NAME2!=null?NAME2.getText():null))); 
            		}

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
        dbg.location(130, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionCall");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "functionCall"



    // $ANTLR start "variableList"
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:132:1: variableList : ( NAME )? ( ',' NAME )* ;
    public final void variableList() throws RecognitionException {
        int variableList_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "variableList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:133:2: ( ( NAME )? ( ',' NAME )* )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:134:3: ( NAME )? ( ',' NAME )*
            {
            dbg.location(134,3);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:134:3: ( NAME )?
            int alt20=2;
            try { dbg.enterSubRule(20);
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==NAME) ) {
                alt20=1;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:134:3: NAME
                    {
                    dbg.location(134,3);
                    match(input,NAME,FOLLOW_NAME_in_variableList568); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}

            dbg.location(134,9);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:134:9: ( ',' NAME )*
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21, decisionCanBacktrack[21]);

                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:134:10: ',' NAME
            	    {
            	    dbg.location(134,10);
            	    match(input,23,FOLLOW_23_in_variableList572); if (state.failed) return ;
            	    dbg.location(134,14);
            	    match(input,NAME,FOLLOW_NAME_in_variableList574); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);
            } finally {dbg.exitSubRule(21);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, variableList_StartIndex); }

        }
        dbg.location(135, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "variableList"



    // $ANTLR start "assignment"
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:137:1: assignment : NAME assignmentOperator expression ;
    public final void assignment() throws RecognitionException {
        int assignment_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:138:2: ( NAME assignmentOperator expression )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:139:3: NAME assignmentOperator expression
            {
            dbg.location(139,3);
            match(input,NAME,FOLLOW_NAME_in_assignment590); if (state.failed) return ;
            dbg.location(139,8);
            pushFollow(FOLLOW_assignmentOperator_in_assignment592);
            assignmentOperator();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(139,27);
            pushFollow(FOLLOW_expression_in_assignment594);
            expression();

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
        dbg.location(140, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "assignmentOperator"
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:144:1: assignmentOperator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
    public final void assignmentOperator() throws RecognitionException {
        int assignmentOperator_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "assignmentOperator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:145:2: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:
            {
            dbg.location(145,2);
            if ( input.LA(1)==12||input.LA(1)==15||input.LA(1)==19||input.LA(1)==22||input.LA(1)==26||input.LA(1)==28||input.LA(1)==33||input.LA(1)==35||input.LA(1)==40||input.LA(1)==45||input.LA(1)==59 ) {
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
            if ( state.backtracking>0 ) { memoize(input, 18, assignmentOperator_StartIndex); }

        }
        dbg.location(156, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignmentOperator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assignmentOperator"



    // $ANTLR start "expression"
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:158:2: expression : logical_or_expression ( '?' expression ':' expression )? ;
    public final void expression() throws RecognitionException {
        int expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:159:3: ( logical_or_expression ( '?' expression ':' expression )? )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:159:5: logical_or_expression ( '?' expression ':' expression )?
            {
            dbg.location(159,5);
            pushFollow(FOLLOW_logical_or_expression_in_expression670);
            logical_or_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(159,27);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:159:27: ( '?' expression ':' expression )?
            int alt22=2;
            try { dbg.enterSubRule(22);
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:159:28: '?' expression ':' expression
                    {
                    dbg.location(159,28);
                    match(input,41,FOLLOW_41_in_expression673); if (state.failed) return ;
                    dbg.location(159,32);
                    pushFollow(FOLLOW_expression_in_expression675);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(159,43);
                    match(input,29,FOLLOW_29_in_expression677); if (state.failed) return ;
                    dbg.location(159,47);
                    pushFollow(FOLLOW_expression_in_expression679);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(22);}


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
        dbg.location(160, 2);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:162:2: logical_or_expression : logical_and_expression ( '||' logical_and_expression )* ;
    public final void logical_or_expression() throws RecognitionException {
        int logical_or_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "logical_or_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(162, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:163:3: ( logical_and_expression ( '||' logical_and_expression )* )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:163:5: logical_and_expression ( '||' logical_and_expression )*
            {
            dbg.location(163,5);
            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression695);
            logical_and_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(163,28);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:163:28: ( '||' logical_and_expression )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23, decisionCanBacktrack[23]);

                int LA23_0 = input.LA(1);

                if ( (LA23_0==60) ) {
                    alt23=1;
                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:163:29: '||' logical_and_expression
            	    {
            	    dbg.location(163,29);
            	    match(input,60,FOLLOW_60_in_logical_or_expression698); if (state.failed) return ;
            	    dbg.location(163,34);
            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression700);
            	    logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 20, logical_or_expression_StartIndex); }

        }
        dbg.location(164, 2);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:166:2: logical_and_expression : inclusive_or_expression ( '&&' inclusive_or_expression )* ;
    public final void logical_and_expression() throws RecognitionException {
        int logical_and_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "logical_and_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(166, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:167:3: ( inclusive_or_expression ( '&&' inclusive_or_expression )* )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:167:5: inclusive_or_expression ( '&&' inclusive_or_expression )*
            {
            dbg.location(167,5);
            pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression716);
            inclusive_or_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(167,29);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:167:29: ( '&&' inclusive_or_expression )*
            try { dbg.enterSubRule(24);

            loop24:
            do {
                int alt24=2;
                try { dbg.enterDecision(24, decisionCanBacktrack[24]);

                int LA24_0 = input.LA(1);

                if ( (LA24_0==13) ) {
                    alt24=1;
                }


                } finally {dbg.exitDecision(24);}

                switch (alt24) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:167:30: '&&' inclusive_or_expression
            	    {
            	    dbg.location(167,30);
            	    match(input,13,FOLLOW_13_in_logical_and_expression719); if (state.failed) return ;
            	    dbg.location(167,35);
            	    pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression721);
            	    inclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);
            } finally {dbg.exitSubRule(24);}


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
        dbg.location(168, 2);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:170:2: inclusive_or_expression : exclusive_or_expression ( '|' exclusive_or_expression )* ;
    public final void inclusive_or_expression() throws RecognitionException {
        int inclusive_or_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "inclusive_or_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(170, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:171:3: ( exclusive_or_expression ( '|' exclusive_or_expression )* )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:171:5: exclusive_or_expression ( '|' exclusive_or_expression )*
            {
            dbg.location(171,5);
            pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression737);
            exclusive_or_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(171,29);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:171:29: ( '|' exclusive_or_expression )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25, decisionCanBacktrack[25]);

                int LA25_0 = input.LA(1);

                if ( (LA25_0==58) ) {
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:171:30: '|' exclusive_or_expression
            	    {
            	    dbg.location(171,30);
            	    match(input,58,FOLLOW_58_in_inclusive_or_expression740); if (state.failed) return ;
            	    dbg.location(171,34);
            	    pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression742);
            	    exclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}


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
        dbg.location(172, 2);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:174:2: exclusive_or_expression : and_expression ( '^' and_expression )* ;
    public final void exclusive_or_expression() throws RecognitionException {
        int exclusive_or_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "exclusive_or_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(174, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:175:3: ( and_expression ( '^' and_expression )* )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:175:5: and_expression ( '^' and_expression )*
            {
            dbg.location(175,5);
            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression758);
            and_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(175,20);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:175:20: ( '^' and_expression )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26, decisionCanBacktrack[26]);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:175:21: '^' and_expression
            	    {
            	    dbg.location(175,21);
            	    match(input,44,FOLLOW_44_in_exclusive_or_expression761); if (state.failed) return ;
            	    dbg.location(175,25);
            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression763);
            	    and_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 23, exclusive_or_expression_StartIndex); }

        }
        dbg.location(176, 2);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:178:2: and_expression : equality_expression ( '&' equality_expression )* ;
    public final void and_expression() throws RecognitionException {
        int and_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "and_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:179:3: ( equality_expression ( '&' equality_expression )* )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:179:5: equality_expression ( '&' equality_expression )*
            {
            dbg.location(179,5);
            pushFollow(FOLLOW_equality_expression_in_and_expression779);
            equality_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(179,25);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:179:25: ( '&' equality_expression )*
            try { dbg.enterSubRule(27);

            loop27:
            do {
                int alt27=2;
                try { dbg.enterDecision(27, decisionCanBacktrack[27]);

                int LA27_0 = input.LA(1);

                if ( (LA27_0==14) ) {
                    alt27=1;
                }


                } finally {dbg.exitDecision(27);}

                switch (alt27) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:179:26: '&' equality_expression
            	    {
            	    dbg.location(179,26);
            	    match(input,14,FOLLOW_14_in_and_expression782); if (state.failed) return ;
            	    dbg.location(179,30);
            	    pushFollow(FOLLOW_equality_expression_in_and_expression784);
            	    equality_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 24, and_expression_StartIndex); }

        }
        dbg.location(180, 2);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:181:2: equality_expression : relational_expression ( ( '==' | '!=' ) relational_expression )* ;
    public final void equality_expression() throws RecognitionException {
        int equality_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "equality_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(181, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:182:3: ( relational_expression ( ( '==' | '!=' ) relational_expression )* )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:182:5: relational_expression ( ( '==' | '!=' ) relational_expression )*
            {
            dbg.location(182,5);
            pushFollow(FOLLOW_relational_expression_in_equality_expression799);
            relational_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(182,27);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:182:27: ( ( '==' | '!=' ) relational_expression )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28, decisionCanBacktrack[28]);

                int LA28_0 = input.LA(1);

                if ( (LA28_0==10||LA28_0==36) ) {
                    alt28=1;
                }


                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:182:28: ( '==' | '!=' ) relational_expression
            	    {
            	    dbg.location(182,28);
            	    if ( input.LA(1)==10||input.LA(1)==36 ) {
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

            	    dbg.location(182,40);
            	    pushFollow(FOLLOW_relational_expression_in_equality_expression808);
            	    relational_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 25, equality_expression_StartIndex); }

        }
        dbg.location(183, 2);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:185:2: relational_expression : shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* ;
    public final void relational_expression() throws RecognitionException {
        int relational_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "relational_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(185, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:186:3: ( shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:186:5: shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
            {
            dbg.location(186,5);
            pushFollow(FOLLOW_shift_expression_in_relational_expression824);
            shift_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(186,22);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:186:22: ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
            try { dbg.enterSubRule(29);

            loop29:
            do {
                int alt29=2;
                try { dbg.enterDecision(29, decisionCanBacktrack[29]);

                int LA29_0 = input.LA(1);

                if ( (LA29_0==31||LA29_0==34||(LA29_0 >= 37 && LA29_0 <= 38)) ) {
                    alt29=1;
                }


                } finally {dbg.exitDecision(29);}

                switch (alt29) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:186:23: ( '<' | '>' | '<=' | '>=' ) shift_expression
            	    {
            	    dbg.location(186,23);
            	    if ( input.LA(1)==31||input.LA(1)==34||(input.LA(1) >= 37 && input.LA(1) <= 38) ) {
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

            	    dbg.location(186,43);
            	    pushFollow(FOLLOW_shift_expression_in_relational_expression837);
            	    shift_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 26, relational_expression_StartIndex); }

        }
        dbg.location(187, 2);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:189:2: shift_expression : additive_expression ( ( '<<' | '>>' ) additive_expression )* ;
    public final void shift_expression() throws RecognitionException {
        int shift_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "shift_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(189, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:190:3: ( additive_expression ( ( '<<' | '>>' ) additive_expression )* )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:190:5: additive_expression ( ( '<<' | '>>' ) additive_expression )*
            {
            dbg.location(190,5);
            pushFollow(FOLLOW_additive_expression_in_shift_expression853);
            additive_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(190,25);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:190:25: ( ( '<<' | '>>' ) additive_expression )*
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30, decisionCanBacktrack[30]);

                int LA30_0 = input.LA(1);

                if ( (LA30_0==32||LA30_0==39) ) {
                    alt30=1;
                }


                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:190:26: ( '<<' | '>>' ) additive_expression
            	    {
            	    dbg.location(190,26);
            	    if ( input.LA(1)==32||input.LA(1)==39 ) {
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

            	    dbg.location(190,38);
            	    pushFollow(FOLLOW_additive_expression_in_shift_expression862);
            	    additive_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 27, shift_expression_StartIndex); }

        }
        dbg.location(191, 2);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:193:2: additive_expression : ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* ;
    public final void additive_expression() throws RecognitionException {
        int additive_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "additive_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(193, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:194:3: ( ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:194:5: ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )*
            {
            dbg.location(194,5);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:194:5: ( multiplicative_expression )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:194:6: multiplicative_expression
            {
            dbg.location(194,6);
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression881);
            multiplicative_expression();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(194,33);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:194:33: ( '+' multiplicative_expression | '-' multiplicative_expression )*
            try { dbg.enterSubRule(31);

            loop31:
            do {
                int alt31=3;
                try { dbg.enterDecision(31, decisionCanBacktrack[31]);

                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }
                else if ( (LA31_0==24) ) {
                    alt31=2;
                }


                } finally {dbg.exitDecision(31);}

                switch (alt31) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:194:34: '+' multiplicative_expression
            	    {
            	    dbg.location(194,34);
            	    match(input,20,FOLLOW_20_in_additive_expression885); if (state.failed) return ;
            	    dbg.location(194,38);
            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression887);
            	    multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:194:66: '-' multiplicative_expression
            	    {
            	    dbg.location(194,66);
            	    match(input,24,FOLLOW_24_in_additive_expression891); if (state.failed) return ;
            	    dbg.location(194,70);
            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression893);
            	    multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 28, additive_expression_StartIndex); }

        }
        dbg.location(195, 2);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:197:2: multiplicative_expression : ( unary_expression ) ( '*' unary_expression | '/' unary_expression | '%' unary_expression )* ;
    public final void multiplicative_expression() throws RecognitionException {
        int multiplicative_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "multiplicative_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(197, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:198:3: ( ( unary_expression ) ( '*' unary_expression | '/' unary_expression | '%' unary_expression )* )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:198:5: ( unary_expression ) ( '*' unary_expression | '/' unary_expression | '%' unary_expression )*
            {
            dbg.location(198,5);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:198:5: ( unary_expression )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:198:6: unary_expression
            {
            dbg.location(198,6);
            pushFollow(FOLLOW_unary_expression_in_multiplicative_expression910);
            unary_expression();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(198,24);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:198:24: ( '*' unary_expression | '/' unary_expression | '%' unary_expression )*
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=4;
                try { dbg.enterDecision(32, decisionCanBacktrack[32]);

                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt32=1;
                    }
                    break;
                case 27:
                    {
                    alt32=2;
                    }
                    break;
                case 11:
                    {
                    alt32=3;
                    }
                    break;

                }

                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:198:25: '*' unary_expression
            	    {
            	    dbg.location(198,25);
            	    match(input,18,FOLLOW_18_in_multiplicative_expression914); if (state.failed) return ;
            	    dbg.location(198,29);
            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression916);
            	    unary_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:198:48: '/' unary_expression
            	    {
            	    dbg.location(198,48);
            	    match(input,27,FOLLOW_27_in_multiplicative_expression920); if (state.failed) return ;
            	    dbg.location(198,52);
            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression922);
            	    unary_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:198:71: '%' unary_expression
            	    {
            	    dbg.location(198,71);
            	    match(input,11,FOLLOW_11_in_multiplicative_expression926); if (state.failed) return ;
            	    dbg.location(198,75);
            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression928);
            	    unary_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 29, multiplicative_expression_StartIndex); }

        }
        dbg.location(199, 2);

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
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:201:1: unary_expression : ( postfix_expression | '++' unary_expression | '--' unary_expression );
    public final void unary_expression() throws RecognitionException {
        int unary_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "unary_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(201, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:202:2: ( postfix_expression | '++' unary_expression | '--' unary_expression )
            int alt33=3;
            try { dbg.enterDecision(33, decisionCanBacktrack[33]);

            switch ( input.LA(1) ) {
            case NAME:
            case WERT:
            case 16:
                {
                alt33=1;
                }
                break;
            case 21:
                {
                alt33=2;
                }
                break;
            case 25:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:202:4: postfix_expression
                    {
                    dbg.location(202,4);
                    pushFollow(FOLLOW_postfix_expression_in_unary_expression942);
                    postfix_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:203:4: '++' unary_expression
                    {
                    dbg.location(203,4);
                    match(input,21,FOLLOW_21_in_unary_expression947); if (state.failed) return ;
                    dbg.location(203,9);
                    pushFollow(FOLLOW_unary_expression_in_unary_expression949);
                    unary_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:204:4: '--' unary_expression
                    {
                    dbg.location(204,4);
                    match(input,25,FOLLOW_25_in_unary_expression954); if (state.failed) return ;
                    dbg.location(204,9);
                    pushFollow(FOLLOW_unary_expression_in_unary_expression956);
                    unary_expression();

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
            if ( state.backtracking>0 ) { memoize(input, 30, unary_expression_StartIndex); }

        }
        dbg.location(205, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unary_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "unary_expression"



    // $ANTLR start "postfix_expression"
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:207:1: postfix_expression : primary_expression ( '[' expression ']' | '++' | '--' )* ;
    public final void postfix_expression() throws RecognitionException {
        int postfix_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "postfix_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(207, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:208:2: ( primary_expression ( '[' expression ']' | '++' | '--' )* )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:208:6: primary_expression ( '[' expression ']' | '++' | '--' )*
            {
            dbg.location(208,6);
            pushFollow(FOLLOW_primary_expression_in_postfix_expression969);
            primary_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(209,9);
            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:209:9: ( '[' expression ']' | '++' | '--' )*
            try { dbg.enterSubRule(34);

            loop34:
            do {
                int alt34=4;
                try { dbg.enterDecision(34, decisionCanBacktrack[34]);

                switch ( input.LA(1) ) {
                case 42:
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

                }

                } finally {dbg.exitDecision(34);}

                switch (alt34) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:209:13: '[' expression ']'
            	    {
            	    dbg.location(209,13);
            	    match(input,42,FOLLOW_42_in_postfix_expression983); if (state.failed) return ;
            	    dbg.location(209,17);
            	    pushFollow(FOLLOW_expression_in_postfix_expression985);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(209,28);
            	    match(input,43,FOLLOW_43_in_postfix_expression987); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:210:13: '++'
            	    {
            	    dbg.location(210,13);
            	    match(input,21,FOLLOW_21_in_postfix_expression1002); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:211:13: '--'
            	    {
            	    dbg.location(211,13);
            	    match(input,25,FOLLOW_25_in_postfix_expression1016); if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 31, postfix_expression_StartIndex); }

        }
        dbg.location(213, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "postfix_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "postfix_expression"



    // $ANTLR start "primary_expression"
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:215:1: primary_expression : ( NAME | '(' expression ')' | functionCall | WERT );
    public final void primary_expression() throws RecognitionException {
        int primary_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "primary_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(215, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:216:2: ( NAME | '(' expression ')' | functionCall | WERT )
            int alt35=4;
            try { dbg.enterDecision(35, decisionCanBacktrack[35]);

            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==16) ) {
                    alt35=3;
                }
                else if ( (LA35_1==EOF||(LA35_1 >= 10 && LA35_1 <= 11)||(LA35_1 >= 13 && LA35_1 <= 14)||(LA35_1 >= 17 && LA35_1 <= 18)||(LA35_1 >= 20 && LA35_1 <= 21)||(LA35_1 >= 23 && LA35_1 <= 25)||LA35_1==27||(LA35_1 >= 29 && LA35_1 <= 32)||LA35_1==34||(LA35_1 >= 36 && LA35_1 <= 39)||(LA35_1 >= 41 && LA35_1 <= 44)||LA35_1==58||LA35_1==60) ) {
                    alt35=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 16:
                {
                alt35=2;
                }
                break;
            case WERT:
                {
                alt35=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:216:4: NAME
                    {
                    dbg.location(216,4);
                    match(input,NAME,FOLLOW_NAME_in_primary_expression1038); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:218:4: '(' expression ')'
                    {
                    dbg.location(218,4);
                    match(input,16,FOLLOW_16_in_primary_expression1044); if (state.failed) return ;
                    dbg.location(218,8);
                    pushFollow(FOLLOW_expression_in_primary_expression1046);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(218,19);
                    match(input,17,FOLLOW_17_in_primary_expression1048); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:219:4: functionCall
                    {
                    dbg.location(219,4);
                    pushFollow(FOLLOW_functionCall_in_primary_expression1053);
                    functionCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:220:4: WERT
                    {
                    dbg.location(220,4);
                    match(input,WERT,FOLLOW_WERT_in_primary_expression1058); if (state.failed) return ;

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
        dbg.location(221, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primary_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "primary_expression"



    // $ANTLR start "typeSpecifier"
    // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:245:1: typeSpecifier : ( 'int' | 'void' | 'bool' );
    public final void typeSpecifier() throws RecognitionException {
        int typeSpecifier_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "typeSpecifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(245, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:246:2: ( 'int' | 'void' | 'bool' )
            dbg.enterAlt(1);

            // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:
            {
            dbg.location(246,2);
            if ( input.LA(1)==46||input.LA(1)==53||input.LA(1)==55 ) {
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
            if ( state.backtracking>0 ) { memoize(input, 33, typeSpecifier_StartIndex); }

        }
        dbg.location(250, 1);

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
        // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:41:2: ( typeSpecifier NAME ( '=' | ';' | ',' ) )
        dbg.enterAlt(1);

        // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:41:3: typeSpecifier NAME ( '=' | ';' | ',' )
        {
        dbg.location(41,3);
        pushFollow(FOLLOW_typeSpecifier_in_synpred4_nopC85);
        typeSpecifier();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(41,17);
        match(input,NAME,FOLLOW_NAME_in_synpred4_nopC87); if (state.failed) return ;
        dbg.location(41,22);
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
        // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:42:4: ( typeSpecifier NAME '(' )
        dbg.enterAlt(1);

        // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:42:5: typeSpecifier NAME '('
        {
        dbg.location(42,5);
        pushFollow(FOLLOW_typeSpecifier_in_synpred5_nopC111);
        typeSpecifier();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(42,19);
        match(input,NAME,FOLLOW_NAME_in_synpred5_nopC113); if (state.failed) return ;
        dbg.location(42,25);
        match(input,16,FOLLOW_16_in_synpred5_nopC116); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_nopC

    // $ANTLR start synpred17_nopC
    public final void synpred17_nopC_fragment() throws RecognitionException {
        // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:92:5: ( ( functionCall ';' ) )
        dbg.enterAlt(1);

        // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:92:5: ( functionCall ';' )
        {
        dbg.location(92,5);
        // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:92:5: ( functionCall ';' )
        dbg.enterAlt(1);

        // /Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/nopC.g:92:6: functionCall ';'
        {
        dbg.location(92,6);
        pushFollow(FOLLOW_functionCall_in_synpred17_nopC340);
        functionCall();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(92,19);
        match(input,30,FOLLOW_30_in_synpred17_nopC342); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_globalFunctionOrStatement_in_cFile70 = new BitSet(new long[]{0x00A0400000000002L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_globalFunctionOrStatement104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_globalFunctionOrStatement121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_globalVariableDeclaration134 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_globalVariableDeclarationList_in_globalVariableDeclaration136 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_globalVariableDeclaration138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_globalVariableDeclarationList158 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_globalVariableDeclarationList161 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WERT_in_globalVariableDeclarationList163 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_globalVariableDeclarationList168 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_globalVariableDeclarationList170 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_globalVariableDeclarationList173 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WERT_in_globalVariableDeclarationList175 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_typeSpecifier_in_variableDeclaration196 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_variableDeclarationList_in_variableDeclaration198 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_variableDeclaration200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_variableDeclarationList215 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_variableDeclarationList218 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_variableDeclarationList220 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_variableDeclarationList225 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_variableDeclarationList227 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_variableDeclarationList230 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_variableDeclarationList232 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_typeSpecifier_in_functionDefinition253 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_functionDefinition255 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDefinition257 = new BitSet(new long[]{0x00A0400000020000L});
    public static final BitSet FOLLOW_parameterList_in_functionDefinition259 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionDefinition261 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_functionDefinition263 = new BitSet(new long[]{0x21FDC00042210180L});
    public static final BitSet FOLLOW_statement_in_functionDefinition265 = new BitSet(new long[]{0x21FDC00042210180L});
    public static final BitSet FOLLOW_61_in_functionDefinition268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_parameterList288 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_parameterList290 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_parameterList293 = new BitSet(new long[]{0x00A0400000000000L});
    public static final BitSet FOLLOW_typeSpecifier_in_parameterList295 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_parameterList297 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_57_in_codeBlock313 = new BitSet(new long[]{0x21FDC00042210180L});
    public static final BitSet FOLLOW_statement_in_codeBlock314 = new BitSet(new long[]{0x21FDC00042210180L});
    public static final BitSet FOLLOW_61_in_codeBlock316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_codeBlock321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement340 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement351 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_statement361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_selection_statement402 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_selection_statement404 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_selection_statement406 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_selection_statement408 = new BitSet(new long[]{0x03FDC00042210180L});
    public static final BitSet FOLLOW_codeBlock_in_selection_statement410 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_selection_statement425 = new BitSet(new long[]{0x03FDC00042210180L});
    public static final BitSet FOLLOW_codeBlock_in_selection_statement427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_iteration_statement440 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_iteration_statement442 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_iteration_statement444 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_iteration_statement446 = new BitSet(new long[]{0x03FDC00042210180L});
    public static final BitSet FOLLOW_codeBlock_in_iteration_statement448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_iteration_statement453 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_iteration_statement455 = new BitSet(new long[]{0x0000000042210180L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement457 = new BitSet(new long[]{0x0000000042210180L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement459 = new BitSet(new long[]{0x0000000002230180L});
    public static final BitSet FOLLOW_expression_in_iteration_statement461 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_iteration_statement464 = new BitSet(new long[]{0x03FDC00042210180L});
    public static final BitSet FOLLOW_codeBlock_in_iteration_statement466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_expression_statement478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement483 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_expression_statement485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_jump_statement496 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_jump_statement498 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_jump_statement505 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_jump_statement512 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_jump_statement519 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_jump_statement526 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_jump_statement528 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_functionCall543 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionCall545 = new BitSet(new long[]{0x0000000000820080L});
    public static final BitSet FOLLOW_variableList_in_functionCall547 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionCall549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_variableList568 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_variableList572 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_variableList574 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_NAME_in_assignment590 = new BitSet(new long[]{0x0800210A14489000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignment592 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_expression670 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_expression673 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_expression675 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_expression677 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_expression679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression695 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_logical_or_expression698 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression700 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression716 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_logical_and_expression719 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression721 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression737 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_inclusive_or_expression740 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression742 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression758 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_exclusive_or_expression761 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression763 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression779 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_and_expression782 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression784 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression799 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_set_in_equality_expression802 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression808 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression824 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_set_in_relational_expression827 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression837 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression853 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_set_in_shift_expression856 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression862 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression881 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_20_in_additive_expression885 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression887 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_24_in_additive_expression891 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression893 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression910 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_18_in_multiplicative_expression914 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression916 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_27_in_multiplicative_expression920 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression922 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_11_in_multiplicative_expression926 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression928 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_unary_expression947 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_unary_expression954 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression969 = new BitSet(new long[]{0x0000040002200002L});
    public static final BitSet FOLLOW_42_in_postfix_expression983 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_postfix_expression985 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_postfix_expression987 = new BitSet(new long[]{0x0000040002200002L});
    public static final BitSet FOLLOW_21_in_postfix_expression1002 = new BitSet(new long[]{0x0000040002200002L});
    public static final BitSet FOLLOW_25_in_postfix_expression1016 = new BitSet(new long[]{0x0000040002200002L});
    public static final BitSet FOLLOW_NAME_in_primary_expression1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_primary_expression1044 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_primary_expression1046 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_primary_expression1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primary_expression1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WERT_in_primary_expression1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_synpred4_nopC85 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_synpred4_nopC87 = new BitSet(new long[]{0x0000000840800000L});
    public static final BitSet FOLLOW_set_in_synpred4_nopC89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_synpred5_nopC111 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_synpred5_nopC113 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred5_nopC116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_synpred17_nopC340 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred17_nopC342 = new BitSet(new long[]{0x0000000000000002L});

}
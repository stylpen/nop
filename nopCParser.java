// $ANTLR 3.4 nopC.g 2012-05-11 12:55:22

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeMap;
import src.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class nopCParser extends Parser {
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


    public nopCParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public nopCParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[103+1];
         

    }

    public String[] getTokenNames() { return nopCParser.tokenNames; }
    public String getGrammarFileName() { return "nopC.g"; }


        TreeMap<String, String> functionTable = new TreeMap<String, String>();
        HashMap<String, String> varTable = new HashMap<String, String>();



    // $ANTLR start "cFile"
    // nopC.g:23:1: cFile returns [GenericStatement ret] : ( globalFunctionOrStatement[cFile] )+ ;
    public final GenericStatement cFile() throws RecognitionException {
        GenericStatement ret = null;

        int cFile_StartIndex = input.index();

        GenericStatement globalFunctionOrStatement1 =null;



        HashMap<String, String> scope = new HashMap<String, String>();
        GenericStatement cFile = new GenericStatement(scope, functionTable, varTable);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ret; }

            // nopC.g:28:2: ( ( globalFunctionOrStatement[cFile] )+ )
            // nopC.g:29:2: ( globalFunctionOrStatement[cFile] )+
            {
            // nopC.g:29:2: ( globalFunctionOrStatement[cFile] )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==46||LA1_0==53||LA1_0==55) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // nopC.g:29:2: globalFunctionOrStatement[cFile]
            	    {
            	    pushFollow(FOLLOW_globalFunctionOrStatement_in_cFile65);
            	    globalFunctionOrStatement1=globalFunctionOrStatement(cFile);

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


            if ( state.backtracking==0 ) {ret = globalFunctionOrStatement1;}

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
    // nopC.g:34:1: globalFunctionOrStatement[GenericStatement parent] returns [GenericStatement ret] : ( ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration[parent] | ( typeSpecifier NAME '(' )=> functionDefinition[parent] );
    public final GenericStatement globalFunctionOrStatement(GenericStatement parent) throws RecognitionException {
        GenericStatement ret = null;

        int globalFunctionOrStatement_StartIndex = input.index();

        nopCParser.globalVariableDeclaration_return globalVariableDeclaration2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ret; }

            // nopC.g:35:2: ( ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration[parent] | ( typeSpecifier NAME '(' )=> functionDefinition[parent] )
            int alt2=2;
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
                    // nopC.g:36:2: ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration[parent]
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_globalFunctionOrStatement108);
                    globalVariableDeclaration2=globalVariableDeclaration(parent);

                    state._fsp--;
                    if (state.failed) return ret;

                    if ( state.backtracking==0 ) {ret = (globalVariableDeclaration2!=null?globalVariableDeclaration2.ret:null);}

                    }
                    break;
                case 2 :
                    // nopC.g:37:4: ( typeSpecifier NAME '(' )=> functionDefinition[parent]
                    {
                    pushFollow(FOLLOW_functionDefinition_in_globalFunctionOrStatement127);
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
    // nopC.g:40:1: globalVariableDeclaration[GenericStatement parent] returns [GenericStatement ret] : typeSpecifier globalVariableDeclarationList[parent] ';' ;
    public final nopCParser.globalVariableDeclaration_return globalVariableDeclaration(GenericStatement parent) throws RecognitionException {
        nopCParser.globalVariableDeclaration_return retval = new nopCParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);

        int globalVariableDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // nopC.g:41:2: ( typeSpecifier globalVariableDeclarationList[parent] ';' )
            // nopC.g:43:2: typeSpecifier globalVariableDeclarationList[parent] ';'
            {
            pushFollow(FOLLOW_typeSpecifier_in_globalVariableDeclaration148);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;

            pushFollow(FOLLOW_globalVariableDeclarationList_in_globalVariableDeclaration150);
            globalVariableDeclarationList(parent);

            state._fsp--;
            if (state.failed) return retval;

            match(input,30,FOLLOW_30_in_globalVariableDeclaration153); if (state.failed) return retval;

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
    // nopC.g:51:1: globalVariableDeclarationList[GenericStatement parent] returns [GenericStatement ret] : (n1= NAME ( '=' w1= WERT )? ) ( ',' (n2= NAME ( '=' w2= WERT )? ) )* ;
    public final GenericStatement globalVariableDeclarationList(GenericStatement parent) throws RecognitionException {
        GenericStatement ret = null;

        int globalVariableDeclarationList_StartIndex = input.index();

        Token n1=null;
        Token w1=null;
        Token n2=null;
        Token w2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ret; }

            // nopC.g:52:2: ( (n1= NAME ( '=' w1= WERT )? ) ( ',' (n2= NAME ( '=' w2= WERT )? ) )* )
            // nopC.g:53:2: (n1= NAME ( '=' w1= WERT )? ) ( ',' (n2= NAME ( '=' w2= WERT )? ) )*
            {
            // nopC.g:53:2: (n1= NAME ( '=' w1= WERT )? )
            // nopC.g:53:3: n1= NAME ( '=' w1= WERT )?
            {
            n1=(Token)match(input,NAME,FOLLOW_NAME_in_globalVariableDeclarationList183); if (state.failed) return ret;

            // nopC.g:53:12: ( '=' w1= WERT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // nopC.g:53:13: '=' w1= WERT
                    {
                    match(input,35,FOLLOW_35_in_globalVariableDeclarationList185); if (state.failed) return ret;

                    w1=(Token)match(input,WERT,FOLLOW_WERT_in_globalVariableDeclarationList191); if (state.failed) return ret;

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {parent.addVarToScope((n1!=null?n1.getText():null), (w1!=null?w1.getText():null));}

            // nopC.g:53:73: ( ',' (n2= NAME ( '=' w2= WERT )? ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // nopC.g:53:74: ',' (n2= NAME ( '=' w2= WERT )? )
            	    {
            	    match(input,23,FOLLOW_23_in_globalVariableDeclarationList198); if (state.failed) return ret;

            	    // nopC.g:53:78: (n2= NAME ( '=' w2= WERT )? )
            	    // nopC.g:53:79: n2= NAME ( '=' w2= WERT )?
            	    {
            	    n2=(Token)match(input,NAME,FOLLOW_NAME_in_globalVariableDeclarationList205); if (state.failed) return ret;

            	    // nopC.g:53:88: ( '=' w2= WERT )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==35) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // nopC.g:53:89: '=' w2= WERT
            	            {
            	            match(input,35,FOLLOW_35_in_globalVariableDeclarationList207); if (state.failed) return ret;

            	            w2=(Token)match(input,WERT,FOLLOW_WERT_in_globalVariableDeclarationList213); if (state.failed) return ret;

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
    // nopC.g:56:1: variableDeclaration[GenericStatement parent] returns [GenericStatement ret] : typeSpecifier variableDeclarationList[parent] ';' ;
    public final nopCParser.variableDeclaration_return variableDeclaration(GenericStatement parent) throws RecognitionException {
        nopCParser.variableDeclaration_return retval = new nopCParser.variableDeclaration_return();
        retval.start = input.LT(1);

        int variableDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // nopC.g:57:2: ( typeSpecifier variableDeclarationList[parent] ';' )
            // nopC.g:58:2: typeSpecifier variableDeclarationList[parent] ';'
            {
            pushFollow(FOLLOW_typeSpecifier_in_variableDeclaration239);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;

            pushFollow(FOLLOW_variableDeclarationList_in_variableDeclaration241);
            variableDeclarationList(parent);

            state._fsp--;
            if (state.failed) return retval;

            match(input,30,FOLLOW_30_in_variableDeclaration244); if (state.failed) return retval;

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
    // nopC.g:61:1: variableDeclarationList[GenericStatement parent] returns [GenericStatement ret] : (n1= NAME ( '=' expression )? ) ( ',' (n2= NAME ( '=' expression )? ) )* ;
    public final GenericStatement variableDeclarationList(GenericStatement parent) throws RecognitionException {
        GenericStatement ret = null;

        int variableDeclarationList_StartIndex = input.index();

        Token n1=null;
        Token n2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ret; }

            // nopC.g:62:2: ( (n1= NAME ( '=' expression )? ) ( ',' (n2= NAME ( '=' expression )? ) )* )
            // nopC.g:64:2: (n1= NAME ( '=' expression )? ) ( ',' (n2= NAME ( '=' expression )? ) )*
            {
            // nopC.g:64:2: (n1= NAME ( '=' expression )? )
            // nopC.g:64:3: n1= NAME ( '=' expression )?
            {
            n1=(Token)match(input,NAME,FOLLOW_NAME_in_variableDeclarationList272); if (state.failed) return ret;

            // nopC.g:64:13: ( '=' expression )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // nopC.g:64:14: '=' expression
                    {
                    match(input,35,FOLLOW_35_in_variableDeclarationList275); if (state.failed) return ret;

                    pushFollow(FOLLOW_expression_in_variableDeclarationList277);
                    expression();

                    state._fsp--;
                    if (state.failed) return ret;

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {parent.addVarToScope((n1!=null?n1.getText():null), null);}

            // nopC.g:64:71: ( ',' (n2= NAME ( '=' expression )? ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // nopC.g:64:72: ',' (n2= NAME ( '=' expression )? )
            	    {
            	    match(input,23,FOLLOW_23_in_variableDeclarationList284); if (state.failed) return ret;

            	    // nopC.g:64:76: (n2= NAME ( '=' expression )? )
            	    // nopC.g:64:77: n2= NAME ( '=' expression )?
            	    {
            	    n2=(Token)match(input,NAME,FOLLOW_NAME_in_variableDeclarationList291); if (state.failed) return ret;

            	    // nopC.g:64:87: ( '=' expression )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==35) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // nopC.g:64:88: '=' expression
            	            {
            	            match(input,35,FOLLOW_35_in_variableDeclarationList294); if (state.failed) return ret;

            	            pushFollow(FOLLOW_expression_in_variableDeclarationList296);
            	            expression();

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
    // nopC.g:68:1: functionDefinition[GenericStatement parent] returns [GenericStatement ret] : typeSpecifier NAME '(' parameterList[functionDefinition] ')' '{' ( statement[functionDefinition] )* '}' ;
    public final nopCParser.functionDefinition_return functionDefinition(GenericStatement parent) throws RecognitionException {
        nopCParser.functionDefinition_return retval = new nopCParser.functionDefinition_return();
        retval.start = input.LT(1);

        int functionDefinition_StartIndex = input.index();

        Token NAME3=null;


        ScopedStatement functionDefinition = new ScopedStatement(parent.getScope(), functionTable, varTable);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // nopC.g:72:2: ( typeSpecifier NAME '(' parameterList[functionDefinition] ')' '{' ( statement[functionDefinition] )* '}' )
            // nopC.g:73:3: typeSpecifier NAME '(' parameterList[functionDefinition] ')' '{' ( statement[functionDefinition] )* '}'
            {
            pushFollow(FOLLOW_typeSpecifier_in_functionDefinition328);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;

            NAME3=(Token)match(input,NAME,FOLLOW_NAME_in_functionDefinition330); if (state.failed) return retval;

            match(input,16,FOLLOW_16_in_functionDefinition332); if (state.failed) return retval;

            pushFollow(FOLLOW_parameterList_in_functionDefinition334);
            parameterList(functionDefinition);

            state._fsp--;
            if (state.failed) return retval;

            match(input,17,FOLLOW_17_in_functionDefinition337); if (state.failed) return retval;

            match(input,57,FOLLOW_57_in_functionDefinition339); if (state.failed) return retval;

            // nopC.g:73:68: ( statement[functionDefinition] )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= NAME && LA9_0 <= WERT)||LA9_0==16||LA9_0==21||LA9_0==25||LA9_0==30||(LA9_0 >= 46 && LA9_0 <= 48)||(LA9_0 >= 50 && LA9_0 <= 56)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // nopC.g:73:68: statement[functionDefinition]
            	    {
            	    pushFollow(FOLLOW_statement_in_functionDefinition341);
            	    statement(functionDefinition);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match(input,61,FOLLOW_61_in_functionDefinition345); if (state.failed) return retval;

            if ( state.backtracking==0 ) {System.out.println(input.toString(retval.start,input.LT(-1))); functionDefinition.addFun((NAME3!=null?NAME3.getText():null));}

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
    // nopC.g:77:1: parameterList[GenericStatement parent] : ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )? ;
    public final void parameterList(GenericStatement parent) throws RecognitionException {
        int parameterList_StartIndex = input.index();

        Token n1=null;
        Token n2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }

            // nopC.g:78:2: ( ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )? )
            // nopC.g:79:3: ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )?
            {
            // nopC.g:79:3: ( typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==46||LA11_0==53||LA11_0==55) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // nopC.g:79:4: typeSpecifier (n1= NAME ) ( ',' typeSpecifier (n2= NAME ) )*
                    {
                    pushFollow(FOLLOW_typeSpecifier_in_parameterList365);
                    typeSpecifier();

                    state._fsp--;
                    if (state.failed) return ;

                    // nopC.g:79:18: (n1= NAME )
                    // nopC.g:79:19: n1= NAME
                    {
                    n1=(Token)match(input,NAME,FOLLOW_NAME_in_parameterList372); if (state.failed) return ;

                    }


                    if ( state.backtracking==0 ) {parent.addVarToScope((n1!=null?n1.getText():null), null);}

                    // nopC.g:79:69: ( ',' typeSpecifier (n2= NAME ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==23) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // nopC.g:79:70: ',' typeSpecifier (n2= NAME )
                    	    {
                    	    match(input,23,FOLLOW_23_in_parameterList377); if (state.failed) return ;

                    	    pushFollow(FOLLOW_typeSpecifier_in_parameterList379);
                    	    typeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    // nopC.g:79:88: (n2= NAME )
                    	    // nopC.g:79:89: n2= NAME
                    	    {
                    	    n2=(Token)match(input,NAME,FOLLOW_NAME_in_parameterList386); if (state.failed) return ;

                    	    }


                    	    if ( state.backtracking==0 ) {parent.addVarToScope((n2!=null?n2.getText():null), null);}

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
    // nopC.g:82:1: codeBlock : ( '{' ( statement[null] )* '}' | statement[null] );
    public final void codeBlock() throws RecognitionException {
        int codeBlock_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }

            // nopC.g:83:2: ( '{' ( statement[null] )* '}' | statement[null] )
            int alt13=2;
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

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // nopC.g:84:2: '{' ( statement[null] )* '}'
                    {
                    match(input,57,FOLLOW_57_in_codeBlock405); if (state.failed) return ;

                    // nopC.g:84:5: ( statement[null] )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= NAME && LA12_0 <= WERT)||LA12_0==16||LA12_0==21||LA12_0==25||LA12_0==30||(LA12_0 >= 46 && LA12_0 <= 48)||(LA12_0 >= 50 && LA12_0 <= 56)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // nopC.g:84:5: statement[null]
                    	    {
                    	    pushFollow(FOLLOW_statement_in_codeBlock406);
                    	    statement(null);

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    match(input,61,FOLLOW_61_in_codeBlock409); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:85:4: statement[null]
                    {
                    pushFollow(FOLLOW_statement_in_codeBlock414);
                    statement(null);

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
    // nopC.g:89:1: statement[GenericStatement parent] : ( ( functionCall ';' ) | ( assignment ';' ) | variableDeclaration[parent] | selection_statement | iteration_statement | jump_statement | expression_statement );
    public final void statement(GenericStatement parent) throws RecognitionException {
        int statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }

            // nopC.g:90:2: ( ( functionCall ';' ) | ( assignment ';' ) | variableDeclaration[parent] | selection_statement | iteration_statement | jump_statement | expression_statement )
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

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // nopC.g:91:5: ( functionCall ';' )
                    {
                    // nopC.g:91:5: ( functionCall ';' )
                    // nopC.g:91:6: functionCall ';'
                    {
                    pushFollow(FOLLOW_functionCall_in_statement435);
                    functionCall();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_statement437); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // nopC.g:92:5: ( assignment ';' )
                    {
                    // nopC.g:92:5: ( assignment ';' )
                    // nopC.g:92:7: assignment ';'
                    {
                    pushFollow(FOLLOW_assignment_in_statement446);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_statement448); if (state.failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // nopC.g:93:5: variableDeclaration[parent]
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_statement456);
                    variableDeclaration(parent);

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // nopC.g:94:5: selection_statement
                    {
                    pushFollow(FOLLOW_selection_statement_in_statement463);
                    selection_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // nopC.g:95:6: iteration_statement
                    {
                    pushFollow(FOLLOW_iteration_statement_in_statement470);
                    iteration_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // nopC.g:96:6: jump_statement
                    {
                    pushFollow(FOLLOW_jump_statement_in_statement477);
                    jump_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // nopC.g:97:6: expression_statement
                    {
                    pushFollow(FOLLOW_expression_statement_in_statement484);
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
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "selection_statement"
    // nopC.g:101:1: selection_statement : 'if' '(' expression ')' codeBlock ( options {k=1; backtrack=false; } : 'else' codeBlock )? ;
    public final void selection_statement() throws RecognitionException {
        int selection_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // nopC.g:102:2: ( 'if' '(' expression ')' codeBlock ( options {k=1; backtrack=false; } : 'else' codeBlock )? )
            // nopC.g:102:4: 'if' '(' expression ')' codeBlock ( options {k=1; backtrack=false; } : 'else' codeBlock )?
            {
            match(input,52,FOLLOW_52_in_selection_statement498); if (state.failed) return ;

            match(input,16,FOLLOW_16_in_selection_statement500); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_selection_statement502);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input,17,FOLLOW_17_in_selection_statement504); if (state.failed) return ;

            pushFollow(FOLLOW_codeBlock_in_selection_statement506);
            codeBlock();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:102:38: ( options {k=1; backtrack=false; } : 'else' codeBlock )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==49) ) {
                int LA15_1 = input.LA(2);

                if ( (true) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // nopC.g:102:71: 'else' codeBlock
                    {
                    match(input,49,FOLLOW_49_in_selection_statement521); if (state.failed) return ;

                    pushFollow(FOLLOW_codeBlock_in_selection_statement523);
                    codeBlock();

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
    // nopC.g:105:1: iteration_statement : ( 'while' '(' expression ')' codeBlock | 'for' '(' expression_statement expression_statement ( expression )? ')' codeBlock );
    public final void iteration_statement() throws RecognitionException {
        int iteration_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

            // nopC.g:106:2: ( 'while' '(' expression ')' codeBlock | 'for' '(' expression_statement expression_statement ( expression )? ')' codeBlock )
            int alt17=2;
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

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // nopC.g:106:4: 'while' '(' expression ')' codeBlock
                    {
                    match(input,56,FOLLOW_56_in_iteration_statement536); if (state.failed) return ;

                    match(input,16,FOLLOW_16_in_iteration_statement538); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_iteration_statement540);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,17,FOLLOW_17_in_iteration_statement542); if (state.failed) return ;

                    pushFollow(FOLLOW_codeBlock_in_iteration_statement544);
                    codeBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:107:4: 'for' '(' expression_statement expression_statement ( expression )? ')' codeBlock
                    {
                    match(input,50,FOLLOW_50_in_iteration_statement549); if (state.failed) return ;

                    match(input,16,FOLLOW_16_in_iteration_statement551); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_statement_in_iteration_statement553);
                    expression_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expression_statement_in_iteration_statement555);
                    expression_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    // nopC.g:107:56: ( expression )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0 >= NAME && LA16_0 <= WERT)||LA16_0==16||LA16_0==21||LA16_0==25) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // nopC.g:107:56: expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement557);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,17,FOLLOW_17_in_iteration_statement560); if (state.failed) return ;

                    pushFollow(FOLLOW_codeBlock_in_iteration_statement562);
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
        return ;
    }
    // $ANTLR end "iteration_statement"



    // $ANTLR start "expression_statement"
    // nopC.g:110:1: expression_statement : ( ';' | expression ';' );
    public final void expression_statement() throws RecognitionException {
        int expression_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }

            // nopC.g:111:2: ( ';' | expression ';' )
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
                    // nopC.g:111:4: ';'
                    {
                    match(input,30,FOLLOW_30_in_expression_statement574); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:112:4: expression ';'
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement579);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_expression_statement581); if (state.failed) return ;

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
    // nopC.g:115:1: jump_statement : ( 'goto' NAME ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' );
    public final void jump_statement() throws RecognitionException {
        int jump_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // nopC.g:116:2: ( 'goto' NAME ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' )
            int alt19=5;
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
                    // nopC.g:116:4: 'goto' NAME ';'
                    {
                    match(input,51,FOLLOW_51_in_jump_statement592); if (state.failed) return ;

                    match(input,NAME,FOLLOW_NAME_in_jump_statement594); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement596); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:117:4: 'continue' ';'
                    {
                    match(input,48,FOLLOW_48_in_jump_statement601); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement603); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // nopC.g:118:4: 'break' ';'
                    {
                    match(input,47,FOLLOW_47_in_jump_statement608); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement610); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // nopC.g:119:4: 'return' ';'
                    {
                    match(input,54,FOLLOW_54_in_jump_statement615); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement617); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // nopC.g:120:4: 'return' expression ';'
                    {
                    match(input,54,FOLLOW_54_in_jump_statement622); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_jump_statement624);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement626); if (state.failed) return ;

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
    // nopC.g:123:1: functionCall : NAME '(' variableList ')' ;
    public final void functionCall() throws RecognitionException {
        int functionCall_StartIndex = input.index();

        Token NAME4=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }

            // nopC.g:124:2: ( NAME '(' variableList ')' )
            // nopC.g:125:2: NAME '(' variableList ')'
            {
            NAME4=(Token)match(input,NAME,FOLLOW_NAME_in_functionCall639); if (state.failed) return ;

            match(input,16,FOLLOW_16_in_functionCall641); if (state.failed) return ;

            pushFollow(FOLLOW_variableList_in_functionCall643);
            variableList();

            state._fsp--;
            if (state.failed) return ;

            match(input,17,FOLLOW_17_in_functionCall645); if (state.failed) return ;

            if ( state.backtracking==0 ) {
            			System.out.println("In functionTable gefunden " + functionTable.get((NAME4!=null?NAME4.getText():null))); 
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
        return ;
    }
    // $ANTLR end "functionCall"



    // $ANTLR start "variableList"
    // nopC.g:131:1: variableList : ( NAME )? ( ',' NAME )* ;
    public final void variableList() throws RecognitionException {
        int variableList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

            // nopC.g:132:2: ( ( NAME )? ( ',' NAME )* )
            // nopC.g:133:3: ( NAME )? ( ',' NAME )*
            {
            // nopC.g:133:3: ( NAME )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NAME) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // nopC.g:133:3: NAME
                    {
                    match(input,NAME,FOLLOW_NAME_in_variableList664); if (state.failed) return ;

                    }
                    break;

            }


            // nopC.g:133:9: ( ',' NAME )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // nopC.g:133:10: ',' NAME
            	    {
            	    match(input,23,FOLLOW_23_in_variableList668); if (state.failed) return ;

            	    match(input,NAME,FOLLOW_NAME_in_variableList670); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
            if ( state.backtracking>0 ) { memoize(input, 16, variableList_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "variableList"



    // $ANTLR start "assignment"
    // nopC.g:136:1: assignment : NAME assignmentOperator expression ;
    public final void assignment() throws RecognitionException {
        int assignment_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // nopC.g:137:2: ( NAME assignmentOperator expression )
            // nopC.g:138:3: NAME assignmentOperator expression
            {
            match(input,NAME,FOLLOW_NAME_in_assignment686); if (state.failed) return ;

            pushFollow(FOLLOW_assignmentOperator_in_assignment688);
            assignmentOperator();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_assignment690);
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
        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "assignmentOperator"
    // nopC.g:143:1: assignmentOperator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
    public final void assignmentOperator() throws RecognitionException {
        int assignmentOperator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // nopC.g:144:2: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
            // nopC.g:
            {
            if ( input.LA(1)==12||input.LA(1)==15||input.LA(1)==19||input.LA(1)==22||input.LA(1)==26||input.LA(1)==28||input.LA(1)==33||input.LA(1)==35||input.LA(1)==40||input.LA(1)==45||input.LA(1)==59 ) {
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
    // nopC.g:157:2: expression : logical_or_expression ( '?' expression ':' expression )? ;
    public final void expression() throws RecognitionException {
        int expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // nopC.g:158:3: ( logical_or_expression ( '?' expression ':' expression )? )
            // nopC.g:158:5: logical_or_expression ( '?' expression ':' expression )?
            {
            pushFollow(FOLLOW_logical_or_expression_in_expression766);
            logical_or_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:158:27: ( '?' expression ':' expression )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // nopC.g:158:28: '?' expression ':' expression
                    {
                    match(input,41,FOLLOW_41_in_expression769); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_expression771);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,29,FOLLOW_29_in_expression773); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_expression775);
                    expression();

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
            if ( state.backtracking>0 ) { memoize(input, 19, expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "logical_or_expression"
    // nopC.g:161:2: logical_or_expression : logical_and_expression ( '||' logical_and_expression )* ;
    public final void logical_or_expression() throws RecognitionException {
        int logical_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // nopC.g:162:3: ( logical_and_expression ( '||' logical_and_expression )* )
            // nopC.g:162:5: logical_and_expression ( '||' logical_and_expression )*
            {
            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression791);
            logical_and_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:162:28: ( '||' logical_and_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==60) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // nopC.g:162:29: '||' logical_and_expression
            	    {
            	    match(input,60,FOLLOW_60_in_logical_or_expression794); if (state.failed) return ;

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression796);
            	    logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 20, logical_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "logical_or_expression"



    // $ANTLR start "logical_and_expression"
    // nopC.g:165:2: logical_and_expression : inclusive_or_expression ( '&&' inclusive_or_expression )* ;
    public final void logical_and_expression() throws RecognitionException {
        int logical_and_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // nopC.g:166:3: ( inclusive_or_expression ( '&&' inclusive_or_expression )* )
            // nopC.g:166:5: inclusive_or_expression ( '&&' inclusive_or_expression )*
            {
            pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression812);
            inclusive_or_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:166:29: ( '&&' inclusive_or_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==13) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // nopC.g:166:30: '&&' inclusive_or_expression
            	    {
            	    match(input,13,FOLLOW_13_in_logical_and_expression815); if (state.failed) return ;

            	    pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression817);
            	    inclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 21, logical_and_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "logical_and_expression"



    // $ANTLR start "inclusive_or_expression"
    // nopC.g:169:2: inclusive_or_expression : exclusive_or_expression ( '|' exclusive_or_expression )* ;
    public final void inclusive_or_expression() throws RecognitionException {
        int inclusive_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // nopC.g:170:3: ( exclusive_or_expression ( '|' exclusive_or_expression )* )
            // nopC.g:170:5: exclusive_or_expression ( '|' exclusive_or_expression )*
            {
            pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression833);
            exclusive_or_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:170:29: ( '|' exclusive_or_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==58) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // nopC.g:170:30: '|' exclusive_or_expression
            	    {
            	    match(input,58,FOLLOW_58_in_inclusive_or_expression836); if (state.failed) return ;

            	    pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression838);
            	    exclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 22, inclusive_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "inclusive_or_expression"



    // $ANTLR start "exclusive_or_expression"
    // nopC.g:173:2: exclusive_or_expression : and_expression ( '^' and_expression )* ;
    public final void exclusive_or_expression() throws RecognitionException {
        int exclusive_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // nopC.g:174:3: ( and_expression ( '^' and_expression )* )
            // nopC.g:174:5: and_expression ( '^' and_expression )*
            {
            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression854);
            and_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:174:20: ( '^' and_expression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // nopC.g:174:21: '^' and_expression
            	    {
            	    match(input,44,FOLLOW_44_in_exclusive_or_expression857); if (state.failed) return ;

            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression859);
            	    and_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 23, exclusive_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "exclusive_or_expression"



    // $ANTLR start "and_expression"
    // nopC.g:177:2: and_expression : equality_expression ( '&' equality_expression )* ;
    public final void and_expression() throws RecognitionException {
        int and_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }

            // nopC.g:178:3: ( equality_expression ( '&' equality_expression )* )
            // nopC.g:178:5: equality_expression ( '&' equality_expression )*
            {
            pushFollow(FOLLOW_equality_expression_in_and_expression875);
            equality_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:178:25: ( '&' equality_expression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==14) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // nopC.g:178:26: '&' equality_expression
            	    {
            	    match(input,14,FOLLOW_14_in_and_expression878); if (state.failed) return ;

            	    pushFollow(FOLLOW_equality_expression_in_and_expression880);
            	    equality_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 24, and_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "and_expression"



    // $ANTLR start "equality_expression"
    // nopC.g:180:2: equality_expression : relational_expression ( ( '==' | '!=' ) relational_expression )* ;
    public final void equality_expression() throws RecognitionException {
        int equality_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }

            // nopC.g:181:3: ( relational_expression ( ( '==' | '!=' ) relational_expression )* )
            // nopC.g:181:5: relational_expression ( ( '==' | '!=' ) relational_expression )*
            {
            pushFollow(FOLLOW_relational_expression_in_equality_expression895);
            relational_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:181:27: ( ( '==' | '!=' ) relational_expression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==10||LA28_0==36) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // nopC.g:181:28: ( '==' | '!=' ) relational_expression
            	    {
            	    if ( input.LA(1)==10||input.LA(1)==36 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression904);
            	    relational_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 25, equality_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "equality_expression"



    // $ANTLR start "relational_expression"
    // nopC.g:184:2: relational_expression : shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* ;
    public final void relational_expression() throws RecognitionException {
        int relational_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }

            // nopC.g:185:3: ( shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* )
            // nopC.g:185:5: shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
            {
            pushFollow(FOLLOW_shift_expression_in_relational_expression920);
            shift_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:185:22: ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31||LA29_0==34||(LA29_0 >= 37 && LA29_0 <= 38)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // nopC.g:185:23: ( '<' | '>' | '<=' | '>=' ) shift_expression
            	    {
            	    if ( input.LA(1)==31||input.LA(1)==34||(input.LA(1) >= 37 && input.LA(1) <= 38) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_shift_expression_in_relational_expression933);
            	    shift_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 26, relational_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "relational_expression"



    // $ANTLR start "shift_expression"
    // nopC.g:188:2: shift_expression : additive_expression ( ( '<<' | '>>' ) additive_expression )* ;
    public final void shift_expression() throws RecognitionException {
        int shift_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }

            // nopC.g:189:3: ( additive_expression ( ( '<<' | '>>' ) additive_expression )* )
            // nopC.g:189:5: additive_expression ( ( '<<' | '>>' ) additive_expression )*
            {
            pushFollow(FOLLOW_additive_expression_in_shift_expression949);
            additive_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:189:25: ( ( '<<' | '>>' ) additive_expression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==32||LA30_0==39) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // nopC.g:189:26: ( '<<' | '>>' ) additive_expression
            	    {
            	    if ( input.LA(1)==32||input.LA(1)==39 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_additive_expression_in_shift_expression958);
            	    additive_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 27, shift_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "shift_expression"



    // $ANTLR start "additive_expression"
    // nopC.g:192:2: additive_expression : ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* ;
    public final void additive_expression() throws RecognitionException {
        int additive_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }

            // nopC.g:193:3: ( ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* )
            // nopC.g:193:5: ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )*
            {
            // nopC.g:193:5: ( multiplicative_expression )
            // nopC.g:193:6: multiplicative_expression
            {
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression977);
            multiplicative_expression();

            state._fsp--;
            if (state.failed) return ;

            }


            // nopC.g:193:33: ( '+' multiplicative_expression | '-' multiplicative_expression )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }
                else if ( (LA31_0==24) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // nopC.g:193:34: '+' multiplicative_expression
            	    {
            	    match(input,20,FOLLOW_20_in_additive_expression981); if (state.failed) return ;

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression983);
            	    multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:193:66: '-' multiplicative_expression
            	    {
            	    match(input,24,FOLLOW_24_in_additive_expression987); if (state.failed) return ;

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression989);
            	    multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 28, additive_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "additive_expression"



    // $ANTLR start "multiplicative_expression"
    // nopC.g:196:2: multiplicative_expression : ( unary_expression ) ( '*' unary_expression | '/' unary_expression | '%' unary_expression )* ;
    public final void multiplicative_expression() throws RecognitionException {
        int multiplicative_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }

            // nopC.g:197:3: ( ( unary_expression ) ( '*' unary_expression | '/' unary_expression | '%' unary_expression )* )
            // nopC.g:197:5: ( unary_expression ) ( '*' unary_expression | '/' unary_expression | '%' unary_expression )*
            {
            // nopC.g:197:5: ( unary_expression )
            // nopC.g:197:6: unary_expression
            {
            pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1006);
            unary_expression();

            state._fsp--;
            if (state.failed) return ;

            }


            // nopC.g:197:24: ( '*' unary_expression | '/' unary_expression | '%' unary_expression )*
            loop32:
            do {
                int alt32=4;
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

                switch (alt32) {
            	case 1 :
            	    // nopC.g:197:25: '*' unary_expression
            	    {
            	    match(input,18,FOLLOW_18_in_multiplicative_expression1010); if (state.failed) return ;

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1012);
            	    unary_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:197:48: '/' unary_expression
            	    {
            	    match(input,27,FOLLOW_27_in_multiplicative_expression1016); if (state.failed) return ;

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1018);
            	    unary_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // nopC.g:197:71: '%' unary_expression
            	    {
            	    match(input,11,FOLLOW_11_in_multiplicative_expression1022); if (state.failed) return ;

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1024);
            	    unary_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 29, multiplicative_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "multiplicative_expression"



    // $ANTLR start "unary_expression"
    // nopC.g:200:1: unary_expression : ( postfix_expression | '++' unary_expression | '--' unary_expression );
    public final void unary_expression() throws RecognitionException {
        int unary_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }

            // nopC.g:201:2: ( postfix_expression | '++' unary_expression | '--' unary_expression )
            int alt33=3;
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

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // nopC.g:201:4: postfix_expression
                    {
                    pushFollow(FOLLOW_postfix_expression_in_unary_expression1038);
                    postfix_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:202:4: '++' unary_expression
                    {
                    match(input,21,FOLLOW_21_in_unary_expression1043); if (state.failed) return ;

                    pushFollow(FOLLOW_unary_expression_in_unary_expression1045);
                    unary_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // nopC.g:203:4: '--' unary_expression
                    {
                    match(input,25,FOLLOW_25_in_unary_expression1050); if (state.failed) return ;

                    pushFollow(FOLLOW_unary_expression_in_unary_expression1052);
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
        return ;
    }
    // $ANTLR end "unary_expression"



    // $ANTLR start "postfix_expression"
    // nopC.g:206:1: postfix_expression : primary_expression ( '[' expression ']' | '++' | '--' )* ;
    public final void postfix_expression() throws RecognitionException {
        int postfix_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }

            // nopC.g:207:2: ( primary_expression ( '[' expression ']' | '++' | '--' )* )
            // nopC.g:207:6: primary_expression ( '[' expression ']' | '++' | '--' )*
            {
            pushFollow(FOLLOW_primary_expression_in_postfix_expression1065);
            primary_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:208:9: ( '[' expression ']' | '++' | '--' )*
            loop34:
            do {
                int alt34=4;
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

                switch (alt34) {
            	case 1 :
            	    // nopC.g:208:13: '[' expression ']'
            	    {
            	    match(input,42,FOLLOW_42_in_postfix_expression1079); if (state.failed) return ;

            	    pushFollow(FOLLOW_expression_in_postfix_expression1081);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input,43,FOLLOW_43_in_postfix_expression1083); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:209:13: '++'
            	    {
            	    match(input,21,FOLLOW_21_in_postfix_expression1098); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // nopC.g:210:13: '--'
            	    {
            	    match(input,25,FOLLOW_25_in_postfix_expression1112); if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 31, postfix_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "postfix_expression"



    // $ANTLR start "primary_expression"
    // nopC.g:214:1: primary_expression : ( NAME | '(' expression ')' | functionCall | WERT );
    public final void primary_expression() throws RecognitionException {
        int primary_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }

            // nopC.g:215:2: ( NAME | '(' expression ')' | functionCall | WERT )
            int alt35=4;
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

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // nopC.g:215:4: NAME
                    {
                    match(input,NAME,FOLLOW_NAME_in_primary_expression1134); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:217:4: '(' expression ')'
                    {
                    match(input,16,FOLLOW_16_in_primary_expression1140); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_primary_expression1142);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,17,FOLLOW_17_in_primary_expression1144); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // nopC.g:218:4: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primary_expression1149);
                    functionCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // nopC.g:219:4: WERT
                    {
                    match(input,WERT,FOLLOW_WERT_in_primary_expression1154); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "primary_expression"



    // $ANTLR start "typeSpecifier"
    // nopC.g:244:1: typeSpecifier : ( 'int' | 'void' | 'bool' );
    public final void typeSpecifier() throws RecognitionException {
        int typeSpecifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }

            // nopC.g:245:2: ( 'int' | 'void' | 'bool' )
            // nopC.g:
            {
            if ( input.LA(1)==46||input.LA(1)==53||input.LA(1)==55 ) {
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
        // nopC.g:36:2: ( typeSpecifier NAME ( '=' | ';' | ',' ) )
        // nopC.g:36:3: typeSpecifier NAME ( '=' | ';' | ',' )
        {
        pushFollow(FOLLOW_typeSpecifier_in_synpred4_nopC89);
        typeSpecifier();

        state._fsp--;
        if (state.failed) return ;

        match(input,NAME,FOLLOW_NAME_in_synpred4_nopC91); if (state.failed) return ;

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
        // nopC.g:37:4: ( typeSpecifier NAME '(' )
        // nopC.g:37:5: typeSpecifier NAME '('
        {
        pushFollow(FOLLOW_typeSpecifier_in_synpred5_nopC117);
        typeSpecifier();

        state._fsp--;
        if (state.failed) return ;

        match(input,NAME,FOLLOW_NAME_in_synpred5_nopC119); if (state.failed) return ;

        match(input,16,FOLLOW_16_in_synpred5_nopC122); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_nopC

    // $ANTLR start synpred17_nopC
    public final void synpred17_nopC_fragment() throws RecognitionException {
        // nopC.g:91:5: ( ( functionCall ';' ) )
        // nopC.g:91:5: ( functionCall ';' )
        {
        // nopC.g:91:5: ( functionCall ';' )
        // nopC.g:91:6: functionCall ';'
        {
        pushFollow(FOLLOW_functionCall_in_synpred17_nopC435);
        functionCall();

        state._fsp--;
        if (state.failed) return ;

        match(input,30,FOLLOW_30_in_synpred17_nopC437); if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred17_nopC

    // Delegated rules

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


 

    public static final BitSet FOLLOW_globalFunctionOrStatement_in_cFile65 = new BitSet(new long[]{0x00A0400000000002L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_globalFunctionOrStatement108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_globalFunctionOrStatement127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_globalVariableDeclaration148 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_globalVariableDeclarationList_in_globalVariableDeclaration150 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_globalVariableDeclaration153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_globalVariableDeclarationList183 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_globalVariableDeclarationList185 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WERT_in_globalVariableDeclarationList191 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_globalVariableDeclarationList198 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_globalVariableDeclarationList205 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_globalVariableDeclarationList207 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WERT_in_globalVariableDeclarationList213 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_typeSpecifier_in_variableDeclaration239 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_variableDeclarationList_in_variableDeclaration241 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_variableDeclaration244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_variableDeclarationList272 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_variableDeclarationList275 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_variableDeclarationList277 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_variableDeclarationList284 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_variableDeclarationList291 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_variableDeclarationList294 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_variableDeclarationList296 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_typeSpecifier_in_functionDefinition328 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_functionDefinition330 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDefinition332 = new BitSet(new long[]{0x00A0400000020000L});
    public static final BitSet FOLLOW_parameterList_in_functionDefinition334 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionDefinition337 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_functionDefinition339 = new BitSet(new long[]{0x21FDC00042210180L});
    public static final BitSet FOLLOW_statement_in_functionDefinition341 = new BitSet(new long[]{0x21FDC00042210180L});
    public static final BitSet FOLLOW_61_in_functionDefinition345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_parameterList365 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_parameterList372 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_parameterList377 = new BitSet(new long[]{0x00A0400000000000L});
    public static final BitSet FOLLOW_typeSpecifier_in_parameterList379 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_parameterList386 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_57_in_codeBlock405 = new BitSet(new long[]{0x21FDC00042210180L});
    public static final BitSet FOLLOW_statement_in_codeBlock406 = new BitSet(new long[]{0x21FDC00042210180L});
    public static final BitSet FOLLOW_61_in_codeBlock409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_codeBlock414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement435 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement446 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_statement456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_selection_statement498 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_selection_statement500 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_selection_statement502 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_selection_statement504 = new BitSet(new long[]{0x03FDC00042210180L});
    public static final BitSet FOLLOW_codeBlock_in_selection_statement506 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_selection_statement521 = new BitSet(new long[]{0x03FDC00042210180L});
    public static final BitSet FOLLOW_codeBlock_in_selection_statement523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_iteration_statement536 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_iteration_statement538 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_iteration_statement540 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_iteration_statement542 = new BitSet(new long[]{0x03FDC00042210180L});
    public static final BitSet FOLLOW_codeBlock_in_iteration_statement544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_iteration_statement549 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_iteration_statement551 = new BitSet(new long[]{0x0000000042210180L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement553 = new BitSet(new long[]{0x0000000042210180L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement555 = new BitSet(new long[]{0x0000000002230180L});
    public static final BitSet FOLLOW_expression_in_iteration_statement557 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_iteration_statement560 = new BitSet(new long[]{0x03FDC00042210180L});
    public static final BitSet FOLLOW_codeBlock_in_iteration_statement562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_expression_statement574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement579 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_expression_statement581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_jump_statement592 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_jump_statement594 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_jump_statement601 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_jump_statement608 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_jump_statement615 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_jump_statement622 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_jump_statement624 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_functionCall639 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionCall641 = new BitSet(new long[]{0x0000000000820080L});
    public static final BitSet FOLLOW_variableList_in_functionCall643 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionCall645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_variableList664 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_variableList668 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_variableList670 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_NAME_in_assignment686 = new BitSet(new long[]{0x0800210A14489000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignment688 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_expression766 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_expression769 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_expression771 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_expression773 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_expression775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression791 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_logical_or_expression794 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression796 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression812 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_logical_and_expression815 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression817 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression833 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_inclusive_or_expression836 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression838 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression854 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_exclusive_or_expression857 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression859 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression875 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_and_expression878 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression880 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression895 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_set_in_equality_expression898 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression904 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression920 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_set_in_relational_expression923 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression933 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression949 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_set_in_shift_expression952 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression958 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression977 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_20_in_additive_expression981 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression983 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_24_in_additive_expression987 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression989 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1006 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_18_in_multiplicative_expression1010 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1012 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_27_in_multiplicative_expression1016 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1018 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_11_in_multiplicative_expression1022 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1024 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_unary_expression1043 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_unary_expression1050 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression1065 = new BitSet(new long[]{0x0000040002200002L});
    public static final BitSet FOLLOW_42_in_postfix_expression1079 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_postfix_expression1081 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_postfix_expression1083 = new BitSet(new long[]{0x0000040002200002L});
    public static final BitSet FOLLOW_21_in_postfix_expression1098 = new BitSet(new long[]{0x0000040002200002L});
    public static final BitSet FOLLOW_25_in_postfix_expression1112 = new BitSet(new long[]{0x0000040002200002L});
    public static final BitSet FOLLOW_NAME_in_primary_expression1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_primary_expression1140 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_primary_expression1142 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_primary_expression1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primary_expression1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WERT_in_primary_expression1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_synpred4_nopC89 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_synpred4_nopC91 = new BitSet(new long[]{0x0000000840800000L});
    public static final BitSet FOLLOW_set_in_synpred4_nopC93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_synpred5_nopC117 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_synpred5_nopC119 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred5_nopC122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_synpred17_nopC435 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred17_nopC437 = new BitSet(new long[]{0x0000000000000002L});

}
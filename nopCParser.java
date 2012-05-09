// $ANTLR 3.4 nopC.g 2012-05-05 16:59:04

import java.util.Set;
import java.util.HashSet;
import java.util.TreeMap;


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
        this.state.ruleMemo = new HashMap[101+1];
         

    }

    public String[] getTokenNames() { return nopCParser.tokenNames; }
    public String getGrammarFileName() { return "nopC.g"; }


    	TreeMap<String, String> functionTable = new TreeMap<String, String>();
    	TreeMap<String, Float> varTable = new TreeMap<String, Float>();
    	



    // $ANTLR start "cFile"
    // nopC.g:33:1: cFile : ( globalFunctionOrStatement )+ ;
    public final void cFile() throws RecognitionException {
        int cFile_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // nopC.g:38:2: ( ( globalFunctionOrStatement )+ )
            // nopC.g:39:2: ( globalFunctionOrStatement )+
            {
            // nopC.g:39:2: ( globalFunctionOrStatement )+
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
            	    // nopC.g:39:2: globalFunctionOrStatement
            	    {
            	    pushFollow(FOLLOW_globalFunctionOrStatement_in_cFile72);
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
                        throw eee;
                }
                cnt1++;
            } while (true);


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
        return ;
    }
    // $ANTLR end "cFile"



    // $ANTLR start "globalFunctionOrStatement"
    // nopC.g:42:1: globalFunctionOrStatement : ( ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration | ( typeSpecifier NAME '(' )=> functionDefinition );
    public final void globalFunctionOrStatement() throws RecognitionException {
        int globalFunctionOrStatement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }

            // nopC.g:43:2: ( ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration | ( typeSpecifier NAME '(' )=> functionDefinition )
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
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // nopC.g:44:2: ( typeSpecifier NAME ( '=' | ';' | ',' ) )=> globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_globalFunctionOrStatement106);
                    globalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:45:4: ( typeSpecifier NAME '(' )=> functionDefinition
                    {
                    pushFollow(FOLLOW_functionDefinition_in_globalFunctionOrStatement123);
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
        return ;
    }
    // $ANTLR end "globalFunctionOrStatement"


    public static class globalVariableDeclaration_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "globalVariableDeclaration"
    // nopC.g:48:1: globalVariableDeclaration : typeSpecifier globalVariableDeclarationList ';' ;
    public final nopCParser.globalVariableDeclaration_return globalVariableDeclaration() throws RecognitionException {
        nopCParser.globalVariableDeclaration_return retval = new nopCParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);

        int globalVariableDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // nopC.g:49:2: ( typeSpecifier globalVariableDeclarationList ';' )
            // nopC.g:50:2: typeSpecifier globalVariableDeclarationList ';'
            {
            pushFollow(FOLLOW_typeSpecifier_in_globalVariableDeclaration136);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;

            pushFollow(FOLLOW_globalVariableDeclarationList_in_globalVariableDeclaration138);
            globalVariableDeclarationList();

            state._fsp--;
            if (state.failed) return retval;

            match(input,30,FOLLOW_30_in_globalVariableDeclaration140); if (state.failed) return retval;

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
    // nopC.g:58:1: globalVariableDeclarationList : NAME ( '=' WERT )? ( ',' NAME ( '=' WERT )? )* ;
    public final void globalVariableDeclarationList() throws RecognitionException {
        int globalVariableDeclarationList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // nopC.g:59:2: ( NAME ( '=' WERT )? ( ',' NAME ( '=' WERT )? )* )
            // nopC.g:60:2: NAME ( '=' WERT )? ( ',' NAME ( '=' WERT )? )*
            {
            match(input,NAME,FOLLOW_NAME_in_globalVariableDeclarationList160); if (state.failed) return ;

            // nopC.g:60:7: ( '=' WERT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // nopC.g:60:8: '=' WERT
                    {
                    match(input,35,FOLLOW_35_in_globalVariableDeclarationList163); if (state.failed) return ;

                    match(input,WERT,FOLLOW_WERT_in_globalVariableDeclarationList165); if (state.failed) return ;

                    }
                    break;

            }


            // nopC.g:60:19: ( ',' NAME ( '=' WERT )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // nopC.g:60:20: ',' NAME ( '=' WERT )?
            	    {
            	    match(input,23,FOLLOW_23_in_globalVariableDeclarationList170); if (state.failed) return ;

            	    match(input,NAME,FOLLOW_NAME_in_globalVariableDeclarationList172); if (state.failed) return ;

            	    // nopC.g:60:29: ( '=' WERT )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==35) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // nopC.g:60:30: '=' WERT
            	            {
            	            match(input,35,FOLLOW_35_in_globalVariableDeclarationList175); if (state.failed) return ;

            	            match(input,WERT,FOLLOW_WERT_in_globalVariableDeclarationList177); if (state.failed) return ;

            	            }
            	            break;

            	    }


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
        return ;
    }
    // $ANTLR end "globalVariableDeclarationList"


    public static class variableDeclaration_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "variableDeclaration"
    // nopC.g:64:1: variableDeclaration : typeSpecifier variableDeclarationList ';' ;
    public final nopCParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        nopCParser.variableDeclaration_return retval = new nopCParser.variableDeclaration_return();
        retval.start = input.LT(1);

        int variableDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // nopC.g:65:2: ( typeSpecifier variableDeclarationList ';' )
            // nopC.g:66:2: typeSpecifier variableDeclarationList ';'
            {
            pushFollow(FOLLOW_typeSpecifier_in_variableDeclaration198);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;

            pushFollow(FOLLOW_variableDeclarationList_in_variableDeclaration200);
            variableDeclarationList();

            state._fsp--;
            if (state.failed) return retval;

            match(input,30,FOLLOW_30_in_variableDeclaration202); if (state.failed) return retval;

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
    // nopC.g:69:1: variableDeclarationList : NAME ( '=' expression )? ( ',' NAME ( '=' expression )? )* ;
    public final void variableDeclarationList() throws RecognitionException {
        int variableDeclarationList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }

            // nopC.g:70:2: ( NAME ( '=' expression )? ( ',' NAME ( '=' expression )? )* )
            // nopC.g:71:2: NAME ( '=' expression )? ( ',' NAME ( '=' expression )? )*
            {
            match(input,NAME,FOLLOW_NAME_in_variableDeclarationList217); if (state.failed) return ;

            // nopC.g:71:7: ( '=' expression )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // nopC.g:71:8: '=' expression
                    {
                    match(input,35,FOLLOW_35_in_variableDeclarationList220); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_variableDeclarationList222);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // nopC.g:71:25: ( ',' NAME ( '=' expression )? )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // nopC.g:71:26: ',' NAME ( '=' expression )?
            	    {
            	    match(input,23,FOLLOW_23_in_variableDeclarationList227); if (state.failed) return ;

            	    match(input,NAME,FOLLOW_NAME_in_variableDeclarationList229); if (state.failed) return ;

            	    // nopC.g:71:35: ( '=' expression )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==35) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // nopC.g:71:36: '=' expression
            	            {
            	            match(input,35,FOLLOW_35_in_variableDeclarationList232); if (state.failed) return ;

            	            pushFollow(FOLLOW_expression_in_variableDeclarationList234);
            	            expression();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }


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
        return ;
    }
    // $ANTLR end "variableDeclarationList"


    public static class functionDefinition_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "functionDefinition"
    // nopC.g:75:1: functionDefinition : typeSpecifier NAME '(' parameterList ')' '{' codeBlock '}' ;
    public final nopCParser.functionDefinition_return functionDefinition() throws RecognitionException {
        nopCParser.functionDefinition_return retval = new nopCParser.functionDefinition_return();
        retval.start = input.LT(1);

        int functionDefinition_StartIndex = input.index();

        Token NAME1=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // nopC.g:76:2: ( typeSpecifier NAME '(' parameterList ')' '{' codeBlock '}' )
            // nopC.g:77:3: typeSpecifier NAME '(' parameterList ')' '{' codeBlock '}'
            {
            pushFollow(FOLLOW_typeSpecifier_in_functionDefinition255);
            typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;

            NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_functionDefinition257); if (state.failed) return retval;

            match(input,16,FOLLOW_16_in_functionDefinition259); if (state.failed) return retval;

            pushFollow(FOLLOW_parameterList_in_functionDefinition261);
            parameterList();

            state._fsp--;
            if (state.failed) return retval;

            match(input,17,FOLLOW_17_in_functionDefinition263); if (state.failed) return retval;

            match(input,57,FOLLOW_57_in_functionDefinition265); if (state.failed) return retval;

            pushFollow(FOLLOW_codeBlock_in_functionDefinition267);
            codeBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,61,FOLLOW_61_in_functionDefinition269); if (state.failed) return retval;

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
        return retval;
    }
    // $ANTLR end "functionDefinition"



    // $ANTLR start "parameterList"
    // nopC.g:81:1: parameterList : ( typeSpecifier NAME ( ',' typeSpecifier NAME )* )? ;
    public final void parameterList() throws RecognitionException {
        int parameterList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }

            // nopC.g:82:2: ( ( typeSpecifier NAME ( ',' typeSpecifier NAME )* )? )
            // nopC.g:83:3: ( typeSpecifier NAME ( ',' typeSpecifier NAME )* )?
            {
            // nopC.g:83:3: ( typeSpecifier NAME ( ',' typeSpecifier NAME )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==46||LA10_0==53||LA10_0==55) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // nopC.g:83:4: typeSpecifier NAME ( ',' typeSpecifier NAME )*
                    {
                    pushFollow(FOLLOW_typeSpecifier_in_parameterList289);
                    typeSpecifier();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,NAME,FOLLOW_NAME_in_parameterList291); if (state.failed) return ;

                    // nopC.g:83:23: ( ',' typeSpecifier NAME )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==23) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // nopC.g:83:24: ',' typeSpecifier NAME
                    	    {
                    	    match(input,23,FOLLOW_23_in_parameterList294); if (state.failed) return ;

                    	    pushFollow(FOLLOW_typeSpecifier_in_parameterList296);
                    	    typeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    match(input,NAME,FOLLOW_NAME_in_parameterList298); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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
    // nopC.g:86:1: codeBlock : ( statement )* ;
    public final void codeBlock() throws RecognitionException {
        int codeBlock_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }

            // nopC.g:87:2: ( ( statement )* )
            // nopC.g:88:2: ( statement )*
            {
            // nopC.g:88:2: ( statement )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= NAME && LA11_0 <= WERT)||LA11_0==16||LA11_0==21||LA11_0==25||LA11_0==30||(LA11_0 >= 46 && LA11_0 <= 48)||(LA11_0 >= 50 && LA11_0 <= 56)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // nopC.g:88:2: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_codeBlock314);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
            if ( state.backtracking>0 ) { memoize(input, 9, codeBlock_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "codeBlock"



    // $ANTLR start "statement"
    // nopC.g:91:1: statement : ( ( functionCall ';' ) | ( assignment ';' ) | variableDeclaration | selection_statement | iteration_statement | jump_statement | expression_statement );
    public final void statement() throws RecognitionException {
        int statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }

            // nopC.g:92:2: ( ( functionCall ';' ) | ( assignment ';' ) | variableDeclaration | selection_statement | iteration_statement | jump_statement | expression_statement )
            int alt12=7;
            switch ( input.LA(1) ) {
            case NAME:
                {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    int LA12_15 = input.LA(3);

                    if ( (synpred15_nopC()) ) {
                        alt12=1;
                    }
                    else if ( (true) ) {
                        alt12=7;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 15, input);

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
                    alt12=2;
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
                    alt12=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }

                }
                break;
            case 46:
            case 53:
            case 55:
                {
                alt12=3;
                }
                break;
            case 52:
                {
                alt12=4;
                }
                break;
            case 50:
            case 56:
                {
                alt12=5;
                }
                break;
            case 47:
            case 48:
            case 51:
            case 54:
                {
                alt12=6;
                }
                break;
            case WERT:
            case 16:
            case 21:
            case 25:
            case 30:
                {
                alt12=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // nopC.g:93:5: ( functionCall ';' )
                    {
                    // nopC.g:93:5: ( functionCall ';' )
                    // nopC.g:93:6: functionCall ';'
                    {
                    pushFollow(FOLLOW_functionCall_in_statement332);
                    functionCall();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_statement334); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // nopC.g:94:5: ( assignment ';' )
                    {
                    // nopC.g:94:5: ( assignment ';' )
                    // nopC.g:94:7: assignment ';'
                    {
                    pushFollow(FOLLOW_assignment_in_statement343);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_statement345); if (state.failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // nopC.g:95:5: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_statement353);
                    variableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // nopC.g:96:5: selection_statement
                    {
                    pushFollow(FOLLOW_selection_statement_in_statement359);
                    selection_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // nopC.g:97:6: iteration_statement
                    {
                    pushFollow(FOLLOW_iteration_statement_in_statement366);
                    iteration_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // nopC.g:98:6: jump_statement
                    {
                    pushFollow(FOLLOW_jump_statement_in_statement373);
                    jump_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // nopC.g:99:6: expression_statement
                    {
                    pushFollow(FOLLOW_expression_statement_in_statement380);
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
    // nopC.g:103:1: selection_statement : 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )? ;
    public final void selection_statement() throws RecognitionException {
        int selection_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // nopC.g:104:2: ( 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )? )
            // nopC.g:104:4: 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )?
            {
            match(input,52,FOLLOW_52_in_selection_statement394); if (state.failed) return ;

            match(input,16,FOLLOW_16_in_selection_statement396); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_selection_statement398);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input,17,FOLLOW_17_in_selection_statement400); if (state.failed) return ;

            pushFollow(FOLLOW_statement_in_selection_statement402);
            statement();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:104:38: ( options {k=1; backtrack=false; } : 'else' statement )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==49) ) {
                int LA13_1 = input.LA(2);

                if ( (true) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // nopC.g:104:71: 'else' statement
                    {
                    match(input,49,FOLLOW_49_in_selection_statement417); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_selection_statement419);
                    statement();

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
    // nopC.g:107:1: iteration_statement : ( 'while' '(' expression ')' statement | 'for' '(' expression_statement expression_statement ( expression )? ')' statement );
    public final void iteration_statement() throws RecognitionException {
        int iteration_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

            // nopC.g:108:2: ( 'while' '(' expression ')' statement | 'for' '(' expression_statement expression_statement ( expression )? ')' statement )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==56) ) {
                alt15=1;
            }
            else if ( (LA15_0==50) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // nopC.g:108:4: 'while' '(' expression ')' statement
                    {
                    match(input,56,FOLLOW_56_in_iteration_statement432); if (state.failed) return ;

                    match(input,16,FOLLOW_16_in_iteration_statement434); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_iteration_statement436);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,17,FOLLOW_17_in_iteration_statement438); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_iteration_statement440);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:109:4: 'for' '(' expression_statement expression_statement ( expression )? ')' statement
                    {
                    match(input,50,FOLLOW_50_in_iteration_statement445); if (state.failed) return ;

                    match(input,16,FOLLOW_16_in_iteration_statement447); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_statement_in_iteration_statement449);
                    expression_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expression_statement_in_iteration_statement451);
                    expression_statement();

                    state._fsp--;
                    if (state.failed) return ;

                    // nopC.g:109:56: ( expression )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0 >= NAME && LA14_0 <= WERT)||LA14_0==16||LA14_0==21||LA14_0==25) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // nopC.g:109:56: expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement453);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,17,FOLLOW_17_in_iteration_statement456); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_iteration_statement458);
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
            if ( state.backtracking>0 ) { memoize(input, 12, iteration_statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "iteration_statement"



    // $ANTLR start "expression_statement"
    // nopC.g:112:1: expression_statement : ( ';' | expression ';' );
    public final void expression_statement() throws RecognitionException {
        int expression_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }

            // nopC.g:113:2: ( ';' | expression ';' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            else if ( ((LA16_0 >= NAME && LA16_0 <= WERT)||LA16_0==16||LA16_0==21||LA16_0==25) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // nopC.g:113:4: ';'
                    {
                    match(input,30,FOLLOW_30_in_expression_statement470); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:114:4: expression ';'
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement475);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_expression_statement477); if (state.failed) return ;

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
    // nopC.g:117:1: jump_statement : ( 'goto' NAME ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' );
    public final void jump_statement() throws RecognitionException {
        int jump_statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // nopC.g:118:2: ( 'goto' NAME ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt17=1;
                }
                break;
            case 48:
                {
                alt17=2;
                }
                break;
            case 47:
                {
                alt17=3;
                }
                break;
            case 54:
                {
                int LA17_4 = input.LA(2);

                if ( (LA17_4==30) ) {
                    alt17=4;
                }
                else if ( ((LA17_4 >= NAME && LA17_4 <= WERT)||LA17_4==16||LA17_4==21||LA17_4==25) ) {
                    alt17=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // nopC.g:118:4: 'goto' NAME ';'
                    {
                    match(input,51,FOLLOW_51_in_jump_statement488); if (state.failed) return ;

                    match(input,NAME,FOLLOW_NAME_in_jump_statement490); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement492); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:119:4: 'continue' ';'
                    {
                    match(input,48,FOLLOW_48_in_jump_statement497); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement499); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // nopC.g:120:4: 'break' ';'
                    {
                    match(input,47,FOLLOW_47_in_jump_statement504); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement506); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // nopC.g:121:4: 'return' ';'
                    {
                    match(input,54,FOLLOW_54_in_jump_statement511); if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement513); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // nopC.g:122:4: 'return' expression ';'
                    {
                    match(input,54,FOLLOW_54_in_jump_statement518); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_jump_statement520);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,30,FOLLOW_30_in_jump_statement522); if (state.failed) return ;

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
    // nopC.g:125:1: functionCall : NAME '(' variableList ')' ;
    public final void functionCall() throws RecognitionException {
        int functionCall_StartIndex = input.index();

        Token NAME2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }

            // nopC.g:126:2: ( NAME '(' variableList ')' )
            // nopC.g:127:2: NAME '(' variableList ')'
            {
            NAME2=(Token)match(input,NAME,FOLLOW_NAME_in_functionCall535); if (state.failed) return ;

            match(input,16,FOLLOW_16_in_functionCall537); if (state.failed) return ;

            pushFollow(FOLLOW_variableList_in_functionCall539);
            variableList();

            state._fsp--;
            if (state.failed) return ;

            match(input,17,FOLLOW_17_in_functionCall541); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "functionCall"



    // $ANTLR start "variableList"
    // nopC.g:133:1: variableList : ( NAME )? ( ',' NAME )* ;
    public final void variableList() throws RecognitionException {
        int variableList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

            // nopC.g:134:2: ( ( NAME )? ( ',' NAME )* )
            // nopC.g:135:3: ( NAME )? ( ',' NAME )*
            {
            // nopC.g:135:3: ( NAME )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==NAME) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // nopC.g:135:3: NAME
                    {
                    match(input,NAME,FOLLOW_NAME_in_variableList560); if (state.failed) return ;

                    }
                    break;

            }


            // nopC.g:135:9: ( ',' NAME )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // nopC.g:135:10: ',' NAME
            	    {
            	    match(input,23,FOLLOW_23_in_variableList564); if (state.failed) return ;

            	    match(input,NAME,FOLLOW_NAME_in_variableList566); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // nopC.g:138:1: assignment : NAME assignmentOperator expression ;
    public final void assignment() throws RecognitionException {
        int assignment_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // nopC.g:139:2: ( NAME assignmentOperator expression )
            // nopC.g:140:3: NAME assignmentOperator expression
            {
            match(input,NAME,FOLLOW_NAME_in_assignment582); if (state.failed) return ;

            pushFollow(FOLLOW_assignmentOperator_in_assignment584);
            assignmentOperator();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_assignment586);
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
    // nopC.g:145:1: assignmentOperator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
    public final void assignmentOperator() throws RecognitionException {
        int assignmentOperator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // nopC.g:146:2: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
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
    // nopC.g:159:2: expression : logical_or_expression ( '?' expression ':' expression )? ;
    public final void expression() throws RecognitionException {
        int expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // nopC.g:160:3: ( logical_or_expression ( '?' expression ':' expression )? )
            // nopC.g:160:5: logical_or_expression ( '?' expression ':' expression )?
            {
            pushFollow(FOLLOW_logical_or_expression_in_expression662);
            logical_or_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:160:27: ( '?' expression ':' expression )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // nopC.g:160:28: '?' expression ':' expression
                    {
                    match(input,41,FOLLOW_41_in_expression665); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_expression667);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,29,FOLLOW_29_in_expression669); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_expression671);
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
    // nopC.g:163:2: logical_or_expression : logical_and_expression ( '||' logical_and_expression )* ;
    public final void logical_or_expression() throws RecognitionException {
        int logical_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // nopC.g:164:3: ( logical_and_expression ( '||' logical_and_expression )* )
            // nopC.g:164:5: logical_and_expression ( '||' logical_and_expression )*
            {
            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression687);
            logical_and_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:164:28: ( '||' logical_and_expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==60) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // nopC.g:164:29: '||' logical_and_expression
            	    {
            	    match(input,60,FOLLOW_60_in_logical_or_expression690); if (state.failed) return ;

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression692);
            	    logical_and_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 20, logical_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "logical_or_expression"



    // $ANTLR start "logical_and_expression"
    // nopC.g:167:2: logical_and_expression : inclusive_or_expression ( '&&' inclusive_or_expression )* ;
    public final void logical_and_expression() throws RecognitionException {
        int logical_and_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // nopC.g:168:3: ( inclusive_or_expression ( '&&' inclusive_or_expression )* )
            // nopC.g:168:5: inclusive_or_expression ( '&&' inclusive_or_expression )*
            {
            pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression708);
            inclusive_or_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:168:29: ( '&&' inclusive_or_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==13) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // nopC.g:168:30: '&&' inclusive_or_expression
            	    {
            	    match(input,13,FOLLOW_13_in_logical_and_expression711); if (state.failed) return ;

            	    pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression713);
            	    inclusive_or_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 21, logical_and_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "logical_and_expression"



    // $ANTLR start "inclusive_or_expression"
    // nopC.g:171:2: inclusive_or_expression : exclusive_or_expression ( '|' exclusive_or_expression )* ;
    public final void inclusive_or_expression() throws RecognitionException {
        int inclusive_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // nopC.g:172:3: ( exclusive_or_expression ( '|' exclusive_or_expression )* )
            // nopC.g:172:5: exclusive_or_expression ( '|' exclusive_or_expression )*
            {
            pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression729);
            exclusive_or_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:172:29: ( '|' exclusive_or_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==58) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // nopC.g:172:30: '|' exclusive_or_expression
            	    {
            	    match(input,58,FOLLOW_58_in_inclusive_or_expression732); if (state.failed) return ;

            	    pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression734);
            	    exclusive_or_expression();

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
            if ( state.backtracking>0 ) { memoize(input, 22, inclusive_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "inclusive_or_expression"



    // $ANTLR start "exclusive_or_expression"
    // nopC.g:175:2: exclusive_or_expression : and_expression ( '^' and_expression )* ;
    public final void exclusive_or_expression() throws RecognitionException {
        int exclusive_or_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // nopC.g:176:3: ( and_expression ( '^' and_expression )* )
            // nopC.g:176:5: and_expression ( '^' and_expression )*
            {
            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression750);
            and_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:176:20: ( '^' and_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==44) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // nopC.g:176:21: '^' and_expression
            	    {
            	    match(input,44,FOLLOW_44_in_exclusive_or_expression753); if (state.failed) return ;

            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression755);
            	    and_expression();

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
            if ( state.backtracking>0 ) { memoize(input, 23, exclusive_or_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "exclusive_or_expression"



    // $ANTLR start "and_expression"
    // nopC.g:179:2: and_expression : equality_expression ( '&' equality_expression )* ;
    public final void and_expression() throws RecognitionException {
        int and_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }

            // nopC.g:180:3: ( equality_expression ( '&' equality_expression )* )
            // nopC.g:180:5: equality_expression ( '&' equality_expression )*
            {
            pushFollow(FOLLOW_equality_expression_in_and_expression771);
            equality_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:180:25: ( '&' equality_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==14) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // nopC.g:180:26: '&' equality_expression
            	    {
            	    match(input,14,FOLLOW_14_in_and_expression774); if (state.failed) return ;

            	    pushFollow(FOLLOW_equality_expression_in_and_expression776);
            	    equality_expression();

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
            if ( state.backtracking>0 ) { memoize(input, 24, and_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "and_expression"



    // $ANTLR start "equality_expression"
    // nopC.g:182:2: equality_expression : relational_expression ( ( '==' | '!=' ) relational_expression )* ;
    public final void equality_expression() throws RecognitionException {
        int equality_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }

            // nopC.g:183:3: ( relational_expression ( ( '==' | '!=' ) relational_expression )* )
            // nopC.g:183:5: relational_expression ( ( '==' | '!=' ) relational_expression )*
            {
            pushFollow(FOLLOW_relational_expression_in_equality_expression791);
            relational_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:183:27: ( ( '==' | '!=' ) relational_expression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==10||LA26_0==36) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // nopC.g:183:28: ( '==' | '!=' ) relational_expression
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


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression800);
            	    relational_expression();

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
            if ( state.backtracking>0 ) { memoize(input, 25, equality_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "equality_expression"



    // $ANTLR start "relational_expression"
    // nopC.g:186:2: relational_expression : shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* ;
    public final void relational_expression() throws RecognitionException {
        int relational_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }

            // nopC.g:187:3: ( shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* )
            // nopC.g:187:5: shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
            {
            pushFollow(FOLLOW_shift_expression_in_relational_expression816);
            shift_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:187:22: ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==31||LA27_0==34||(LA27_0 >= 37 && LA27_0 <= 38)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // nopC.g:187:23: ( '<' | '>' | '<=' | '>=' ) shift_expression
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


            	    pushFollow(FOLLOW_shift_expression_in_relational_expression829);
            	    shift_expression();

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
            if ( state.backtracking>0 ) { memoize(input, 26, relational_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "relational_expression"



    // $ANTLR start "shift_expression"
    // nopC.g:190:2: shift_expression : additive_expression ( ( '<<' | '>>' ) additive_expression )* ;
    public final void shift_expression() throws RecognitionException {
        int shift_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }

            // nopC.g:191:3: ( additive_expression ( ( '<<' | '>>' ) additive_expression )* )
            // nopC.g:191:5: additive_expression ( ( '<<' | '>>' ) additive_expression )*
            {
            pushFollow(FOLLOW_additive_expression_in_shift_expression845);
            additive_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:191:25: ( ( '<<' | '>>' ) additive_expression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==32||LA28_0==39) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // nopC.g:191:26: ( '<<' | '>>' ) additive_expression
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


            	    pushFollow(FOLLOW_additive_expression_in_shift_expression854);
            	    additive_expression();

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
            if ( state.backtracking>0 ) { memoize(input, 27, shift_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "shift_expression"



    // $ANTLR start "additive_expression"
    // nopC.g:194:2: additive_expression : ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* ;
    public final void additive_expression() throws RecognitionException {
        int additive_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }

            // nopC.g:195:3: ( ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* )
            // nopC.g:195:5: ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )*
            {
            // nopC.g:195:5: ( multiplicative_expression )
            // nopC.g:195:6: multiplicative_expression
            {
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression873);
            multiplicative_expression();

            state._fsp--;
            if (state.failed) return ;

            }


            // nopC.g:195:33: ( '+' multiplicative_expression | '-' multiplicative_expression )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    alt29=1;
                }
                else if ( (LA29_0==24) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // nopC.g:195:34: '+' multiplicative_expression
            	    {
            	    match(input,20,FOLLOW_20_in_additive_expression877); if (state.failed) return ;

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression879);
            	    multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:195:66: '-' multiplicative_expression
            	    {
            	    match(input,24,FOLLOW_24_in_additive_expression883); if (state.failed) return ;

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression885);
            	    multiplicative_expression();

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
            if ( state.backtracking>0 ) { memoize(input, 28, additive_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "additive_expression"



    // $ANTLR start "multiplicative_expression"
    // nopC.g:198:2: multiplicative_expression : ( unary_expression ) ( '*' unary_expression | '/' unary_expression | '%' unary_expression )* ;
    public final void multiplicative_expression() throws RecognitionException {
        int multiplicative_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }

            // nopC.g:199:3: ( ( unary_expression ) ( '*' unary_expression | '/' unary_expression | '%' unary_expression )* )
            // nopC.g:199:5: ( unary_expression ) ( '*' unary_expression | '/' unary_expression | '%' unary_expression )*
            {
            // nopC.g:199:5: ( unary_expression )
            // nopC.g:199:6: unary_expression
            {
            pushFollow(FOLLOW_unary_expression_in_multiplicative_expression902);
            unary_expression();

            state._fsp--;
            if (state.failed) return ;

            }


            // nopC.g:199:24: ( '*' unary_expression | '/' unary_expression | '%' unary_expression )*
            loop30:
            do {
                int alt30=4;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt30=1;
                    }
                    break;
                case 27:
                    {
                    alt30=2;
                    }
                    break;
                case 11:
                    {
                    alt30=3;
                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // nopC.g:199:25: '*' unary_expression
            	    {
            	    match(input,18,FOLLOW_18_in_multiplicative_expression906); if (state.failed) return ;

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression908);
            	    unary_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:199:48: '/' unary_expression
            	    {
            	    match(input,27,FOLLOW_27_in_multiplicative_expression912); if (state.failed) return ;

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression914);
            	    unary_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // nopC.g:199:71: '%' unary_expression
            	    {
            	    match(input,11,FOLLOW_11_in_multiplicative_expression918); if (state.failed) return ;

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression920);
            	    unary_expression();

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
            if ( state.backtracking>0 ) { memoize(input, 29, multiplicative_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "multiplicative_expression"



    // $ANTLR start "unary_expression"
    // nopC.g:202:1: unary_expression : ( postfix_expression | '++' unary_expression | '--' unary_expression );
    public final void unary_expression() throws RecognitionException {
        int unary_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }

            // nopC.g:203:2: ( postfix_expression | '++' unary_expression | '--' unary_expression )
            int alt31=3;
            switch ( input.LA(1) ) {
            case NAME:
            case WERT:
            case 16:
                {
                alt31=1;
                }
                break;
            case 21:
                {
                alt31=2;
                }
                break;
            case 25:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // nopC.g:203:4: postfix_expression
                    {
                    pushFollow(FOLLOW_postfix_expression_in_unary_expression934);
                    postfix_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:204:4: '++' unary_expression
                    {
                    match(input,21,FOLLOW_21_in_unary_expression939); if (state.failed) return ;

                    pushFollow(FOLLOW_unary_expression_in_unary_expression941);
                    unary_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // nopC.g:205:4: '--' unary_expression
                    {
                    match(input,25,FOLLOW_25_in_unary_expression946); if (state.failed) return ;

                    pushFollow(FOLLOW_unary_expression_in_unary_expression948);
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
    // nopC.g:208:1: postfix_expression : primary_expression ( '[' expression ']' | '++' | '--' )* ;
    public final void postfix_expression() throws RecognitionException {
        int postfix_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }

            // nopC.g:209:2: ( primary_expression ( '[' expression ']' | '++' | '--' )* )
            // nopC.g:209:6: primary_expression ( '[' expression ']' | '++' | '--' )*
            {
            pushFollow(FOLLOW_primary_expression_in_postfix_expression961);
            primary_expression();

            state._fsp--;
            if (state.failed) return ;

            // nopC.g:210:9: ( '[' expression ']' | '++' | '--' )*
            loop32:
            do {
                int alt32=4;
                switch ( input.LA(1) ) {
                case 42:
                    {
                    alt32=1;
                    }
                    break;
                case 21:
                    {
                    alt32=2;
                    }
                    break;
                case 25:
                    {
                    alt32=3;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // nopC.g:210:13: '[' expression ']'
            	    {
            	    match(input,42,FOLLOW_42_in_postfix_expression975); if (state.failed) return ;

            	    pushFollow(FOLLOW_expression_in_postfix_expression977);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    match(input,43,FOLLOW_43_in_postfix_expression979); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // nopC.g:211:13: '++'
            	    {
            	    match(input,21,FOLLOW_21_in_postfix_expression994); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // nopC.g:212:13: '--'
            	    {
            	    match(input,25,FOLLOW_25_in_postfix_expression1008); if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 31, postfix_expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "postfix_expression"



    // $ANTLR start "primary_expression"
    // nopC.g:216:1: primary_expression : ( NAME | '(' expression ')' | functionCall | WERT );
    public final void primary_expression() throws RecognitionException {
        int primary_expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }

            // nopC.g:217:2: ( NAME | '(' expression ')' | functionCall | WERT )
            int alt33=4;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==16) ) {
                    alt33=3;
                }
                else if ( (LA33_1==EOF||(LA33_1 >= 10 && LA33_1 <= 11)||(LA33_1 >= 13 && LA33_1 <= 14)||(LA33_1 >= 17 && LA33_1 <= 18)||(LA33_1 >= 20 && LA33_1 <= 21)||(LA33_1 >= 23 && LA33_1 <= 25)||LA33_1==27||(LA33_1 >= 29 && LA33_1 <= 32)||LA33_1==34||(LA33_1 >= 36 && LA33_1 <= 39)||(LA33_1 >= 41 && LA33_1 <= 44)||LA33_1==58||LA33_1==60) ) {
                    alt33=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;

                }
                }
                break;
            case 16:
                {
                alt33=2;
                }
                break;
            case WERT:
                {
                alt33=4;
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
                    // nopC.g:217:4: NAME
                    {
                    match(input,NAME,FOLLOW_NAME_in_primary_expression1030); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // nopC.g:219:4: '(' expression ')'
                    {
                    match(input,16,FOLLOW_16_in_primary_expression1036); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_primary_expression1038);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,17,FOLLOW_17_in_primary_expression1040); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // nopC.g:220:4: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primary_expression1045);
                    functionCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // nopC.g:221:4: WERT
                    {
                    match(input,WERT,FOLLOW_WERT_in_primary_expression1050); if (state.failed) return ;

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
    // nopC.g:246:1: typeSpecifier : ( 'int' | 'void' | 'bool' );
    public final void typeSpecifier() throws RecognitionException {
        int typeSpecifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }

            // nopC.g:247:2: ( 'int' | 'void' | 'bool' )
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
        // nopC.g:44:2: ( typeSpecifier NAME ( '=' | ';' | ',' ) )
        // nopC.g:44:3: typeSpecifier NAME ( '=' | ';' | ',' )
        {
        pushFollow(FOLLOW_typeSpecifier_in_synpred4_nopC87);
        typeSpecifier();

        state._fsp--;
        if (state.failed) return ;

        match(input,NAME,FOLLOW_NAME_in_synpred4_nopC89); if (state.failed) return ;

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
        // nopC.g:45:4: ( typeSpecifier NAME '(' )
        // nopC.g:45:5: typeSpecifier NAME '('
        {
        pushFollow(FOLLOW_typeSpecifier_in_synpred5_nopC113);
        typeSpecifier();

        state._fsp--;
        if (state.failed) return ;

        match(input,NAME,FOLLOW_NAME_in_synpred5_nopC115); if (state.failed) return ;

        match(input,16,FOLLOW_16_in_synpred5_nopC118); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_nopC

    // $ANTLR start synpred15_nopC
    public final void synpred15_nopC_fragment() throws RecognitionException {
        // nopC.g:93:5: ( ( functionCall ';' ) )
        // nopC.g:93:5: ( functionCall ';' )
        {
        // nopC.g:93:5: ( functionCall ';' )
        // nopC.g:93:6: functionCall ';'
        {
        pushFollow(FOLLOW_functionCall_in_synpred15_nopC332);
        functionCall();

        state._fsp--;
        if (state.failed) return ;

        match(input,30,FOLLOW_30_in_synpred15_nopC334); if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred15_nopC

    // Delegated rules

    public final boolean synpred15_nopC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_nopC_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_globalFunctionOrStatement_in_cFile72 = new BitSet(new long[]{0x00A0400000000002L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_globalFunctionOrStatement106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_globalFunctionOrStatement123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_globalVariableDeclaration136 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_globalVariableDeclarationList_in_globalVariableDeclaration138 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_globalVariableDeclaration140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_globalVariableDeclarationList160 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_globalVariableDeclarationList163 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WERT_in_globalVariableDeclarationList165 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_globalVariableDeclarationList170 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_globalVariableDeclarationList172 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_globalVariableDeclarationList175 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WERT_in_globalVariableDeclarationList177 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_typeSpecifier_in_variableDeclaration198 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_variableDeclarationList_in_variableDeclaration200 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_variableDeclaration202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_variableDeclarationList217 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_variableDeclarationList220 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_variableDeclarationList222 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_variableDeclarationList227 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_variableDeclarationList229 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_35_in_variableDeclarationList232 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_variableDeclarationList234 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_typeSpecifier_in_functionDefinition255 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_functionDefinition257 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDefinition259 = new BitSet(new long[]{0x00A0400000020000L});
    public static final BitSet FOLLOW_parameterList_in_functionDefinition261 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionDefinition263 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_functionDefinition265 = new BitSet(new long[]{0x21FDC00042210180L});
    public static final BitSet FOLLOW_codeBlock_in_functionDefinition267 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_functionDefinition269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_parameterList289 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_parameterList291 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_parameterList294 = new BitSet(new long[]{0x00A0400000000000L});
    public static final BitSet FOLLOW_typeSpecifier_in_parameterList296 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_parameterList298 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_statement_in_codeBlock314 = new BitSet(new long[]{0x01FDC00042210182L});
    public static final BitSet FOLLOW_functionCall_in_statement332 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement343 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_statement353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_selection_statement394 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_selection_statement396 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_selection_statement398 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_selection_statement400 = new BitSet(new long[]{0x01FDC00042210180L});
    public static final BitSet FOLLOW_statement_in_selection_statement402 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_selection_statement417 = new BitSet(new long[]{0x01FDC00042210180L});
    public static final BitSet FOLLOW_statement_in_selection_statement419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_iteration_statement432 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_iteration_statement434 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_iteration_statement436 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_iteration_statement438 = new BitSet(new long[]{0x01FDC00042210180L});
    public static final BitSet FOLLOW_statement_in_iteration_statement440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_iteration_statement445 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_iteration_statement447 = new BitSet(new long[]{0x0000000042210180L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement449 = new BitSet(new long[]{0x0000000042210180L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement451 = new BitSet(new long[]{0x0000000002230180L});
    public static final BitSet FOLLOW_expression_in_iteration_statement453 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_iteration_statement456 = new BitSet(new long[]{0x01FDC00042210180L});
    public static final BitSet FOLLOW_statement_in_iteration_statement458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_expression_statement470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement475 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_expression_statement477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_jump_statement488 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_jump_statement490 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_jump_statement497 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_jump_statement504 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_jump_statement511 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_jump_statement518 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_jump_statement520 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_jump_statement522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_functionCall535 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionCall537 = new BitSet(new long[]{0x0000000000820080L});
    public static final BitSet FOLLOW_variableList_in_functionCall539 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionCall541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_variableList560 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_variableList564 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_variableList566 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_NAME_in_assignment582 = new BitSet(new long[]{0x0800210A14489000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignment584 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_assignment586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_expression662 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_expression665 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_expression667 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_expression669 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_expression671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression687 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_logical_or_expression690 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression692 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression708 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_logical_and_expression711 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression713 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression729 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_inclusive_or_expression732 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression734 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression750 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_exclusive_or_expression753 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression755 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression771 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_and_expression774 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression776 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression791 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_set_in_equality_expression794 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression800 = new BitSet(new long[]{0x0000001000000402L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression816 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_set_in_relational_expression819 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression829 = new BitSet(new long[]{0x0000006480000002L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression845 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_set_in_shift_expression848 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression854 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression873 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_20_in_additive_expression877 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression879 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_24_in_additive_expression883 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression885 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression902 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_18_in_multiplicative_expression906 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression908 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_27_in_multiplicative_expression912 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression914 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_11_in_multiplicative_expression918 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression920 = new BitSet(new long[]{0x0000000008040802L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_unary_expression939 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_unary_expression946 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression961 = new BitSet(new long[]{0x0000040002200002L});
    public static final BitSet FOLLOW_42_in_postfix_expression975 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_postfix_expression977 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_postfix_expression979 = new BitSet(new long[]{0x0000040002200002L});
    public static final BitSet FOLLOW_21_in_postfix_expression994 = new BitSet(new long[]{0x0000040002200002L});
    public static final BitSet FOLLOW_25_in_postfix_expression1008 = new BitSet(new long[]{0x0000040002200002L});
    public static final BitSet FOLLOW_NAME_in_primary_expression1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_primary_expression1036 = new BitSet(new long[]{0x0000000002210180L});
    public static final BitSet FOLLOW_expression_in_primary_expression1038 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_primary_expression1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primary_expression1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WERT_in_primary_expression1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_synpred4_nopC87 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_synpred4_nopC89 = new BitSet(new long[]{0x0000000840800000L});
    public static final BitSet FOLLOW_set_in_synpred4_nopC91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_synpred5_nopC113 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NAME_in_synpred5_nopC115 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred5_nopC118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_synpred15_nopC332 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred15_nopC334 = new BitSet(new long[]{0x0000000000000002L});

}
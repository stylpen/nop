// $ANTLR 3.4 /Users/alexander/Code/nop/nopC.g 2012-05-11 12:17:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class nopCLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public nopCLexer() {} 
    public nopCLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public nopCLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/alexander/Code/nop/nopC.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:2:7: ( '!=' )
            // /Users/alexander/Code/nop/nopC.g:2:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:3:7: ( '%' )
            // /Users/alexander/Code/nop/nopC.g:3:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:4:7: ( '%=' )
            // /Users/alexander/Code/nop/nopC.g:4:9: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:5:7: ( '&&' )
            // /Users/alexander/Code/nop/nopC.g:5:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:6:7: ( '&' )
            // /Users/alexander/Code/nop/nopC.g:6:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:7:7: ( '&=' )
            // /Users/alexander/Code/nop/nopC.g:7:9: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:8:7: ( '(' )
            // /Users/alexander/Code/nop/nopC.g:8:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:9:7: ( ')' )
            // /Users/alexander/Code/nop/nopC.g:9:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:10:7: ( '*' )
            // /Users/alexander/Code/nop/nopC.g:10:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:11:7: ( '*=' )
            // /Users/alexander/Code/nop/nopC.g:11:9: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:12:7: ( '+' )
            // /Users/alexander/Code/nop/nopC.g:12:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:13:7: ( '++' )
            // /Users/alexander/Code/nop/nopC.g:13:9: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:14:7: ( '+=' )
            // /Users/alexander/Code/nop/nopC.g:14:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:15:7: ( ',' )
            // /Users/alexander/Code/nop/nopC.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:16:7: ( '-' )
            // /Users/alexander/Code/nop/nopC.g:16:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:17:7: ( '--' )
            // /Users/alexander/Code/nop/nopC.g:17:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:18:7: ( '-=' )
            // /Users/alexander/Code/nop/nopC.g:18:9: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:19:7: ( '/' )
            // /Users/alexander/Code/nop/nopC.g:19:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:20:7: ( '/=' )
            // /Users/alexander/Code/nop/nopC.g:20:9: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:21:7: ( ':' )
            // /Users/alexander/Code/nop/nopC.g:21:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:22:7: ( ';' )
            // /Users/alexander/Code/nop/nopC.g:22:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:23:7: ( '<' )
            // /Users/alexander/Code/nop/nopC.g:23:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:24:7: ( '<<' )
            // /Users/alexander/Code/nop/nopC.g:24:9: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:25:7: ( '<<=' )
            // /Users/alexander/Code/nop/nopC.g:25:9: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:26:7: ( '<=' )
            // /Users/alexander/Code/nop/nopC.g:26:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:27:7: ( '=' )
            // /Users/alexander/Code/nop/nopC.g:27:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:28:7: ( '==' )
            // /Users/alexander/Code/nop/nopC.g:28:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:29:7: ( '>' )
            // /Users/alexander/Code/nop/nopC.g:29:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:30:7: ( '>=' )
            // /Users/alexander/Code/nop/nopC.g:30:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:31:7: ( '>>' )
            // /Users/alexander/Code/nop/nopC.g:31:9: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:32:7: ( '>>=' )
            // /Users/alexander/Code/nop/nopC.g:32:9: '>>='
            {
            match(">>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:33:7: ( '?' )
            // /Users/alexander/Code/nop/nopC.g:33:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:34:7: ( '[' )
            // /Users/alexander/Code/nop/nopC.g:34:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:35:7: ( ']' )
            // /Users/alexander/Code/nop/nopC.g:35:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:36:7: ( '^' )
            // /Users/alexander/Code/nop/nopC.g:36:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:37:7: ( '^=' )
            // /Users/alexander/Code/nop/nopC.g:37:9: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:38:7: ( 'bool' )
            // /Users/alexander/Code/nop/nopC.g:38:9: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:39:7: ( 'break' )
            // /Users/alexander/Code/nop/nopC.g:39:9: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:40:7: ( 'continue' )
            // /Users/alexander/Code/nop/nopC.g:40:9: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:41:7: ( 'else' )
            // /Users/alexander/Code/nop/nopC.g:41:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:42:7: ( 'for' )
            // /Users/alexander/Code/nop/nopC.g:42:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:43:7: ( 'goto' )
            // /Users/alexander/Code/nop/nopC.g:43:9: 'goto'
            {
            match("goto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:44:7: ( 'if' )
            // /Users/alexander/Code/nop/nopC.g:44:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:45:7: ( 'int' )
            // /Users/alexander/Code/nop/nopC.g:45:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:46:7: ( 'return' )
            // /Users/alexander/Code/nop/nopC.g:46:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:47:7: ( 'void' )
            // /Users/alexander/Code/nop/nopC.g:47:9: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:48:7: ( 'while' )
            // /Users/alexander/Code/nop/nopC.g:48:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:49:7: ( '{' )
            // /Users/alexander/Code/nop/nopC.g:49:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:50:7: ( '|' )
            // /Users/alexander/Code/nop/nopC.g:50:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:51:7: ( '|=' )
            // /Users/alexander/Code/nop/nopC.g:51:9: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:52:7: ( '||' )
            // /Users/alexander/Code/nop/nopC.g:52:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:53:7: ( '}' )
            // /Users/alexander/Code/nop/nopC.g:53:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "WERT"
    public final void mWERT() throws RecognitionException {
        try {
            int _type = WERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:221:2: ( ( '0' .. '9' )+ )
            // /Users/alexander/Code/nop/nopC.g:222:3: ( '0' .. '9' )+
            {
            // /Users/alexander/Code/nop/nopC.g:222:3: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/alexander/Code/nop/nopC.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WERT"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:226:2: ( LETTER ( LETTER | '0' .. '9' )* )
            // /Users/alexander/Code/nop/nopC.g:227:2: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 


            // /Users/alexander/Code/nop/nopC.g:227:9: ( LETTER | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='$'||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/alexander/Code/nop/nopC.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /Users/alexander/Code/nop/nopC.g:233:2: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // /Users/alexander/Code/nop/nopC.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:248:3: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // /Users/alexander/Code/nop/nopC.g:248:4: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:251:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/alexander/Code/nop/nopC.g:251:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // /Users/alexander/Code/nop/nopC.g:251:14: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1 >= '\u0000' && LA3_1 <= '.')||(LA3_1 >= '0' && LA3_1 <= '\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= ')')||(LA3_0 >= '+' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/alexander/Code/nop/nopC.g:251:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/alexander/Code/nop/nopC.g:255:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /Users/alexander/Code/nop/nopC.g:255:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // /Users/alexander/Code/nop/nopC.g:255:12: (~ ( '\\n' | '\\r' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/alexander/Code/nop/nopC.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // /Users/alexander/Code/nop/nopC.g:255:26: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/alexander/Code/nop/nopC.g:255:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // /Users/alexander/Code/nop/nopC.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | WERT | NAME | WS | COMMENT | LINE_COMMENT )
        int alt6=57;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /Users/alexander/Code/nop/nopC.g:1:10: T__10
                {
                mT__10(); 


                }
                break;
            case 2 :
                // /Users/alexander/Code/nop/nopC.g:1:16: T__11
                {
                mT__11(); 


                }
                break;
            case 3 :
                // /Users/alexander/Code/nop/nopC.g:1:22: T__12
                {
                mT__12(); 


                }
                break;
            case 4 :
                // /Users/alexander/Code/nop/nopC.g:1:28: T__13
                {
                mT__13(); 


                }
                break;
            case 5 :
                // /Users/alexander/Code/nop/nopC.g:1:34: T__14
                {
                mT__14(); 


                }
                break;
            case 6 :
                // /Users/alexander/Code/nop/nopC.g:1:40: T__15
                {
                mT__15(); 


                }
                break;
            case 7 :
                // /Users/alexander/Code/nop/nopC.g:1:46: T__16
                {
                mT__16(); 


                }
                break;
            case 8 :
                // /Users/alexander/Code/nop/nopC.g:1:52: T__17
                {
                mT__17(); 


                }
                break;
            case 9 :
                // /Users/alexander/Code/nop/nopC.g:1:58: T__18
                {
                mT__18(); 


                }
                break;
            case 10 :
                // /Users/alexander/Code/nop/nopC.g:1:64: T__19
                {
                mT__19(); 


                }
                break;
            case 11 :
                // /Users/alexander/Code/nop/nopC.g:1:70: T__20
                {
                mT__20(); 


                }
                break;
            case 12 :
                // /Users/alexander/Code/nop/nopC.g:1:76: T__21
                {
                mT__21(); 


                }
                break;
            case 13 :
                // /Users/alexander/Code/nop/nopC.g:1:82: T__22
                {
                mT__22(); 


                }
                break;
            case 14 :
                // /Users/alexander/Code/nop/nopC.g:1:88: T__23
                {
                mT__23(); 


                }
                break;
            case 15 :
                // /Users/alexander/Code/nop/nopC.g:1:94: T__24
                {
                mT__24(); 


                }
                break;
            case 16 :
                // /Users/alexander/Code/nop/nopC.g:1:100: T__25
                {
                mT__25(); 


                }
                break;
            case 17 :
                // /Users/alexander/Code/nop/nopC.g:1:106: T__26
                {
                mT__26(); 


                }
                break;
            case 18 :
                // /Users/alexander/Code/nop/nopC.g:1:112: T__27
                {
                mT__27(); 


                }
                break;
            case 19 :
                // /Users/alexander/Code/nop/nopC.g:1:118: T__28
                {
                mT__28(); 


                }
                break;
            case 20 :
                // /Users/alexander/Code/nop/nopC.g:1:124: T__29
                {
                mT__29(); 


                }
                break;
            case 21 :
                // /Users/alexander/Code/nop/nopC.g:1:130: T__30
                {
                mT__30(); 


                }
                break;
            case 22 :
                // /Users/alexander/Code/nop/nopC.g:1:136: T__31
                {
                mT__31(); 


                }
                break;
            case 23 :
                // /Users/alexander/Code/nop/nopC.g:1:142: T__32
                {
                mT__32(); 


                }
                break;
            case 24 :
                // /Users/alexander/Code/nop/nopC.g:1:148: T__33
                {
                mT__33(); 


                }
                break;
            case 25 :
                // /Users/alexander/Code/nop/nopC.g:1:154: T__34
                {
                mT__34(); 


                }
                break;
            case 26 :
                // /Users/alexander/Code/nop/nopC.g:1:160: T__35
                {
                mT__35(); 


                }
                break;
            case 27 :
                // /Users/alexander/Code/nop/nopC.g:1:166: T__36
                {
                mT__36(); 


                }
                break;
            case 28 :
                // /Users/alexander/Code/nop/nopC.g:1:172: T__37
                {
                mT__37(); 


                }
                break;
            case 29 :
                // /Users/alexander/Code/nop/nopC.g:1:178: T__38
                {
                mT__38(); 


                }
                break;
            case 30 :
                // /Users/alexander/Code/nop/nopC.g:1:184: T__39
                {
                mT__39(); 


                }
                break;
            case 31 :
                // /Users/alexander/Code/nop/nopC.g:1:190: T__40
                {
                mT__40(); 


                }
                break;
            case 32 :
                // /Users/alexander/Code/nop/nopC.g:1:196: T__41
                {
                mT__41(); 


                }
                break;
            case 33 :
                // /Users/alexander/Code/nop/nopC.g:1:202: T__42
                {
                mT__42(); 


                }
                break;
            case 34 :
                // /Users/alexander/Code/nop/nopC.g:1:208: T__43
                {
                mT__43(); 


                }
                break;
            case 35 :
                // /Users/alexander/Code/nop/nopC.g:1:214: T__44
                {
                mT__44(); 


                }
                break;
            case 36 :
                // /Users/alexander/Code/nop/nopC.g:1:220: T__45
                {
                mT__45(); 


                }
                break;
            case 37 :
                // /Users/alexander/Code/nop/nopC.g:1:226: T__46
                {
                mT__46(); 


                }
                break;
            case 38 :
                // /Users/alexander/Code/nop/nopC.g:1:232: T__47
                {
                mT__47(); 


                }
                break;
            case 39 :
                // /Users/alexander/Code/nop/nopC.g:1:238: T__48
                {
                mT__48(); 


                }
                break;
            case 40 :
                // /Users/alexander/Code/nop/nopC.g:1:244: T__49
                {
                mT__49(); 


                }
                break;
            case 41 :
                // /Users/alexander/Code/nop/nopC.g:1:250: T__50
                {
                mT__50(); 


                }
                break;
            case 42 :
                // /Users/alexander/Code/nop/nopC.g:1:256: T__51
                {
                mT__51(); 


                }
                break;
            case 43 :
                // /Users/alexander/Code/nop/nopC.g:1:262: T__52
                {
                mT__52(); 


                }
                break;
            case 44 :
                // /Users/alexander/Code/nop/nopC.g:1:268: T__53
                {
                mT__53(); 


                }
                break;
            case 45 :
                // /Users/alexander/Code/nop/nopC.g:1:274: T__54
                {
                mT__54(); 


                }
                break;
            case 46 :
                // /Users/alexander/Code/nop/nopC.g:1:280: T__55
                {
                mT__55(); 


                }
                break;
            case 47 :
                // /Users/alexander/Code/nop/nopC.g:1:286: T__56
                {
                mT__56(); 


                }
                break;
            case 48 :
                // /Users/alexander/Code/nop/nopC.g:1:292: T__57
                {
                mT__57(); 


                }
                break;
            case 49 :
                // /Users/alexander/Code/nop/nopC.g:1:298: T__58
                {
                mT__58(); 


                }
                break;
            case 50 :
                // /Users/alexander/Code/nop/nopC.g:1:304: T__59
                {
                mT__59(); 


                }
                break;
            case 51 :
                // /Users/alexander/Code/nop/nopC.g:1:310: T__60
                {
                mT__60(); 


                }
                break;
            case 52 :
                // /Users/alexander/Code/nop/nopC.g:1:316: T__61
                {
                mT__61(); 


                }
                break;
            case 53 :
                // /Users/alexander/Code/nop/nopC.g:1:322: WERT
                {
                mWERT(); 


                }
                break;
            case 54 :
                // /Users/alexander/Code/nop/nopC.g:1:327: NAME
                {
                mNAME(); 


                }
                break;
            case 55 :
                // /Users/alexander/Code/nop/nopC.g:1:332: WS
                {
                mWS(); 


                }
                break;
            case 56 :
                // /Users/alexander/Code/nop/nopC.g:1:335: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 57 :
                // /Users/alexander/Code/nop/nopC.g:1:343: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\2\uffff\1\44\1\47\2\uffff\1\51\1\54\1\uffff\1\57\1\63\2\uffff\1"+
        "\66\1\70\1\73\3\uffff\1\75\11\41\1\uffff\1\113\25\uffff\1\115\5"+
        "\uffff\1\117\3\uffff\6\41\1\126\4\41\7\uffff\4\41\1\137\1\41\1\uffff"+
        "\1\141\3\41\1\145\2\41\1\150\1\uffff\1\151\1\uffff\1\41\1\153\1"+
        "\41\1\uffff\1\155\1\41\2\uffff\1\41\1\uffff\1\160\1\uffff\1\41\1"+
        "\162\1\uffff\1\41\1\uffff\1\164\1\uffff";
    static final String DFA6_eofS =
        "\165\uffff";
    static final String DFA6_minS =
        "\1\11\1\uffff\1\75\1\46\2\uffff\1\75\1\53\1\uffff\1\55\1\52\2\uffff"+
        "\1\74\2\75\3\uffff\1\75\2\157\1\154\2\157\1\146\1\145\1\157\1\150"+
        "\1\uffff\1\75\25\uffff\1\75\5\uffff\1\75\3\uffff\1\157\1\145\1\156"+
        "\1\163\1\162\1\164\1\44\2\164\2\151\7\uffff\1\154\1\141\1\164\1"+
        "\145\1\44\1\157\1\uffff\1\44\1\165\1\144\1\154\1\44\1\153\1\151"+
        "\1\44\1\uffff\1\44\1\uffff\1\162\1\44\1\145\1\uffff\1\44\1\156\2"+
        "\uffff\1\156\1\uffff\1\44\1\uffff\1\165\1\44\1\uffff\1\145\1\uffff"+
        "\1\44\1\uffff";
    static final String DFA6_maxS =
        "\1\175\1\uffff\2\75\2\uffff\2\75\1\uffff\2\75\2\uffff\2\75\1\76"+
        "\3\uffff\1\75\1\162\1\157\1\154\2\157\1\156\1\145\1\157\1\150\1"+
        "\uffff\1\174\25\uffff\1\75\5\uffff\1\75\3\uffff\1\157\1\145\1\156"+
        "\1\163\1\162\1\164\1\172\2\164\2\151\7\uffff\1\154\1\141\1\164\1"+
        "\145\1\172\1\157\1\uffff\1\172\1\165\1\144\1\154\1\172\1\153\1\151"+
        "\1\172\1\uffff\1\172\1\uffff\1\162\1\172\1\145\1\uffff\1\172\1\156"+
        "\2\uffff\1\156\1\uffff\1\172\1\uffff\1\165\1\172\1\uffff\1\145\1"+
        "\uffff\1\172\1\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\2\uffff\1\7\1\10\2\uffff\1\16\2\uffff\1\24\1\25\3\uffff"+
        "\1\40\1\41\1\42\12\uffff\1\60\1\uffff\1\64\1\65\1\66\1\67\1\3\1"+
        "\2\1\4\1\6\1\5\1\12\1\11\1\14\1\15\1\13\1\20\1\21\1\17\1\23\1\70"+
        "\1\71\1\22\1\uffff\1\31\1\26\1\33\1\32\1\35\1\uffff\1\34\1\44\1"+
        "\43\13\uffff\1\62\1\63\1\61\1\30\1\27\1\37\1\36\6\uffff\1\53\10"+
        "\uffff\1\51\1\uffff\1\54\3\uffff\1\45\2\uffff\1\50\1\52\1\uffff"+
        "\1\56\1\uffff\1\46\2\uffff\1\57\1\uffff\1\55\1\uffff\1\47";
    static final String DFA6_specialS =
        "\165\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\1\1\2\uffff\1\41\1\2\1\3\1"+
            "\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\12\40\1\13\1\14"+
            "\1\15\1\16\1\17\1\20\1\uffff\32\41\1\21\1\uffff\1\22\1\23\1"+
            "\41\1\uffff\1\41\1\24\1\25\1\41\1\26\1\27\1\30\1\41\1\31\10"+
            "\41\1\32\3\41\1\33\1\34\3\41\1\35\1\36\1\37",
            "",
            "\1\43",
            "\1\45\26\uffff\1\46",
            "",
            "",
            "\1\50",
            "\1\52\21\uffff\1\53",
            "",
            "\1\55\17\uffff\1\56",
            "\1\61\4\uffff\1\62\15\uffff\1\60",
            "",
            "",
            "\1\64\1\65",
            "\1\67",
            "\1\71\1\72",
            "",
            "",
            "",
            "\1\74",
            "\1\76\2\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104\7\uffff\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\111\76\uffff\1\112",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\114",
            "",
            "",
            "",
            "",
            "",
            "\1\116",
            "",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\140",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\146",
            "\1\147",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "\1\152",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\154",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\156",
            "",
            "",
            "\1\157",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "\1\161",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "\1\163",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | WERT | NAME | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}
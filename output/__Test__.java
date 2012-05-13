import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        nopCLexer lex = new nopCLexer(new ANTLRFileStream("/home/stephan/workspace/nop/main.c", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        nopCParser g = new nopCParser(tokens, 49100, null);
        try {
            g.cFile();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}
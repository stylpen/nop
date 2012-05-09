import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        nopCLexer lex = new nopCLexer(new ANTLRFileStream("/Users/alexander/Dropbox/Uni/Semester4/FLA/NOP/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        nopCParser g = new nopCParser(tokens, 49100, null);
        try {
            g.cFile();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}
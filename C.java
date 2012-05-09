import org.antlr.runtime.*;

public class C 
{
  public static void main(String[] args) throws Exception 
  {
    ANTLRInputStream input = new ANTLRInputStream(System.in);
    nopCLexer lexer = new nopCLexer(input);
    CommonTokenStream ts = new CommonTokenStream(lexer);
    nopCParser parser = new nopCParser(ts);
    parser.cFile();
  }
}


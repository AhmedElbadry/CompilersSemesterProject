import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import java.io.File;
import java.io.FileInputStream;

public class Parse {

    public static void main(String[] args) throws Exception {

        String TestCaseFile = args[0];
        FileInputStream fis = new FileInputStream(new File(TestCaseFile));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        CoolLexer lexer = new CoolLexer(input);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        CoolParser parser = new CoolParser(tokenStream);


        System.out.println(parser.getRuleContext() );
        System.out.println(parser.getCurrentToken());
        parser.consume();

    }
}

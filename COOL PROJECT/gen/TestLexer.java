import java.io.File;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

public class TestLexer {

    public static void main(String[] args) throws Exception {
        System.out.println("Parsing: " + args[0]);

        FileInputStream fis = new FileInputStream(new File(args[0]));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        CoolLexer lexer = new CoolLexer(input);

        Token token = lexer.nextToken();
        while (token.getType() != CoolLexer.EOF) {
            System.out.println("\t" + getTokenType(token.getType()) + "\t\t"
                    + token.getText() + "  " + token.getLine());
            token = lexer.nextToken();
        }
    }

    private static String getTokenType(int tokenType) {

        switch (tokenType) {
            case CoolLexer.DOT:
                return "DOT";
            case CoolLexer.OBJECTID:
                return "OBJECTID";
            case CoolLexer.TYPEID:
                return "TYPEID";

            case CoolLexer.SEMICOLON:
                return "SEMICOLON";
            case CoolLexer.RBRACE:
                return "RBRACE";

            case CoolLexer.LBRACE:
                return "LBRACE";
            default:
                return "Error";
        }

    }
}
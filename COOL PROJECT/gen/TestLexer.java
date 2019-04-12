import java.io.*;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

public class TestLexer {
    public static String arr[]=new String[100];
    public static int i=1;
    public static void main(String[] args) throws Exception {
        System.out.println("Parsing: " + args[0]);

        FileInputStream fis = new FileInputStream(new File(args[0]));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        CoolLexer lexer = new CoolLexer(input);

        Token token = lexer.nextToken();


        //FileInputStream tokensFile = new FileInputStream(new File("CoolLexer.tokens"));
        String line = null;
        FileReader tokensFile =
                new FileReader("CoolLexer.tokens");

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader =
                new BufferedReader(tokensFile);

        while((line = bufferedReader.readLine()) != null) {
            if(line.charAt(0) == '\'') break;
            arr[i]=line.substring(0, line.indexOf('='));
            //System.out.println(arr[i]);
            i++;

        }

        // Always close files.
        bufferedReader.close();


        while (token.getType() != CoolLexer.EOF) {
            System.out.println("\t" + getTokenType(token.getType()) + "\t\t"
                    /*+ token.getText() + "  " + token.getLine()*/);
            token = lexer.nextToken();
        }





    }

    private static String getTokenType(int tokenType) {
        //System.out.println(tokenType + ' ' + i);
        if(tokenType < i){
            return arr[tokenType];
        }else{
            return  "Error";
        }


/*
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
                return "others";
        }
        */

    }
}
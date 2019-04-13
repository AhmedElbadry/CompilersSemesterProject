import java.io.*;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import java.util.*;

public class TestLexer {
    public static String arr[] = new String[100];
    public static int i = 1;
    public static boolean err = false;
    public static BufferedWriter writer ;

    public static void main(String[] args) throws Exception {
        //System.out.println("Parsing: " + args[0]);

        File file = new File("good.cl-lex.txt");
        file.delete();

        writer = new BufferedWriter(new FileWriter("good.cl-lex.txt", true));

        FileInputStream fis = new FileInputStream(new File(args[0]));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        CoolLexer lexer = new CoolLexer(input);

        FileReader tokensFile = new FileReader("CoolLexer.tokens");

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(tokensFile);

        String line = bufferedReader.readLine();
        while(line != null && line.charAt(0) != '\''){
            arr[i]=line.substring(0, line.indexOf('='));
            i++;
            line = bufferedReader.readLine();
        }

        // Always close files.
        bufferedReader.close();

        /*List xx = lexer.getAllTokens();
        for(Object it : xx) {
            System.out.println(it + "here");
        }*/

        Token token = lexer.nextToken();
        //System.out.println(token.getType());
        while (token.getType() != CoolLexer.EOF) {
            System.out.println(getTokenType(token));
            token = lexer.nextToken();
        }

        writer.close();
    }

    private static String getTokenType(Token token)throws Exception {
        String str;

        if(token.getType() == 2){ // 2 is the INVALID tag in .token files because there is a problem in comparing strings
            err = true;
            str = ("ERROR: " + Integer.toString(token.getLine()) + " : lexer: invalid character: "
                    + token.getText() + '\n');
        }else{
            str = (Integer.toString(token.getLine()) + " : lexer: " + arr[token.getType()] + '\n');
        }

        writer.append(str);
        return  str;
    }
}
import java.io.*;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

public class Lex {
    public static String arr[] = new String[100];
    public static int i = 1, err = 0;
    public static BufferedWriter writer ;

    public static void main(String[] args) throws Exception {
        String TestCaseFile = "Test Cases/" + args[0];
        String OutputFile = "Output/" + args[0] + "-lex";

        File file = new File(OutputFile);
        file.delete();

        writer = new BufferedWriter(new FileWriter(OutputFile, true));

        FileInputStream fis = new FileInputStream(new File(TestCaseFile));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        CoolLexer lexer = new CoolLexer(input);

        FileReader tokensFile = new FileReader("gen/CoolLexer.tokens");
        BufferedReader bufferedReader = new BufferedReader(tokensFile);

        String line = bufferedReader.readLine();
        while(line != null && line.charAt(0) != '\''){
            arr[i]=line.substring(0, line.indexOf('='));
            i++;
            line = bufferedReader.readLine();
        }

        bufferedReader.close();

        /*List xx = lexer.getAllTokens();
        for(Object it : xx) {
            System.out.println(it + "here");
        }*/

        Token token = lexer.nextToken();
        while (token.getType() != CoolLexer.EOF) {
            System.out.println(getTokenType(token));
            token = lexer.nextToken();
        }

        System.out.println("\nThis file contains " + err + " Errors!");
        writer.close();
    }

    private static String getTokenType(Token token)throws Exception {
        String str;

        if(token.getType() == i-1){ // i-1 is the last token tag in .tokens file which refers to the INVALID token
            err++;
            str = ("ERROR: " + Integer.toString(token.getLine()) + ": Lexer: invalid character: "
                    + token.getText());
        }else{
            str = (Integer.toString(token.getLine()) + ": lexer: " + arr[token.getType()] + ": " + token.getText());
        }

        writer.append(str + "\n");
        return  str;
    }
}
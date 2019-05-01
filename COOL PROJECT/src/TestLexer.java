import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

public class TestLexer {
    public static String arr[] = new String[100];
    public static int i = 1;
    public static boolean err = false;
    public static BufferedWriter writer ;

    public static void main(String[] args) throws Exception {
        String TestCaseFile = "Test Cases/" + args[0];
        String OutputFile = "Output/" + args[0] + "-lex";

        File file = new File(OutputFile);
        file.delete();

        writer = new BufferedWriter(new FileWriter(OutputFile, true));

        FileInputStream fis = new FileInputStream(new File(TestCaseFile));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        Lex lexer = new Lex(input);

        FileReader tokensFile = new FileReader("gen/Lex.tokens");
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
            System.out.println(it);
        }*/

        Token token = lexer.nextToken();
        while (!err && token.getType() != Lex.EOF) {
            getTokenType(token);
            token = lexer.nextToken();
        }

        writer.close();

        if(err){
            file = new File(OutputFile);
            file.delete();
        }
        else{
            System.out.println("Phase 1: Lexer: Done!");
        }
    }

    private static void getTokenType(Token token)throws Exception {
        String str;

        if(token.getType() == i-1){ // i-1 is the last token tag in .tokens file which refers to the INVALID token
            err = true;
            str = ("ERROR: " + token.getLine() + ": Lexer: invalid character: " + token.getText());
            System.out.println(str);
        }else{
            str = (token.getLine() + "\n" + arr[token.getType()] + "\n" + token.getText() + "\n");
            writer.append(str);
        }
    }
}
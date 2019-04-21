import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.Token;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.*;

public class Parse {

    public static List<Token> tokenList;
    public static String intToStrToken[] = new String[100];
    public static HashMap<String, Integer> strToIntToken = new HashMap();


    public static void main(String[] args) throws Exception {


        String TestCaseFile = "Test Cases/" + args[0];
        FileInputStream fis = new FileInputStream(new File(TestCaseFile));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        CoolLexer lexer = new CoolLexer(input);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        CoolParser parser = new CoolParser(tokenStream);


        System.out.println(parser.getRuleContext() );
        System.out.println(parser.getCurrentToken());


        //parser.consume();

        /*

        //load all tokens from CoolLexer.tokens
        loadTokens();

        //get the token from the .cl-lex input file
        getAllTokens("Output/" + args[0]);

        System.out.println(tokenList);

*/


        /*
        FileReader lexFile = new FileReader("Output/" + args[0]);
        BufferedReader lexFile__bufferedReader = new BufferedReader(lexFile);

        String line = lexFile__bufferedReader.readLine();
        int lineNum = 1;
        int currTokenType;
        String currTokenText;
        while(line != null && line.charAt(0) != '\''){

            System.out.println(lineNum + ": " + line);

            if(lineNum == 1){

            }else if(lineNum == 2){

            }else{

                lineNum = 0;
            }
            line = lexFile__bufferedReader.readLine();
            lineNum++;
        }

        lexFile__bufferedReader.close();


         */




    }

    private static void getAllTokens(String filePath) throws Exception{
        FileReader lexFile = new FileReader(filePath);
        BufferedReader lexFile__bufferedReader = new BufferedReader(lexFile);

        String line = lexFile__bufferedReader.readLine();
        int lineNum = 1;
        int currTokenType = 0;
        String currTokenText;
        //TokenFactory tokenFactory;
        while(line != null && line.charAt(0) != '\''){

            //System.out.println(lineNum + ": " + line);

            if(lineNum == 1){

            }else if(lineNum == 2){
                currTokenType = strToIntToken.get(line);
            }else{
                currTokenText = line;
                //tokenList.add(tokenFactory.create(currTokenType, currTokenText));
                lineNum = 0;
            }
            line = lexFile__bufferedReader.readLine();
            lineNum++;
        }

        lexFile__bufferedReader.close();
        loadTokens();

    }

    private static void loadTokens() throws Exception {
        FileReader tokensFile = new FileReader("gen/CoolLexer.tokens");
        BufferedReader bufferedReader = new BufferedReader(tokensFile);

        String line = bufferedReader.readLine();
        int i = 1;
        while(line != null && line.charAt(0) != '\''){
            intToStrToken[i]=line.substring(0, line.indexOf('='));

            strToIntToken.put(line.substring(0, line.indexOf('=')), i);

            i++;
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }


}

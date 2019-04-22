import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.pattern.ParseTreeMatch;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.*;

public class Parse {

    public static List<Token> tokenList = new ArrayList();
    public static String intToStrToken[] = new String[100];
    public static HashMap<String, Integer> strToIntToken = new HashMap();


    public static void main(String[] args) throws Exception {




        String TestCaseFile = "Test Cases/" + args[0];
        FileInputStream fis = new FileInputStream(new File(TestCaseFile));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        CoolLexer lexer = new CoolLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        CoolParser parser = new CoolParser(tokenStream);

        //CoolParser parser = new UnbufferedTokenStream<CommonToken>(lex);

        //parser.setBuildParseTree(true);
        //System.out.println(parser.getBuildParseTree());
        //parser.file();

        ParseTree tree = parser.program();
        System.out.println("ENDDDDD");
        System.out.println(tree.getPayload().toStringTree(parser));

        /*ParseTree t = parser.program();
        ParseTreePattern p = parser.compileParseTreePattern("<ID>+0", CoolParser.RULE_program);
        ParseTreeMatch m = p.match(t);
        //String id = m.get("ID");
*/

        //System.out.println(parser.getRuleContext() );
        //System.out.println(parser.getCurrentToken());

        //parser.consume();

/*

        //load all tokens from CoolLexer.tokens
        loadTokens();

        //get the token from the .cl-lex input file

        getAllTokens("Output/" + args[0]);



        //CommonTokenStream t = new CommonTokenStream(tokenList);

        System.out.println(tokenList);*/


    }

    private static void getAllTokens(String filePath) throws Exception{
        FileReader lexFile = new FileReader(filePath);
        BufferedReader lexFile__bufferedReader = new BufferedReader(lexFile);

        String line = lexFile__bufferedReader.readLine();
        int lineNum = 1;
        int currTokenType = 0;
        String currTokenText;
        //TokenFactory tokenFactory;
        TokenFactory _factory = CommonTokenFactory.DEFAULT;
        while(line != null && line.charAt(0) != '\''){

            //System.out.println(lineNum + ": " + line);

            if(lineNum == 1){

            }else if(lineNum == 2){
                currTokenType = strToIntToken.get(line);
            }else{
                currTokenText = line;
                Token t = _factory.create(currTokenType, currTokenText);
                tokenList.add(t);
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

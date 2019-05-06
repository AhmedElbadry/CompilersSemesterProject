import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.pattern.ParseTreeMatch;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.*;
import java.io.*;
import java.lang.reflect.Field;
public class TestCodegen {

    //public static List<Token> tokenList = new ArrayList();
    //public static String intToStrToken[] = new String[100];
    //public static HashMap<String, Integer> strToIntToken = new HashMap();
    public static BufferedWriter writer ;


    public static void main(String[] args) {
        try{
            String TestCaseFile = "Test Cases/" + args[0];
            String OutputFile = "Output/" + args[0] + "-CST";

            File file = new File(OutputFile);
            file.delete();
            writer = new BufferedWriter(new FileWriter(OutputFile, true));

            FileInputStream fis = new FileInputStream(new File(TestCaseFile));
            ANTLRInputStream input = new ANTLRInputStream(fis);
            Lex lexer = new Lex(input);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            tokenStream.fill();
            Parse parser = new Parse(tokenStream);
            parser.removeErrorListeners();
            parser.addErrorListener(new ThrowingErrorListener());


            Parse.ProgramContext prog = parser.program();
            //prog = parser.program();

            System.out.println(prog.value.getString(""));
            prog.value.gen();
            //System.out.println(AST.prog3AdCode);
            for(String s: AST.prog3AdCode){
                System.out.println(s);
            }



        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }



    }


}

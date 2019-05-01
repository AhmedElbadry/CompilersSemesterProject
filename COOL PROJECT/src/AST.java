import java.util.List;
public class AST {
    public static class ASTNode {
        int lineNo;
    }
    public static String sp = "  ";

    public static class program extends ASTNode {
        public List<class_> classes;
        public program(/*List<class_> c*/){
            //classes = c;
        }
        String getString(String space){
            return "progB";
        }
    }
    public static class class_ extends ASTNode {
        public class_(){
        }
        String getString(String space){
            return "class_";
        }
    }
}

import java.util.List;
public class AST {
    public static class ASTNode {
        int lineNo;
    }
    public static String sp = "  ";

    public static class program extends ASTNode {
        public List<class_> classes;
        public program(List<class_> c){
            classes = c;
            System.out.println("prograaam");
        }
        String getString(String space){
            String str;
            str = space+"#"+lineNo+"\n"+space+"_program" + classes.size();
            for ( class_ c : classes ) {
                str += "\n"+c.getString(space+sp);
            }
            return str;
        }
    }
    public static class class_ extends ASTNode {
        public class_(){
            System.out.println("claaaas");
        }
        String getString(String space){
            return "class_";
        }
    }
}

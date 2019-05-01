import java.util.List;
public class AST {
    public static class ASTNode {
        int lineNo;
    }
    public static String sp = "  ";

    public static class program extends ASTNode {
        public List<class_> classes_;
        public program(List<class_> c){
            classes_ = c;
        }
        String getString(String space){
            String str;
            str = space+"#"+lineNo+"\n"+space+"_program" + classes_.size();
            for ( class_ c : classes_ ) {
                str += "\n"+c.getString(space+sp);
            }
            return str;
        }
    }
    public static class class_ extends ASTNode {
        public List<feature> features;
        public class_(List<feature> fl){
            features = fl;
            //System.out.println("claaaas");
        }
        String getString(String space){
            String str;
            str = space+"#"+lineNo+"\n"+space+"_class" + features.size();
            for ( feature f : features ) {
                str += "\n"+f.getString(space+sp);
            }
            return str;
        }
    }

    public static class feature extends ASTNode {
        public feature(){
            //System.out.println("claaaas");
        }
        String getString(String space){
            return "feature";
        }
    }
}

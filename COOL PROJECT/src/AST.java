import java.util.List;
public class AST {
    public static class ASTNode {
        int lineNo;
    }
    public static String sp = "  ";

    public static class program extends ASTNode {
        public List<class_> classes_;
        public program(List<class_> c, int l){
            classes_ = c;
            lineNo = l;
        }
        String getString(String space){
            String str;
            str = space+"#"+lineNo+"\n"+space+"_program";
            for ( class_ c : classes_ ) {
                str += "\n"+c.getString(space+sp);
            }
            return str;
        }
    }
    public static class class_ extends ASTNode {
        public String name;
        public String parent;
        public List<feature> features;
        public class_(String n, String p, List<feature> fl, int l){
            name = n;
            parent = p;
            features = fl;
            lineNo = l;
            //System.out.println("claaaas");
        }
        String getString(String space){
            String str;
            str = space+"#"+lineNo + " class:" + name;
            for ( feature f : features ) {
                str += "\n" + f.getString(space+sp);
            }
            return str;
        }
    }

    public static class feature extends ASTNode {
        public feature(){
            //System.out.println("claaaas");
        }
        String getString(String space){

            return space+"feature";
        }
    }

    public static class method extends feature {
        String name;
        String retType;
        public List<formal> formals;
        public method(String n, String rt, List<formal> fl, int l){
            name = n;
            retType = rt;
            formals = fl;
            lineNo = l;
            //System.out.println("claaaas");
        }
        String getString(String space){
            String str;
            str = space+"#"+lineNo+" method:" + name + " return type:" + retType + "\n" + sp+space;
            if(formals.size() > 0)
                str += "formals: " + formals.size();
            else
                str+= "no formals";
            for ( formal f : formals ) {
                str += "\n"+f.getString(space+sp);
            }
            return str;
        }
    }
    public static class decl extends feature {
        String name;
        String type;
        public decl(String n, String t, int l){
            name = n;
            type = t;
            lineNo = l;
            //System.out.println("claaaas");
        }
        String getString(String space){

            return space+ "#" + lineNo + " decl:" + name + " type:" + type ;
        }
    }

    public static class formal extends ASTNode {
        String name;
        String type;
        public formal(String n, String t){
            name = n;
            type = t;
            //System.out.println("claaaas");
        }
        String getString(String space){

            return space + "formal:" + name + " type:" + type;
        }
    }

}

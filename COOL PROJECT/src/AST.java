public class AST {
    public static class ASTNode {
        int lineNo;
    }
    public static String sp = "  ";

    public static class program extends ASTNode {
        public program(){
        }
        String getString(String space){
            return "progB";
        }
    }
}

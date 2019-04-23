import org.antlr.v4.runtime.ParserRuleContext;

public class Parserlistener extends CoolBaseListener {
    public static int tabs = 0;
    @Override public void enterEveryRule(ParserRuleContext ctx) {
        //for (int i = 0 ; i < tabs ; i++) System.out.println("\t");
        System.out.println(ctx.getText());      //code that executes per rule
        //tabs++;
    }

    /*@Override public void exitEveryRule(ParserRuleContext ctx) {
        tabs--;
        for (int i = 0 ; i < tabs ; i++) System.out.println("\t");
        System.out.println("}\n");      //code that executes per rule
    }*/
}

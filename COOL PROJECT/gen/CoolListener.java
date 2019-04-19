// Generated from C:/Users/Ahmed/Desktop/CompilersSemesterProject/COOL PROJECT/src\Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CoolParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CoolParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#classes}.
	 * @param ctx the parse tree
	 */
	void enterClasses(CoolParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#classes}.
	 * @param ctx the parse tree
	 */
	void exitClasses(CoolParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(CoolParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(CoolParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CoolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CoolParser.ExprContext ctx);
}
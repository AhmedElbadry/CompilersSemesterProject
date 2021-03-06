// Generated from C:/Users/Khaled/Desktop/comp/COOL PROJECT/grammar\Parse.g4 by ANTLR 4.7.2

	import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parse}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parse#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Parse.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classes}
	 * labeled alternative in {@link Parse#programBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasses(Parse.ClassesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parse#classDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefine(Parse.ClassDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parse#featureList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureList(Parse.FeatureListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parse#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature(Parse.FeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parse#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(Parse.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parse#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(Parse.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parse#formalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalList(Parse.FormalListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parse#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(Parse.FormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(Parse.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetIn(Parse.LetInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(Parse.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(Parse.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(Parse.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueOrFlase}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueOrFlase(Parse.TrueOrFlaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(Parse.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoid(Parse.IsvoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Parse.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(Parse.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(Parse.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(Parse.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(Parse.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(Parse.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNot(Parse.BoolNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(Parse.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Parse.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(Parse.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqual(Parse.LessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(Parse.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(Parse.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnMethodCall(Parse.OwnMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link Parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(Parse.MethodCallContext ctx);
}
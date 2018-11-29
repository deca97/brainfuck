// Generated from /home/giovanni/Scrivania/brainfuck/src/main/resources/gram.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(gramParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operation}
	 * labeled alternative in {@link gramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(gramParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link gramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(gramParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightpointer}
	 * labeled alternative in {@link gramParser#opcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightpointer(gramParser.RightpointerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftpointer}
	 * labeled alternative in {@link gramParser#opcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftpointer(gramParser.LeftpointerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link gramParser#opcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(gramParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link gramParser#opcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(gramParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code output}
	 * labeled alternative in {@link gramParser#opcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(gramParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code input}
	 * labeled alternative in {@link gramParser#opcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(gramParser.InputContext ctx);
}
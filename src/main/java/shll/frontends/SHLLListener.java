// Generated from java-escape by ANTLR 4.11.1
package shll.frontends;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SHLLParser}.
 */
public interface SHLLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SHLLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SHLLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SHLLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#blocked}.
	 * @param ctx the parse tree
	 */
	void enterBlocked(SHLLParser.BlockedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#blocked}.
	 * @param ctx the parse tree
	 */
	void exitBlocked(SHLLParser.BlockedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SHLLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SHLLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Single}
	 * labeled alternative in {@link SHLLParser#anno}.
	 * @param ctx the parse tree
	 */
	void enterSingle(SHLLParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Single}
	 * labeled alternative in {@link SHLLParser#anno}.
	 * @param ctx the parse tree
	 */
	void exitSingle(SHLLParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code List}
	 * labeled alternative in {@link SHLLParser#anno}.
	 * @param ctx the parse tree
	 */
	void enterList(SHLLParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code List}
	 * labeled alternative in {@link SHLLParser#anno}.
	 * @param ctx the parse tree
	 */
	void exitList(SHLLParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dict}
	 * labeled alternative in {@link SHLLParser#anno}.
	 * @param ctx the parse tree
	 */
	void enterDict(SHLLParser.DictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dict}
	 * labeled alternative in {@link SHLLParser#anno}.
	 * @param ctx the parse tree
	 */
	void exitDict(SHLLParser.DictContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(SHLLParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(SHLLParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithRename}
	 * labeled alternative in {@link SHLLParser#kwArg}.
	 * @param ctx the parse tree
	 */
	void enterWithRename(SHLLParser.WithRenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithRename}
	 * labeled alternative in {@link SHLLParser#kwArg}.
	 * @param ctx the parse tree
	 */
	void exitWithRename(SHLLParser.WithRenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithoutRename}
	 * labeled alternative in {@link SHLLParser#kwArg}.
	 * @param ctx the parse tree
	 */
	void enterWithoutRename(SHLLParser.WithoutRenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithoutRename}
	 * labeled alternative in {@link SHLLParser#kwArg}.
	 * @param ctx the parse tree
	 */
	void exitWithoutRename(SHLLParser.WithoutRenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#posArg}.
	 * @param ctx the parse tree
	 */
	void enterPosArg(SHLLParser.PosArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#posArg}.
	 * @param ctx the parse tree
	 */
	void exitPosArg(SHLLParser.PosArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(SHLLParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(SHLLParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Intialized}
	 * labeled alternative in {@link SHLLParser#let}.
	 * @param ctx the parse tree
	 */
	void enterIntialized(SHLLParser.IntializedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Intialized}
	 * labeled alternative in {@link SHLLParser#let}.
	 * @param ctx the parse tree
	 */
	void exitIntialized(SHLLParser.IntializedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Uninitialized}
	 * labeled alternative in {@link SHLLParser#let}.
	 * @param ctx the parse tree
	 */
	void enterUninitialized(SHLLParser.UninitializedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Uninitialized}
	 * labeled alternative in {@link SHLLParser#let}.
	 * @param ctx the parse tree
	 */
	void exitUninitialized(SHLLParser.UninitializedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForEach}
	 * labeled alternative in {@link SHLLParser#for}.
	 * @param ctx the parse tree
	 */
	void enterForEach(SHLLParser.ForEachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForEach}
	 * labeled alternative in {@link SHLLParser#for}.
	 * @param ctx the parse tree
	 */
	void exitForEach(SHLLParser.ForEachContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link SHLLParser#for}.
	 * @param ctx the parse tree
	 */
	void enterLoop(SHLLParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link SHLLParser#for}.
	 * @param ctx the parse tree
	 */
	void exitLoop(SHLLParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link SHLLParser#for}.
	 * @param ctx the parse tree
	 */
	void enterWhile(SHLLParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link SHLLParser#for}.
	 * @param ctx the parse tree
	 */
	void exitWhile(SHLLParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#structof}.
	 * @param ctx the parse tree
	 */
	void enterStructof(SHLLParser.StructofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#structof}.
	 * @param ctx the parse tree
	 */
	void exitStructof(SHLLParser.StructofContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(SHLLParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(SHLLParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#enumof}.
	 * @param ctx the parse tree
	 */
	void enterEnumof(SHLLParser.EnumofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#enumof}.
	 * @param ctx the parse tree
	 */
	void exitEnumof(SHLLParser.EnumofContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#enum}.
	 * @param ctx the parse tree
	 */
	void enterEnum(SHLLParser.EnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#enum}.
	 * @param ctx the parse tree
	 */
	void exitEnum(SHLLParser.EnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#traitof}.
	 * @param ctx the parse tree
	 */
	void enterTraitof(SHLLParser.TraitofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#traitof}.
	 * @param ctx the parse tree
	 */
	void exitTraitof(SHLLParser.TraitofContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#trait}.
	 * @param ctx the parse tree
	 */
	void enterTrait(SHLLParser.TraitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#trait}.
	 * @param ctx the parse tree
	 */
	void exitTrait(SHLLParser.TraitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#funof}.
	 * @param ctx the parse tree
	 */
	void enterFunof(SHLLParser.FunofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#funof}.
	 * @param ctx the parse tree
	 */
	void exitFunof(SHLLParser.FunofContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#fatArrow}.
	 * @param ctx the parse tree
	 */
	void enterFatArrow(SHLLParser.FatArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#fatArrow}.
	 * @param ctx the parse tree
	 */
	void exitFatArrow(SHLLParser.FatArrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(SHLLParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(SHLLParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#kindof}.
	 * @param ctx the parse tree
	 */
	void enterKindof(SHLLParser.KindofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#kindof}.
	 * @param ctx the parse tree
	 */
	void exitKindof(SHLLParser.KindofContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#kind}.
	 * @param ctx the parse tree
	 */
	void enterKind(SHLLParser.KindContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#kind}.
	 * @param ctx the parse tree
	 */
	void exitKind(SHLLParser.KindContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#when}.
	 * @param ctx the parse tree
	 */
	void enterWhen(SHLLParser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#when}.
	 * @param ctx the parse tree
	 */
	void exitWhen(SHLLParser.WhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCase(SHLLParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCase(SHLLParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#generic}.
	 * @param ctx the parse tree
	 */
	void enterGeneric(SHLLParser.GenericContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#generic}.
	 * @param ctx the parse tree
	 */
	void exitGeneric(SHLLParser.GenericContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DerefTuple}
	 * labeled alternative in {@link SHLLParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDerefTuple(SHLLParser.DerefTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DerefTuple}
	 * labeled alternative in {@link SHLLParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDerefTuple(SHLLParser.DerefTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DerefDict}
	 * labeled alternative in {@link SHLLParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDerefDict(SHLLParser.DerefDictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DerefDict}
	 * labeled alternative in {@link SHLLParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDerefDict(SHLLParser.DerefDictContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(SHLLParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(SHLLParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#implicitApplier}.
	 * @param ctx the parse tree
	 */
	void enterImplicitApplier(SHLLParser.ImplicitApplierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#implicitApplier}.
	 * @param ctx the parse tree
	 */
	void exitImplicitApplier(SHLLParser.ImplicitApplierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#positionalApplier}.
	 * @param ctx the parse tree
	 */
	void enterPositionalApplier(SHLLParser.PositionalApplierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#positionalApplier}.
	 * @param ctx the parse tree
	 */
	void exitPositionalApplier(SHLLParser.PositionalApplierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#namedApplier}.
	 * @param ctx the parse tree
	 */
	void enterNamedApplier(SHLLParser.NamedApplierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#namedApplier}.
	 * @param ctx the parse tree
	 */
	void exitNamedApplier(SHLLParser.NamedApplierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#assigner}.
	 * @param ctx the parse tree
	 */
	void enterAssigner(SHLLParser.AssignerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#assigner}.
	 * @param ctx the parse tree
	 */
	void exitAssigner(SHLLParser.AssignerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHLLParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SHLLParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHLLParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SHLLParser.TermContext ctx);
}
package shll.backends

import shll.*
import shll.ast.*
object ShllPrettyPrinter {
  private val pp = ShllPrettyPrinter()
  def print(ast: Ast): String = pp.print(ast)
}

case class ShllPrettyPrinter(
    newlines: Boolean = true,
    withNumber: Boolean = false
) extends PrettyPrinter {

  val IDENT: String = if (newlines) "  " else ""
  val NL: String = if (newlines) "\n" else " "
  val textTool: TextTool = TextTool(NL, IDENT)

  def printImpl(a: Ast): String =
    (a match {
      case Apply(f, args, kwArgs) =>
        s"(${printImpl(f)} ${printImpl(args)} ${printImpl(kwArgs)})"
      case Compose(f, args, kwArgs) =>
        s"[${printImpl(f)} ${printImpl(args)} ${printImpl(kwArgs)}]"
      case Cond(cond, consequence, alternative) =>
        s"(if ${printImpl(cond)} ${printImpl(consequence)} ${printImpl(alternative)})"
      case ForEach(target, iter, body) =>
        s"(for ${target.name} ${printImpl(iter)} $NL ${textTool.indent(printImpl(body))} $NL)"
      case Block(Nil) =>
        "(block)"
      case Block(body) =>
        s"(block$NL${textTool.indent(body.map(printImpl).mkString(NL))}$NL)"
      case Ident(name) =>
        name
      case LiteralInt(value) =>
        value.toString
      case LiteralDecimal(value) =>
        value.toString
      case LiteralChar(value) =>
        s"'$value'"
      case LiteralString(value) =>
        s"\"$value\""
      case LiteralBool(x) =>
        x.toString
      case BuildList(Nil) =>
        s"(list)"
      case BuildList(value) =>
        s"(list ${value.map(printImpl).mkString(" ")})"
      case KwArg(name, value) =>
        s"${name.name}=${printImpl(value)}"
      case Field(name, ty) =>
        s"(: ${name.name} ${printImpl(ty)})"
      case Param(name, ty) =>
        s"(: ${name.name} ${printImpl(ty)})"
      case PosArgs(args) =>
        args.map(printImpl).mkString(" ")
      case KwArgs(args) =>
        args.map(x => printImpl(x)).mkString(" ")
      case Params(params) =>
        s"(lp ${params.map(printImpl).mkString(" ")})"
      case DefVal(name, body) =>
        s"(def-val ${name.name} ${printImpl(body)})"
      case DefFun(name, args, ret, body) =>
        s"(def-fun ${name.name} ${printImpl(args)} ${printImpl(ret)} ${printImpl(body)})"
      case DeclFun(name, args, ret) =>
        s"(decl-fun ${name.name} ${printImpl(args)} ${printImpl(ret)})"
      case Assign(target, value) =>
        s"(assign ${printImpl(target)} ${printImpl(value)})"
      case DefStruct(name, fields) =>
        s"(def-struct ${name.name} ${printImpl(fields)})"
      case DefType(name, params, value) =>
        s"(def-type ${name.name} ${printImpl(params)} ${printImpl(value)})"
      case BuildFun(args, ret, body) =>
        s"(fun ${printImpl(args)} ${printImpl(ret)} ${printImpl(body)})"
      case LiteralUnknown() =>
        "???"
      case BuildStruct(name, values) =>
        s"(${printImpl(name)} ${printImpl(values)})"
      case Fields(fields) =>
        "(lf " + fields.map(printImpl).mkString(" ") + ")"
      case Select(obj, field) =>
        s"(select ${printImpl(obj)} ${field.name})"
    }) + (if (withNumber) s"#${a.num}" else "")

  def print(a: Ast): String = {
    val raw = printImpl(a)
    raw
  }
}

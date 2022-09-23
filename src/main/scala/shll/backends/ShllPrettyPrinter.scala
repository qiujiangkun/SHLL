package shll.backends

import shll.*
import shll.ast.*
case class ShllPrettyPrinter(
    useRawLiteral: Boolean = false,
    newlines: Boolean = true
) extends PrettyPrinter {

  val IDENT: String = if (newlines) "  " else ""
  val NL: String = if (newlines) "\n" else " "
  val textTool: TextTool = TextTool(NL, IDENT)
  def printList(l: List[AST]): String = {
    l.map(printImpl).mkString(" ")
  }

  def printDict(d: List[KeyValue]): String = {
    d.map(printImpl).mkString(" ")
  }
  def printImpl(a: AST): String = {
    a match {
      case Apply(f, Nil, Nil) =>
        s"(${printImpl(f)})"
      case Apply(f, Nil, kwArgs) =>
        s"(${printImpl(f)} ${printDict(kwArgs)})"
      case Apply(f, args, Nil) =>
        s"(${printImpl(f)} ${printList(args)})"
      case Apply(f, args, kwArgs) =>
        s"(${printImpl(f)} ${printList(args)} ${printDict(kwArgs)})"
      case TypeApply(f, Nil, Nil) =>
        s"[${printImpl(f)}]"
      case TypeApply(f, Nil, kwArgs) =>
        s"[${printImpl(f)} ${printDict(kwArgs)}]"
      case TypeApply(f, args, Nil) =>
        s"[${printImpl(f)} ${printList(args)}]"
      case TypeApply(f, args, kwArgs) =>
        s"[(${printImpl(f)} ${printList(args)} ${printDict(kwArgs)}]"
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
      case LiteralInt(_, raw) if useRawLiteral =>
        raw
      case LiteralInt(value, _) =>
        value.toString
      case LiteralDecimal(_, raw) if useRawLiteral =>
        raw
      case LiteralDecimal(value, _) =>
        value.toString
      case LiteralChar(_, raw) if useRawLiteral =>
        raw
      case LiteralChar(value, _) =>
        s"'$value'"
      case LiteralString(_, raw) if useRawLiteral =>
        raw
      case LiteralString(value, _) =>
        s"\"$value\""
      case LiteralBool(x) =>
        x.toString
      case LiteralList(Nil) =>
        s"(list)"
      case LiteralList(value) =>
        s"(list ${printList(value)})"
      case KeyValue(name, value) =>
        s"${name.name}=${printImpl(value)}"
      case Field(name, ty) =>
        s"(field ${name.name} ${printImpl(ty)})"
      case DefVal(name, body) =>
        s"(def-val ${name.name} ${printImpl(body)})"
      case DefFun(name, args, ret, body) =>
        s"(def-fun ${name.name} ${printImpl(args)} ${printImpl(ret)} ${body.map(printImpl).getOrElse("")})"
      case Assign(target, value) =>
        s"(assign ${target.name} ${printImpl(value)})"
      case DefStruct(name, fields) =>
        s"(def-struct ${name.name} ${printImpl(fields)})"
      case DefType(name, value) =>
        s"(def-type ${name.name} ${printImpl(value)})"
      case StructApply(name, values) =>
        printImpl(Apply(name, Nil, values))
      case Select(obj, field) =>
        s"(select ${printImpl(obj)} ${field.name})"
    }
  }
  def print(a: AST): String = {
    val raw = printImpl(a)
    raw
  }
}

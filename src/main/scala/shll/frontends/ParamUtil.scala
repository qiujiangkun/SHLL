package shll.frontends

import shll.ast.*

case object ParamUtil {
  def getArgOpt(args: PosArgs, kwArgs: KwArgs, pos: Int, key: String): Option[Ast] = {
    val p1 = args.args.lift(pos)
    val p2 = kwArgs.args.find(_.name.name == key)
    if (p1.isDefined && p2.isDefined)
      throw ParserException("Duplicate key: " + key)
    else
      p1.orElse(p2)
  }

  def getArg(args: PosArgs, kwArgs: KwArgs, pos: Int, key: String): Ast =
    getArgOpt(args, kwArgs, pos, key).getOrElse(throw Exception("Missing key: " + key))
  
  def checkArguments(args: PosArgs, kwArgs: KwArgs, knownArgs: Array[Int], knownKwArgs: Array[String]): Unit = {
    collectArguments(args, kwArgs, knownArgs, knownKwArgs)
  }
  
  def collectArguments(args: PosArgs, kwArgs: KwArgs, knownArgs: Array[Int], knownKwArgs: Array[String]): Map[String, Ast] = {
    val res = collection.mutable.Map[String, Ast]()
    for (i <- args.args.indices) {
      knownArgs.lift(i) match {
        case None => throw ParserException(s"Unknown positional argument: $i " + args.args(i))
        case Some(x) if kwArgs.args.exists(_.name.name == knownKwArgs(x)) =>
          throw Exception(s"Duplicate key: $i vs ${knownKwArgs(x)}")
        case Some(x) =>
          res(knownKwArgs(x)) = args.args(i)
      }
    }
    for (kw <- kwArgs.args) {
      if (res.contains(kw.name.name))
        throw ParserException(s"Duplicate key: ${kw.name.name}")
      res(kw.name.name) = kw.value
    }
    for (kw <- knownKwArgs) {
      if (!res.contains(kw))
        throw ParserException(s"Missing key: $kw")
    }
    res.toMap
  }
}

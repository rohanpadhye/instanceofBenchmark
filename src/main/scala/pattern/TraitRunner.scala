package pattern

abstract class TraitRoot

trait TraitA {
  def getA() : Int
}

trait TraitB {
  def getB() : Int
}

trait TraitC {
  def getC() : Int
}

trait TraitD {
  def getD() : Int
}

trait TraitE {
  def getE() : Int
}

trait TraitF {
  def getF() : Int
}

trait TraitG {
  def getG() : Int
}

trait TraitH {
  def getH() : Int
}

case class ImplA(v: Int) extends TraitRoot with TraitA {
  def getA() = v+1
}

case class ImplB(v:Int) extends TraitRoot with TraitB {
  def getB() = v+2
}

case class ImplC(v:Int) extends TraitRoot with TraitC {
  def getC() = v+3
}

case class ImplD(v:Int) extends TraitRoot with TraitD {
  def getD() = v+4
}

case class ImplE(v:Int) extends TraitRoot with TraitE {
  def getE() = v+5
}

case class ImplF(v:Int) extends TraitRoot with TraitF {
  def getF() = v+6
}

case class ImplG(v:Int) extends TraitRoot with TraitG {
  def getG() = v+7
}

case class ImplH(v:Int) extends TraitRoot with TraitH {
  def getH() = v+8
}

object TraitRunner extends PatternMatchingRunner {
  val items:Array[TraitRoot] = Array(ImplA(1), ImplB(2), ImplC(3), ImplD(4), ImplE(5), ImplF(6), ImplG(7), ImplH(8))
  def run(x: Int) : Int = {
    val idx = x % items.length
    items(idx) match {
      case o:TraitA => o.getA() 
      case o:TraitB => o.getB() 
      case o:TraitC => o.getC() 
      case o:TraitD => o.getD() 
      case o:TraitE => o.getE() 
      case o:TraitF => o.getF() 
      case o:TraitG => o.getG() 
      case o:TraitH => o.getH() 
    }
  }
}

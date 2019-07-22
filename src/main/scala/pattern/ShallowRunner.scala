package pattern

abstract class ShallowRoot

case class ShallowA(v:Int) extends ShallowRoot {
  def getA() = v+1
}

case class ShallowB(v:Int) extends ShallowRoot {
  def getB() = v+2
}

case class ShallowC(v:Int) extends ShallowRoot {
  def getC() = v+3
}

case class ShallowD(v:Int) extends ShallowRoot {
  def getD() = v+4
}

case class ShallowE(v:Int) extends ShallowRoot {
  def getE() = v+5
}

case class ShallowF(v:Int) extends ShallowRoot {
  def getF() = v+6
}

case class ShallowG(v:Int) extends ShallowRoot {
  def getG() = v+7
}

case class ShallowH(v:Int) extends ShallowRoot {
  def getH() = v+8
}

object ShallowRunner extends PatternMatchingRunner {
  val items:Array[ShallowRoot] = Array(ShallowA(1), ShallowB(2), ShallowC(3), ShallowD(4), ShallowE(5), ShallowF(6), ShallowG(7), ShallowH(8))
  def run(x: Int) : Int = {
    val idx = x % items.length
    items(idx) match {
      case o:ShallowA => o.getA()
      case o:ShallowB => o.getB()
      case o:ShallowC => o.getC()
      case o:ShallowD => o.getD()
      case o:ShallowE => o.getE()
      case o:ShallowF => o.getF()
      case o:ShallowG => o.getG()
      case o:ShallowH => o.getH()
    }
  }
}

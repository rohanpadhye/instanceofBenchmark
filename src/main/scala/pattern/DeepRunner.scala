package pattern

abstract class DeepOne
abstract class DeepTwo extends DeepOne
abstract class DeepThree extends DeepTwo
abstract class DeepFour extends DeepThree
abstract class DeepFive extends DeepFour
abstract class DeepSix extends DeepFive
abstract class DeepSeven extends DeepSix
abstract class DeepEight extends DeepSeven
abstract class DeepNine extends DeepEight
abstract class DeepRoot extends DeepNine

case class DeepA(v: Int) extends DeepRoot {
  def getA() = v+1
}

case class DeepB(v:Int) extends DeepRoot {
  def getB() = v+2
}

case class DeepC(v:Int) extends DeepRoot {
  def getC() = v+3
}

case class DeepD(v:Int) extends DeepRoot {
  def getD() = v+4
}

case class DeepE(v:Int) extends DeepRoot {
  def getE() = v+5
}

case class DeepF(v:Int) extends DeepRoot {
  def getF() = v+6
}

case class DeepG(v:Int) extends DeepRoot {
  def getG() = v+7
}

case class DeepH(v:Int) extends DeepRoot {
  def getH() = v+8
}

object DeepRunner extends PatternMatchingRunner {
  val items:Array[DeepRoot] = Array(DeepA(1), DeepB(2), DeepC(3), DeepD(4), DeepE(5), DeepF(6), DeepG(7), DeepH(8))
  def run(x: Int) : Int = {
    val idx = x % items.length
    items(idx) match {
      case o:DeepA => o.getA()
      case o:DeepB => o.getB()
      case o:DeepC => o.getC()
      case o:DeepD => o.getD()
      case o:DeepE => o.getE()
      case o:DeepF => o.getF()
      case o:DeepG => o.getG()
      case o:DeepH => o.getH()
    }
  }
}

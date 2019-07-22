package pattern

trait HasBloom {
  def getBloom() : Long
}

trait PatternMatchingRunner {
    def run(v: Int) : Int
}

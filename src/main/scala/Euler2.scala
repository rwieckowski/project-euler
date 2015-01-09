object Euler2 extends App {
  def fibs: Stream[BigInt] = BigInt(1) #:: BigInt(2) #:: (fibs zip fibs.tail).map { case (a, b) => a + b }

  println("Euler 2")
  println(fibs takeWhile (_ < 4000000) filter (_ % 2 == 0) sum)
}

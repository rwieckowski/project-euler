import scala.collection.immutable.Stream

object Euler1 extends App {
  def mult3or5: Stream[Int] = Stream.from(1) filter(i => i % 3 == 0 || i % 5 == 0)

  println("Euler 1")
  println(mult3or5 takeWhile (_ < 1000) sum)
}

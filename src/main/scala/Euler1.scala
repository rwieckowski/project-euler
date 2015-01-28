import scala.collection.immutable.Stream

/**
If we list all the natural numbers below 10 that are multiples of 3 or 
5 we get 3 5 6 and 9 The sum of these multiples is 23

Find the sum of all the multiples of 3 or 5 below 1000
*/
object Euler1 extends App {
  def mult3or5: Stream[Int] = Stream.from(1) filter(i => i % 3 == 0 || i % 5 == 0)

  println("Euler 1")
  println(mult3or5 takeWhile (_ < 1000) sum)
}

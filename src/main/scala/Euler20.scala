import scala.annotation.tailrec

/**
<i>n</i> means <i>n</i> times <i>n</i> minus 1 times  times 3 times 2 
times 1

For example 10  10 times 9 times  times 3 times 2 times 1  3628800
and the sum of the digits in the number 10 is 3  6  2  8  8  0  0  27

Find the sum of the digits in the number 100
*/
object Euler20 extends App {
  println("Euler 20")
  def factorial(n: BigInt): BigInt = if (n < 2) 1 else factorial(n - 1) * n
  def sumOfDigits(s: String) = s.map(_ - '0').sum

  val n = 100
  println(factorial(n))
  println(sumOfDigits(factorial(n).toString))
}
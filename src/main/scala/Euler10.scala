/**
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17

Find the sum of all the primes below two million
*/
object Euler10 extends App {
  println("Euler 10")
  lazy val primes: Stream[Int] = 2 #:: 3 #:: Stream.from(5).filter(n => primes.takeWhile(p => p * p <= n).forall(p => n % p != 0))

  def sumOfPrimesBelow(n: Int) = primes.takeWhile(_ < n).map(BigInt(_)).sum

  println(sumOfPrimesBelow(10))
  println(sumOfPrimesBelow(2000000))
}
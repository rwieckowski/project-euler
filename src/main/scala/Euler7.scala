/**
By listing the first six prime numbers 2 3 5 7 11 and 13 we can see 
that the 6th prime is 13

What is the 10 001st prime number
*/
object Euler7 extends App {
  println("Euler 7")
  lazy val primes: Stream[Int] = 2 #:: Stream.from(3).filter(n => primes.takeWhile(p => p * p <= n).forall(n % _ != 0))
  def nthPrime(n: Int) = primes.drop(n - 1).head

  println(nthPrime(6))
  println(nthPrime(10001))
}
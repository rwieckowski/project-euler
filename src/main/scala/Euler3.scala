/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
object Euler3 extends App {
  def nums(n: Long): Stream[Long] = n #:: nums(n + 1)

  lazy val primes: Stream[Long] = 2 #:: 3 #:: (nums(5) filter(p => primes takeWhile(i => i * i <= p) forall(p % _ != 0)))

  def factors(n: Long): List[Long] = primes takeWhile (p => p * p <= n) filter (n % _ == 0) toList

  println(factors(13195))
  println(factors(600851475143L) max)
}

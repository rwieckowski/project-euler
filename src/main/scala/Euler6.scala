/**
 * The sum of the squares of the first ten natural numbers is,
 *
 * 1^^2 + 2^^2 + ... + 10^^2 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)^^2 = 55^^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
object Euler6 extends App {
  def sumOfSquares(n: Int) = (1 to n) map (i => i * i) sum
  def squareOfSums(n: Int): Int = {
    val s = (1 to n) sum

    s * s
  }
  def diff(n: Int) = (sumOfSquares(n) - squareOfSums(n)).abs

  println(diff(100))
}

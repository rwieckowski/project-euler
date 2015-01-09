/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
object Euler4 extends App {
  def isPalindrome(n: Int) = n.toString == n.toString.reverse

  val palindromes = for {
    i <- 100 to 998
    j <- i + 1 to 999
    p = i * j
    if isPalindrome(p)
  } yield p

  println(palindromes max)
}

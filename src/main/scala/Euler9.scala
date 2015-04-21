/**
A Pythagorean triplet is a set of three natural numbers <var>a</var>
&lt; <var>b</var> &lt; <var>c</var> for which
<div style="text-align:center;"> <var>a</var><sup>2</sup> + <var>b
</var><sup>2</sup> = <var>c</var><sup>2</sup>
*/
object Euler9 extends App {
  println("Euler 9")

  def triplet(n: Int) = for {
    a <- 1 until n
    b <- a + 1 until n
    c <- b + 1 until n
    if (a * a) + (b * b) == (c * c) && a + b + c == n
  } yield (a, b, c)

  println(triplet(25))
  val (a, b, c) = triplet(1000).head
  println(a * b * c)
}
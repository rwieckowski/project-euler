/**
2520 is the smallest number that can be divided by each of the numbers 
from 1 to 10 without any remainder

What is the smallest positive number that is 
<dfn title="divisible with no remainder">evenly divisible</dfn> by all 
of the numbers from 1 to 20
*/
object Euler5 extends App {
  def divisible(n: Int)(i: Int): Boolean = (2 to n).forall(i % _ == 0)
  def smallest(n: Int) = Stream.from(n, n).find(divisible(n))

  println(divisible(10)(2520))
  println(smallest(10))
  println(smallest(20))
}

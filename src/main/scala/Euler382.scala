/**
A <b>polygon</b> is a flat shape consisting of straight line segments 
that are joined to form a closed chain or circuit A polygon consists 
of at least three sides and does not selfintersect

A set S of positive numbers is said to <i>generate a polygon</i> P if
<ul><li> no two sides of P are the same length<li> the length of every 
side of P is in S and<li> S contains no other value</ul>

For example
The set 3 4 5 generates a polygon with sides 3 4 and 5 a triangle
The set 6 9 11 24 generates a polygon with sides 6 9 11 and 24 a 
quadrilateral
The sets 1 2 3 and 2 3 4 9 do not generate any polygon at all

Consider the sequence s defined as follows<ul><li>s<sub>1</sub>  1 s
<sub>2</sub>  2 s<sub>3</sub>  3<li>s<sub><var>n</var></sub>  s<sub>
<var>n</var>1</sub>  s<sub><var>n</var>3</sub> for <var>n</var> gt 3
</ul>

Let U<sub><var>n</var></sub> be the set s<sub>1</sub> s<sub>2</sub>  s
<sub><var>n</var></sub> For example U<sub>10</sub>  1 2 3 4 6 9 13 19 
28 41
Let f<var>n</var> be the number of subsets of U<sub><var>n</var></sub> 
which generate at least one polygon
For example f5  7 f10  501 and f25  18635853

Find the last 9 digits of f10<sup>18</sup>
*/
object Euler382 extends App {
  println("Euler 382")
}
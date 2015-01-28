/**
The <b>ThueMorse sequence</b> T<sub><var>n</var></sub> is a binary 
sequence satisfying<ul><li>T<sub>0</sub>  0</li><li>T<sub>2<var>n
</var></sub>  T<sub><var>n</var></sub></li><li>T<sub>2<var>n</var>1
</sub>  1  T<sub><var>n</var></sub></li></ul>

The first several terms of T<sub><var>n</var></sub> are given as 
follows
01101001<span style="color:red;">10010</span>1101001011001101001

We define A<sub><var>n</sub></var> as the sorted sequence of integers 
such that the binary expression of each element appears as a 
subsequence in T<sub><var>n</sub></var>
For example the decimal number 18 is expressed as 10010 in binary 
10010 appears in T<sub><var>n</sub></var> T<sub>8</sub> to T<sub>12
</sub> so 18 is an element of A<sub><var>n</sub></var>
The decimal number 14 is expressed as 1110 in binary 1110 never 
appears in T<sub><var>n</sub></var> so 14 is not an element of A<sub>
<var>n</sub></var>

The first several terms of A<sub><var>n</sub></var> are given as 
follows
<div align='center'>
<table cellspacing='1' cellpadding='5' border='0' align='center'><tr>
<td align='left'><var>n</var></td><td>0</td><td>1</td><td>2</td><td>3
</td><td>4</td><td>5</td><td>6</td><td>7</td><td>8</td><td>9</td><td>
10</td><td>11</td><td>12</td><td>hellip</td></tr><tr><td>A<sub><var>n
</sub></var></td><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td>
<td>5</td><td>6</td><td>9</td><td>10</td><td>11</td><td>12</td><td>13
</td><td>18</td><td>hellip</td></tr></table>
*/
object Euler361 extends App {
  println("Euler 361")
}
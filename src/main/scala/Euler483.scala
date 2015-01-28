/**
<P>We define a <i>permutation</i> as an operation that rearranges the 
order of the elements 1 2 3  nThere are n such permutations one of 
which leaves the elements in their initial orderFor n  3 we have 3  6 
permutations<BR /> P<sub>1</sub>  keep the initial order<BR /> P<sub>2
</sub>  exchange the 1<sup>st</sup> and 2<sup>nd</sup> elements<BR /> 
P<sub>3</sub>  exchange the 1<sup>st</sup> and 3<sup>rd</sup> elements
<BR /> P<sub>4</sub>  exchange the 2<sup>nd</sup> and 3<sup>rd</sup> 
elements<BR /> P<sub>5</sub>  rotate the elements to the right<BR /> P
<sub>6</sub>  rotate the elements to the left</P><P>If we select one 
of these permutations and we reapply the 
<span style="text-decoration: underline">same</span> permutation 
repeatedly we eventually restore the initial order
For a permutation P<sub>i</sub> let fP<sub>i</sub> be the number of 
steps required to restore the initial order by applying the 
permutation P<sub>i</sub> repeatedly
For n  3 we obtain
 fP<sub>1</sub>  1  123 rarr 123
 fP<sub>2</sub>  2  123 rarr 213 rarr 123
 fP<sub>3</sub>  2  123 rarr 321 rarr 123
 fP<sub>4</sub>  2  123 rarr 132 rarr 123
 fP<sub>5</sub>  3  123 rarr 312 rarr 231 rarr 123
 fP<sub>6</sub>  3  123 rarr 231 rarr 312 rarr 123</P><P>Let gn be the 
average value of f<sup>2</sup>P<sub>i</sub> over all permutations P
<sub>i</sub> of length n
g3  1<sup>2</sup>  2<sup>2</sup>  2<sup>2</sup>  2<sup>2</sup>  3<sup>
2</sup>  3<sup>2</sup>3  316 asymp 5166666667e0
g5  2081120 asymp 1734166667e1
g20  124227288860237691673012432902008176640000 asymp 5106136147e3</P>
<P>Find g350 and write the answer in scientific notation rounded to 10 
significant digits using a lowercase e to separate mantissa and 
exponent as in the examples above</P>
*/
object Euler483 extends App {
  println("Euler 483")
}
/**
<P>6174 is a remarkable number if we sort its digits in increasing 
order and subtract that number from the number you get when you sort 
the digits in decreasing order we get 764114676174<BR />Even more 
remarkable is that if we start from any 4 digit number and repeat this 
process of sorting and subtracting well eventually end up with 6174 or 
immediately with 0 if all digits are equal<BR /> This also works with 
numbers that have less than 4 digits if we pad the number with leading 
zeroes until we have 4 digits<BR />Eg lets start with the number 0837
<BR />873003788352<BR />853223586174</P><P>6174 is called the <b>
Kaprekar constant</b> The process of sorting and subtracting and 
repeating this until either 0 or the Kaprekar constant is reached is 
called the <b>Kaprekar routine</b></P><P>We can consider the Kaprekar 
routine for other bases and number of digits<BR /> Unfortunately it is 
not guaranteed a Kaprekar constant exists in all cases either the 
routine can end up in a cycle for some input numbers or the constant 
the routine arrives at can be different for different input numbers
<BR >However it can be shown that for 5 digits and a base b  6t3ne9 a 
Kaprekar constant exists<BR />Eg base 15 1041495<sub>15</sub><BR />
base 21 14620137<sub>21</sub></P><P>Define <var>C<sub>b</sub></var> to 
be the Kaprekar constant in base <var>b</var> for 5 digitsDefine the 
function <var>sbi</var> to be<ul> <li> 0 if i  <var>C<sub>b</sub>
</var> or if <var>i</var> written in base <var>b</var> consists of 5 
identical digits<li> the number of iterations it takes the Kaprekar 
routine in base <var>b</var> to arrive at <var>C<sub>b</sub></var> 
otherwise</ul>Note that we can define <var>sbi</var> for all integers 
<var>i</var> lt <var>b</var><sup>5</sup> If <var>i</var> written in 
base <var>b</var> takes less than 5 digits the number is padded with 
leading zero digits until we have 5 digits before applying the 
Kaprekar routine</P><P>Define <var>Sb</var> as the sum of <var>sbi
</var> for 0 lt <var>i</var> lt <var>b</var><sup>5</sup><BR >Eg S15  
5274369<BR /> S111  400668930299</P><P>Find the sum of S6k3 for 2 le k 
le 300<BR />Give the last 18 digits as your answer</P>
*/
object Euler414 extends App {
  println("Euler 414")
}
/**
<P>A positive integer <var>n</var> is <b>powerful</b> if p<sup>2</sup> 
is a divisor of <var>n</var> for every prime factor p in <var>n</var>
</P><P>A positive integer <var>n</var> is a <b>perfect power</b> if 
<var>n</var> can be expressed as a power of another positive integer
</P><P>A positive integer <var>n</var> is an <b>Achilles number</b> if 
<var>n</var> is powerful but not a perfect power For example 864 and 
1800 are Achilles numbers 864  2<sup>5</sup>middot3<sup>3</sup> and 
1800  2<sup>3</sup>middot3<sup>2</sup>middot5<sup>2</sup>

We shall call a positive integer <var>S</var> a <i>Strong Achilles 
number</i> if both <var>S</var> and phi<var>S</var> are Achilles 
numbers<sup>1</sup><BR />For example 864 is a Strong Achilles number 
phi864  288  2<sup>5</sup>middot3<sup>2</sup> However 1800 isnt a 
Strong Achilles number because phi1800  480  2<sup>5</sup>middot3<sup>
1</sup>middot5<sup>1</sup>

There are 7 Strong Achilles numbers below 10<sup>4</sup> and 656 below 
10<sup>8</sup>

How many Strong Achilles numbers are there below 10<sup>18</sup>

<sup>1</sup> phi denotes <b>Eulers totient function</b>
*/
object Euler302 extends App {
  println("Euler 302")
}
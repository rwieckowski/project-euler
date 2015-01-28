/**
<P>A <b>Harshad or Niven number</b> is a number that is divisible by 
the sum of its digits<BR/>201 is a Harshad number because it is 
divisible by 3 the sum of its digits<BR/>When we truncate the last 
digit from 201 we get 20 which is a Harshad number<BR/>When we 
truncate the last digit from 20 we get 2 which is also a Harshad 
number<BR/>Lets call a Harshad number that while recursively 
truncating the last digit always results in a Harshad number a <i>
right truncatable Harshad number</i></P>  <P>Also<BR/>201367 which is 
prime<BR/>Lets call a Harshad number that when divided by the sum of 
its digits results in a prime a <i>strong Harshad number</i></P><P>Now 
take the number 2011 which is prime<BR/>When we truncate the last 
digit from it we get 201 a strong Harshad number that is also right 
truncatable<BR/>Lets call such primes <i>strong right truncatable 
Harshad primes</i></P><P>You are given that the sum of the strong 
right truncatable Harshad primes less than 10000 is 90619</P><P>Find 
the sum of the strong right truncatable Harshad primes less than 10
<sup>14</sup></P>
*/
object Euler387 extends App {
  println("Euler 387")
}
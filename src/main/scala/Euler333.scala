/**
All positive integers can be partitioned in such a way that each and 
every term of the partition can be expressed as 2<sup>i</sup>x3<sup>j
</sup> where ij ge 0

Lets consider only those such partitions where none of the terms can 
divide any of the other terms
For example the partition of 17  2  6  9  2<sup>1</sup>x3<sup>0</sup>  
2<sup>1</sup>x3<sup>1</sup>  2<sup>0</sup>x3<sup>2</sup> would not be 
valid since 2 can divide 6 Neither would the partition 17  16  1  2
<sup>4</sup>x3<sup>0</sup>  2<sup>0</sup>x3<sup>0</sup> since 1 can 
divide 16 The only valid partition of 17 would be 8  9  2<sup>3</sup>
x3<sup>0</sup>  2<sup>0</sup>x3<sup>2</sup></br>

Many integers have more than one valid partition the first being 11 
having the following two partitions
11  2  9  2<sup>1</sup>x3<sup>0</sup>  2<sup>0</sup>x3<sup>2</sup>
11  8  3  2<sup>3</sup>x3<sup>0</sup>  2<sup>0</sup>x3<sup>1</sup>

Lets define P<var>n</var> as the number of valid partitions of <var>n
</var> For example P11  2

Lets consider only the prime integers <var>q</var> which would have a 
single valid partition such as P17

The sum of the primes <var>q</var> lt100 such that P<var>q</var>1 
equals 233

Find the sum of the primes <var>q</var> lt1000000 such that P<var>q
</var>1
*/
object Euler333 extends App {
  println("Euler 333")
}
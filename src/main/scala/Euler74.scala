/**
The number 145 is well known for the property that the sum of the 
factorial of its digits is equal to 145

1  4  5  1  24  120  145

Perhaps less well known is 169 in that it produces the longest chain 
of numbers that link back to 169 it turns out that there are only 
three such loops that exist

169 rarr 363601 rarr 1454 rarr 169
871 rarr 45361 rarr 871
872 rarr 45362 rarr 872

It is not difficult to prove that EVERY starting number will 
eventually get stuck in a loop For example

69 rarr 363600 rarr 1454 rarr 169 rarr 363601 rarr 1454
78 rarr 45360 rarr 871 rarr 45361 rarr 871
540 rarr 145 rarr 145

Starting with 69 produces a chain of five nonrepeating terms but the 
longest nonrepeating chain with a starting number below one million is 
sixty terms

How many chains with a starting number below one million contain 
exactly sixty nonrepeating terms
*/
object Euler74 extends App {
  println("Euler 74")
}
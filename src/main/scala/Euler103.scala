/**
Let SA represent the sum of elements in set A of size <i>n</i> We 
shall call it a special sum set if for any two nonempty disjoint 
subsets B and C the following properties are true
<ol style="list-style-type:lower-roman;"><li>SB ne SC that is sums of 
subsets cannot be equal</li><li>If B contains more elements than C 
then SB gt SC</li></ol>

If SA is minimised for a given <i>n</i> we shall call it an optimum 
special sum set The first five optimum special sum sets are given 
below

<i>n</i>  1 1
<i>n</i>  2 1 2
<i>n</i>  3 2 3 4
<i>n</i>  4 3 5 6 7
<i>n</i>  5 6 9 11 12 13

It <i>seems</i> that for a given optimum set A  <i>a</i><sub>1</sub> 
<i>a</i><sub>2</sub>   <i>a</i><sub>n</sub> the next optimum set is of 
the form B  <i>b</i> <i>a</i><sub>1</sub><i>b</i> <i>a</i><sub>2</sub>
<i>b</i>  <i>a</i><sub>n</sub><i>b</i> where <i>b</i> is the quot
middlequot element on the previous row

By applying this quotrulequot we would expect the optimum set for <i>n
</i>  6 to be A  11 17 20 22 23 24 with SA  117 However this is not 
the optimum set as we have merely applied an algorithm to provide a 
near optimum set The optimum set for <i>n</i>  6 is A  11 18 19 20 22 
25 with SA  115 and corresponding set string 111819202225

Given that A is an optimum special sum set for <i>n</i>  7 find its 
set string

NOTE This problem is related to <a href="problem=105">Problem 105</a> 
and <a href="problem=106">Problem 106</a>
*/
object Euler103 extends App {
  println("Euler 103")
}
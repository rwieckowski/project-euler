/**
<i>Nim</i> is a game played with heaps of stones where two players 
take it in turn to remove any number of stones from any heap until no 
stones remain

Well consider the threeheap normalplay version of Nim which works as 
follows
 At the start of the game there are three heaps of stones
 On his turn the player removes any positive number of stones from any 
single heap
 The first player unable to move because no stones remain loses

 If <var>n</var><sub>1</sub><var>n</var><sub>2</sub><var>n</var><sub>3
</sub> indicates a Nim position consisting of heaps of size <var>n
</var><sub>1</sub> <var>n</var><sub>2</sub> and <var>n</var><sub>3
</sub> then there is a simple function <var>X</var><var>n</var><sub>1
</sub><var>n</var><sub>2</sub><var>n</var><sub>3</sub> mdash that you 
may look up or attempt to deduce for yourself mdash that returns<ul>
<li>zero if with perfect strategy the player about to move will 
eventually lose or</li><li>nonzero if with perfect strategy the player 
about to move will eventually win</li></ul>

For example <var>X</var>123  0 because no matter what the current 
player does his opponent can respond with a move that leaves two heaps 
of equal size at which point every move by the current player can be 
mirrored by his opponent until no stones remain so the current player 
loses To illustrate
 current player moves to 121
 opponent moves to 101
 current player moves to 001
 opponent moves to 000 and so wins

For how many positive integers <var>n</var>thinsplethinsp2<sup>30
</sup> does <var>X</var><var>n</var>2<var>n</var>3<var>n</var>  0 
*/
object Euler301 extends App {
  println("Euler 301")
}
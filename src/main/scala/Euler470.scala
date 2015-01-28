/**
<P>Consider a single game of Ramvok</P><P>Let <var>t</var> represent 
the maximum number of turns the game lasts If <var>t</var>  0 then the 
game ends immediately Otherwise on each turn <var>i</var> the player 
rolls a die After rolling if <var>i</var> lt <var>t</var> the player 
can either stop the game and receive a prize equal to the value of the 
current roll or discard the roll and try again next turn If <var>i
</var>  <var>t</var> then the roll cannot be discarded and the prize 
must be accepted Before the game begins <var>t</var> is chosen by the 
player who must then pay an upfront cost <var>ct</var> for some 
constant <var>c</var> For <var>c</var>  0 <var>t</var> can be chosen 
to be infinite with an upfront cost of 0 Let R<var>d</var> <var>c
</var> be the expected profit ie net gain that the player receives 
from a single game of optimallyplayed Ramvok given a fair <var>d</var>
sided die and cost constant <var>c</var> For example R4 02  265 Assume 
that the player has sufficient funds for paying anyall upfront costs
</P><P>Now consider a game of Super Ramvok</P><P>In Super Ramvok the 
game of Ramvok is played repeatedly but with a slight modification 
After each game the die is altered The alteration process is as 
follows The die is rolled once and if the resulting face has its pips 
visible then that face is altered to be blank instead If the face is 
already blank then it is changed back to its original value After the 
alteration is made another game of Ramvok can begin and during such a 
game at each turn the die is rolled until a face with a value on it 
appears The player knows which faces are blank and which are not at 
all times The game of Super Ramvok ends once all faces of the die are 
blank</P><P>Let S<var>d</var> <var>c</var> be the expected profit that 
the player receives from an optimallyplayed game of Super Ramvok given 
a fair <var>d</var>sided die to start with all sides visible and cost 
constant <var>c</var> For example S6 1  2083</P><P>Let F<var>n</var>  
sum<sub>4le<var>d</var>le<var>n</var></sub> sum<sub>0le<var>c</var>le
<var>n</var></sub> S<var>d</var> <var>c</var></P><P>Calculate F20 
rounded to the nearest integer</P>
*/
object Euler470 extends App {
  println("Euler 470")
}
/**
A program written in the programming language Fractran consists of a 
list of fractions

The internal state of the Fractran Virtual Machine is a positive 
integer which is initially set to a seed value Each iteration of a 
Fractran program multiplies the state integer by the first fraction in 
the list which will leave it an integer

For example one of the Fractran programs that John Horton Conway wrote 
for primegeneration consists of the following 14 fractions
<table class="formula"><tr><td><table class="frac">    <tr><td>17</td>
</tr><tr><td class="overline">91</td></tr></table></td><td></td><td>
<table class="frac">    <tr><td>78</td></tr><tr><td class="overline">
85</td></tr></table></td><td></td><td><table class="frac">    <tr><td>
19</td></tr><tr><td class="overline">51</td></tr></table></td><td>
</td><td><table class="frac">    <tr><td>23</td></tr><tr>
<td class="overline">38</td></tr></table></td><td></td><td>
<table class="frac">    <tr><td>29</td></tr><tr><td class="overline">
33</td></tr></table></td><td></td><td><table class="frac">    <tr><td>
77</td></tr><tr><td class="overline">29</td></tr></table></td><td>
</td><td><table class="frac">    <tr><td>95</td></tr><tr>
<td class="overline">23</td></tr></table></td><td></td><td>
<table class="frac">    <tr><td>77</td></tr><tr><td class="overline">
19</td></tr></table></td><td></td><td><table class="frac">    <tr><td>
1</td></tr><tr><td class="overline">17</td></tr></table></td><td></td>
<td><table class="frac">    <tr><td>11</td></tr><tr>
<td class="overline">13</td></tr></table></td><td></td><td>
<table class="frac">    <tr><td>13</td></tr><tr><td class="overline">
11</td></tr></table></td><td></td><td><table class="frac">    <tr><td>
15</td></tr><tr><td class="overline">2</td></tr></table></td><td></td>
<td><table class="frac">    <tr><td>1</td></tr><tr>
<td class="overline">7</td></tr></table></td><td></td><td>
<table class="frac">    <tr><td>55</td></tr><tr><td class="overline">1
</td></tr></table></td><td></td></tr></table>

Starting with the seed integer 2 successive iterations of the program 
produce the sequence
15 825 725 1925 2275 425  68 <b>4</b> 30  136 <b>8</b> 60  544 <b>32
</b> 240 

The powers of 2 that appear in this sequence are 2<sup>2</sup> 2<sup>3
</sup> 2<sup>5</sup> 
It can be shown that <i>all</i> the powers of 2 in this sequence have 
prime exponents and that <i>all</i> the primes appear as exponents of 
powers of 2 in proper order

If someone uses the above Fractran program to solve Project Euler 
Problem 7 find the 10001<sup>st</sup> prime how many iterations would 
be needed until the program produces 2<sup>10001st prime</sup> 
*/
object Euler308 extends App {
  println("Euler 308")
}
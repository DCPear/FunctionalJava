# FunctionalJava
functional programming has become more and more popular
what
functional programming and object oriented progamming are not opposite
why
to avoid bugs
 you'll learn many techniques that can be used to create very large, powerful, and virtually bug-free code bases that are composed of many smaller, self-contained, and easily testable parts.
 there are several ways that functional programming aims to do this, but all of them are centered around this idea. Functional programming brings the precision of mathematical functions into computer programs.
 f(x) = x+1
 adding the provable certainty that comes with mathematics into computer programming makes it far easier to avoid bugs.
 
two styles of programming
declative(what is it?) and imperitive(how do i get it?)

Core concepts of functional programming
1. Immutability(treat all data as immutable)
   In declarive programming we name a container and we assign values to it, container can hold different values at differnt times.
   In functional programming, we don't assign so much as define.
   int x=3; mean x is 3 (X is just another name for three.)
   So functional programming treats all values as if they were as concrete and unchanging as pi or any other mathematical constant. <br>
   *So the advantage of immutability and the reason that functional programming places such an emphasis on it is that it frees us from having to deal with something called state change. When a program contains many variables that are all constantly changing at different times, it can be very hard to know what state a program is going to be in at any given point in time, and as programs increase in size to include thousands or even millions of individual variables, this can lead to extremely hard to find bugs and an overall fragile code base that programmers are afraid to make changes to.*

advantages: 
1. original data in a program will always remain intact, which makes bugs a lot easier to find.
2. That programs constructed in this way are much easier to keep track of, since we can focus on any given piece individually            

2. functional purity
In functional programming, we aim to make all of our functions into pure functions. And what this means is that the functions we write should always return the same output, given the same arguments.
person.getAge(); 34
person.setAge(50);
person.getage(); 50

pure function
int add(int x, in y){
return x+y;
}

3. First-class functions

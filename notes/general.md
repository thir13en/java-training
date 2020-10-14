# General


### The `main` method
Java programs by default look for the `main` method as an entrypoint to start the programJ.

### Operators
* + - -> addition substraction
* * -> multiplication
* / -> division
* % -> mod
* && -> and
* || -> or
* & -> bitwise and
* |-> bitwise or
* > -> gt
* < -> st
* boolean ? something : another -> ternary operator is available in Java.  

Here you are a [Java Operators Precedence Table](http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html).

As in `JavaScript`, some shorthands can be used:
```java
int number = 13;
number *= 2;	// 26
```

If you want to know more about the Java keywords, you can reach them [here](https://en.wikipedia.org/wiki/List_of_Java_keywords).  

### Control statements
In a `switch` control statement, you can pile up several cases in one line:
```java
switch (myThingy) {
	case 1: case 2: case 3:
		// handler for these cases
		break;
}
```

### Exiting a for look
You can do so with the `break;` instruction. Also you can do a `continue;` which also breaks the execution flow of the current iteration but keeps the loop going.

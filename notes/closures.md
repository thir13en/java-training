# Closures


### Code blocks
In Java, variables are destroyed when a code block execution context is finished:
```java
if (something) {
	int number = 100;
	System.out.println(number); // 100
}
System.out.println(number); // undefined, compile time error
```
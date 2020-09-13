# Data Types


### Primitive data types
1. boolean
1. byte --> 8 bits
1. char --> was much more useful when Java was release, since they are very optimal with memory, now not so important. It occupies 2 bytes of memory (It allows you to store Unicode characters).
1. short --> 16 bits, rarely used
1. int --> 32 bits
1. long --> 64 bits
1. float --> Single precision decimal number -> 32bits, rarely used
1. double --> double precision decimal number -> 64bits / 8 bytes

### String
This is NOT a primitive data type, it's actually a class, but has some special features in Java that makes it easier to use. String in Java are `Immutable`, which means when you try to modify a `String`, what happens under the hood is that a new `String` is created. The most optimal way to modify of make additions to a `String` value is using the class `StringBuffer`.

### Wrapper classes
Java uses the concept of `wrapper class` for the primitive values, for example in the case of `int`, we got the wrapper class `Integer`.

### Casting
Some operation is Java can be conflictive, for instance:
```java
byte byteValue = (Byte.MIN_VALUE / 2);
```
Will throw a compile time error due to a `byte` divided by an `integer` being considered the latter, to avoid that we can `cast` the result:
```java
byte byteValue = (byte)(Byte.MIN_VALUE / 2);
```

### Foating Point Number
They are fractionary numbers with decimal parts, there are two primitive types to deal with them. `float` and `double`.  
The `double` precision number or `Double` wrapper class is the one recommended, it has more capacity, precision and it has more optimizations and runtime speed due to the architecture of modern CPUs (64bits). By default, Java uses `double` precision numbers by default when it deals with decimals.

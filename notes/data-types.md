# Data Types


### Primitive data types
1. boolean
1. byte --> 8 bits
1. char
1. short --> 16 bits
1. int --> 32 bits
1. long --> 64 bits
1. float

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
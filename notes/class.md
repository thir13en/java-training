# Class


### Methods
When invoked inside the class, the `this` keyword is `NOT` necessary.

### Method overloading
Consists on using the same method name but with different paramenters. It does NOT work just by reusing the same signature and parameters and changing the return type, it needs to change the number of parameters.

### Constructor syntax
```java
public class Kebab {
	public Kebab() {
		// construction logic
	}
}
```
We can even call a constructor from another constructor to initialize with default values.
```
public class Kebab {
	public Kebab() {
		this('Yougurt', true); // calls to another constructor must be the very first line of the constructor
	}
	public Kebab(String sauce, boolean vegan) {
		// construction logic
	}
}
```

### Initializing properties
As a rule of thumb, set properties directly in the constructor by assignation, not by calling the setter, which is reserved for used outside the constructor. 
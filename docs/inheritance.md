# Inheritance

You can create classes with shared characteristics across many classes, and then create classes that **inherit** from it. This will promote code reusability.
```java
public class Dog extends Animal {
	private int eyes;
	private int legs;
	// properties that are characteristics of the child class...
	public Dog(String name, int brain, int body, int size, int weight) {
		// the super constructor always needs to be the first line in the child class constructor
		// you could also delete parameters and set them by default
		super(name, brain, body, size, weight);
	}

	// methods specific to the child class...
	public void bark() {
		System.out.printlm("Guau!");
	}

}
```

### The mother of all Classess
**All** classes created in Java, extend from `java.lang.Object`, so in Java, everything is an object and has the following public methods:
* hashCode();
* equals();
* clone();
* toString();
* finalize();

### Override extended methods:
```java
public class Dog extends Animal {
	private int eyes;
	private int legs;
	// properties that are characteristics of the child class...
	public Dog(String name, int brain, int body, int size, int weight) {
		// the super constructor always needs to be the first line in the child class constructor
		// you could also delete parameters and set them by default
		super(name, brain, body, size, weight);
	}

	// methods specific to the child class...
	public void bark() {
		System.out.printlm("Guau!");
	}

	@Override
	public void eat() {
		// you can call the super class method in this signature:
		super.eat();
	}

}
```
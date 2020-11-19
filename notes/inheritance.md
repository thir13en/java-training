# Inheritance

You can create classes with shared characteristics across many classes, and then create classes that **inherit** from it. This will promote code reusability.
```java
public class Dog extends Animal {
	public Dog(String name, int brain, int body, int size, int weight) {
		// the super constructor always needs to be the first line in the child class constructor
		super(name, brain, body, size, weight);
	}

}
7:40
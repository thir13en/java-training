# Class


### Methods
When invoked inside the class, the `this` keyword is `NOT` necessary.

### Method overloading
Consists on using the same method name but with different paramenters. It does **NOT** work just by reusing the same signature and parameters and changing the return type, it needs to change the number or type of parameters.  
It is often related with **polymorphism**, but it has nothing to do with it. It is often referred as **Compile Time Polymorphism**.  
You can overload `static` and `instance` methods. 

### Method overriding
It is actual **Runtime Polymorphism** and **Dynamic Method Dispatch**, it consist en defining a method signature that already exists in the parent class, and overriding it's implementation with the `@Override` decorator.  
Overriden method **can't** have a less restrictive modifier, for example `protected` => `public` will fail, while `protected` => `private` won't. You can use `super.<methodName>()` to still call the non-overriden method.  
Al a last note, the overriden method **can't** throw a new or broader checked exception. 

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

### Super vs This
`super` is used to access the superclass methods, while `this` accesses the current instance. It is used for usually with method overriding, for specifying that we want to explicitly call the superclass method. By default, constructors add a call to `super()` superclass constructor with no arguments (empty constructor). An `abstract class` is still a superclass and it's constructor is called whenever instantiated.
* call to parent constructor: `super(...args)`
* call to current instrance constructor: `this(...args)`

### Static vs Instance methods and properties
`Static` modifier tells us that a method or property is not an instance one, but can be accesses directly though the class declaration, i.e. `ClassName.staticMethod()`. On the opposite, to use an `Instance` method or property, we first need to craete or instance a class with the `new` keyword.
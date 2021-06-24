# Class


### Methods
When invoked inside the class, the `this` keyword is `NOT` necessary.

### Method overloading
Consists on using the same method name but with different parameters. It does **NOT** work just by reusing the same 
signature and parameters and changing the return type, it needs to change the number or type of parameters.  
It is often related with **polymorphism**, but it has nothing to do with it. It is often referred as **Compile Time Polymorphism**.  
You can overload `static` and `instance` methods.

### Method overriding
It is actual **Runtime Polymorphism** and **Dynamic Method Dispatch**, it consists on defining a method signature that 
already exists in the parent class, and overriding it's implementation with the `@Override` decorator.  
Overridden method **can't** have a less restrictive modifier, for example `protected` => `public` will fail, while 
`protected` => `private` won't. You can use `super.<methodName>()` to still call the non-overridden method.  
As a last note, the overridden method **can't** throw a new or broader checked exception.

### Constructor syntax
```java
public class Kebab {
	public Kebab() {
		// construction logic
	}
}
```
We can even call a constructor from another constructor to initialize with default values.
```java
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
As a rule of thumb, set properties directly in the constructor by an assignation, not by calling the setter, which is 
reserved for used outside the constructor.

### Super vs This
`super` is used to access the superclass methods, while `this` accesses the current instance. It is used for usually 
with method overriding, for specifying that we want to explicitly call the superclass method. By default, constructors 
add a call to `super()` superclass constructor with no arguments (empty constructor). An `abstract class` is still a 
superclass, and it's constructor is called whenever instantiated.
* call to parent constructor: `super(...args)`
* call to current instance constructor: `this(...args)`

### Static vs Instance methods and properties
`Static` modifier tells us that a method or property is not an instance one, but can be accesses directly though the 
class declaration, i.e. `ClassName.staticMethod()`. On the opposite, to use an `Instance` method or property, we first 
need to create or instance a class with the `new` keyword.  
If you change a `static` field in one class, the change will propagate to the others, because that field belongs to the 
object that holds the class. So actually you do not change all other instances, but the value of the memory position 
that holds the pointer of the static method will be changed.
`Instance fields`, on the contrary, represent the specific **state** of an instantiated element. 

### toString
Every Class implements a `toString` method that by default provides the fully qualified name of the class 
(package + className) @ the position of memory at runtime:
```
com.santiloopz.MyClass@dfasdcx 
```

### Casting in Java
You can specify a certain instance belongs to a class with `Casting`, like this:
```java
IInterface monster = new Monster();
// The compiler knows about the interface but not the class, but we can explicit it!!
(Monster myMonster).getStrength();
```

### Nested and inner Classes
* Non-static nested Class / Inner Class
  
* Static nested classes
* Local Class
* Anonymous Class

#### Local Class
You can nest one class inside another, this is what we call a `Local Class`, it will be interesting to do this when we
need to create a Class that will only be referred within the context of another.  
The `this` keyword within the inner class will refer to the class itself and not the container class.  
To instantiate Local Classes, you follow this syntax:
```java
// Instantiate container class
Gearbox mcLaren = new Gearbox(6);

// Instantiate local class
Gearbox.Gear gear = Gearbox.new Gear(1, 1.2);
```
It is important to consider that you will need to have an instance of the parent class to be able to access the
local class constructor.

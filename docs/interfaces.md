# Interfaces

Refer to abstract implementation definitions WITHOUT the implementation itself, which is delegated to the class.
The Interface of a method is also named **Signature**.  
By convention you start Interfaces names with the capital letter `I`, so `IMyInterfaceName`. Example:
```java
// ITelephone
public interface ITelephone {
	// You only declare the publicly accessible members en the signature
	void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean isRinging();
}
```
Now you can use the interface with the `implements` keyword.
```java
public class DeskTelephone implements ITelephone {
	// ???? I have doubts here, you need to overrride all Interface membrs
	private myNumber;
	private model;
	@Override
	void powerOn() {
		// my implementation
	};
	@Override
	void dial(int phoneNumber) {
		// my implementation
	};
	@Override
	void answer() {
		// my implementation
	};
	@Override
	boolean isRinging() {
		// my implementation
	};
}
```
And now, to create instances, you create based on the Interface type:
```java
// ...
private ITelephone myPhone = new DeskTelephone();
// ...
```

### Defining interfaces
An interface is an abstract contract that a class will implement in some part of our source. When we define interfaces we can
be more or less restrictive in our definitions, for example we can force some property to be `ArrayList<String>`, or we
could just completely skip the `ArrayList` and only force to use a `List<String`, which will allow the user to user
other types of List, we can even go as far as to determine that the property is of type `List`, so we provide more degrees
of freedom in determining what kind of content will our list have.

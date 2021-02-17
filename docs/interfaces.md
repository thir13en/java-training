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
# Interfaces

Refer to abstract implementation definitions WITHOUT the implementation itself, which is delegated to the class.
The Interface of a method is also named **Signature**.  
By convention you start Interfaces names with the capital letter `I`, so `IMyInterfaceName`. Example:
```java
// ITelephone
public interface ITelephone {
	public void powerOn();
	public void dial(int phoneNumber);
	public void answer();
	public boolean isRinging();
}
# Collection Types

### Array
Arrays inherit from the `List` object.
#### Syntax:
```java
int[] numbers = new int[10]; // Creates an array with 10 uninitialized positions
numbers[5] = 55;
// or
int[] otherNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
// or reassigning (de-referencing)
initializedArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
```
#### Simple iteratation
```java
public static void printArray(int[] array) {
	for (int i=0; i<array.length; i++) {
		System.out.println("Element " + i + " value is " + array[i]);
	}
}
```

### Sort an Array
This mutates the original array:
```java
Arrays.sort(copyintegers);
```

### Resizing an Array
#### The Manual way
You should copy the old array in a new one and then reassign the new size to the array and loop through the original one to fill up the newly assigned array.

### Output an Array
```java
System.out.println(Arrays.toString(arrayName));
```

### Lists
An **Interface** that represents the structure for an **ordered collection or sequence** of elements.

#### ArrayLists
Extends from `AbstractList` which implements the `List` interface. The interesting feature of `ArrayLists` is that they assign new memory space dynamically when they are resized. `ArrayList` are defined with a **generic type** which informs the compiler on what kind of data they are holding:
```java
private ArrayList<String> myArrayList = new ArrayList<String>();

private void addElementToArrayList(String el) {
	// the logic for resizing and assigning is handled automagically
	myArrayList.add(el);
}
private void replaceElementInArrayList(int position, String el) {
	myArrayList.set(position, el);
}
private void removeElementInArrayList(int position) {
	myArrayList.remove(position);
}
private boolean containsElement(String el) {
	return myArrayList.contains(el);
}
private int containsElementByIndexOf(String el) {
	// returns -1 if not, otherwise returns the element
	return myArrayList.indexOf(el);
}
private void cloneArray(String el) {
	// adds the content of one array to the other
	myArrayList.addAll(readyPopulatedArrayList);
}
```

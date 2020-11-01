# Console I/O


### Print to the console
No line break:
`System.out.print(myString)`

With line break:
`System.out.println(myString)`

### Read user input
```java
Scanner scanner = new Scanner(System.in);

System.out.println("Enter your name: ");
String name = scanner.nextLine();
String name = scanner.nextLine(); // handle next line character
System.out.println("Enter your year of birth: ");
int birthYear = scanner.nextInt();
int age = 2020 - birthYear;

System.out.println("Your name is: " + name);
System.out.println("Your year of birth: " + birthYear + "and you are " + age + "years old");

scanner.close();
```
Adding some checks:
```java
Scanner scanner = new Scanner(System.in);

System.out.println("Enter your year of birth: ");

boolean hasNextInt = scanner.hasNextInt(); // check if input qualifies as an int

if (hasNextInt) {
	int birthYear = scanner.nextInt();
	int age = 2020 - birthYear;
	String name = scanner.nextLine(); // handle next line character

	System.out.println("Enter your name: ");
	String name = scanner.nextLine();
	System.out.println("Your name is: " + name);
	if (birthYear > 1910 || birthYear < 2021) {
		System.out.println("Your year of birth: " + birthYear + "and you are " + age + "years old");
	} else {
		System.out.println("Invalid year of birth");
	}

} else {
	System.out.println("Unable to parse year of birth");
}
```
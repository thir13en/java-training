package training.santiloopz;

public class Main {

    public static void main(String[] args) {
	    boolean isAlien = false;
	    int alienCreatures = 13;

	    if (!isAlien) {
            System.out.println("Hello, humanito");
        } else {
            System.out.println("Hello, alien");
        }

	    if (alienCreatures == 13) {
            System.out.println("time to panic!");
        } else if (alienCreatures < 13) {
            System.out.println("tranquilo brother");
        }

	    // increase / decrease int
        int value = 13;
        value++;
        System.out.println(value); // 14
        value--;
        System.out.println(value); // 13
    }
}

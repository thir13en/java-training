package com.santiloopz.learning.builtinlists.arrays;

import java.util.Scanner;

public class MinElement {
    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a number");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        return 0;
    }

    public static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[count];
        System.out.println("Enter " + count + " numbers:\r");
        for (int i=0; i<count; i++) {
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
                scanner.nextLine();
            }
        }
        return numbers;
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];

        for (int i=1; i<numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        return min;
    }
}

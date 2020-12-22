package com.santiloopz.learning.builtinlists.arrays;

import java.util.Scanner;

public class MinElement {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInteger() {
        System.out.println("Add a number");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        return 0;
    }

    public static int readElements(int elementsCount) {
        System.out.println("Enter " + elementsCount + " numbers:\r");
        for (int i=0; i<elementsCount; i++) {
            if (scanner.hasNextInt()) {
                scanner.nextInt();
            }
        }
        return 0;
    }
}

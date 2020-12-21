package com.santiloopz.learning.builtinlists.arrays;

import java.util.Scanner;

public class MinElement {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInteger() {
        System.out.println("Add a number");
        if (scanner.hasNextInt()) {
            scanner.nextInt();
        }
        return 0;
    }
}

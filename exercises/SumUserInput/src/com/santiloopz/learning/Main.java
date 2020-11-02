package com.santiloopz.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt;
        int sum = 0;

	    for (int i = 10; i > 0; i--) {
            System.out.println("Enter a number");
            hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                sum += scanner.nextInt();
            } else {
                System.out.println("Not a number");
                i++;
            }
        }
        scanner.close();
        System.out.println("The total sum is " + sum);
    }
}

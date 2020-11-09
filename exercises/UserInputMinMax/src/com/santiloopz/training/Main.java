package com.santiloopz.training;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int next;

        while (scanner.hasNextInt()) {
            System.out.println("Has next");
            next = scanner.nextInt();

            if (max < next) {
                max = next;
            }
            if (min > next) {
                min = next;
            }
        }

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        scanner.close();
    }
}

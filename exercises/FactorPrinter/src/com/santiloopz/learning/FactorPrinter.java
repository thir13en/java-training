package com.santiloopz.learning;


public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        int maxDividend = number / 2 + (number % 2 == 0 ? 0 : 1);

        for (int i = 1; i <= maxDividend; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        if (number > 1) {
            System.out.println(number);
        }
    }
}

package com.santiloopz.training;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
        }

        System.out.println("SUM = " + sum + " AVG = " + (count == 0 ? count : Math.round((double) sum / (double) count)));
    }
}

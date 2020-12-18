package com.santiloopz.learning.oop.collections;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = getNumbers(10);
        printArray(numbers);
    }

    private static int[] getNumbers(int capacity) {
        int[] numbers = new int[capacity];

        System.out.println("Enter " + capacity + " integer values\r");
        for (int i=0; i<capacity; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " => " + array[i]);
        }
    }

}

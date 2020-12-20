package com.santiloopz.learning.builtinlists.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = sortIntegers(getIntegers(10));
        printArray(numbers);
    }

    private static int[] getIntegers(int capacity) {
        int[] numbers = new int[capacity];

        System.out.println("Enter " + capacity + " integer values\r");
        for (int i=0; i<capacity; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    private static int[] sortIntegers(int[] integers) {
        int[] copyintegers = Arrays.copyOf(integers, integers.length);

        Arrays.sort(copyintegers);
        Collections.reverse(Arrays.asList(copyintegers));

        return copyintegers;
    }

}

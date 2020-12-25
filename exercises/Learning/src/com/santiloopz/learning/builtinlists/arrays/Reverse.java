package com.santiloopz.learning.builtinlists.arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] n = { 4, 6, 7, 8, 9, 1 };
        reverse(n);
    }
    private static void reverse(int[] numbers) {
        int temp;

        for (int i=0; i<(numbers.length / 2); i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(numbers));
    }
}

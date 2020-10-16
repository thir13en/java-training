package com.santiloopz.learning;


public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        number *= number < 0 ? -1 : 1;
        int buffer = number;
        int reversed = 0;

        while (buffer > 0) {
            reversed += buffer % 10;
            buffer /= 10;
            System.out.println(reversed);
            if (buffer > 0) {
                reversed *= 10;
            }
        }

        return reversed == number;
    }
}

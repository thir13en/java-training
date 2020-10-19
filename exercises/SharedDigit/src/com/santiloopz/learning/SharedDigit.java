package com.santiloopz.learning;


public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second) {
        if ((first < 10 || first > 99) || (second < 10 || second > 99)) {
            return false;
        }
        int currentFirstDigit = 0;
        int secondBuffer = second;

        while (first > 0) {
            currentFirstDigit = first % 10;
            secondBuffer = second;
            while (secondBuffer > 0) {
                if (currentFirstDigit == secondBuffer % 10) {
                    return true;
                }
                secondBuffer /= 10;
            }
            first /= 10;
        }
        return false;
    }
}

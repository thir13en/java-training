package com.santiloopz.learning;


public class LastDigitChecker {

    public static boolean isValid(int number) {
        return number > 9 && number < 1001;
    }
    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (!isValid(first) || !isValid(second) || !isValid(third)) {
            return false;
        }
        first %= 10;
        second %= 10;
        third %= 10;

        return first == second || first == third || second == third;
    }
}

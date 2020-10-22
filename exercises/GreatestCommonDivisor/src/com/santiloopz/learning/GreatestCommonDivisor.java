package com.santiloopz.learning;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int max = Math.max(first, second);
        int min = Math.min(first, second);

        if (max % min == 0) {
            return min;
        }

        int minDiv = min / 2 + (min % 2 == 0 ? 0 : 1);

        while (minDiv > 1) {
            if (max % minDiv == 0 && min % minDiv == 0) {
                return minDiv;
            }
            minDiv--;
        }
        return -1;
    }
}

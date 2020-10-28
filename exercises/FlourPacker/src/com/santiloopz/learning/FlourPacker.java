package com.santiloopz.learning;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigCountSize = 5;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (goal > (bigCount * bigCountSize + smallCount)) {
            return false;
        }
        if (bigCount > 0) {
            if (goal % bigCountSize == 0) {
                return true;
            } else {
                return goal % bigCountSize <= smallCount;
            }
        }

        return goal <= smallCount;
    }
}

package com.santiloopz.learning;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int reversed = reverse(number);
        String wordNumber = "";
        for (int i = 0; i < getDigitCount(number); i++) {
            switch (reversed % 10) {
                case 0:
                    wordNumber = wordNumber + " Zero";
                    break;
                case 1:
                    wordNumber = wordNumber + " One";
                    break;
                case 2:
                    wordNumber = wordNumber + " Two";
                    break;
                case 3:
                    wordNumber = wordNumber + " Three";
                    break;
                case 4:
                    wordNumber = wordNumber + " Four";
                    break;
                case 5:
                    wordNumber = wordNumber + " Five";
                    break;
                case 6:
                    wordNumber = wordNumber + " Six";
                    break;
                case 7:
                    wordNumber = wordNumber + " Seven";
                    break;
                case 8:
                    wordNumber = wordNumber + " Eight";
                    break;
                case 9:
                    wordNumber = wordNumber + " Nine";
                    break;
                default:
                    break;
            }
            reversed /= 10;
        }
        System.out.println(wordNumber);
    }

    public static int reverse(int number) {
        if (number < 10 && number > -10) {
            return number;
        }

        boolean negative = number < 0;

        if (negative) {
            number *= -1;
        }
        int reversed = 0;

        while (number > 0) {
            reversed *= 10;
            reversed += number % 10;
            number /= 10;
        }
        reversed *= negative ? -1 : 1;

        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}

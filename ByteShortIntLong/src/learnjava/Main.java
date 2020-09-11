package learnjava;

public class Main {
    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.println("int min value: " + min);                // -2147483648
        System.out.println("int max value: " + max);                // 2147483647
        System.out.println("overflow max value: " + (max + 1));     // -2147483648
        System.out.println("overflow min value: " + (min - 1));     // 2147483647

        // you can use underscores to separate numbers
        int maxNumberSeparated = 2_147_483_647;

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        System.out.println("int min byte value: " + minByte);                // -128
        System.out.println("int max byte value: " + maxByte);                // 127
        System.out.println("overflow max byte value: " + (maxByte + 1));     // -128
        System.out.println("overflow min byte value: " + (minByte - 1));     // 127

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;

        System.out.println("int min short value: " + minShort);                // -32769
        System.out.println("int max short value: " + maxShort);                // 32768
        System.out.println("overflow max short value: " + (maxShort + 1));     // -32769
        System.out.println("overflow min short value: " + (minShort - 1));     // 32768

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.println("int min long value: " + minLong);                // -9223372036854775808
        System.out.println("int max long value: " + maxLong);                // 9223372036854775807
        System.out.println("overflow max long value: " + (maxLong + 1));     // -9223372036854775808
        System.out.println("overflow min long value: " + (minLong - 1));     // 9223372036854775807

        long aLongNumber = 100L;        // The final L tells the compiler this is a LONG value
    }
}

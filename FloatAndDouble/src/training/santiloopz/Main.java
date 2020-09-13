package training.santiloopz;

public class Main {

    public static void main(String[] args) {
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;

        System.out.println("Min float value: " + minFloatValue);
        System.out.println("Max float value: " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;

        System.out.println("Min double value: " + minDoubleValue);
        System.out.println("Max double value: " + maxDoubleValue);

        int intValue = 13;
        float floatValue = 13;
        double doubleValue = 13d;       // notice the ending d (not mandatory)
        double alsoDoubleValue = 13.00;

        // float floatDecimalValue = 13.13;  This produces a compile time error
        float floatDecimalValue = (float) 13.13;    // remember to cast decimals
        float anotherFloatDecimalValue = 13.13f;    // or append the "f"

        double separatedFloatDecimalValue = 13_222_333.45_6_7852_3d;    // you can randomly separate the decimals
    }
}

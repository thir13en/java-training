package santiloopz.training;

public class FeetAndInches {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches argument");
            return -1;
        }
        double centimeters = feet * 12 * 2.54;
        centimeters += inches * 2.54;

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid inches argument");
            return -1;
        }
        int feet = (int) inches / 12;
        int remainingInches = (int) inches % 12;
        System.out.println(feet + " feet and " + remainingInches + " inches");
        return inches * 2.54;
    }
}

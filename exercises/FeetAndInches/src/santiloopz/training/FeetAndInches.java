package santiloopz.training;

public class FeetAndInches {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches argument");
            return -1;
        }
        double centimeters = calcFeetAndInchesToCentimeters(feet * 12);
        centimeters += calcFeetAndInchesToCentimeters(inches);

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid inches argument");
            return -1;
        }
        return inches * 2.54;
    }
}

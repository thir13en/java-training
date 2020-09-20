package training.santiloopz;


public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        String message = "Invalid Value";
        if (kilometersPerHour >= 0) {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            message = kilometersPerHour + " km/h = " + milesPerHour + " mi/h";
        }
        System.out.println(message);
    }
}

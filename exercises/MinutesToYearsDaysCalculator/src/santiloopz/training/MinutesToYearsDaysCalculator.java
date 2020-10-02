package santiloopz.training;

public class MinutesToYearsDaysCalculator {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes) {
        long minutesInADay = 60L * 24L;
        long minutesInAYear = minutesInADay * 365L;
        long years = 0;
        long days = 0;

        if (minutes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return;
        } else if (minutes >= minutesInADay) {
            days = (minutes % minutesInAYear) / minutesInADay;
            years =  minutes / minutesInAYear;
        }

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}

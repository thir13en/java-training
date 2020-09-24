package santiloopz.training;


public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                return !(year % 100 == 0) ||
                        year % 100 == 0 &&
                        year % 400 == 0;
            }
        }
        return false;
    }
}

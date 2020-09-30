package santiloopz.training;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(12225));
        System.out.println(getDurationString(1564));
        System.out.println(getDurationString(3945));
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long onlySeconds = seconds % 60;

        return getDurationString(minutes, onlySeconds);
    }
    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long onlyMinutes = minutes % 60;

        return prependZero(hours) + hours + "h " +
                prependZero(onlyMinutes) + onlyMinutes + "m " +
                prependZero(seconds) + seconds + "s";
    }

    private static String prependZero(long n) {
        return n < 10 ? "0" : "";
    }
}

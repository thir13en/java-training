package santiloopz.training;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(12225));
        System.out.println(getDurationString(1564));
        System.out.println(getDurationString(3945));
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        long minutes = seconds / 60;
        long onlySeconds = seconds % 60;

        return getDurationString(minutes, onlySeconds);
    }
    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        long hours = minutes / 60;
        long onlyMinutes = minutes % 60;

        return hours + "h " + onlyMinutes + "m " + (seconds < 10 ? "0" : "") +seconds + "s";
    }
}

package santiloopz.training;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            double megaBytes = Math.floor((double) kiloBytes / 1024);
            double kbRemainder = (double) kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + (int) megaBytes + " MB and " + (int) kbRemainder + " KB");
        }
    }
}

package training.santiloopz;

public class Main {

    public static void main(String[] args) {
        char myChar = 'd';  // char can only store a single character
        char myUnicode = '\u00A9'; // unicode character
        System.out.println(myChar);
        System.out.println(myUnicode);

        // booleans
        boolean totallyTrue = true;
        boolean noWayBro = false;

        // String
        String supBro = "Hi sweetie!";
        supBro = supBro + ", how are you?";
        System.out.println(supBro);

        String stringVsInt = "50";
        int myNumber = 13;

        System.out.println(stringVsInt + myNumber);     // 5013
    }
}
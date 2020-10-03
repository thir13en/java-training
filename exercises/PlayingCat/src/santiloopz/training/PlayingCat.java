package santiloopz.training;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int lowerTemp = 25;
        int upperTemp = summer ? 45 : 35;

        return !(temperature > upperTemp || temperature < lowerTemp);
    }
}

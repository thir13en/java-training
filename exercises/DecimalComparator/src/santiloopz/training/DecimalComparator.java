package santiloopz.training;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        double roundedToThreeDecimalsFirst;
        double roundedToThreeDecimalsSecond;
        if (first >= 0 && second >= 0) {
            roundedToThreeDecimalsFirst = Math.floor(first * 1000) / 1000;
            roundedToThreeDecimalsSecond = Math.floor(second * 1000) / 1000;
        } else if (first < 0 && second < 0) {
            // if numbers are negative, floor will actually select the number closer to zero
            roundedToThreeDecimalsFirst = Math.ceil(first * 1000) / 1000;
            roundedToThreeDecimalsSecond = Math.ceil(second * 1000) / 1000;
        } else {
            return false;
        }
        return roundedToThreeDecimalsFirst == roundedToThreeDecimalsSecond;
    }
}

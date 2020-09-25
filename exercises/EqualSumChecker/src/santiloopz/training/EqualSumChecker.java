package santiloopz.training;

public class EqualSumChecker {
    public static boolean hasEqualSum(int firstOp, int secondOp, int expected) {
        int result = firstOp + secondOp;
        return result == expected;
    }
}

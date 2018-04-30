package algorithm;

/*
    Counting Elements - https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 */
public class FrogRiverOne {
    public static int solution(int X, int[] A) {
        int[] checker = new int[X+1];
        for (int i = 0; i < A.length; i++) {
            addChecker(checker, X, A[i]);
            if (checker[0] == X) {
                return i;
            }
        }
        return -1;
    }

    private static void addChecker(int[] checker, int X, int value) {
        if (X < value) {
            return;
        }

        if (checker[value] == 0) {
            checker[0]++;
            checker[value]++;
        }
    }
}

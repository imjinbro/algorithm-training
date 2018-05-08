package algorithm.codility;

/*
    Counting Elements - https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 */

public class MissingInteger {
    public static int solution(int[] A) {
        boolean[] checker = new boolean[getMaxValue(A) + 1];
        for (int num : A) {
            if (num < 0 || checker[num] == true) {
                continue;
            }
            checker[num] = true;
        }

        for (int i = 1; i < checker.length; i++) {
            if (!checker[i]) {
                return i;
            }
        }
        return checker.length;
    }

    private static int getMaxValue(int[] A) {
        int maxValue = 1;
        for (int num : A) {
            if (maxValue < num) {
                maxValue = num;
            }
        }
        return maxValue;
    }
}
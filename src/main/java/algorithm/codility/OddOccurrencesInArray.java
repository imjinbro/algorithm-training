package algorithm.codility;

import java.util.Arrays;
/*
    https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 */
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        if (A.length == 1) {
            return A[0];
        }

        Arrays.sort(A);
        int value = -1;
        int searchIdx = -1;
        for (int i = 0; i < A.length - 2; i += 2) {
            if (A[i] - A[i + 1] != 0) {
                value = A[i];
                searchIdx = i;
                break;
            }
        }

        if (searchIdx == -1) {
            value = A[A.length - 1];
        }

        return value;
    }
}

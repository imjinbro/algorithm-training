package algorithm.codility;
/*
    https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
 */
public class TapeEquilibrium {
    public static int solution(int[] A) {
        int N = A.length;
        int[] sumArr = new int[N];
        for (int i = 0; i < sumArr.length; i++) {
            int beforeSum = 0;
            if (i != 0) {
                beforeSum = sumArr[i - 1];
            }
            sumArr[i] = beforeSum + A[i];
        }

        int minIdx = -1;
        int minDiff = 2100000000;
        for (int i = 1; i < N; i++) {
            int a = sumArr[i - 1];
            int b = sumArr[i] - a;

            int diff = Math.abs(a - b);
            if (diff < minDiff) {
                minIdx = i;
                minDiff = diff;
            }
        }
        return minIdx;
    }
}

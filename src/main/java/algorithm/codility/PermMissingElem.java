package algorithm.codility;

/*
    https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 */
public class PermMissingElem {
    public static int solution(int[] A) {
        long N = A.length + 1;
        long value = N * (N + 1) / 2;
        for (int num : A) {
            value -= num;
        }
        return (int) value;
    }
}

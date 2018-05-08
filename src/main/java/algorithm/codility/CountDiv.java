package algorithm.codility;

public class CountDiv {


    public static int performanceFailSolution(int A, int B, int K) {
        int cnt = 0;
        for(int i = A; i <= B; i++) {
            if (i % K == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}

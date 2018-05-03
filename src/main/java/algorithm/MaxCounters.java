package algorithm;
/*
    Counting Elements - https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
 */
public class MaxCounters {
    public static int[] solution(int N, int[] A) {
        int[] counter = new int[N];
        int max = 0;
        int tempMax = 0;
        for (int i = 0; i < A.length; i++) {
            int X = A[i];

            if (1 <= X && X <= N) {
                if (counter[X-1] < max) {
                    counter[X-1] = max + 1;
                } else {
                    counter[X-1]++;
                }

                if (counter[X-1] > tempMax) {
                    tempMax = counter[X-1];
                }
            } else {
                max = tempMax;
            }
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] < max) {
                counter[i] = max;
            }
        }
        return counter;
    }

    public static int[] performFailSolution(int N, int[] A) {
        int[] counter = new int[N];

        int currentIdx = -1;
        boolean isAllCheck = false;
        while (currentIdx < A.length-1) {
            System.out.println(currentIdx);
            for (int i = currentIdx + 1; i < A.length; i++) {
                currentIdx = i;
                int idx = A[i] - 1;
                if (A[i] > N) {
                    isAllCheck = true;
                    break;
                }
                counter[idx]++;
            }

            if (isAllCheck) {
                int maxValue = 0;
                for (int value : counter) {
                    if (maxValue < value) {
                        maxValue = value;
                    }
                }

                for (int i = 0; i< counter.length; i++) {
                    counter[i] = maxValue;
                }
                isAllCheck = false;
            }
        }

        return counter;
    }
}

package algorithm.baekjoon.array;

import java.util.Scanner;

public class Q8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        int cnt = 0;
        int start = 0;
        int end = -1;
        int continueNum = 0;

        for (int num = 0; num < N; num++) {
            char[] data = sc.nextLine().toCharArray();
            for(int i = 0; i < data.length; i++) {
                if (data[i] == 'O') {
                    if (start >= end) {
                        start = i;
                    }

                    if (i == data.length - 1) {
                        end = i;
                    }
                } else {
                    end = i - 1;
                }

                if (start <= end) {
                    cnt += continueNum;
                    continueNum = 0;
                }
            }
            System.out.println(cnt);
        }
    }
}

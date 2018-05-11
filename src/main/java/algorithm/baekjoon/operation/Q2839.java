package algorithm.baekjoon.operation;

import java.util.*;

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        while (N >= 3) {
            if (N % 5 == 0) {
                System.out.println(N/5);
                return;
            }

            N -= 3;
            cnt++;

            if (N % 5 == 0) {
                System.out.println((N / 5) + cnt);
                return;
            }
        }
        System.out.println(-1);
    }
}

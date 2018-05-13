package algorithm.baekjoon.condition;

import java.util.Scanner;

public class Q4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int sum = 0;
            int[] scores = new int[sc.nextInt()];

            for (int j = 0; j < scores.length; j++) {
                int num = sc.nextInt();
                sum += num;
                scores[j] = num;
            }

            double avg = sum / scores.length;
            int cnt = 0;
            for (int score : scores) {
                if (avg < score) {
                    cnt++;
                }
            }
            System.out.println(String.format("%.3f", (double)cnt / scores.length * 100) + "%");
        }
    }
}

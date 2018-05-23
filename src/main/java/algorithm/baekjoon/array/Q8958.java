package algorithm.baekjoon.array;

import java.util.Scanner;

public class Q8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            char[] data = sc.nextLine().toCharArray();
            int cnt = 0;
            int sum = 0;
            for (char ch : data) {
                if (ch == 'O') {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
    }
}

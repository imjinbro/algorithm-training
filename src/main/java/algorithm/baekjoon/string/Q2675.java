package algorithm.baekjoon.string;

import java.util.Arrays;
import java.util.Scanner;

public class Q2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            char[] data = sc.next().toCharArray();
            char[] result = new char[data.length * num];

            int dataIdx = 0;
            for (int j = 0; j < result.length; j += num) {
                Arrays.fill(result, j, j + num, data[dataIdx++]);
            }
            System.out.println(String.valueOf(result));
        }
    }
}

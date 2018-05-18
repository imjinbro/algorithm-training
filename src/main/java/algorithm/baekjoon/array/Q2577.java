package algorithm.baekjoon.array;

import java.util.*;

public class Q2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int Num = 1;
        for (int i = 0; i < 3; i++) {
            Num *= sc.nextInt();
        }

        char[] values = String.valueOf(Num).toCharArray();
        for (int i = 0; i < values.length; i++) {
            arr[values[i] - '0']++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

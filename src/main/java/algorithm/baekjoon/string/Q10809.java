package algorithm.baekjoon.string;

import java.util.Arrays;
import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] checker = new int['z' - 'a' + 1];
        Arrays.fill(checker, -1);
        char[] data = sc.nextLine().toCharArray();
        for (int i = 0; i < data.length; i++) {
            int idx = data[i] - 'a';
            if (checker[idx] == -1) {
                checker[idx] = i;
            }
        }

        for (int num : checker) {
            System.out.print(num + " ");
        }
    }
}
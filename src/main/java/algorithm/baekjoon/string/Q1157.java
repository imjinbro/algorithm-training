package algorithm.baekjoon.string;

import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] data = sc.nextLine().toCharArray();
        int[] checker = new int['Z' - 'A' + 1];

        for (int i = 0; i < data.length; i++) {
            int idx = data[i];
            if (idx > 'Z') {
                idx = idx - ('a' - 'A');
            }
            checker[idx - 'A']++;
        }

        int maxId = -1;
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < checker.length; i++) {
            if (max < checker[i]) {
                maxId = i;
                max = checker[i];
                cnt = 1;
            } else if (max == checker[i]){
                cnt++;
            }
        }

        if (cnt > 1) {
            System.out.println("?");
        } else {
            System.out.println((char)(maxId + 'A'));
        }

    }
}

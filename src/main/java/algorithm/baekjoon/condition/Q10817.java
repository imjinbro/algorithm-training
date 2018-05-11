package algorithm.baekjoon.condition;

import java.util.Scanner;

public class Q10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int second = 0;
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A < B) {
            max = B;
            second = A;
        } else {
            max = A;
            second = B;
        }

        if (C > max) {
            System.out.println(max);
        } else if (C == max) {
            System.out.println(C);
        } else {
            if (C < second) {
                System.out.println(second);
            } else {
                System.out.println(C);
            }
        }
    }
}

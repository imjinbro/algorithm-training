package algorithm.baekjoon.operation;

import java.util.*;

public class Q10430 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println( (A+B)%C );
        System.out.println( (A%C + B%C)%C );

        System.out.println( (A*B)%C );
        System.out.println( (A%C*B%C)%C );
    }
}

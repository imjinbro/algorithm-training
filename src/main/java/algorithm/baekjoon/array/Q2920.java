package algorithm.baekjoon.array;

import java.util.*;

public class Q2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < arr.length; i++) {
            if (end == 0) {
                end = arr[i];
                continue;
            }
            int diff = arr[i] - end;
            if (diff != 1 && diff != -1) {
                System.out.println("mixed");
                break;
            }
            end = arr[i];

            if (i == arr.length -1) {
                if (end == 1) {
                    System.out.println("descending");
                } else {
                    System.out.println("ascending");
                }
            }
        }
    }
}

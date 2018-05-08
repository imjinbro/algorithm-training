package algorithm.baekjoon.io;

import java.util.Scanner;

public class Q10950 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int T = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < T; i++) {
            String[] data = scanner.nextLine().split(" ");
            System.out.println(Integer.parseInt(data[0]) + Integer.parseInt(data[1]));
        }
    }
}

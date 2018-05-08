package algorithm.baekjoon.io;

import java.util.Scanner;

public class Q10951 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNextLine()) {
            String[] data = sc.nextLine().split(" ");
            System.out.println(Integer.parseInt(data[0]) + Integer.parseInt(data[1]));
        }
    }
}

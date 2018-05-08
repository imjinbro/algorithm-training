package algorithm.baekjoon.io;

import java.util.Scanner;

public class Q1000 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] data = scanner.nextLine().split(" ");
        System.out.println(Integer.parseInt(data[0]) + Integer.parseInt(data[1]));
    }
}

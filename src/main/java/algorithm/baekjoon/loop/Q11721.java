package algorithm.baekjoon.loop;

import java.util.Scanner;

public class Q11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        int start = 0;

        while (true) {
            if (start + 10 <= data.length()) {
                System.out.println(data.substring(start, start + 10));
                start += 10;
            } else {
                System.out.println(data.substring(start, (data.length() % 10) + start));
                break;
            }
        }
    }
}

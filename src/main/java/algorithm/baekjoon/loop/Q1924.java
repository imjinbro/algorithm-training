package algorithm.baekjoon.loop;

import java.util.*;

public class Q1924 {
    public static void main(String[] args) {
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] date = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int diff = 0;
        for (int i = 0; i < month - 1; i++) {
            diff += dayOfMonth[i];
        }

        if (month == 1) {
            if (day == 1) {
                diff = 1;
            } else {
                diff += day + 1;
            }
        } else {
            diff += day;
        }
        System.out.println(date[diff % 7]);
    }
}
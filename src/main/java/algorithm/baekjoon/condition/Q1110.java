package algorithm.baekjoon.condition;
import java.util.*;

public class Q1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        if (N < 10) {
            N *= 10;
        }
        int num = N;
        while (true) {
            cnt++;
            int secondary = (num / 10) + (num % 10);
            num = ((num % 10) * 10) + (secondary % 10);
            if (N == num) {
                break;
            }
        }
        System.out.println(cnt);
    }
}

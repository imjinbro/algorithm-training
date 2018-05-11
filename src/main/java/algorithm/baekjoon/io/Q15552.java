package algorithm.baekjoon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15552 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(reader.readLine());
            for (int i = 0 ; i < N; i++) {
                String[] data = reader.readLine().split(" ");
                System.out.println(Integer.parseInt(data[0]) + Integer.parseInt(data[1]));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

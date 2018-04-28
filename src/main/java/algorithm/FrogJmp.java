package algorithm;

/*
    https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
 */
public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        if ((X < Y && D >= Y) || (X + D >= Y)) {
            return 1;
        }
        int result = Y / D;
        int rest = Y % D;
        if (rest > X) {
            result++;
        }
        return result;
    }
}

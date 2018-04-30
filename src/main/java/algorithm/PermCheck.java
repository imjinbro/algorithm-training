package algorithm;

public class PermCheck {
    public static int solution(int[] A) {
        boolean[] checker = new boolean[A.length+1];

        for(int i = 0 ; i < A.length; i++){
            if(A[i] < checker.length){
                checker[A[i]] = true;
            }
        }

        for(int i = 1 ; i < checker.length ; i++){
            if(!checker[i]){
                return 0;
            }
        }
        return 1;
    }
}

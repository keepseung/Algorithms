package test.easy;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,3,1,5}));
    }
    public static int solution(int[] A) {
        Arrays.sort(A);
        int result =0;
        for (int i =0; i <A.length; i++){
            if (A[i] != i+1){
                result = i+1;
                break;
            }
        }
        return result;
    }
}

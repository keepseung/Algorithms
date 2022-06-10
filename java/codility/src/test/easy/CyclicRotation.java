package test.easy;

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        boolean[] a = new boolean[3];

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public int[] solution(int[] A, int K) {
        for (int i =0; i< K; i++){
            A = rotate(A);
        }
        return A;
    }
    public int[] rotate(int[] A){
        int[] newArr = new int[A.length]; // 오른쪽으로 한 인덱스씩 이동한 배열
        for (int i =0; i<A.length; i++){
            // 마지막 인덱스인 경우
            if (i == 0){
                newArr[0] = A[A.length-1];  // 0번 인덱스에 마지막 원소를 넣는다.
            }else{
                newArr[i] = A[i-1]; // 1~n-1 인덱스에 -1이 작은 인덱스 값을 넣는다.
            }
        }
        return newArr;
    }
}

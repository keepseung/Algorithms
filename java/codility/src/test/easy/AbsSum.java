package test.easy;

public class AbsSum {
    public int solution(int[] A) {
        int maxResult = (int) 1e9; // 10억을 큰수로 지정
        for (int p =1; p <A.length ; p++){
            // p보다 작은 값들의 합
            int leftSum = 0;
            for (int i =0; i<p; i++){
                leftSum += A[i];
            }

            // p와 같거나 큰 값들의 합
            int rightSum = 0;
            for (int i = p ; i < A.length; i++){
                rightSum += A[i];
            }

            maxResult = Math.min(maxResult, Math.abs(leftSum-rightSum));
        }

        return maxResult;
    }
}

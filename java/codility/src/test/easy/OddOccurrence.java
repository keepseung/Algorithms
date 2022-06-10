package test.easy;

public class OddOccurrence {
    public int solution(int[] A) {
        // 값의 개수를 가진 계수 배열을 사용할까
        boolean[] paried = new boolean[A.length];
        for (int i =0; i< A.length; i++){
            int value = A[i];

            if (paried[i]) continue; // 이미 짝이 맺어진 인덱스는 넘어간다.

            // i보다 큰 인덱스와 i를 반복해서 비교한다.
            for (int j =i+1; j <A.length; j++){

                if (paried[j]) continue;
                // 값이 동일하고 아직 짝이 안 맺어진 경우
                if (value ==A[j]){
                    paried[i] = true;
                    paried[j] = true;
                    break;
                }
            }
        }

        // 아직 짝이 안맺어진 값을 찾는다.
        int idx = 0;
        for (int i =0; i<A.length;i++){
            if (!paried[i]){
                idx = i;
                break;
            }
        }
        return A[idx];
    }

}

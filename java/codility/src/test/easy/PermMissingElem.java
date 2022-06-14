package test.easy;

public class PermMissingElem {
    public static int solution(int[] A) {
        int[] values = new int[A.length+2];

        for (int i = 0; i < A.length; i++) {
            values[A[i]] = A[i];
        }

        int result =0;
        for (int i = 1; i < values.length; i++) {
            if (values[i]==0){
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,3,1,5}));
    }
}

package test.easy;

/*
1041
-> 7
 */
public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(1041));
    }

    public static int solution(int N) {
        String binary = Integer.toBinaryString(N);

        int maxLength = 0;
        int startIdx=-1;
        for (int i= 0; i <binary.length(); i++){
            // 아직 왼쪽에 1이 안나온 경우
            if (startIdx ==-1){
                // 현재가 1인 경우 인덱스 저장
                if (binary.charAt(i)=='1') {
                    startIdx = i;
                }
                // 왼쪽에 1이 나온 경우
            }else{

                // 현재가 1인 경우
                if (binary.charAt(i)=='1') {
                    maxLength = Math.max(maxLength, i-startIdx-1);
                    startIdx = -1; // 시작 인덱스 초기화
                }
            }
        }

        return maxLength;

    }
}

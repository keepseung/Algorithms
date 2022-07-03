package easy.array;

import java.util.Arrays;

public class SingleNumber {
    // 오름차순 정렬 이후 홀수, 짝수 인덱스를 비교함, 안나오면 마지막 인덱스가 답임
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        // 00 11 22 344
        for (int i =0; i <nums.length-1; i+=2){
            if (nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

    // 더 빠름 XOR 비트 연산자 사용
    public int singleNumber1(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }

}

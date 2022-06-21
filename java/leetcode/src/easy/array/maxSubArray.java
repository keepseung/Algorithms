package easy.array;

public class maxSubArray {
    public int maxSubArray(int[] nums) {
        // 현재 인덱스의 값과 현재 인덱스까지 더한 값 중에 최대값을 가짐
        int currentSum = nums[0];
        // 현재 인덱스까지 더한 Sum의 최대 값
        int maxSum = nums[0];

        for (int i =1; i<nums.length; i++){
            currentSum = Math.max(nums[i]+currentSum, nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}

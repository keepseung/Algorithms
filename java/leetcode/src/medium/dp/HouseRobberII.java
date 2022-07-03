package medium.dp;

public class HouseRobberII {
    public int rob(int[] nums) {
        // 0-> 0(1)
        // 1-> 0(1)와 1(2)중 최대값
        // 2-> 0(1)와 1(2)와 2(3)중 최대 값
        // 3-> 0(1)+2(3)와 1(2)+3(1)중 최대 값
        // n-> n-3(?)+n-1(?)와 n-2(?)+n(?)중 최대 값

        if (nums.length ==1) return nums[0];

        int max1 = rob_simple(nums, 0, nums.length-2);
        int max2 = rob_simple(nums, 1, nums.length-1);
        return Math.max(max1,max2);
    }

    public int rob_simple(int[] nums, int start, int end){
        if (start == end){
            return nums[start];
        }

        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start+1] = Math.max(dp[start], nums[start+1]);

        for (int i = start+2; i <=end; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        return dp[end];
    }
}

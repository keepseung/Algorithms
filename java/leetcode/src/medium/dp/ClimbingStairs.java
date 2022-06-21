package medium.dp;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
//        System.out.println(climbStairs(2));
    }
    public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] =1;
        for (int i =2; i<n+1;i++){
            dp[n] = dp[n-1]+dp[n-2];
        }
        return dp[n];
    }
}

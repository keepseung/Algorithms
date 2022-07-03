package medium.dp;

import java.util.HashMap;

public class CombinationSumIV {
    private HashMap<Integer, Integer> memo;

    public int combinationSum4(int[] nums, int target) {
        memo = new HashMap<>();
        return combs(nums, target);
    }

    // 탑 다운 다이나믹프로그래밍
    private int combs(int[] nums, int remain){
        if (remain == 0){ // 남은게 0이면 1을 반환
            return 1;
        }
        if (memo.containsKey(remain)){ // 이미 remain 까지 경우의 수가 있는 경우
            return memo.get(remain); // remain까지 경우의 수를 반환
        }

        int result = 0; // remain까지 경우에 수
        for (int num : nums) {
            if (remain - num >=0) {
                // remain 까지의 경우의 수 추가하기
                result += combs(nums, remain -num);
            }
        }
        memo.put(remain, result); // remain 까지의 경우의 수 추가하기
        return result;
    }

    // 바텀업 다이나믹 프로그래밍
    public int combinationSum4BottomUp(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;

        // 1~target까지 바텀 업 방식으로 진행
        for (int combSum =1; combSum < target+1; combSum++){
            for (int num : nums){
                // combSum이 1은 1개, 2는 2개이다.
                // 뺀 값이 0보다 크면 유효한 값으로 볼 수 있기 때문이다.
                if (combSum - num >=0){
                    dp[combSum] += dp[combSum -num];
                }
            }
        }
        return dp[target];

    }
}

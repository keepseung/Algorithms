import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.lang.*;

class Solution {
    public int solution(int[] nums) {
        
        int answer = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        
        // 중복된 수가 있는 경우 중복 제거한 값이 최대 종류 개수가 된다.
        if (answer > set.size()){
            answer = set.size();
        }
        return answer;
    }
}
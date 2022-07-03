package easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
    }

    // O(N^2)의 시간 복잡도를 가짐, 시간초과 발생함
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) ;
                return true;
            }
        }
        return false;
    }

    // 배열 -> ArrayList -> Set을 이용하는 방법
    public boolean containsDuplicateV2(int[] nums) {
        ArrayList<Integer> arrs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arrs.add(nums[i]);
        }
        Set<Integer> sets = new HashSet<>(arrs);
        if (sets.size() != arrs.size())
            return true;
        return false;
    }

    // 배열을 정렬해서 현재 원소와 다음 원소를 비교하는 방법
    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);

        for (int i =0; i <nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    // Set만 이용하는 방법
    public boolean containsDuplicate3(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        boolean isDuplicate = false;
        for(int num : nums) {
            if(!unique.add(num)) {
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }

}
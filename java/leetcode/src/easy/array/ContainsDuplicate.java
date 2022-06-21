package easy.array;

import java.util.ArrayList;
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

    // 시간초과 발생 안함
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

}
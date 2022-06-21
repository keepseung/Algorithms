package medium.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i]+nums[j]+nums[k] ==0) {
                        List<Integer> answers = new ArrayList<>();
                        answers.add(nums[i]);
                        answers.add(nums[j]);
                        answers.add(nums[k]);
                        if (!checkDuplicate(list, answers)){
                            list.add(answers);
                        }
                    }
                }
            }
        }
        return list;
    }

    public boolean checkDuplicate(List<List<Integer>> list, List<Integer> target){
        if (list.size() ==0) return false;
        for (int i=0; i < list.size(); i++){
            List<Integer> integers = list.get(i);
            Collections.sort(integers);
            Collections.sort(target);
            return integers.containsAll(target);

        }
        return false;
    }
}

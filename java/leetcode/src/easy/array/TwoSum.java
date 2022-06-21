package easy.array;

public class TwoSum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        for (int i =0; i < nums.length; i++){
            int firstValue = nums[i];
            for (int j =i+1; j < nums.length; j++){
                int secondValue = nums[j];
                if (firstValue + secondValue == target)
                    return new int[]{i, j};
            }
        }
        return new int[2];
    }
}

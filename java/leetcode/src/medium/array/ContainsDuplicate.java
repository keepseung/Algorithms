package medium.array;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsNearbyAlmostDuplicate(new int[] {-2147483648,2147483647},1,1));
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j])<= t && Math.abs(i-j) <=k)
                    return true;
            }
        }
        return false;
    }

}
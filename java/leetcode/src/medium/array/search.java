package medium.array;

public class search {
    private int binarySearch(int[] nums, int start, int end, int target){
        if(start >= end)
            return (nums[start] == target) ? start : -1;

        int ret = -1;
        int mid = (start + end) /2 ;
        if(nums[mid] == target){
            ret = mid;
        } else{
            ret = binarySearch(nums, start, mid - 1, target);
            if(ret < 0)
                ret = binarySearch(nums, mid + 1, end, target);
        }

        return ret;
    }
}

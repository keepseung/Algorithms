package easy.array;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int index = 1;

        int length = nums.length;
        for (int i =0; i <length-1; i++){
            if (nums[i] != nums[i+1]){
                nums[index++] = nums[i+1]; // num[index]에 새로운 값 nums[i+1]을 넣어줌. 이후 index의 값을 1 증가시킴
            }
        }
        return index;

    }
}

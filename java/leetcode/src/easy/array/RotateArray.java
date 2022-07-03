package easy.array;

public class RotateArray {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,6,7};
        int[] res= rotate(a,3);
        for (int i : res) {
            System.out.print(i);
        }
    }
    public static int[] rotate(int[] nums, int k) {
        k %= nums.length;
        int[] temp = new int[nums.length];

        for (int i =0; i<k; i++){
            nums = rotateTemp(nums);
        }
        return nums;
    }

    public static int[] rotateTemp(int[] nums){
        int[] temp = new int[nums.length];
        for (int j = 0; j<nums.length; j++){
            if (j ==nums.length-1){
                temp[0] = nums[nums.length-1];
            }else{
                temp[j+1] = nums[j];
            }
        }
        return temp;

    }
    public void rotate1(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length -1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length -1);

    }

    public void reverse(int[] nums, int start, int end){
        while(start <end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
}

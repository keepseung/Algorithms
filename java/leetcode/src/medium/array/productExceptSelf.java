package medium.array;

public class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        // left -> right
        res[0] = 1;
        // res[1]~res[3]까지 이전 인덱스까지의 누적 곱을 넣어준다.
        for (int i =1; i <nums.length; i++){
            res[i] = res[i-1] * nums[i-1];
            // res[1] = res[0](=1) * nums[0] = nums[0]
            // res[2] = res[1] * nums[1] = nums[0]*nums[1]
            // res[3] = res[2]*nums[2] =  nums[0]*nums[1]*nums[2]
        }

        // right -> left
        int acc = 1;
        // res[2]~res[0] 이전 인덱스까지의 누적 곱을 넣어준다.
        for (int i =nums.length-2; i>=0; i--){
            acc *= nums[i+1];
            res[i] *= acc;
            // acc = 1*nums[3], res[2] = res[2]*nums[3]
            // acc = 1*nums[3]*nums[2], res[1] = res[1]*nums[2]*nums[3]
            // acc = 1*nums[3]*nums[2]*nums[1], res[0] = res[0]*res[1]*nums[2]*nums[3]
        }
        return res;


    }
}

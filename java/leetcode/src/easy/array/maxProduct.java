package easy.array;

public class maxProduct {
    public int maxProduct(int[] nums) {
        // 현재 인덱스의 값과 현재 인덱스 까지 곱 중에 최대값을 가짐
        int currentProduct = nums[0];
        // 현재 인덱스까지 곱 중에 최대값
        int maxProduct = nums[0];

        for (int i =1 ; i<nums.length; i++){
            currentProduct = Math.max(currentProduct*nums[i], currentProduct);
            maxProduct = Math.max(currentProduct, maxProduct);
        }
        return maxProduct;
    }
}

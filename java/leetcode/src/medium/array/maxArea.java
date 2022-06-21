package medium.array;

public class maxArea {
    public int maxArea(int[] height) {
        int maxArea = 0;
        // 두 지점을 찾는다.
        for (int i = 0; i < height.length; i++) {

            for (int j = i+1; j < height.length; j++) {
                // 물의 양을 구한다.
                int width = j-i; // 가로 길이
                int hei = Math.min(height[i],height[j]);// 세로는 더 작은 값
                // 최대값보다 크면 최대값으로 갱신한다.
                maxArea = Math.max(maxArea, width*hei);
            }
        }

        return maxArea;
    }

    public int maxAreaV2(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length-1;

        while(start < end){
            max = Math.max((end-start)*Math.min(height[start], height[end]), max);
            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }
        }

        return max;
    }
}

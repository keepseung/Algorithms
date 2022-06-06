import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i =0; i<10; i++){
            if (!contains(numbers, i)){
                answer +=i;
            }
        }
        
        return answer;
    }
    
    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}
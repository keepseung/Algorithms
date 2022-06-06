import java.util.Arrays;
import java.util.List;

class Solution {
    
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int zeroCnt = 0; // lottos에서 0인 개수
        int minWinCnt = 0; // lottos에서 정답의 개수
        for (int i =0; i < lottos.length; i++){  
            // lottos에서 0인 개수를 증가시킨다.
            if (lottos[i] ==0){
                zeroCnt ++;
            }
            
            // lottos에서 정답의 개수를 찾는다.
            if (contains(win_nums,lottos[i])){
                minWinCnt ++;
            }
        }
        
        
        if (minWinCnt <= 1){
            answer[1]= 6;
        }else{
            answer[1]= 7-minWinCnt;
        }
        int maxWinCnt = minWinCnt+zeroCnt;
        
        if (maxWinCnt<= 1){
              answer[0]= 6;
        }else{
            answer[0]= 7-maxWinCnt;
        }
        return answer;
    }
    
    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }


}
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i =0; i < commands.length; i ++){
            answer[i] = getAnswer(array, commands[i][0],commands[i][1],commands[i][2]);
        }        
        return answer;
    }
    
    public static int getAnswer(int[] source,int start, int end, int pick){
        int[] slicedArray = Arrays.copyOfRange(source, start-1, end);
        Arrays.sort(slicedArray);
        return  slicedArray[pick-1];
    }
}
import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
       // 1. 연속된 인형들이 제거된 횟수.
        int answer = 0;
        // 2. 인형을 담을 stack 바구니.
        Stack<Integer> stack = new Stack<>();  
        
        // 크레인 이동
        for (int move : moves){
            for (int j =0; j < board.length ; j++){ // 보드 행 탐색, j가 0부터 시작하는 것은 크레인이 위부터 탐색하는거랑 같다.
                if (board[j][move-1] != 0){ // 크레인의 위치에 인형이 존재한 경우 
                    // 스택이 비어있지 않고, 현재 스택의 최상단 인형이 크레인이 뽑은 인형과 같은 경우
                    if (!stack.empty() && stack.peek() == board[j][move-1]){
                        answer ++; // 인형 제거 횟수 증가
                        stack.pop(); // 바구니에 있는 인형 제거
                        board[j][move-1] = 0; // 크레인으로 뽑은 인형을 0으로 만들어 제거함
                        break;
                        
                    // 그 외의 경우는 인형을 바구니에 담고, 0으로 제거한다,
                    }else{ 
                        stack.push(board[j][move-1]);
                        board[j][move-1] = 0; 
                        break;
                    }
                    
                } 
            }
        }
        
        // 제거한 총 인형 개수는 = 없센 수 * 2 
        return answer*2;
    }
}
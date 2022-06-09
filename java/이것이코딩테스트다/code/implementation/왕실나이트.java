package implementation;

import java.util.Scanner;

public class 왕실나이트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        System.out.println(cnt);

        // 현재 나이트 위치 입력받기, 예) a1
        String inputData = sc.nextLine();
        int row = inputData.charAt(1) - '0';
        int column = inputData.charAt(0) - 'a' + 1;

        // 나이트가 이동할 수 있는 방향 정의
        int[] dx = {-2,-1,1,2,2,1,-1,-2};
        int[] dy = {-1,-2,-2,-1,1,2,2,1};

        // 8가지 방향에 대하여 이동할 수 있는지 확인
        for (int i =0; i <8; i++){
            int nextRow = row+dx[i];
            int nextColumn = row+dy[i];

            // 해당 위치에 이동가능하면 카운트 증가
            if (nextRow>= 1 && nextRow <=8 && nextColumn >=1 && nextColumn <=8){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}

package implementation;

import java.util.Scanner;

/** 방향
 * - 0 : 북쪽
 * - 1 : 동쪽
 * - 2 : 남쪽
 * - 3 : 서쪽
 */
public class 게임개발 {
    public static int n,m,x,y,direction;
    // 방문할 위치를 저장하기 위한 맵을 생성하여 0으로 초기화
    public static int[][] d = new int[50][50];
    // 전체 맵 정보
    public static int[][] arr = new int[50][50];

    // 북, 동, 남, 서 방향 정리
    public static int dx [] = {-1,0,1,0};
    public static int dy [] = {0,1,0,-1};

    public static void turn_left(){
        direction -=1;
        if (direction==-1) direction= 3;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // n, m을 공백을 구분하여 입력받기
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 현재 캐릭터의 x,y 좌표, 방향을 입력받기
        x = sc.nextInt();
        y = sc.nextInt();
        direction = sc.nextInt();

        // 전체 맵 정보 입력받기
        for (int i = 0; i< n; i++){
            for (int j = 0; j <n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // 시뮬레이션 시작
        int cnt = 1;
        int turn_time = 0;
        while (true){

            turn_left();
            // 왼쪽으로 회전
            int nx = x+dx[direction];
            int ny = y+dy[direction];

            // 회전한 이후에 정면에 가보지 않은 칸이 존재한 경우
            if (d[nx][ny] ==0 && arr[nx][ny]==0){
                d[nx][ny] = 1;
                x =nx;
                y = ny;
                cnt +=1;
                turn_time = 0;
                continue;
            }
            // 회전한 이후에 정면에 가보지 않은 칸이 없거나 바다인 경우
            else turn_time+=1;

            // 네 방향 모두 갈 수 없는 경우
            if (turn_time == 4){
                nx = x-dx[direction];
                ny = y-dy[direction];

                // 바다가 아니여서 뒤로 갈 수 있다면 뒤로가기
                if (arr[nx][ny]==0){
                    x = nx;
                    y = ny;
                }
                // 뒤가 바다로 막혀있는 경우
                else break;
                turn_time =0;
            }
        }
        System.out.println(cnt);
    }
}

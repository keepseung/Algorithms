package implementation;

import java.util.Scanner;

public class 상하좌우 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        sc.nextLine(); // 버퍼비우기
        String[] plans = sc.nextLine().split(" ");
        int x =1, y = 1;

        // L, R, U, D에 따른 이동 방향
        int[] dx= {0,0,-1,1};
        int[] dy= {-1,1, 0,0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        // 이동 계획에 따라 x,y를 움직임
        for (int i =0; i < plans.length; i++){
            char plan = plans[i].charAt(i);
            int nx = -1, ny = -1; // 이동 후 좌표
            for (int j=0; j<4; j++){
                if (plan == moveTypes[j]){
                    nx = x+dx[j];
                    ny = y+dy[j];
                    break;
                }
            }
            // 공간을 벗어나는 경우 무시
            if (nx <1 || ny < 1 || nx> n || ny>n) break;
            //이동 수행
            x = nx;
            y = ny;
        }

       // 이동 후에 좌표를 출력
        System.out.println(x+ " "+ y);
    }
}

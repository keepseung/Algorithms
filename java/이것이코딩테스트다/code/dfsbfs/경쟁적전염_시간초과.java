package dfsbfs;

import java.util.Scanner;

public class 경쟁적전염_시간초과 {
    // 시험관의 크기, 바이러스의 종류 개수, s초 후 구해야 하는 좌표 x,y
    public static int n, k, s, x, y;
    public static int[][] arr = new int[201][201];

    // 이동 좌표 동북서남
    public static int[] dx = {0, -1, 0, 1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 시험관의 크기, 바이러스의 종류 개수 입력 받기
        n = sc.nextInt();
        k = sc.nextInt();

        // 시험관 입력 받기
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int value = sc.nextInt();
                arr[i][j] = value;


            }
        }

        // 초, 결과 좌표 입력 받기
        s = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();

        for (int i = 0; i < s; i++) { // s초 만큼 방문

            dfx();
        }

        System.out.println(arr[x][y]);
    }

    private static void dfx() {
        for (int x = 1; x <= k; x++) { // 바이러스가 1~k까지 반복
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (arr[i][j]==x) { // 원하는 바이러스를 찾은 경우
                        // 상하좌우 전염시키기
                        for (int m = 0; m <4; m++){
                            int nx = i+dx[m];
                            int ny = j+dy[m];

                            // 범위 안 인 경우
                            if (nx >=1 && nx <=200 && ny >=1 && ny <=200){
                                if (arr[nx][ny] ==0){ // 감염이 안된 곳인 경우
                                    arr[nx][ny] = x; // 감염시키기
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

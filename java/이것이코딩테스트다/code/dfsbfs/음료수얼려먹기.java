package dfsbfs;

import java.util.Scanner;

public class 음료수얼려먹기 {
    public static int n,m;
    public static int[][] graph = new int[1000][1000];


    public static boolean dfs(int x, int y){
        // 주어진 범위를 벗어난 경우 즉시 종료
        if (x<0 || y<0 || x>=n || y>=m) return false;

        // 현재 노드를 아직 방문 안한 경우
        if (graph[x][y] ==0){

            // 해당 노드 방문 처리
            graph[x][y] =1;

            // 상하좌우의 위치들을 모두 재귀적으로 호출
            dfs(x-1, y);
            dfs(x+1, y);
            dfs(x, y-1);
            dfs(x, y+1);
            return true;
        }

        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // n,m을 공백을 기준으로 입력받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        // 2차원 리스트의 맵 정보를 입력받기
        for (int i =0; i < n; i++){
            String str = sc.nextLine();
            for (int j = 0; j <m; j++){
                graph[i][j]= str.charAt(j) - '0';
            }
        }

        // 모든 노드 위치에 대해서 음료수 채우기
        int result = 0;
        for (int i =0; i <n; i++){
            for (int j =0; j<m; j++){
                if (dfs(i,j)) result ++;
            }
        }
        System.out.println(result);
    }
}

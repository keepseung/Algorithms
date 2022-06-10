package minroute;

import java.util.Arrays;
import java.util.Scanner;

public class 플로이드워셜알고리즘 {
    public static final int INF = (int) 1e9;//무한 의미
    // 노드의 개수, 간선의 개수
    // 노드의 개수는 최대 500
    public static int n,m;
    // 2차원 배열 만들기
    public static int[][] graph = new int[501][501];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // 최단 거리 테이블 무한으로 초기화
        for (int i =0; i< 501; i++){
            Arrays.fill(graph[i], INF);
        }

        // 자기 자신에서 자기 자신으로는 0으로 초기화
        for (int i=1; i<=n ; i++){
            for (int j = 1; j <=n; j++){
                if (i ==j) graph[i][j] = 0;
            }
        }

        // 각 간선에 대한 정보를 입력받아 그 값으로 초기화
        for (int i =0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph[a][b] =c;
        }

        // 점화식에 따라 플로이드 워셜 알고리즘 수행
        for (int k=1; k<=n; k++){
            for (int a= 1; a<=n; a++){
                for (int b= 1; b<=n; b++){
                    graph[a][b] = Math.min(graph[a][b], graph[a][k]+graph[k][b]);
                }
            }
        }

        // 수행된 결과를 출력
        for (int a= 1; a<=n; a++){
            for (int b=1; b<=n; b++){
                if (graph[a][b]==INF){
                    System.out.println("무한");
                }else{
                    System.out.print(graph[a][b]+" ");
                }
            }
            System.out.println();
        }

    }
}

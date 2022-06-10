package minroute;

import java.util.Arrays;
import java.util.Scanner;

public class 미래도시 {
    public static int INF = (int) 1e9; //무한을 의마함
    // 노드의 개수, 간선의 개수, 거쳐갈 노드, 최종 목적지 노드
    public static int n,m,x,k;
    // 2차원 배열 만들기
    public static int[][] graph = new int[101][101];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        // 최단 거리 테이블 무제한을 초기화
        for (int i =0; i< 101; i++){
            Arrays.fill(graph[i], INF);
        }
        // 자기 자신에서 자기 자신으로 가는 비용은 0으로 초기화
        for (int a =1; a<=n; a++){
            for (int b = 1; b<=n; b++){
                if (a==b) graph[a][b] = 0;
            }
        }

        // 각 간선에 대한 정보를 입력받아 그 값으로 초기화
        for (int i =0; i <m; i++){
            // a와 b가 서로에게 가는 비용은 1이라고 설정
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b]=1;
            graph[b][a] =1;
        }

        x = sc.nextInt();
        k = sc.nextInt();

        // 점화식에 따라 플로이드 워셜 알고리즘 수행
        for (int k =1; k<=n; k++){
            for (int a=1; a<=n; a++){
                for (int b=1; b<=n; b++){
                    graph[a][b] = Math.min(graph[a][b], graph[a][k]+graph[k][b]);
                }
            }
        }

        // 수행된 결과를 출력
        int distance = graph[1][k]+graph[k][1];
        if (distance >= INF){
            System.out.println(-1);
        }else{
            System.out.println(distance);
        }

    }
}

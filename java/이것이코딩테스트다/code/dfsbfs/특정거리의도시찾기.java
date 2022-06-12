package dfsbfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
https://www.acmicpc.net/problem/18352
4 4 2 1
1 2
1 3
2 3
2 4
 */
public class 특정거리의도시찾기 {

    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static int[] d;  // x에서 시작하는 각 노드별 최단거리 비용
    public static boolean[] visited; // 각 노드별 방문 여부

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();

        d = new int[n+1];
        visited = new boolean[n+1];
        // 그래프 초기화
        for (int i =0; i < n+1; i++) { // 인덱스 0~n 생성
            graph.add(new ArrayList<>());
        }

        // 그래프에 간선 정보 넣기
        for(int i =0; i<m; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            graph.get(start).add(end);
        }

        // 시작노드를 시작으로 bfs 수행
        bfx(x);

        // 노드별 최단거리를 조회하고, k인 경우를 출력한다.
        boolean check = false;
        for (int i =1; i < n+1; i++){
            if (d[i] == k) {
                System.out.println(i);
                check = true;
            }
        }
        // 만약 최단 거리가 K인 도시가 없다면, -1 출력
        if (!check) System.out.println(-1);
    }
    static void bfx(int start){
        d[start] = 0; // 시작 노드에서 시작 노드로 가는 비용은 0으로 설정
        visited[start] = true; // 방문 처리 함

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()){
            Integer now = queue.poll();

            // 현재 노드에 근접한 노드들을 방문함
            for (int i =0; i< graph.get(now).size(); i++){
                Integer otherNode = graph.get(now).get(i);
                if (!visited[otherNode]){
                    visited[otherNode] = true; // 인접한 노드를 방문 처리 함
                    d[otherNode] = d[now] +1; // 인접한 노드의 최단 거리를 현재 노드에서 1 증가한 값으로 설정
                    queue.offer(otherNode);
                }
            }
        }
    }
}

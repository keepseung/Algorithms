package minroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 간단한다익스트라알고리즘 {
    public static final int INF = (int) 1e9; // 무한을 의미하는 값
    // 노드의 개수, 간선의 개수, 시작 노드
    public static int n,m,start;
    // 각 노드에 연결되어 있는 노드 정보
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    // 방문한 적이 있는지 체크하는 목적의 배열 만들기
    public static boolean[] visited = new boolean[100001];
    // 최단 거리 테이블 만들기
    public static int[] d = new int[100001];

    public static class Node {
        private int index;
        private int distance;

        public int getIndex() {
            return index;
        }

        public int getDistance() {
            return distance;
        }

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        // 그래프 초기화
        for (int i =0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        // 모든 간선 정보를 입력받기
        for (int i =0; i<m;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            // a번 노드에서 b번 노드로 가는 비용이 c라는 의미
            graph.get(a).add(new Node(b,c));
        }

        // 최단 거리 테이블 모두 무한으로 초기화
        Arrays.fill(d, INF);

        // 다익스트라 알고리즘 수행
        dijkstra(start);

        // 모든 노드로 가기 위한 최단 거리를 수행
        for (int i =1; i <=n; i++){
            // 도달할 수 없는 경우, 무한이라고 출력
            if (d[i]==INF){
                System.out.println("INF");
            }else{
                System.out.println(d[i]);
            }
        }
    }

    private static void dijkstra(int start) {
        // 시작 노드 초기화
        d[start]=0;
        visited[start] = true;

        // 근접한 노드 거리 설정함
        for (int j = 0; j <graph.get(start).size(); j++){
            d[graph.get(start).get(j).getIndex()] =graph.get(start).get(j).getDistance();
        }

        // 시작 노드를 제외한 전체 n-1개 노드에 대해 반복
        for (int i =0; i< n-1; i++){
            // 현재 최단 거리가 가장 짧은 노드를 꺼내서 방문 처리
            int now = getSmallestNode();
            visited[now] = true;
            // 현재 노드와 연결된 다른 노드 확인
            for (int j= 0; j <graph.get(now).size(); j++){
                int cost = d[now]+graph.get(now).get(j).getDistance();
                // 현재 노드를 거쳐서 다른 노드로 이동하는 거리가 더 짧은 경우
                if (cost < d[graph.get(now).get(j).getIndex()]);{
                    d[graph.get(now).get(i).getIndex()] = cost;
                }
            }
        }
    }

    private static int getSmallestNode() {
        int min_value = INF;
        int index = 0; // 최단 거리가 짧은 노드
        for (int i =1; i<=n;i++){
            if (d[i] < min_value && !visited[i]) {
                min_value = d[i];

            }
        }

        return index;
    }
}

package minroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 개선된다익스트라알고리즘 {

    public static final int INF = (int) 1e9; // 무한을 의미하는 값으로 10억 설정
    public static int n,m,start; // 노드의 개수, 간선 개수, 시작 노드 번호
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<>();// 각 노드에 연결 되어 있는 그래프
    public static int[] d = new int[100001]; // 최단 경로 테이블

    private static void dijkstra(int x){
        PriorityQueue<Node> pq= new PriorityQueue<>();
        // 시작 노드를 위하 ㄴ최단경로 0으로 설정, 큐에 삽입
        pq.offer(new Node(start, 0));
        d[start] = 0;

        while (!pq.isEmpty()){ // 큐가 비어있지 않은 경우

            // 가장 최단거리가 짧은 노드 정보 가져오기
            Node node = pq.poll();
            int distance = node.getDistance();
            int now = node.getIndex();

            if (d[now]< distance) continue; // 이미 처리된 노드라면 무시

            // 현재 노드와 연결된 다른 인접한 노드를 검사
            for (int i=0; i<graph.get(now).size(); i++){
                int cost = d[now]+graph.get(now).get(i).getDistance();
                // 현재 노드를 거쳐서, 다른 노드로 이동하는 거리가 더 짧은 경우
                if (cost < d[graph.get(now).get(i).getIndex()]){
                    d[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Node>());
        }

        // 모든 간선 정보를 입력받기
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            // a번 노드에서 b번 노드로 가는 비용이 c라는 의미
            graph.get(a).add(new Node(b, c));
        }

        // 최단 거리 테이블을 모두 무한으로 초기화
        Arrays.fill(d, INF);

        // 다익스트라 알고리즘을 수행
        dijkstra(start);

        // 모든 노드로 가기 위한 최단 거리를 출력
        for (int i = 1; i <= n; i++) {
            // 도달할 수 없는 경우, 무한(INFINITY)이라고 출력
            if (d[i] == INF) {
                System.out.println("INFINITY");
            }
            // 도달할 수 있는 경우 거리를 출력
            else {
                System.out.println(d[i]);
            }
        }
    }

    static class Node implements Comparable<Node> {
        private int index;
        private int distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        public int getIndex() {
            return index;
        }

        public int getDistance() {
            return distance;
        }

        // 거리를 기준으로 오름차순, 짧은게 더 높은 우선순위 가지게 함
        @Override
        public int compareTo(Node o) {
            if (this.distance <o.distance) return -1;
            return 1;
        }
    }
}

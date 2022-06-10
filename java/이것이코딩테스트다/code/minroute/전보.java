package minroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 전보 {

    private static final int INF = (int) 1e9; // 최대 거리를 나타냄

    // 노드 개수, 간선 개수, 시작 노드
    private static int n,m,start;
    // 노드에 연결된 노드 번호, 거리를 나타낼 리스트
    private static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    // 최단거리 그래프
    private static int[] d = new int[30001];

    public static class Node implements Comparable<Node>{
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

        @Override
        public int compareTo(Node o) {
            if (this.distance < o.distance) return -1;
            return 1;
        }
    }

    static void dijkstra(int start){
        PriorityQueue<Node> pq= new PriorityQueue<>();

        // 시작 노드 설정
        pq.offer(new Node(start,0));
        d[start] =0;

        while (!pq.isEmpty()){
            Node node = pq.poll(); // 가장 최단거리가 짧은 노드를 꺼내기
            int distance = node.getDistance();
            int now = node.getIndex();

            // 현재 노드가 이미 처리된 적 있는 경우
            if (d[now] < distance) continue;

            // 현재 노드와 인접한 다른 노드들을 확인
            for (int i =0; i<graph.get(now).size(); i++){
                int cost = d[now]+ graph.get(now).get(i).getDistance();
                // 현재 노드를 거쳐서 다른 노드로 가는 거리가 더 짧은 경우
                if (cost < d[graph.get(now).get(i).getDistance()]){
                    d[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n =sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        // 그래프 초기화
        for (int i= 0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        //모든 간선 정보 입력받기
        for (int i =0; i<m ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            // a번 노드에서 b번 노드로 가는 비용이 c라는 의미
            graph.get(a).add(new Node(b, c));
        }

        // 최단 거리 테이블을 무제한으로 초기화
        Arrays.fill(d, INF );

        // 다익스트라 알고리즘 수행
        dijkstra(start);

        // 도달할 수 있는 노드의 개수
        int count = 0;
        // 도달할 수 있는 노드중 가장 멀리 있는 노드와의 최단 거리
        int maxDistance = 0;

        for (int i =1; i<=n;i++){
            // 도달 가능한 노드인 경우
            if  (d[i] !=INF){
                count +=1;
                maxDistance = Math.max(maxDistance, d[i]);
            }
        }

        // 시작노드를 제외해야해서 -1
        System.out.println((count-1) +" "+ maxDistance);
    }


}

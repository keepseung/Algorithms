package dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탈출 {

    public static int n,m;
    public static int[][] graph= new int[201][201];

    // 이동할 4자리 방향좌표 상하좌우
    public static int dx[] = {-1,1,0,0};
    public static int dy[] = {0,0,-1,1};

    public static int bfs(int x, int y){
        // bfs를 하기위해 큐를 생성
        Queue<Node> queue = new LinkedList<>();

        // 큐에 시작 노드 추가함
        queue.offer(new Node(x,y));

        // 큐에 노드가 남아있을 때까지 반복
        while(!queue.isEmpty()){
            Node node = queue.poll();

            x = node.getX();
            y = node.getY();

            // 현재 위치에서 4가지 방향으로 탐색 진행
            for (int i = 0; i<4; i++){
                int nx = x +dx[i];
                int ny = y +dy[i];

                // 범위를 벗어난 경우 해당 노드 탐색 안함
                if (nx <0 || nx >= n || ny <0 || ny >=m) continue;

                // 벽인 경우 해당 노드 탐색 안함
                if (graph[x][y]== 0) continue;

                // 아직 방문 안한 경우 노트 탐색 진행함
                if (graph[x][y]==1){
                    graph[nx][ny] = graph[x][y]+1; // 최단 거리 부여
                    queue.offer(new Node(nx, ny));
                }
            }

        }

        return graph[n-1][m-1];
    }
    public static void main(String[] args) {
        // n, m을 공백을 기준으로 입력받기
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        // 2차원 리스트의 맵 정보 입력받기
        for (int i = 0; i < n; i++){
            String scr = sc.nextLine();
            for (int j =0; j <m; j++){
                graph[i][j] = scr.charAt(j) - '0';
            }
        }

        // bfs를 수행한 결과 발표
        System.out.println(bfs(0,0));
    }
    static class Node{
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}

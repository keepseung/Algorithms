package easy;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
    }


    public static int solution(int[][] maps) {


        Queue<Node> q = new LinkedList<>();
        int answer = 0;
        return answer;
    }

    public static int bfs(int[][] maps, int x, int y){
        int n = maps.length;
        int m = maps[0].length;

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));

        // 동 서 남 북
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};

        while (!q.isEmpty()){
            Node now = q.poll();
            // 인접했지만 아직 방문하지 않은 노드를 방문한다.
            for (int i =0; i<4;i++){
                int nextX = now.getX()+dx[i];
                int nextY = now.getY()+dy[i];

                // 범위를 벗어난 경우 종료
                if (nextX <0 || nextX > n-1 || nextY < 0 || nextY > m-1) continue;

                // 다음 공간이 벽이 없는 자리(1)이고 아직 방문하지 않은 경우(1) +1를 해준다.
                // 다음 탐색을 위해 큐에 넣어줌
                if (maps[nextX][nextY] == 1){
                    maps[nextX][nextY] = maps[now.getX()][now.getY()]+1;
                    q.offer(new Node(nextX, nextY));
                }
            }
        }
        return maps[n-1][m-1];
    }
}

class Node{
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
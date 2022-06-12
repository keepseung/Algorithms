package dfsbfs;

import java.util.*;

public class 경쟁적전염_정답 {
    // 시험관의 크기, 바이러스의 종류 개수, s초 후 구해야 하는 좌표 x,y
    public static int n, k;
    public static int[][] graph = new int[200][200];
    public static ArrayList<Virus> viruses = new ArrayList<>();

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
                graph[i][j] = value;
                // 해당 위치에 바이러스가 존재하는 경우
                if (value >0){
                    // 바이러스 종류, 시간, 위치 x, 위치 y 삽입
                    viruses.add(new Virus(value, 0, i, j));
                }
            }
        }

        // 정렬 이후에 큐로 옮기기 (낮은 번호의 바이러스가 먼저 증식하므로)
        Collections.sort(viruses);
        Queue<Virus> q = new LinkedList<>();
        for (int i =0; i < viruses.size(); i++){
            q.offer(viruses.get(i));
        }

        // 초, 결과 좌표 입력 받기
        int targetS = sc.nextInt();
        int targetX = sc.nextInt();
        int targetY = sc.nextInt();

        // bfs 진행
        while (!q.isEmpty()){
            Virus virus = q.poll();
            // 정확히 second만큼 초가 지나거나 큐가 빌 때까지 진행
            if (virus.getSecond() == targetS) break;
            // 현재 노드에서 주변 4가지 위치 각각 확인
            for (int i =0; i<4; i++){
                int nx = virus.getX() + dx[i];
                int ny = virus.getY() + dy[i];

                // 해당 위치로 이동 가능한 경우
                if (0<=nx && nx < n && 0<=ny && ny <n){
                    // 아직 방문하지 않은 위치라면 바이러스 넣기
                    if (graph[nx][ny] == 0){
                        graph[nx][ny] = virus.getIndex();
                        q.offer(new Virus(virus.getIndex(), virus.getSecond()+1, nx, ny));
                    }
                }
            }
        }

        System.out.println(graph[targetX-1][targetY-1]);
    }

    static class Virus implements Comparable<Virus>{

        private int index;
        private int second;
        private int x;
        private int y;

        public Virus(int index, int second, int x, int y) {
            this.index = index;
            this.second = second;
            this.x = x;
            this.y = y;
        }

        public int getIndex() {
            return index;
        }

        public int getSecond() {
            return second;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }


        //
        @Override
        public int compareTo(Virus o) {
            if (this.index < o.index) return -1;
            return 1;
        }
    }
}

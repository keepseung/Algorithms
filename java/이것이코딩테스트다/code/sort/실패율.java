package sort;

import java.util.ArrayList;
import java.util.Collections;

public class 실패율 {
    public static void main(String[] args) {

    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        ArrayList<Node> nodes = new ArrayList<>();
        int length = stages.length;

        // 스테이지 번호를 1부터 N까지 증가시키며
        for (int i =1; i<N; i++){

            // 해당 스테이지에 머물러 있는 사람 수 계산
            int cnt = 0;
            for (int j =0; j<stages.length; j++){
                if (stages[j] ==i){
                    cnt +=1;
                }
            }

            // 실패율 계산
            double fail = 0;
            if (length>=1) {
                fail = (double) cnt / length;
            }

            // 리스트에 (스테이지 번호, 실패율) 원소 삽입
            nodes.add(new Node(i, fail));
            length -= cnt; // 총원 감소
        }

        // 실패율을 기준으로 내림차순
        Collections.sort(nodes);

        // 정해진 스테이지 번호 반환
        for (int i =0; i<N; i++){
            answer[i] = nodes.get(i).getStage();
        }

        return answer;
    }

}
class Node implements Comparable<Node>{

    private int stage;
    private double fail;

    public Node(int stage, double fail) {
        this.stage = stage;
        this.fail = fail;
    }

    public int getStage() {
        return stage;
    }

    public double getFail() {
        return fail;
    }

    /*
    1. 실패율로 내림차순
    2. 스테이지 번호 오름차순
    Double.compare, Integer.compare는
    첫 번째 원소가 두 번째 보다 큰 경우 양수, 작으면 음수를 반환한다.
     */
    @Override
    public int compareTo(Node o) {
        if (this.getStage() == o.getStage()){
            return Integer.compare(this.stage, o.stage);
        }

        return Double.compare(o.getFail(), this.fail); // 실패일
    }
}
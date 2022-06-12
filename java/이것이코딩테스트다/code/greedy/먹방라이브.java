package greedy;

import java.util.*;
import java.util.stream.IntStream;

public class 먹방라이브 {
    public static void main(String[] args) {

    }

    public int solution(int[] food_times, long k) {
        // 전체 음식을 먹는 시간보다 k가 크거나 같다면 -1
        long summary = 0;
        for (int i = 0; i < food_times.length; i++) {
            summary += food_times[i];
        }
        // 배열의 합 구하는 다른 방법
        // IntStream.of(food_times).sum();
        if (summary <= k) return -1;

        // 시간이 작은 음식부터 빼야하므로 우선순위 큐 사용
        PriorityQueue<Food> pq = new PriorityQueue<>();

        summary = 0;  // 먹기 위해 사용한 시간
        long previous = 0; // 이전 음식 시간
        long length = food_times.length; // 남은 음식의 개수

        // summary + (현재의 음식 시간 - 이전 음식 시간) * 현재 음식 개수와 k 비교
        while (summary+((pq.peek().getTime() - previous)*length) <=k ){
            int now = pq.poll().getTime();
            summary += (now-previous)*length;
            length -= 1;// 다먹은 음식 제외
            previous = now; // 이전 음식 재설정
        }

        // 남은 음식 중에 몇 번째 음식인지 확인하며 출력
        ArrayList<Food> result = new ArrayList<>();
        while (!pq.isEmpty()){
            result.add(pq.poll());
        }

        // 음식 번호 기준으로 정렬
        Collections.sort(result, new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                return Integer.compare(o1.getIndex(), o2.getIndex());
            }
        });

        return result.get((int) ((k-summary)%length)).getIndex();
    }

    static class Food implements Comparable<Food>{
        private int time;
        private int index;

        public Food(int time, int index) {
            this.time = time;
            this.index = index;
        }

        public int getTime() {
            return time;
        }

        public int getIndex() {
            return index;
        }

        // 시간 순으로 높은 우선순위를 가져 오름차순 정렬
        @Override
        public int compareTo(Food o) {
            return Integer.compare(this.time, o.time);
        }
    }
}

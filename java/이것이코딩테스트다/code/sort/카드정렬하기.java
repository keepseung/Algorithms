package sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 카드정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i =0; i<n; i++){
            pq.offer(sc.nextInt());
        }

        // 힙에 원소가 1개 남을 때까지
        while (pq.size() > 1){
            // 가장 작은 원소 2개를 뽑음
            int one = pq.poll();
            int two = pq.poll();
            // 카드 묶음을 다시 합쳐
            int sum = one+two;
            result += sum;
            pq.offer(sum);
        }
        System.out.println(result);

    }


}

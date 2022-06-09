package greedy;

import java.util.Scanner;

public class one이될때까지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;
        while (true){
            // n이 k로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            // n:10, k:3 -> target = 9, result = 1
            // n:25, k:5 -> target = 25, result = 0
            int target = (n/k)*k;
            result += (n-target);
            // n: 1
            n = target;
            // n이 k보다 작을 때 (더이상 나눌 수 없을 때) 반복문 탈출
            if (n<k) break;
            result+=1;
            n/=k;
        }
        result += (n-1);
        System.out.println("result = " + result);
    }
}

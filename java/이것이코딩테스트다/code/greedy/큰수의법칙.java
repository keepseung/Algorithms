package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 큰수의법칙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n, m, k를 공백을 기준으로 구분하여 입력받기
        int n = sc.nextInt(); // 숫자의 개수
        int m = sc.nextInt(); // 더하는 횟수
        int k = sc.nextInt(); // 숫자를 연속해서 더할 수 있는 횟수

        // n개의 수를 공백을 기준으로 입력 받기
        int[] arr= new int[n];
        for (int i =0; i < n; i ++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 오름차순으로 정렬
        int first = arr[n-1]; // 가장 큰수
        int second = arr[n-2]; // 두번째로 큰 수

        // 가장 큰 수가 더해지는 횟수 계산
        int cnt = (m/(k+1))*k;
        cnt += m%(k+1);

        int result =0;
        result += cnt * first;
        result += (m-cnt)*second;
        System.out.println("result = " + result);


    }
}

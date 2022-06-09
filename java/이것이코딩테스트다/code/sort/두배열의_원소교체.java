package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 두배열의_원소교체 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n과 k를 입력받기
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 배열 a의 원소를 입력받기
        Integer[] a = new Integer[n];
        for (int i =0; i <n ; i++){
            a[i] = sc.nextInt();
        }
        Integer[] b = new Integer[n];
        // 배열 b의 원소를 입력받기
        for (int i =0; i <n ; i++){
            b[i] =sc.nextInt();
        }

        // 배열 A는 오름차순
        Arrays.sort(a);
        // b는 내림차순
        Arrays.sort(a, Collections.reverseOrder());

        // 첫 번째 인덱스부터 확인하며 두 배열의 원소를 최대 k번 비교
        for (int i =0; i<k; i++){
            // a의 원소가 b보다 작은 경우
            if (a[i] < b[i]){
                // 두 원소를 교체
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            // a의 원소가 b의 원소보다 크거나 같을 때 종료
            else break;
        }

        // 배열 a의 모든 원소 합
        long result =0;
        for (int i =0; i< n; i++){
            result += a[i];
        }
        System.out.println(result);
    }
}

package binarysearch;

import java.util.Scanner;

/*
4 6
19 15 10 17
 */
public class 떡만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 떡의 개수와 최소한 얻어야 하는 떡의 길이
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 각 떡 길이 정보
        int[] arr = new int[n];
        for (int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        // 이진 탐색을 위한 시작, 끝점 정보
        int start = 0;
        int end = (int) 1e9;

        // 이진 탐색 수행, 반복
        int result = 0;
        while (start<=end){
            long total = 0; // 자른 길이
            int mid = (start+end)/2;

            for (int i =0; i< n; i++){
                // 떡 길이가 중간 값보다 더 긴 경우만 자른다.
                if (arr[i] >mid) total += arr[i]-mid;
            }

            // 자른 길이가 목표보다 적은 경우 왼쪽 탐색
            if (total < m) end = mid-1;
            // 자른 길이가 목표보다 큰 경우
            else {
                result =mid;
                start = mid +1;
            }
        }

        System.out.println(result);
    }
}

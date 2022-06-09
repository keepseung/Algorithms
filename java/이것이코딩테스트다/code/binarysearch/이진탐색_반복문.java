package binarysearch;

import java.util.Scanner;

public class 이진탐색_반복문 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 원소의 개수와 찾을 값 받기
        int n = sc.nextInt();
        int target = sc.nextInt();

        // 전체 원소 입력받기
        int[] arr = new int[n];
        for (int i =0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        // 이진 탐색 수행 결과 반환
        int result = binarySearch(arr, target, 0, n-1);
        if (result ==-1){
            System.out.println("값이 없어");
        }else{
            System.out.println(result+1);
        }
    }

    // 이진 탐색 반복문으로 구현, 찾으려는 값의 인덱스를 반환함
    private static int binarySearch(int[] arr, int target, int start, int end) {

        while (start<=end){
            int mid = (start+end)/2;
            // 찾은 경우 중간 인덱스 반환
            if (arr[mid] == target) return mid;

            // 중간값의 값보다 찾고자 하는 값이 작은 경우 왼쪽 탐색
            else if (arr[mid] > target) end = mid-1;

            // 중간값의 값보다 찾고자 하는 값이 큰 경우 오른쪽 탐색
            else start = mid+1;

        }

        return -1;
    }
}

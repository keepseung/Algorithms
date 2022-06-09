package binarysearch;

import java.util.Scanner;

public class 이진탐색_재귀함수 {

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

    // 이진 탐색 재귀 함수 구현, 찾으려는 값의 인덱스를 반환함
    private static int binarySearch(int[] arr, int target, int start, int end) {
        // 찾으려는 값이 없는 경우
        if (start>end) return -1;

        int mid = (start+end)/2;
        // 찾은 경우 중간점 인덱스 반환
        if (arr[mid] == arr[target]) return mid;

        // 중간점의 값보다 찾으려는 값이 작은 경우 왼쪽 탐색
        else if (arr[mid] > arr[target]) return binarySearch(arr, target, start, mid-1);
        // 중간점의 값보다 찾으려는 값이 큰 경우 오른쪽 탐색
        else return binarySearch(arr, target, mid +1, end);
    }
}

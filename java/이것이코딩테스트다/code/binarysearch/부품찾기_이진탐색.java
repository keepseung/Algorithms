package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class 부품찾기_이진탐색 {

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start<=end){
            int mid = (start+end)/2;
            // 값을 찾은 경우
            if (arr[mid]== target) return mid;
            // 중간 값보다 찾는 값이 더 큰 경우 오른쪽 탐색
            else if (arr[mid] < target) start = mid+1;
            // 중간 값보다 찾는 값이 더 작은 경우 왼쪽 탐색
            else end = mid-1;
        }


        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int m = sc.nextInt();
        int [] orderArr = new int[m];
        for (int i =0; i<m;i++){
            orderArr[i] = sc.nextInt();
        }

        for (int i=0; i<m; i++){
            int result =binarySearch(arr, orderArr[i], 0, n-1);
            if (result!=-1){
                System.out.print("yes");
            }else{
                System.out.print("no");
            }
        }
    }
}

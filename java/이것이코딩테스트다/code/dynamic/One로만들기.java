package dynamic;

import java.util.Scanner;

public class One로만들기 {
    public static int[] arr = new int[30001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // 다이나믹 프로그래밍 바텀업
        // d[0], d[1]는 값이 0임
        for (int i =2; i <=x; i ++){
            // 현재 수에서 1을 빼는 경우.
            arr[i] = arr[i-1]+1;
            // 2로 나눈 경우
            if (i%2==0){
                arr[i] = Math.min(arr[i], arr[i/2]+1);
            }
            // 3으로 나눈 경우
            if (i%3==0){
                arr[i] = Math.min(arr[i], arr[i/3]+1);
            }
            // 5로 나눈 경우
            if (i%5==0){
                arr[i] = Math.min(arr[i], arr[i/5]+1);
            }


        }

        System.out.println(arr[x]);
    }
}

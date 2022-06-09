package dynamic;

import java.util.Scanner;
/*
4
1 3 1 5
 */
public class 식량창고 {

    public static int[] d = new int[100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        d[0] =arr[0];
        d[1] =Math.max(d[0],arr[1]);
        for (int i=2;i <n; i++){
            d[i] = Math.max(d[i-1], d[i-2]+ arr[i]);
        }
        System.out.println(d[n-1]);
    }
}

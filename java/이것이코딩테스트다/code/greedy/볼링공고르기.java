package greedy;

import java.util.Scanner;
/*
5 3
1 3 2 3 2

8 5
1 5 4 3 2 4 5 2
 */
public class 볼링공고르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int result = 0;
        for (int i =0; i <n; i++){
            for (int j = i+1; j <n; j++){
                if (arr[i] != arr[j]) result++;
            }
        }
        System.out.println(result);
    }
}

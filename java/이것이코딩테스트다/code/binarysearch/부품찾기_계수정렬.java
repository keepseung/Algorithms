package binarysearch;

import java.util.Scanner;

/**
5
8 3 7 9 2
3
5 7 9
 */
public class 부품찾기_계수정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[1000001];
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            arr[x] = 1;
        }

        int m = sc.nextInt();
        int [] orderArr = new int[m];
        for (int i =0; i<m;i++){
            orderArr[i] = sc.nextInt();
        }

        for (int i=0; i<m; i++){
            if (arr[orderArr[i]] ==1){
                System.out.print("yes ");
            }else{
                System.out.print("no ");
            }
        }
    }
}

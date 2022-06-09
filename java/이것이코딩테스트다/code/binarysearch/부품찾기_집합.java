package binarysearch;

import java.util.HashSet;
import java.util.Scanner;

/**
5
8 3 7 9 2
3
5 7 9
 */
public class 부품찾기_집합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            s.add(x);
        }

        int m = sc.nextInt();
        int [] orderArr = new int[m];
        for (int i =0; i<m;i++){
            orderArr[i] = sc.nextInt();
        }

        for (int i=0; i<m; i++){
            if (s.contains(orderArr[i])){
                System.out.print("yes ");
            }else{
                System.out.print("no ");
            }
        }
    }
}

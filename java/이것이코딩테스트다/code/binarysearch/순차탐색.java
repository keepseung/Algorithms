package binarysearch;

import java.util.Scanner;

public class 순차탐색 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String target = sc.next();

        String[] arr = new String[n];
        for (int i =0; i <n; i++){
            arr[i] = sc.next();
        }

        System.out.println(sequantialSearch(n, target, arr));
    }

    private static int sequantialSearch(int n, String target, String[] arr) {
        // 각 원소를 하나씩 확인한다.
        for (int i =0; i< n; i++){
            if (arr[i].equals(target)){
                return i+1;
            }
        }
        return -1;
    }
}

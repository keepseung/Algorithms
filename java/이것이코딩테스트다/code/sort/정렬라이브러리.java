package sort;

import java.util.Arrays;

public class 정렬라이브러리 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        Arrays.sort(arr);

        for (int i= 0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}

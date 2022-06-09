package sort;

public class 스와프 {
    public static void main(String[] args) {

        int[] arr = {3, 5};

        // 스와프
        int temp = arr[1];
        arr[1] = arr[0];
        arr[0] = temp;

        for (int i = 0; i <2; i++) {
            System.out.println("i = " + arr[i]);

        }
    }
}

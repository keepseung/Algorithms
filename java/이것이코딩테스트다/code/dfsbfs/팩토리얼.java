package dfsbfs;

public class 팩토리얼 {
    public static int 재귀함수_이용한_팩토리얼(int n){
        if (n<=1) return 1;
        return n*재귀함수_이용한_팩토리얼(n-1);
    }
    public static int 반복문_이용한_팩토리얼(int n){
        int result =1;

        for (int i=0; i <n; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println();
    }
}

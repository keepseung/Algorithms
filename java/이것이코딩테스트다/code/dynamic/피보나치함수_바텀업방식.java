package dynamic;

public class 피보나치함수_바텀업방식 {
    public static long[] d= new long[100];
    public static void main(String[] args) {
        // 첫번째, 두번째 수
        d[1]=1;
        d[2]=1;
        int n= 50;

        for (int i =3; i<=n; i++){
            d[i] = d[i-1]+d[i-2];
        }
    }
}

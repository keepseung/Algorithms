package dynamic;

import java.util.Scanner;

public class 바닥공사 {

    // 앞서 계산된 결과를 저장하기 위한 DP 테이블
    public static int[] d = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        d[1] =1;
        d[2] =3;
        // 점화식 An = an-1 + an-2 * 2
        for (int i=3; i<=n; i++){
            d[i] = (d[i-1]+d[i-2]*2)%796796;
        }
        System.out.println(d[n]);
    }
}

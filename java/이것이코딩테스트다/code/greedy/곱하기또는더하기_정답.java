package greedy;

import java.util.Scanner;

/*
02984
 */
public class 곱하기또는더하기_정답 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        long result = str.charAt(0)-'0';
        for (int i = 1; i< str.length(); i++){
            long now = str.charAt(0)-'0';
            if (result <=1 || now <= 1) {
                result += now;
            }else{
                result *=now;
            }
        }
        System.out.println(result);
    }
}


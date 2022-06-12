package greedy;

import java.util.Scanner;

/*
02984
 */
public class 곱하기또는더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int result = Integer.parseInt(String.valueOf(str.charAt(0)));
        for (int i = 1; i< str.length(); i++){
            int now = Integer.parseInt(String.valueOf(str.charAt(i)));
            if (result <=1 || now <= 1) {
                result += now;
            }else{
                result *=now;
            }
        }
        System.out.println(result);
    }
}


package implementation;

import java.util.Scanner;

public class 럭키스트레이트 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // 왼쪽 합 구하기
        int leftSum = 0;
        for (int i =0; i<str.length()/2; i++){
            leftSum += str.charAt(i) - '0';
        }

        // 오른쪽 합 구하기
        int rightSum = 0;
        for (int i =str.length()/2; i<str.length(); i++){
            rightSum += str.charAt(i) - '0';
        }

        if (leftSum ==rightSum){
            System.out.println("LUCKY");
        }else{
            System.out.println("READY");
        }
    }
}

package greedy;

import java.util.Scanner;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int count0 = 0; // 전부 0으로 바꾸는 행위의 수
        int count1 = 0; // 전부 1로 바꾸는 행위의 수

        // 첫번째 원소 처리
        if (input.charAt(0) =='1'){
            count0++;
        }else{
            count1++;
        }

        // 두번째 원소 처리
        for (int i =0; i <input.length()-1; i++){
            if (input.charAt(i) != input.charAt(i+1)){

                // 다음 수에서 1로 바뀌는 경우
                if (input.charAt(i+1) =='1') count0++;
                else count1++;
                // 다음 수에서 0으로 바뀌는 경우
            }
        }

        System.out.println(Math.min(count0,count1));
    }

}

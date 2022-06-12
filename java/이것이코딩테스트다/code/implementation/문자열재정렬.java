package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
K1KA5CB7
->
ABCKK13
 */
public class 문자열재정렬 {
    public static ArrayList<Character> result = new ArrayList<>();
    public static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i =0; i<str.length(); i++){
            if (Character.isAlphabetic(str.charAt(i))) { // 문자인 경우
                result.add(str.charAt(i));
            }else{
                sum += str.charAt(i) -'0';
            }
        }

        Collections.sort(result); // 문자를 알파벳 순으로 오름차순 정렬한다.
        for (Character c : result){
            System.out.print(c);
        }

        if (sum >0){
            System.out.println(sum);
        }
    }
}

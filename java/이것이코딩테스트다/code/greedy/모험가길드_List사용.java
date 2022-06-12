package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
5
2 3 1 2 2
->
2
 */
public class 모험가길드_List사용 {

    public static void main(String[] args) {

        // 공포도가 X인 모험가는 반드시 X명 이상으로 구성한 모험가 그룹에 참여해야함
        // 그룹 수의 최대 값
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> people = new ArrayList<>();
        for (int i =0; i < n ; i++){
            people.add(sc.nextInt());
        }

        int result = 0; // 그룹 수

        Collections.sort(people);// 오름차순 정렬

        int cnt = 0; // 사람 수
        for (int i=0; i<n;i++){
            cnt ++;
            if (people.get(i)<=cnt){
                result ++;
                cnt =0;
            }
        }
        System.out.println(result);
    }
}

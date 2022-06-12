package implementation;

import java.util.Scanner;
/*
aabbaccc"	7
ababcdcdababcdcd	9
"abcabcdede"	8
"abcabcabcabcdededededede"	14
"xababcdcdababcdcd"	17
 */
public class 문자열압축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int answer = str.length();

        for (int step =1; step< str.length()/2 + 1; step++){ // 단위 별로 압축을 시도함
            String compressed = "";// 압축된 문자열
            String prev = str.substring(0, step); // 앞에서 부터 step만큼 문자열 추출
            int cnt = 1; // prev가 반복된 개수
            // 단위 만큼 증가시키며 이전 문자열과 비교
            for (int j = step; j< str.length(); j +=step){
                String sub = ""; // 비교할 문자열
                for (int k = j; k< j+step; k ++){
                    if (k <str.length()) sub += str.charAt(k);
                }

                // 이전 문자열이랑 지금 문자열이 같은 경우 횟수 증가
                if (prev.equals(sub)) cnt +=1;
                    // 다른 문자열이 나왔다면
                else{
                    compressed += (cnt >=2) ? cnt + prev: prev;
                    prev =sub;// 다시 상태 초기화
                    cnt =1;
                }
            }

            // 남아있는 문자열에 대해 처리
            compressed += (cnt >=2) ? cnt + prev: prev;
            // 만들어진 압축 문자열이 가장 짧은게 정답
            answer = Math.min(answer, compressed.length());

        }
        System.out.println(answer);
    }
}

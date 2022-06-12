package dfsbfs;


import java.util.ArrayList;
import java.util.Scanner;

public class 연산자끼워넣기 {
    public static int n;
    // 연산을 수행하고자 하는 수 리스트
    public static ArrayList<Integer> arr = new ArrayList<>();
    // 더하기, 빼기, 곱하기, 나누기 연산자 개수
    public static int add, sub, mul, divi;

    // 최솟값과 최댓값 초기화
    public static int minValue = (int) -1e9;
    public static int maxValue = (int) 1e9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i =0; i<n; i++){
            arr.add(sc.nextInt());
        }

        add = sc.nextInt();
        sub = sc.nextInt();
        mul = sc.nextInt();
        divi = sc.nextInt();

        dfs(1, arr.get(0));

        System.out.println(maxValue);
        System.out.println(minValue);
    }

    // 깊이 우선 탐색 메서드
    // i -> 다음 연산 대상 인덱스
    // now -> 현재 숫자 값
    private static void dfs(int i, int now) {
        // 모든 연산자를 사용한 경우, 최솟값, 최댓값 업데이트
        if (i ==n){
            minValue = Math.min(minValue, now);
            maxValue = Math.max(maxValue, now);
        }else{
            // 각 연산자에 대하여 재귀적으로 수행
            if (add>0){
                add -=1;
                dfs(i+1, now+arr.get(i));
                add +=1;
            }
            if (sub>0){
                sub -=1;
                dfs(i+1, now - arr.get(i));
                sub +=1;
            }
            if (mul>0){
                mul -= 1;
                dfs(i+1, now * arr.get(i));
                mul +=1;
            }
            if (divi>0){
                divi -=1;
                dfs(i+1, now / arr.get(i));
                divi +=1;
            }
        }
    }
}

package test.easy;

import java.util.HashMap;

public class OddOccurrenceInArray {
    public int solution(int[] A) {
        // 값을 맵의 key, 값의 개수를 맵의 value으로 갖는 맵 선언
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value :A) {
            if (map.get(value) ==null){ // 처음 발견된 값인 경우
                map.put(value,1);
            }else{ // 이전에 발견된 값인 경우
                map.put(value,map.get(value) + 1);
            }
        }
        int result =0;
        for (Integer key: map.keySet()) {
            if (map.get(key)%2==1){ // 값의 개수가 홀수인 것을 출력
                result = key;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
    }
}

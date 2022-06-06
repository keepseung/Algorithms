import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 정답
        int[] answer = new int[id_list.length];
        
        // Map 정의 및 초기화
        Map<String, HashSet<String>> map = new HashMap<>(); // 키: 신고당한 아이디, 값: 신고한 아이디 셋
        Map<String, Integer> idxMap = new HashMap<>(); // 키 : 아이디, 아이디가 속한 id_list 배열 인덱스
        
        // Id 위치 넣어주기
        for (int i =0; i < id_list.length; i++){
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name,i);
        }
        
        // 신고 기록
        // 신고한 아이디에 누가 신고했는지 저장
        for (String s : report){
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            map.get(to).add(from);
        }
        
        // 이용 정지 메일 발송
        for (int i =0 ; i < id_list.length; i++){
            HashSet<String> send = map.get(id_list[i]);
            if (send.size() >=k){
                for (String name: send){
                    answer[idxMap.get(name)]++;
                }
            }
            
        }
        
     
        return answer;
    }
}
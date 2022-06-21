package medium.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    // O(2^n), 시간초과 발생
    // 솔루션을 찾기 위해 단어 사전에서 해당 문자열의 가능한 모든 접두사를 확인합니다. 사전에서 찾은 경우 해당 문자열의 나머지 부분에 대해 재귀 함수가 호출됩니다.
    public boolean wordBreak_TimeOver(String s, List<String> wordDict) {
        return wordBreakRecur(s, new HashSet<>(wordDict), 0);
    }

    private boolean wordBreakRecur(String s, Set<String> wordDict, int start) {
        if (start == s.length()) {
            return true;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && wordBreakRecur(s, wordDict, end)) {
                return true;
            }
        }
        return false;
    }

    // memoization method 여기서 배열 메모는 하위 문제의 결과를 저장하는 데 사용됩니다.
    public boolean wordBreak_Memo(String s, List<String> wordDict) {
        return wordBreakMemo(s, new HashSet<>(wordDict), 0, new Boolean[s.length()]);
    }

    // dp 방식
    private boolean wordBreakMemo(String s, Set<String> wordDict, int start, Boolean[] memo) {
        if (start == s.length()) return true; // 문자열 길이가 같은 경우
        if (memo[start] != null) return memo[start];

        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && wordBreakMemo(s, wordDict, end, memo)) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }


    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDicSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDicSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

}

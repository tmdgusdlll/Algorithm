import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<Character, Integer> word = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (!word.containsKey(c)) {
                answer[i] = -1;
            } else {
                int before = word.get(c);
                answer[i] = i - before;
            }
            word.put(c, i);
        }
        return answer;
    }
}
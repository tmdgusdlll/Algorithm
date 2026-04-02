import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        char[] array = s.toCharArray();
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < '0' || array[i] > '9') {
                return false;
            }
        }
        return answer;
    }
}
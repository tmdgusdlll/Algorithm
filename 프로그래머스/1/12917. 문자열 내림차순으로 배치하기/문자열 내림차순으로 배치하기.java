import java.util.*;

class Solution {
    public String solution(String s) {

        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        String str = new String(arr);
        
        return new StringBuilder(new StringBuilder(str)).reverse().toString();
    }
}
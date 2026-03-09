import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        StringBuilder answer = new StringBuilder();
        for (String s : arr) {
            answer.append(s);
        }
        return Long.parseLong(answer.toString());
    }
}
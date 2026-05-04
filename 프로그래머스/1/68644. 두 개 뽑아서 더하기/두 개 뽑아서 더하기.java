import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> setNum = new TreeSet<Integer>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                setNum.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[setNum.size()];
        
        int index = 0;
        for (Integer num : setNum) {
            answer[index++] = num;
        }
        return answer;
    }
}
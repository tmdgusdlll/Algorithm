import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        
        int[] newArray = Arrays.copyOf(num_list, num_list.length + 1);
        
        int endIdx = num_list.length - 1;
        
        if (num_list[endIdx] > num_list[endIdx-1]) {
            newArray[newArray.length - 1] = num_list[endIdx] - num_list[endIdx - 1];
        } else {
            newArray[newArray.length - 1] = 2 * num_list[endIdx];
        }
        return newArray;
    }
}
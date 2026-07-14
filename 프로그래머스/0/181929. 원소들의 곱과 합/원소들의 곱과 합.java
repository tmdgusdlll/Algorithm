class Solution {
    public int solution(int[] num_list) {
        int multi = 1;
        int sum1 = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            multi *= num_list[i];
            sum1 += num_list[i];
        }
        int sum2 = sum1 * sum1;
        
        return (multi < sum2) ? 1 : 0;
    }
}
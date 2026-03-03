class Solution {
    public int solution(int n) {
        int answer = n - 1;
        for (int i = 2; i * i <= answer; i++) {
            if (answer % i == 0) {
                return i;
            }
        }
        return answer;
    }
    
}
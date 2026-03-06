class Solution {
    public long solution(long n) {
        long answer = -1;
        double result = Math.sqrt(n);
        long x = (long) result;
        
        if (n == x * x) {
            answer = (x + 1) * (x + 1);
        }
        return answer;
    }
}
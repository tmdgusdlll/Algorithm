class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int result = 0;
        
        int n = x;
        while (x >0) {
            result += x % 10;
            x /= 10;
        }
        return n % result == 0;
    }
}
class Solution {
    public int solution(int n) {
        StringBuilder reverse = new StringBuilder();
        
        while (n > 0) {
            reverse.append(n % 3);
            n = n / 3;
        }
        return Integer.parseInt(reverse.toString(), 3);
    }
}
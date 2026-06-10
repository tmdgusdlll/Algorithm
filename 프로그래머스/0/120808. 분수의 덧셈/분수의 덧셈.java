class Solution {
    private int getGcd(int a, int b) {
        int remainder;
        while (b != 0) {
            remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int top = (numer1 * denom2) + (numer2 * denom1);
        int bottom = denom1 * denom2;
            
        int gcd = getGcd(top, bottom);
            
        top = top / gcd;
        bottom = bottom / gcd;
            
        int[] answer = new int[]{top, bottom};
            
        return answer;
    }
}
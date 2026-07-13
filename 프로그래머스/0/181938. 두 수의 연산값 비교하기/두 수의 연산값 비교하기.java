class Solution {
    public int solution(int a, int b) {
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        
        String sumAB = sa + sb;
        
        int sum = Integer.parseInt(sumAB);
        int multi = 2 * a * b;
        
        return Math.max(sum, multi);   
    }
}
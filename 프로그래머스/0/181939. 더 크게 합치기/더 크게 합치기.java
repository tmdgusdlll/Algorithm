class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        
        String sumAb = sa + sb;
        String sumBa = sb + sa;
        
        int num1 = Integer.parseInt(sumAb);
        int num2 = Integer.parseInt(sumBa);
        
        return Math.max(num1, num2);
    }
}
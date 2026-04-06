class Solution {
    public int[] solution(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        
        while (true) {
            int r = a % b;
            if (r == 0) {
                break;
            }
            a = b;
            b = r;
        }
        int gcd = b;
        int lcm = (n * m) / gcd;

        return new int[]{gcd, lcm};
    }
}
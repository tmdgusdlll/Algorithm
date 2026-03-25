class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray(); 
        int len = c.length;

        if (len  % 2 == 0) {
            return "" + c[(len/2) - 1] + c[len/2];
        }else {
            return "" + c[(len-1)/2];
        }
    }
}
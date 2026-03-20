class Solution {
    public String solution(String phone_number) {

        char[] pn = phone_number.toCharArray();
        
        for (int i = 0; i < pn.length - 4; i++) {
            pn[i] = '*';
        }
        return String.valueOf(pn);
    }
}
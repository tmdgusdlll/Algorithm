class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                sb.append(c);
            } 
            else if (c >= 'a' && c <= 'z') {
                char lower = (char)(c + n);
                if (lower > 'z') {
                    lower = (char)(lower - 26);
                }
                sb.append(lower);
            } 
            else if (c >= 'A' && c <= 'Z') {
                char upper = (char)(c + n);
                if (upper > 'Z') {
                    upper = (char)(upper - 26);
                }
                sb.append(upper);
            }
        }
        return sb.toString();
    }
}
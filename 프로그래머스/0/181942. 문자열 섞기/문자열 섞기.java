class Solution {
    public String solution(String str1, String str2) {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            sb.append(c);
            
            char c2 =  str2.charAt(i);
            sb.append(c2);
        }
        return sb.toString();
    }
}
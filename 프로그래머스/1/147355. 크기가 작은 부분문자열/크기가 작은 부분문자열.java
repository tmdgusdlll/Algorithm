class Solution {
    public int solution(String t, String p) {
        Long a = Long.parseLong(p);
        int count = 0;
        
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String three = t.substring(i, i + p.length());
            Long b = Long.parseLong(three);
            
            if (b <= a) {
                count++;
            }
        }
        return count;
    }
}
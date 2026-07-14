class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            
            // mode가 0일때
            if (mode == 0) {
                // idx가 1이면 mode = 1로 변경
                if (c == '1') {
                    mode = 1;
                // idx가 짝수라면 ret에 추가
                } else if (i % 2 == 0) {
                    ret.append(c);
                }
            // mode가 1일때
            } else {
                // idx가 1이면 mode = 0로 변경
                if (c == '1') {
                    mode = 0;
                // idx가 홀수라면 ret에 추가
                } else if (i % 2 != 0) {
                    ret.append(c);
                }
            }
        }
        if (ret.length() == 0) {
            return "EMPTY";
        }
        return ret.toString();
    }
}
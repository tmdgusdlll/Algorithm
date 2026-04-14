class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];
            
            int longSide = Math.max(w, h);
            int shortSide = Math.min(w, h);
            
            maxWidth = Math.max(maxWidth, longSide);
            maxHeight = Math.max(maxHeight, shortSide);
        }
        return maxWidth * maxHeight;
    }
}
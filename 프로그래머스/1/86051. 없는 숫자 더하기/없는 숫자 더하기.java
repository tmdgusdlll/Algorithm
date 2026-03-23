class Solution {
    public int solution(int[] numbers) {
        int total = 45;
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return total - result;
    }
}
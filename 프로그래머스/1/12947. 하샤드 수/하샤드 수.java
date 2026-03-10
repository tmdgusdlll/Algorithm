class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] result = String.valueOf(x).split("");

        int sum = 0;
        for (String s : result) {
            sum += Integer.parseInt(s);
        }
        return x % sum == 0;
    }
}
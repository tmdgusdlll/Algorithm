import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        String answer = Arrays.stream(Long.toString(n).split(""))
            .sorted(Collections.reverseOrder())
            .collect(Collectors.joining());
        return Long.parseLong(answer);
    }
}
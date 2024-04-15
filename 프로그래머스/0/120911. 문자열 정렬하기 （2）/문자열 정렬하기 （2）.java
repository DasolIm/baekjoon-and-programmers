import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String my_string) {
        String [] temp = my_string.split("");
        return Arrays.stream(temp).map(String::toLowerCase).sorted().collect(Collectors.joining());
    }
}
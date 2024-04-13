import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string) {
        String [] strArr = my_string.split("");
        List<String> distincted = Arrays.asList(strArr).stream().distinct().collect(Collectors.toList());
        return String.join("", distincted);
    }
}
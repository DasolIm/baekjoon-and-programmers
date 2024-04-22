import java.util.*;
class Solution {
    public static int solution(String before, String after) {
        String [] beforeNew = before.split("");
        String [] afterNew = after.split("");
        Arrays.sort(beforeNew); 
        Arrays.sort(afterNew);
        if (Arrays.equals(beforeNew, afterNew)) return 1;
        else return 0;
    }
}
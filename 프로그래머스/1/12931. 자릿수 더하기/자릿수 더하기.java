import java.util.*;

public class Solution {
    public static int solution(int n) {
        String str = String.valueOf(n);
        int res  = 0;
        for (int i=0; i<str.length(); i++) {
            res += str.charAt(i) - '0';
        }
        return res;
    }
}
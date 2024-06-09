import java.util.*;
class Solution {
    public static long solution(long n) {
        char [] tmp = String.valueOf(n).toCharArray();
        Arrays.sort(tmp);
        StringBuilder sb = new StringBuilder();
        for (int i=tmp.length-1; i>=0; i--) {
            sb.append(tmp[i]);
        }
        return Long.parseLong(sb.toString());
    }
}
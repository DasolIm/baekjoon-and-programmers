import java.util.*;
class Solution {
    public long solution(int a, int b) {
        long cnt = 0;
        for (long i=Math.min(a, b); i<=Math.max(a,b); i++) {
            cnt += i;
        }
        return cnt;
    }
}
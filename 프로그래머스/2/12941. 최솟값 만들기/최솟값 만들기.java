import java.util.*;
class Solution {
    public static int solution(int [] A, int [] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int ans = 0;
        for (int i=0; i<A.length; i++) {
            ans += (A[i]*B[A.length-i-1]);
        }
        return ans;
    }
}
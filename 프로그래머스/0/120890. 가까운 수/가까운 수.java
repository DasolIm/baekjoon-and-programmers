import java.util.*;
class Solution {
    public static int solution(int[] array, int n) {
        Arrays.sort(array);
        int ans = array[0];
        for (int j : array) {
            if (Math.abs(ans - n) > Math.abs(j - n))
                ans = j;
        }
        return ans;
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[] {-1};
        int min = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
        }
        int [] res = new int[arr.length-1];
        int idx = 0;
        for (int k : arr) {
            if (k != min) {
                res[idx++] = k;
            }
        }
        return res;
    }
}
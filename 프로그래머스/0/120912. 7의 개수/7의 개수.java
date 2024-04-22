import java.util.*;
class Solution {
    public static int solution(int[] array) {
        String [] arr = Arrays.toString(array).split("");
        int cnt = 0;
        for (int i=0; i< arr.length; i++) {
            if (arr[i].equals("7")) cnt++;
        }
        return cnt;
    }
}
import java.util.*;
import java.util.stream.*;
class Solution {
    public static int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=2; i<=n; i++) {
            while (n%i == 0) {
                arr.add(i);
                n /= i;
            }
        }
        return arr.stream().distinct().mapToInt(Integer::intValue).toArray();
    }
}
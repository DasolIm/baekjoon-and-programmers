import java.util.*;
class Solution {
    public static int[] solution(int n) {
        ArrayList<Integer> resArr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) resArr.add(i);
        }
        int [] resArr2 = new int[resArr.size()];
        for (int a = 0; a < resArr.size(); a++) {
            resArr2[a] = resArr.get(a);
        }
        return resArr2;
    }
}
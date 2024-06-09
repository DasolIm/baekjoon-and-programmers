import java.util.*;
class Solution {
    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> al = new ArrayList<>();
        int cnt = 0;
        for (int i : arr) {
            if (i%divisor == 0) { 
                al.add(i); 
                cnt++; 
            }
        }
        if (al.isEmpty()) al.add(-1);
        Collections.sort(al);
        int [] res = new int[al.size()];
        for (int i=0; i<res.length; i++) {
            res[i] = al.get(i);
        }
        return res;
    }
}
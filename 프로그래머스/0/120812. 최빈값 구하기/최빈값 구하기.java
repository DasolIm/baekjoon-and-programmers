import java.util.*;

class Solution {
    public int solution(int[] array) {
        int [] arrDist = Arrays.stream(array).distinct().toArray();
        int [] cnt = new int[arrDist.length];
        for (int i=0; i<arrDist.length; i++) {
            int arrDistTemp = arrDist[i];
            for (int j=0; j<array.length; j++) {
                if (arrDistTemp == array[j]) cnt[i]++;
            }
        }
        int max = 0; int mode = 0; int modeCnt = 0;
        for (int i=0; i<cnt.length; i++) {
            if (cnt[i] > max) max = cnt[i];
        }
        for (int i=0; i<cnt.length; i++) {
            if (cnt[i] == max) {modeCnt++; mode = arrDist[i];}
        }
        if (modeCnt > 1) mode = -1;
        return mode;
    }
}
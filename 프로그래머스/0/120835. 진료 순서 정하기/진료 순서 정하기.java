import java.util.*;
class Solution {
    public static int[] solution(int[] emergency) {
        Integer [] emergencyT = new Integer[emergency.length];
        HashMap<Integer, Integer> hm = new HashMap<>();
        int [] res = new int[emergency.length];
        for (int i=0; i<emergency.length; i++) {
            emergencyT[i] = emergency[i];
        }
        Arrays.sort(emergencyT, Collections.reverseOrder());
        for (int i = 0; i < emergencyT.length; i++) {
            hm.put(emergencyT[i], i + 1);
        }
        for (int i=0; i<emergency.length; i++) {
            if (hm.containsKey(emergency[i])) res[i]=hm.get(emergency[i]);
        }
        return res;
    }
}
import java.util.*;
import java.util.stream.*;
class Solution {
    public static String solution(String s) {
        String [] temp = s.split("");
        ArrayList<String> origin = new ArrayList<>(Arrays.asList(temp));
        Collections.sort(origin);
        String [] temp2 = origin.stream().distinct().collect(Collectors.joining()).split("");
        ArrayList<String> comparing = new ArrayList<>(Arrays.asList(temp2));
        Collections.sort(comparing);
        for (int i=0; i<comparing.size(); i++) {
            int cnt = 0;
            for (String str : origin) {
                if (str.equals(comparing.get(i))) cnt++;
                if (cnt > 1) {
                    comparing.remove(i);
                    i--;
                    break;
                }
            }
        }
        return comparing.stream().collect(Collectors.joining());
    }
}
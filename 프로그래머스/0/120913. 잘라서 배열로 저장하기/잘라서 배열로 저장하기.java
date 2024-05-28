import java.util.*;
class Solution {
    public static String[] solution(String my_str, int n) {
        ArrayList<String> res = new ArrayList<>();
        for (int i=0; i<my_str.length(); i+=n) {
            res.add(my_str.substring(i, Math.min(i + n, my_str.length())));
        }
        return res.toArray(new String[res.size()]);
    }
}
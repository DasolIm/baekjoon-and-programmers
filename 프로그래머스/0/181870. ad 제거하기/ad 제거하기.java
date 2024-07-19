import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> ans = new ArrayList<>();
        for (String a : strArr) {
            if (!a.contains("ad")) ans.add(a);
        }
        return ans.toArray(new String[0]);
    }
}
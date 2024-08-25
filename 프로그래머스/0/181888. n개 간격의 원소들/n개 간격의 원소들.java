import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i=0; i<num_list.length; i+=n) {
            tmp.add(num_list[i]);
        }
        int [] ans = new int[tmp.size()];
        for (int i=0; i<tmp.size(); i++) {
            ans[i] = tmp.get(i);
        }
        return ans;
    }
}
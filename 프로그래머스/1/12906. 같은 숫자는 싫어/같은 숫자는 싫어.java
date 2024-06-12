import java.util.*;
public class Solution {
    public static int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        for (int a : arr) {
            if (st.empty() || !st.peek().equals(a)) 
                st.push(a);
        }
        int [] res = new int[st.size()];
        int idx = 0;
        for (int b : st) {
            res[idx++] = b;
        }
        return res;
    }
}
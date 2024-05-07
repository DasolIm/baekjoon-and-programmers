class Solution {
    public int solution(int[] num_list, int n) {
        int ans = 0;
        for (int i : num_list) {
            if (i == n) ans = 1;
        }
        return ans;
    }
}
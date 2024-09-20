class Solution {
    public int[] solution(int n, int k) {
        int [] ans = new int[n/k];
        int idx = 0;
        for (int i=k; i<=n; i+=k) {
            ans[idx++] = i;
        }
        return ans;
    }
}
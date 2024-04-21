class Solution {
    public int solution(int n) {
        int ans = 1;
        for (int i=1; i<=n; i++) {
            ans *= i;
            if (ans == n) return i;
            else if (ans >= n) return i-1;
        }
        return 0;
    }
}
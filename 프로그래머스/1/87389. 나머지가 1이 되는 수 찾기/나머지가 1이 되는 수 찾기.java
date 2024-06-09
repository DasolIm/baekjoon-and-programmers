class Solution {
    public static int solution(int n) {
        int ans = 0;
        int i = 2;
        while (i < n) {
            if (n%i == 1) {
                ans = i;
                break;
            }
            i++;
        }
        return ans;
    }
}
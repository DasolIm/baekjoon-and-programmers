class Solution {
    public int solution(String num_str) {
        int ans = 0;
        for (char c : num_str.toCharArray()) {
            ans += Character.getNumericValue(c);
        }
        return ans;
    }
}
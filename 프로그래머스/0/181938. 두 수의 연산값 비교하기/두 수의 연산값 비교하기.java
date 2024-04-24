class Solution {
    public int solution(int a, int b) {
        int res1 = Integer.parseInt(a + "" + b);
        int res2 = 2 * a * b;
        if (res1 != res2) {
            return Math.max(res1, res2);
        } else {
            return res1;
        }
    }
}
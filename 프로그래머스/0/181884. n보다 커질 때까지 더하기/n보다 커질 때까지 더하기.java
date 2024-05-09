class Solution {
    public int solution(int[] numbers, int n) {
        int cnt = 0;
        for (int i : numbers) {
            cnt+=i;
            if (cnt > n) break;
        } return cnt;
    }
}
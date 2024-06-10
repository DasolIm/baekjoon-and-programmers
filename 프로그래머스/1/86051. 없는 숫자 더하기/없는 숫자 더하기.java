class Solution {
    public int solution(int[] numbers) {
        int cnt = 0;
        for (int i : numbers) {
            cnt += i;
        }
        return 45 - cnt;
    }
}
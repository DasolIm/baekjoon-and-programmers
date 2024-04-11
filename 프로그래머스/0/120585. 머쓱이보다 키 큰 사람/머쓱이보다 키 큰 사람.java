class Solution {
    public int solution(int[] arr, int height) {
        int cnt = 0;
        for (int i : arr) {
            if (i > height) cnt++;
        }
        return cnt;
    }
}
class Solution {
    public double solution(int[] arr) {
        double cnt = 0;
        for (int i : arr) {
            cnt += i;
        }
        return cnt/arr.length;
    }
}
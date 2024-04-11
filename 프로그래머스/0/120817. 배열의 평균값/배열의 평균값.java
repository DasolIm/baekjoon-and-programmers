class Solution {
    public double solution(int[] numbers) {
        double res = 0;
        for (int i=0; i<numbers.length; i++) {
            res += numbers[i];
        }
        return res/numbers.length;
    }
}
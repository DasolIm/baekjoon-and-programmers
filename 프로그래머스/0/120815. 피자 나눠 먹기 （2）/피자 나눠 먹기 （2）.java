class Solution {
    public int solution(int n) {
        int i = 6;
        int res = 0;
        while (true) {
            if (i % n == 0) {
                res = i;
                break;
            }
            i+=6;
        }
        return res/6;
    }
}
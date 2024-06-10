class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int cnt = 0;
        for (int i=0; i<absolutes.length; i++) {
            if (!signs[i]) cnt-=absolutes[i];
            else cnt+=absolutes[i];
        }
        return cnt;
    }
}
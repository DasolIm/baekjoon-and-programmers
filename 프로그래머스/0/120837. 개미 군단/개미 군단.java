class Solution {
    public int solution(int hp) {
        int [] squad = {5, 3, 1};
        int squadCnt = 0;
        for (int i=0; i<squad.length; i++) {
            squadCnt += hp / squad[i];
            hp %= squad[i];
        }
        return squadCnt;
    }
}
class Solution {
    public static int solution(int[] sides) {
        int max = sides[0];
        int cnt = max;
        for (int i=1; i<sides.length; i++) {
            cnt += sides[i];
            if (sides[i] > max) max = sides[i];
        }
        cnt -= max;
        return (cnt > max) ? 1 : 2;
    }
}
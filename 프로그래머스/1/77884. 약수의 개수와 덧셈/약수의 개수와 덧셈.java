class Solution {
    public static int solution(int left, int right) {
        int res = 0;
        for (int i=left; i<=right; i++) {
            int common = 0;
            for (int j=1; j<=i; j++) {
                if (i%j == 0) common++;
            }
            if (common%2 == 0) 
                res+=i;
            else 
                res-=i;
        }
        return res;
    }
}
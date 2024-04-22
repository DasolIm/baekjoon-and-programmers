class Solution {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int new_denom = denom1*denom2;
        int new_numer = (denom2*numer1)+(denom1*numer2);
        int gcd = 0;
        for (int i=1; i<=new_denom && i<=new_numer; i++) {
            if (new_denom%i==0 && new_numer%i==0) gcd = i;
        }
        return new int[] {new_numer/gcd, new_denom/gcd};
    }
}
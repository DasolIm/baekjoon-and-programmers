class Solution {
    public static int[] solution(long n) {
        String nS = String.valueOf(n);
        int [] res = new int[nS.length()];
        for (int i=0; i<res.length; i++) {
            res[i] = nS.charAt(nS.length()-i-1) - '0';
        }
        return res;
    }
}
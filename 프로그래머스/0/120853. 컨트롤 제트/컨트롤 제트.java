class Solution {
    public static int solution(String s) {
        String [] tmpS = s.split(" ");
        int res = 0;
        for (int i=0; i<tmpS.length; i++) {
            if (tmpS[i].equals("Z")) {
                tmpS[i] = "0"; tmpS[i-1] = "0";
            }
        }
        for (String t : tmpS) {
            res += Integer.parseInt(t);
        }
        return res;
    }
}
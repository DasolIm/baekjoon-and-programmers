class Solution {
    public static String solution(String s) {
        String [] tmp = s.split(" ");
        int min = Integer.parseInt(tmp[0]);
        int max = Integer.parseInt(tmp[0]);
        for (String a : tmp) {
            int b = Integer.parseInt(a);
            if (min > b) min = b;
            if (max < b) max = b;
        }
        return min + " " + max;
    }
}
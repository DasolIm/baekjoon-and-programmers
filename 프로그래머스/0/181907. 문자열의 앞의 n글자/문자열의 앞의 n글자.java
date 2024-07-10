class Solution {
    public static String solution(String my_string, int n) {
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for (char a : my_string.toCharArray()) {
            sb.append(a);
            idx++;
            if (idx == n) break;
        }
        return sb.toString();
    }
}
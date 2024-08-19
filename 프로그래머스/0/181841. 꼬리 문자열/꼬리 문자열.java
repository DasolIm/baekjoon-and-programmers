class Solution {
    public static String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        for (String s : str_list) {
            if (!s.contains(ex)) sb.append(s);
        }
        return sb.toString();
    }
}
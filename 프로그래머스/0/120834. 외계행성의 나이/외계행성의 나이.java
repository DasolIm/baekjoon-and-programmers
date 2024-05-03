class Solution {
    public String solution(int age) {
        char [] chars = String.valueOf(age).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char tmp : chars) {
            char res = (char)((int)tmp+49);
            sb.append(res);
        }
        return sb.toString();
    }
}
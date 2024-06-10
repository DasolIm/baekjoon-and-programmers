class Solution {
    public static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int starLen = phone_number.length() - 4;
        for (int i=0; i<starLen; i++) {
            sb.append("*");
        }
        for (int k=starLen; k<phone_number.length(); k++) {
            sb.append(phone_number.charAt(k));
        }
        return sb.toString();
    }
}
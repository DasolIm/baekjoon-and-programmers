class Solution {
    public String solution(String rsp) {
        String [] strs = new String[rsp.length()];
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<strs.length; i++) {
            strs[i] = String.valueOf(rsp.charAt(i));
            if (strs[i].equals("0")) sb.append("5");
            if (strs[i].equals("5")) sb.append("2");
            if (strs[i].equals("2")) sb.append("0");
        }
        return sb.toString();
    }
}
class Solution {
    public String solution(String n_str) {
        int idx = -1;
        for (char n : n_str.toCharArray()) {
            idx++; 
            if (n != '0') break;
        }
        return n_str.substring(idx);
    }
}
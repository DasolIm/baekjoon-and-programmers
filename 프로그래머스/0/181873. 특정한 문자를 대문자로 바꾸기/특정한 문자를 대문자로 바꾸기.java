import java.util.*;
class Solution {
    public String solution(String my_string, String alp) {
        String [] str = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length; i++) {
            if (str[i].equals(alp)) str[i] = alp.toUpperCase();
            sb.append(str[i]);
        }
        return sb.toString();
    }
}
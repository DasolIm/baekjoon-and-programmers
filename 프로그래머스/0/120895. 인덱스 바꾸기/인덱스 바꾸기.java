import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        char [] resarr = my_string.toCharArray();
        char temp = resarr[num1];
        resarr[num1] = resarr[num2];
        resarr[num2] = temp;
        return new String(resarr);
    }
}
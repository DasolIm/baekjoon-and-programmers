import java.util.*;

class Solution {
    public static int solution(String my_string) {
        int ans = 0;
        StringBuilder digitOnly = new StringBuilder();
        for (char a : my_string.toCharArray()) {
            if (Character.isDigit(a)) {
                digitOnly.append(a);
            } else {
                digitOnly.append(' ');
            }
        }
        String [] digitOnly2 = digitOnly.toString().split(" ");
        for (String num : digitOnly2) {
            if (!num.isEmpty()) {
                ans += Integer.parseInt(num);
            }
        }
        return ans;
    }
}
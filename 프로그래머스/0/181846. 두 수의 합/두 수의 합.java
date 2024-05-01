import java.math.BigInteger;

class Solution {
    public static String solution(String a, String b) {
        BigInteger aint = new BigInteger(a);
        BigInteger bint = new BigInteger(b);
        BigInteger c = aint.add(bint);
        return c.toString();
    }
}
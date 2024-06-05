import java.math.*;

class Solution {
    public static int solution(int balls, int share) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        for (int i = 1; i <= balls; i++) {
            a = a.multiply(BigInteger.valueOf(i));
            if (i <= (balls - share)) {
                b = b.multiply(BigInteger.valueOf(i));
            }
            if (i <= share) {
                b = b.multiply(BigInteger.valueOf(i));
            }
        }
        return a.divide(b).intValue();
    }
}
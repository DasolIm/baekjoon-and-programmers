import java.math.BigInteger;
class Solution {
    public int solution(String number) {
        BigInteger tmp = new BigInteger(number);
        BigInteger divisor = BigInteger.valueOf(9);
        return tmp.mod(divisor).intValue();
    }
}
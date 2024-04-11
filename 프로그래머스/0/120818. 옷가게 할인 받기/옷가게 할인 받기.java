import java.util.*;

class Solution {
    public static int solution(int price) {
        if (price < 100000)
            return price;
        else if (100000 <= price && price < 300000)
            return (int) Math.floor(price*0.95);
        else if (300000 <= price && price < 500000)
            return (int) Math.floor(price*0.9);
        else
            return (int) Math.floor(price*0.8);
    }
}
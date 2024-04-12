class Solution {
    public int solution(int meal, int drink) {
        if (meal >= 10) {
            if (drink >= meal/10) drink = drink - meal/10;
            else drink = 0;
        }
        return meal*12000 + drink*2000;
    }
}
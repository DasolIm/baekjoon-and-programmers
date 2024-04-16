class Solution {
    public static int solution(int chicken) {
        int oth = 0;
        while (chicken >= 10) {
            oth += chicken/10;
            chicken = chicken/10 + chicken%10;
        }
        return oth;
    }
}
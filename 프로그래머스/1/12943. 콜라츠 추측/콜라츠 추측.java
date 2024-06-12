class Solution {
    public static int solution(int num) {
        int tried = 0;
        while (tried < 500) {
            if (tried == 0 && num == 1) break;
            
            if (num%2 == 0) {
                num /= 2;
            }
            else if (num%2 == 1) {
                num *= 3;
                num += 1;
            }
            tried++;
            if (num == 1) break;
        }
        if (tried == 500) return -1;
        else return tried;
    }
}
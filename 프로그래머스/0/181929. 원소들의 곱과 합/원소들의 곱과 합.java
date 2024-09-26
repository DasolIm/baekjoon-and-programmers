class Solution {
    public int solution(int[] num_list) {
        int a = 1; int b = 0;
        for (int i : num_list) {
            a *= i;
            b += i;
        }
        return (b*b > a) ? 1 : 0; 
    }
}
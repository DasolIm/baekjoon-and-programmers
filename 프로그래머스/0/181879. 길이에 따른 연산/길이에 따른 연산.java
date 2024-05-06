class Solution {
    public static int solution(int[] num_list) {
        int res = 1;
        if (num_list.length >= 11) {
            for (int a : num_list) {
                res+=a;
            }
            return res-1;
        } 
        else {
            for (int a : num_list) {
                res*=a;
            }
            return res;
        }
    }
}
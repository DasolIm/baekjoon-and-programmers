class Solution {
    public static int[] solution(int[] num_list) {
        int len = num_list.length;
        int [] ans = new int[len+1];
        int idx = 0;
        for (int i : num_list) {
            ans[idx++] = i;
        }
        if (num_list[len-1] > num_list[len-2])
            ans[len] = num_list[len-1] - num_list[len-2];
        else
            ans[len] = num_list[len-1]*2;
        return ans;
    }
}
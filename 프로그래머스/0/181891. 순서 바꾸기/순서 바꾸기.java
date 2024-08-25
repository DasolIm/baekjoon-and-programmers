class Solution {
    public static int[] solution(int[] num_list, int n) {
        int [] ans = new int[num_list.length];
        int idx1 = 0;
        for (int i=n; i<num_list.length; i++) {
            ans[idx1++] = num_list[i];
        }
        int idx2 = num_list.length-n;
        for (int t=0; t<n; t++) {
            ans[idx2++] = num_list[t];
        }
        return ans;
    }
}
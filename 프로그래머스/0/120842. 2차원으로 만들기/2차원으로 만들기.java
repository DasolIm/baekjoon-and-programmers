class Solution {
    public static int[][] solution(int[] num_list, int n) {
        int idx = 0;
        int [][] res = new int[num_list.length/n][n];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = num_list[idx];
                idx++;
            }
        }
        return res;
    }
}
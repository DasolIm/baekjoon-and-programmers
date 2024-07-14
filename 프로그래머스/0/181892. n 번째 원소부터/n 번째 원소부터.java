class Solution {
    public static int[] solution(int[] num_list, int n) {
        int [] ints = new int[num_list.length-n+1];
        int idx = 0;
        for (int i=n-1; i<num_list.length; i++) {
            ints[idx++] = num_list[i];
        }
        return ints;
    }
}
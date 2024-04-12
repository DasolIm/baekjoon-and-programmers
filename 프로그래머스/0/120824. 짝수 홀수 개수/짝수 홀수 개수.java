class Solution {
    public int[] solution(int[] num_list) {
        int [] evenOrOdd = {0, 0};
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 == 0) evenOrOdd[0]++;
            else evenOrOdd[1]++;
        }
        return evenOrOdd;
    }
}
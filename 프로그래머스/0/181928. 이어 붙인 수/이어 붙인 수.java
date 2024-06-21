class Solution {
    public static int solution(int[] num_list) {
        String evens = "";
        String odds = "";
        for (int i : num_list) {
            if (i%2 == 0) evens += Integer.toString(i);
            if (i%2 == 1) odds += Integer.toString(i);
        }
        return Integer.parseInt(evens) + Integer.parseInt(odds);
    }
}
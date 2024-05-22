class Solution {
    public static int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int [] ans = new int[len];
        if (direction.equals("right")) {
            ans[0] = numbers[len-1];
            for (int i=1; i<len; i++) {
                ans[i] = numbers[i-1];
            }
        }
        else {
            ans[len-1] = numbers[0];
            for (int i=0; i<len-1; i++) {
                ans[i] = numbers[i+1];
            }
        }
        return ans;
    }
}
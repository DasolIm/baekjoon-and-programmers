class Solution {
    public int solution(int n) {
        char [] arr = String.valueOf(n).toCharArray();
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += Character.getNumericValue(arr[i]);
        }
        return sum;
    }
}
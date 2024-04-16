class Solution {
    public int solution(int[] numbers, int k) {
         int res = 1;
        int i = 0;
        int j = 1;
        while(j<k){
            i += 2;
            j ++;
            if(i>numbers.length){
                i = (i%numbers.length);
            }
            if(j == k){
                res = numbers[i];
                break;
            }
        }

        return res;
    }
}
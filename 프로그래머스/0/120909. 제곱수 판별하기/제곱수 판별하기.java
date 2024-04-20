class Solution {
    public int solution(int n) {
        double obj = Math.sqrt(n);
        int objToInt = (int) obj;
        if (obj == objToInt) return 1;
        else return 2;
    }
}
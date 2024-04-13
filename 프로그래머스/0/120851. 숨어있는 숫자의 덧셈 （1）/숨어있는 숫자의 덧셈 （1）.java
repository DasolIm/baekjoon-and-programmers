class Solution {
    public int solution(String my_string) {
        char [] chararr = my_string.toCharArray();
        int total = 0;
        for (char c : chararr) {
            if (Character.isDigit(c)) total+=Character.getNumericValue(c);
        }
        return total;
    }
}
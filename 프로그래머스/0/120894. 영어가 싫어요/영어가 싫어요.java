class Solution {
    public long solution(String numbers) {
        String [] str1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String [] str2 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < str1.length; i++) {
            numbers = numbers.replaceAll(str1[i], str2[i]);
        }
        return Long.parseLong(numbers);
    }
}
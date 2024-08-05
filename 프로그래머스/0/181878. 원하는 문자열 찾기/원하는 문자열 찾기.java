class Solution {
    public static int solution(String myString, String pat) {
        return (myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0);
    }
}
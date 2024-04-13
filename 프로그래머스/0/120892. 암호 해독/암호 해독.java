class Solution {
    public String solution(String cipher, int code) {
        char [] arr = cipher.toCharArray();
        StringBuilder st = new StringBuilder();
        for (int i=code-1; i<arr.length; i+=code) st.append(arr[i]);
        return st.toString();
    }
}
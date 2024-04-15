class Solution {
    public String solution(String my_string) {
        StringBuilder st = new StringBuilder();
        char [] arr = my_string.toCharArray();
        for (int i=0; i<arr.length; i++) {
            if (65 <= arr[i] && arr[i] <= 90) st.append(String.valueOf(arr[i]).toLowerCase());
            else st.append(String.valueOf(arr[i]).toUpperCase());
        }
        return st.toString();
    }
}
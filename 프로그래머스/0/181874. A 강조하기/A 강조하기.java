class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (char a : myString.toCharArray()) {
            if (a == 'A' || a == 'a') 
                sb.append('A');
            else 
                sb.append(Character.toLowerCase(a));
        }
        return sb.toString();
    }
}
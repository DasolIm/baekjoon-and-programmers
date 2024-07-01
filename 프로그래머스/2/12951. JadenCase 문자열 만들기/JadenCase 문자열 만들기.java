class Solution {
    public static String solution(String s) {
        
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (String st : words) {
            if (!st.isEmpty()) {
                sb.append(Character.toUpperCase(st.charAt(0)));
                sb.append(st.substring(1).toLowerCase());
            }
            sb.append(" ");
        }

        if(s.substring(s.length() - 1, s.length()).equals(" "))
    		return sb.toString();
        
        return sb.toString().trim();
        
    }
}
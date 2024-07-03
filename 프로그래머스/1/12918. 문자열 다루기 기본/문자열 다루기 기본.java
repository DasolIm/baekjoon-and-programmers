class Solution {
    public static boolean solution(String s) {
        
        if (s.length()==4 || s.length()==6) {
            for (char a : s.toCharArray()) {
                if (!Character.isDigit(a)) return false;
            }
            return true;
        }
        return false;
        
    }
}
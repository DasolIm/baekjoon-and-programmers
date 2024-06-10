class Solution {
    public boolean solution(int x) {
        String xS = String.valueOf(x);
        int cnt = 0;
        for (int i=0; i<xS.length(); i++) 
            cnt += xS.charAt(i)-'0';
        
        return x%cnt == 0;
    }
}
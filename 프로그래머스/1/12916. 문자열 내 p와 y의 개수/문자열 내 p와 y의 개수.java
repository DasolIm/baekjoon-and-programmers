class Solution {
    boolean solution(String s) {
        String s2 = s.toLowerCase();
        int pCnt = 0;
        int yCnt = 0;
        String [] res = s2.split("");
        for (String a : res) {
            if (a.equals("p")) pCnt++;
            if (a.equals("y")) yCnt++;
        }
        
        if (pCnt==yCnt) 
            return true;
        else 
            return false;
    }
}
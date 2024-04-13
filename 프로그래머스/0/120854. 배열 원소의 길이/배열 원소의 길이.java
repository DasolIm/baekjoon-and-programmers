class Solution {
    public int[] solution(String[] strlist) {
        int [] res = new int[strlist.length];
        for (int i=0; i<strlist.length; i++) res[i] = strlist[i].length();
        return res;
    }
}
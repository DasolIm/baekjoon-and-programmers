class Solution {
    public static int solution(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        for (int a=i; a<=j; a++) {  sb.append(a);  }
        String [] res = sb.toString().split("");
        int cnt = 0;
        for (int a=0; a<res.length; a++) {
            if (res[a].equals(String.valueOf(k))) cnt++;
        }
        return cnt;
    }
}
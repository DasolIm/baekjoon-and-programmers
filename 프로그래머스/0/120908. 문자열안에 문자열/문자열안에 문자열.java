class Solution {
    public static int solution(String str1, String str2) {
        String [] tmp = str1.split("");
        StringBuilder sb = new StringBuilder();
        int ans = 2;
        for (int i=0; i<tmp.length - str2.length() + 1; i++) {
            for (int j=i; j<str2.length()+i; j++) {
                sb.append(tmp[j]);
            }
            if (sb.toString().equals(str2)) ans = 1;
            sb.delete(0, str2.length());
        }
        return ans;
    }
}
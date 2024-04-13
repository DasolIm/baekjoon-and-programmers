class Solution {
    public String solution(String my_string) {
        String [] strarr = my_string.split("");
        String [] vowels = {"a","e","i","o","u"};
        for (int i=0; i< strarr.length; i++) {
            for (int j=0; j<vowels.length; j++) {
                if (strarr[i].equals(vowels[j])) strarr[i] = ".";
            }
        }
        StringBuilder st = new StringBuilder();
        for (int i=0; i<strarr.length; i++) {
            if (!strarr[i].equals(".")) st.append(strarr[i]);
        }
        return st.toString();
    }
}
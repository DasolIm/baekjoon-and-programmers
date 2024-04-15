class Solution {
    public static int solution(String my_string) {
        int res = 0;
        String [] arrS = my_string.split(" ");
        res += Integer.parseInt(arrS[0]);
        for (int i=1; i<arrS.length; i+=2) {
            if (arrS[i].equals("+")) 
                res += Integer.parseInt(arrS[i + 1]);
            else 
                res -= Integer.parseInt(arrS[i + 1]);
        }
        return res;
    }
}
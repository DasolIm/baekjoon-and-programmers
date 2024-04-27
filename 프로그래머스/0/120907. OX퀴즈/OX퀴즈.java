class Solution {
    public String[] solution(String[] quiz) {
        String [] ans = new String[quiz.length];
        for (int i=0; i<quiz.length; i++) {
            String [] tmp = quiz[i].split(" ");
            if (tmp[1].equals("+")) {
                if (Integer.parseInt(tmp[0])+Integer.parseInt(tmp[2]) == Integer.parseInt(tmp[4]))
                    ans[i] = "O";
                else
                    ans[i] = "X";
            } else {
                if (Integer.parseInt(tmp[0])-Integer.parseInt(tmp[2]) == Integer.parseInt(tmp[4]))
                    ans[i] = "O";
                else
                    ans[i] = "X";
            }
        }
        return ans;
    }
}
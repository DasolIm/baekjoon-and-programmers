class Solution {
    public static int solution(String[] babbling) {
        for (int i=0; i<babbling.length; i++) {
            if (babbling[i].contains("aya")) babbling[i] = babbling[i].replace("aya", "K");
            if (babbling[i].contains("ye")) babbling[i] = babbling[i].replace("ye", "K");
            if (babbling[i].contains("woo")) babbling[i] = babbling[i].replace("woo", "K");
            if (babbling[i].contains("ma")) babbling[i] = babbling[i].replace("ma", "K");
        }
        for (int i=0; i<babbling.length; i++) {
            char [] temp = babbling[i].toCharArray();
            for (int j=0; j<temp.length; j++) {
                if (temp[j] != 'K') {
                    babbling[i] = "";
                    break;
                }
            }
        }
        int cnt = 0;
        for (String str : babbling) {
            if (!str.isEmpty()) {
                cnt++;
            }
        }
        return cnt;
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static int[] solution(int n) {
        List<Integer> oddsList = new ArrayList<>();
        for (int i=1; i<=n; i+=2) {
            oddsList.add(i);
        }
        int [] oddsArr = new int[oddsList.size()];
        for (int i=0; i<oddsList.size(); i++) {
            oddsArr[i] = oddsList.get(i);
        }
        return oddsArr;
    }
}
import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> intlist = new ArrayList<>();
        char [] chararr = my_string.toCharArray();
        for (int i=0; i<chararr.length; i++) {
            if (Character.isDigit(chararr[i])) intlist.add(Character.getNumericValue(chararr[i]));
        }
        Collections.sort(intlist);
        int [] intarr = new int[intlist.size()];
        for (int i=0; i<intarr.length; i++) intarr[i] = intlist.get(i);
        return intarr;
    }
}
class Solution {
    public static int solution(int n, String control) {
        for (char cont : control.toCharArray()) {
            if (cont == 'w') n += 1;
            else if (cont == 's') n -= 1;
            else if (cont == 'd') n += 10;
            else n -= 10;
        }
        return n;
    }
}
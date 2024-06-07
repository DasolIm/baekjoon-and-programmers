import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
    
        Stack<Integer>[] st = new Stack[board.length];
        for (int i=0; i<board.length; i++) {
            st[i] = new Stack<>();
        }
        for (int i=board.length-1; i>=0; i--) {
            for (int j=0; j<board[0].length; j++) {
                if (board[i][j] != 0) {
                    st[j].push(board[i][j]);
                }
            }
        }
        
        Stack<Integer> box = new Stack<>();
        int cnt = 0;
        
        for (int i=0; i<moves.length; i++) {
            if (!st[moves[i]-1].empty()) {
                int tmp = st[moves[i]-1].pop();
                if (!box.empty() && box.peek().equals(tmp)) {
                    box.pop();
                    cnt+=2;
                } else {
                    box.push(tmp);
                }
            }
        }
        
        return cnt;
    }
}
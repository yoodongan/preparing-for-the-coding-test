package PRG.exercise;

import java.util.Stack;

public class 크레인_인형뽑기_게임 {
    class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            Stack<Integer> st = new Stack<>();
            for(int i=0; i<moves.length; i++) {
                int depth = 0;
                while(depth < board.length && board[depth][moves[i]-1] == 0) {
                    depth++;
                }
                if(depth < board.length) {
                    if(st.size() != 0 && st.peek() == board[depth][moves[i]-1]) {
                        st.pop();
                        answer += 2;
                    } else {
                        st.push(board[depth][moves[i]-1]);
                    }
                    board[depth][moves[i]-1] = 0;
                }
            }
            return answer;
        }
    }
}

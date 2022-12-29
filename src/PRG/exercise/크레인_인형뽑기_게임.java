package PRG.exercise;

import java.util.Stack;

/**
 * 2019 카카오 개발자 겨울 인턴십
 */
public class 크레인_인형뽑기_게임 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();

        for (int m : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][m - 1] != 0) {
                    int pick = board[j][m - 1];
                    if(st.empty()) {
                        st.push(pick);
                        board[j][m - 1] = 0;
                        break;
                    }
                    else if(st.peek() == pick) {
                        st.pop();
                        answer+=2;
                    }
                    else {
                        st.push(pick);
                    }
                    board[j][m - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.print(solution(board, moves));
    }

}

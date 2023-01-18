package PRG.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 행렬_테두리_회전하기 {
    static ArrayList<Integer> answer = new ArrayList<>();
    public static ArrayList<Integer> solution(int rows, int columns, int[][] queries) {
        int[][] arr = new int[rows+1][columns+1];
        for (int i = 1; i < rows+1; i++) {
            for (int j = 1; j < columns + 1; j++) {
                arr[i][j] = ((i - 1) * columns + j);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int x1 = queries[i][0];  // [2,2,5,4]
            int y1 = queries[i][1];
            int x2 = queries[i][2];
            int y2 = queries[i][3];
            int startNum = arr[x1][y1];
            int min = Integer.MAX_VALUE;

            for (int j = y1; j < y2; j++) {  // 첫 번째 우측 방향 가로
                arr[x1][j+1] = arr[x1][j];
                min = Math.min(arr[x1][j+1], min);
            }
            for (int j = x1; j < x2; j++) {  // 우측 방향 세로
                arr[j+1][y2] = arr[j][y2];
                min = Math.min(arr[j+1][y2], min);

            }
            for (int j = y2; j > y1; j--) {
                arr[x2][j-1] = arr[x2][j];
                min = Math.min(arr[x2][j-1], min);
            }
            for (int j = x2; j > x1; j--) {
                arr[j-1][y1] = arr[j][y1];
                min = Math.min(arr[j-1][y1], min);
            }

            answer.add(min);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());
        int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        System.out.println(solution(row, col, queries));
    }
}

package BOJ.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스티커 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[2][n+1];  //  열의 값을 1부터 해줘야, 대각선으로 2칸까지의 위치까지 고려할 수 있다.
            int[][] dy = new int[2][n+1];
            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            dy[0][1] = arr[0][1];
            dy[1][1] = arr[1][1];

            for (int i = 2; i <= n; i++) {
                dy[0][i] = Math.max(dy[1][i-1], dy[1][i-2]) + arr[0][i];
                dy[1][i] = Math.max(dy[0][i-1], dy[0][i-2]) + arr[1][i];
                
            }
            System.out.println(Math.max(dy[0][n],dy[1][n]));

        }
    }
}

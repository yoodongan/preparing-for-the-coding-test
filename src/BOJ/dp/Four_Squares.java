package BOJ.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Four_Squares {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dy = new int[50001];
        dy[1] = 1;
        for (int i = 2; i <= n; i++) {
            dy[i] = Integer.MAX_VALUE;    // 일단 최대값으로 갱신한다.
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j*j<=i; j++) {
                dy[i] = Math.min(dy[i], dy[i-j*j] + 1);   // dy[i-j*j]를 통해, 예를 들어 dy[85] = dy[4] + 1로 표현할 수 있다. dy[81]이 9^2 이라는 제곱수이므로, 1이 되는 것.
            }
        }
        System.out.println(dy[n]);

    }
}

package BOJ.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1로_만들기 {
    static int[] dy;
    public static int solution(int n) {
        dy = new int[n+1];
        dy[1] = 0;
        for (int i = 2; i <= n; i++) {
            dy[i] = dy[i-1] + 1;
            if(i%2 ==0) dy[i] = Math.min(dy[i], dy[i/2] + 1);
            if(i%3 ==0) dy[i] = Math.min(dy[i], dy[i/3] + 1);
        }
        return dy[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));

    }
}

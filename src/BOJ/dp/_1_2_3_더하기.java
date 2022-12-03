package BOJ.dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 점화식 세우기
* 마지막에 1,2,3 을 더해주는 경우 각각 d[n-1] + 1, d[n-2] + 2, d[n-3] + 3
* 따라서 점화식은, d[n] = d[n-1] + d[n-2] + d[n-3]  (총 횟수)     => (2 + 2) + 1, (2 + 1 + 1) + 1
*
* */



public class _1_2_3_더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] d = new int[11];
        d[0] = 1;
        d[1] = 1;
        d[2] = 2;
        for (int i = 3; i <= 10; i++) {
            d[i] = d[i-1] + d[i-2] + d[i-3];
        }
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(d[n]);
        }

    }
}

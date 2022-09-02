package BOJ.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1로_만들기 {
    public static int[] d;
    public static int makeToOne(int n) {
        if (n == 1) {
            return 0;
        }
        if (d[n] > 0) {
            return d[n];
        }
        d[n] = makeToOne(n-1) + 1;

        if (n % 3 == 0) {
            int temp = makeToOne(n/3) + 1;
            if(d[n] > temp) {
                d[n] = temp;
            }
        }
        if (n % 2 == 0) {
            int temp = makeToOne(n/2) + 1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        return d[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        d = new int[n+1];
        System.out.println(makeToOne(n));

    }
}

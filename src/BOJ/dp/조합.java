package BOJ.dp;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class 조합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BigInteger child = BigInteger.ONE;
        BigInteger parent = BigInteger.ONE;

        for (int i = 0; i < m; i++) {

            // 1 * N * N-1 * N-2 * ..... * N-M + 1
            child = child.multiply(new BigInteger(String.valueOf(n - i))); // n * n-1 * n-2 * n-3 * ....
            parent = parent.multiply(new BigInteger(String.valueOf(i + 1)));  // 1 * 2 * 3 * 4 * ...
        }
        System.out.println(child.divide(parent));  // child는 분자, parent는 분모
    }

}

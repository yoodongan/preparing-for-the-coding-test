package BOJ.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_M_3 {
    static int[] arr;
    static int m;
    static int n;
    static StringBuilder sb;
    public static void dfs(int L) {
        if(L == m) {
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int i = 0; i < n; i++) {
                arr[L] = i+1;
                dfs(L+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        sb = new StringBuilder();

        dfs(0);
        System.out.println(sb.toString());

    }
}

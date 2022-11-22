package recursive_tree_graph_dfs_bfs.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_4 {
    public static int[] fibo;

    public static int dfs(int n) {
        if(n==1) return fibo[n]=1;
        else if(n==2) return fibo[n]=1;
        else {
            return fibo[n] = dfs(n-1) + dfs(n-2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo = new int[n+1];
        dfs(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}

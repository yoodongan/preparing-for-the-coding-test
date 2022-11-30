package recursive_tree_graph_dfs_bfs;

import java.io.IOException;
import java.util.Scanner;

public class 경로탐색_dfs_12 {
    public static int n, m;
    public static int answer = 0;
    public static int[][] graph;
    public static int[] check;

    public static void dfs(int v) {
        if(v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    dfs(i);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        check = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        check[1] = 1;
        dfs(1);
        System.out.println(answer);
    }
}

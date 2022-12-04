package recursive_tree_graph_dfs_bfs;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class 경로탐색_인접리스트_13 {
    public static int[] check;
    public static int n, m;
    public static ArrayList<ArrayList<Integer>> graph;
    public static int ans;
    public static void dfs(int v) {
        if(n == v) ans++;
        else {
            for (int nv : graph.get(v)) {
                if (check[nv] == 0) {
                    check[nv] = 1;
                    dfs(nv);
                    check[nv] = 0;
                }
            }
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        check = new int[n+1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        check[1] = 1;
        dfs(1);
        System.out.println(ans);

    }
}

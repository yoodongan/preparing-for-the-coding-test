package recursive_tree_graph_dfs_bfs;

import javax.swing.*;
import java.util.*;

public class 그래프_최단거리_bfs {
    public static int n;
    public static int m;
    public static ArrayList<ArrayList<Integer>> graph;
    public static int[] check, dis;

    public static void dfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        check[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int currentV = queue.poll();
            for (int nv : graph.get(currentV)) {
                if (check[nv] == 0) {
                    check[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[currentV] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        check = new int[n+1];
        dis = new int[n+1];
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        dfs(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}

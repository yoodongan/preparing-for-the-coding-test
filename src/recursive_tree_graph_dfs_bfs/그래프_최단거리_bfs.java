package recursive_tree_graph_dfs_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프_최단거리_bfs {
    static int n;
    static int m;
    static int[] check;
    static int[] dis;
    static ArrayList<ArrayList<Integer>> graph;

    public static void bfs(int v) {
        check[v] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        while(!queue.isEmpty()) {
            Integer current = queue.poll();
            for (int nv : graph.get(current)) {
                if(check[nv] == 0) {
                    check[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[current] + 1;
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
        for (int i = 0; i <= n; i++) {  // 1번 노드부터 표시하므로, n도 포함해야 한다.
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        bfs(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }

    }
}

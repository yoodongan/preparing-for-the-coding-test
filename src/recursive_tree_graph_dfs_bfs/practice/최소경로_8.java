package recursive_tree_graph_dfs_bfs.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 최소경로_8 {
    public static int[] check;
    public static int ans;
    public static int[] distance = {1, -1, 5};
    public static Queue<Integer> queue = new LinkedList<>();
    public static int bfs(int s, int e) {
        check = new int[10001];
        check[s] = 1;
        int level = 0;
        queue.offer(s);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int next = current + distance[j];
                    if (next == e) {
                        return level+1;
                    }
                    if (next >= 1 && next <= 10000 && check[next] == 0) {
                        check[next] = 1;
                        queue.offer(next);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        System.out.println(bfs(s, e));

    }
}

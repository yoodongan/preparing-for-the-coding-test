package recursive_tree_graph_dfs_bfs.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부분집합_6 {
    public static int check[];
    public static int endPoint;

    public static void dfs(int n) {
        if (n == endPoint + 1) {
            String tmp = "";
            for (int i = 1; i <= endPoint; i++) {
                if (check[i] == 1) {
                    tmp += i + " ";
                }
            }
            if (tmp.length() > 0) System.out.println(tmp);

        } else {
            check[n] = 1;
            dfs(n+1);
            check[n] = 0;
            dfs(n+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        endPoint = Integer.parseInt(br.readLine());
        check = new int[endPoint+1];
        dfs(1);
    }



}

package recursive_tree_graph_dfs_bfs.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼_3 {
    public static int recursive(int n) {
        if(n == 1) return 1;
        else {
            return n * recursive(n-1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(recursive(n));
    }
}

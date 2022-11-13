package recursive_tree_graph_dfs_bfs;

import java.util.Scanner;

public class 팩토리얼_3 {
    public static int recursive(int n) {
        if(n == 1) return 1;
        else {
            return n*recursive(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursive(n));
    }
}

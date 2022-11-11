package recursive_tree_graph_dfs_bfs;

import java.util.Scanner;

public class 재귀함수_1 {
    public static void recursive(int n) {
        if(n==0) return;
        else {
            recursive(n-1);
            System.out.print(n + " ");
        }
    }
    public static void solution(int n) {
        recursive(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }


}

package recursive_tree_graph_dfs_bfs;

import java.util.Scanner;

public class 이진수_출력_2 {
    public static void recursive(int n) {
        if(n==0) {
            return;
        }
        else {
            recursive(n/2);
            System.out.print(n%2 + " ");
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

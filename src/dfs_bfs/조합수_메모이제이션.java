package dfs_bfs;

import java.util.Scanner;

public class 조합수_메모이제이션 {
    public static int n;
    public static int r;
    public static int[][] arr = new int[34][34];

    public static int dfs(int n, int r) {
        if(r==0 || n==r) return 1;
        if(arr[n][r] > 0) return arr[n][r];
        else return arr[n][r] = dfs(n-1, r-1) + + dfs(n-1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        System.out.println(dfs(n, r));

    }
}

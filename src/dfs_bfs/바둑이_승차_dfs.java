package dfs_bfs;

import java.util.Scanner;

public class 바둑이_승차_dfs {
    public static int c;
    public static int n;
    public static int max;

    public static void dfs(int L, int sum, int[] arr) {
        if(L==n) {
            if(sum <= c) max = Math.max(max, sum);
        } else {
            dfs(L + 1, sum + arr[L], arr);
            dfs(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0, 0, arr);
        System.out.println(max);
    }
}

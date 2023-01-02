package dfs_bfs;

import java.util.Scanner;

public class 중복순열_구하기 {
    public static int n;  // 1~n 까지의 숫자
    public static int m;  // 몇 번 올 수 있는지.
    public static int[] arr;

    public static void dfs(int L) {
        if(L == m) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();

        } else {
            for (int i = 1; i <= n; i++) {
                arr[L] = i;
                dfs(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];

        dfs(0);

    }
}

package dfs_bfs;

import java.util.Scanner;

public class 순열_구하기 {
    public static int n;
    public static int m;
    public static int[] arr;
    public static int[] check;

    public static void dfs(int L, int[] number) {
        if (L == m) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i] != 1) {
                    arr[L] = number[i];
                    check[i] = 1;
                    dfs(L+1, number);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        check = new int[n];
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        dfs(0, number);
    }
}

package BOJ;

import java.util.Scanner;

public class N_M_1 {
    public static int n;
    public static int m;
    public static int[] arr;
    public static boolean[] check;
    public static void dfs(int L) {
        if(L == m) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if(!check[L]) {
                    check[L] = true;
                    arr[L] = i+1;
                    dfs(L+1);
                    check[L] = false;
                }
            }
        }
    }
    public static void solution() {
        arr = new int[m];
        check = new boolean[m];
        dfs(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        solution();
    }
}

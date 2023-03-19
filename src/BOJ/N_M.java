package BOJ;

import java.util.Scanner;

public class N_M {
    static int[] arr;
    public static void dfs(int L, int n, int m) {
        if(L == m) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                arr[L] = i+1;
                dfs(L+1, n, m);
            }
        }
    }
    public static void solution(int n, int m) {
        arr = new int[m];
        dfs(0, n, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        solution(n, m);
    }
}

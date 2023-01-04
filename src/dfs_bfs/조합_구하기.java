package dfs_bfs;

import java.util.Scanner;

public class 조합_구하기 {
    public static int n;
    public static int m;
    public static int[] comb; // combination 의 약자. (조합)
    public static void dfs(int L, int s) {
        if(L==m) {
            for (int i : comb) System.out.print(i + " ");
            System.out.println();
        }
        else {
            for (int i = s; i <= n; i++) {
                comb[L] = i;
                dfs(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        comb = new int[m];
        dfs(0, 1);
    }

}

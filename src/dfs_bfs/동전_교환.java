package dfs_bfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전_교환 {
    static Integer[] arr;
    static int n;
    static int m;
    static int min = Integer.MAX_VALUE;

    public static void dfs(int L, int sum) {
        if(sum > m) return;
        if(sum == m) min = Math.min(L, min);
        else {
            for (int i = 0; i < n; i++) {
                dfs(L+1, sum + arr[i]);
            }
        }
    }

    public static int solution(int n1, Integer[] coin, int m1) {
        arr = coin;
        n = n1;
        m = m1;
        dfs(0, 0);
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] coin = new Integer[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        Arrays.sort(coin, Collections.reverseOrder());
        int m = sc.nextInt();
        System.out.println(solution(n, coin, m));

    }
}

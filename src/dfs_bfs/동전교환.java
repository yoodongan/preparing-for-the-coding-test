package dfs_bfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환 {
    public static int min = Integer.MAX_VALUE;  // 최소 개수. 정답
    public static int m;   // 금액
    public static int n;   // 동전 종류

    public static void dfs(int L, int sum, Integer[] arr) {
        if(sum > m) return;
        if(L>=min) return;
        if(sum == m) min = Math.min(min, L);
        else {
            for (int i = 0; i < n; i++) {
                dfs(L+1, sum+arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();
        dfs(0, 0, arr);
        System.out.println(min);
    }
}

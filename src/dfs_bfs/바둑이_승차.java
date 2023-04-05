package dfs_bfs;

import java.util.Scanner;

public class 바둑이_승차 {
    static int[] arr;
    static int limit;
    static int answer = Integer.MIN_VALUE;

    public static void dfs(int L, int sum) {
        if(sum > limit) return;
        if(L == arr.length) answer = Math.max(answer, sum);
        else {
            dfs(L+1, sum+arr[L]);
            dfs(L+1, sum);
        }
    }

    public static int solution(int c, int[] weight) {
        limit = c;
        arr = new int[weight.length];
        arr = weight.clone();
        dfs(0, 0);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }
        System.out.println(solution(c, weight));

    }
}

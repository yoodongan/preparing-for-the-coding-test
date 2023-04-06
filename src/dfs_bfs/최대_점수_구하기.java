package dfs_bfs;

import java.util.Scanner;

public class 최대_점수_구하기 {
    static int max = Integer.MIN_VALUE;
    static int n, m;
    static int[] score;
    static int[] time;

    public static void dfs(int L, int timeSum, int scoreSum) {
        if(timeSum > m) return;
        if(L == score.length) {
            max = Math.max(scoreSum, max);
        } else {
            dfs(L+1, timeSum + time[L], scoreSum + score[L]);
            dfs(L+1, timeSum, scoreSum);
        }
    }
    public static int solution(int n, int m, int[] s, int[] t) {
        score = s;
        time = t;
        dfs(0, 0, 0);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] score = new int[n];
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, score, time));
    }
}

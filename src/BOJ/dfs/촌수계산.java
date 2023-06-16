package BOJ.dfs;

import java.util.ArrayList;
import java.util.Scanner;

public class 촌수계산 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int y; // 도착 지점
    static int answer   = -1;

    public static void dfs(int start, int L) {
        visited[start] = true;
        for(int next : graph.get(start)) {
            if (!visited[next]) {
                if (next == y) {
                    answer = L+1;
                    return;
                }
                dfs(next, L+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 전체 사람의 수
        int x = sc.nextInt();
        y = sc.nextInt();
        int m = sc.nextInt(); // 관계 개수

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        visited = new boolean[n+1];  // 1~n 까지의 사람에 대한 방문 배열 체크.

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();  // from
            int b = sc.nextInt();  // to
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        dfs(x, 0);
        System.out.println(answer);

    }
}

package dfs_bfs;

import java.util.Scanner;

public class 미로_탐색 {
    public static int answer = 0;
    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0,-1,0,1};

    public static void dfs(int x, int y, int[][] graph) {
        if(x == 7 && y == 7) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >=1 && nx <=7 && ny >=1 && ny<=7 && graph[nx][ny] == 0) {
                    graph[nx][ny] = 1;
                    dfs(nx, ny, graph);
                    graph[nx][ny] = 0;
                }
            }
        }

    }

    public static int solution(int[][] graph) {
        dfs(1, 1, graph);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] graph = new int[8][8]; // 1~7 인덱스 사용.
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        graph[1][1] = 1;
        System.out.println(solution(graph));
    }
}

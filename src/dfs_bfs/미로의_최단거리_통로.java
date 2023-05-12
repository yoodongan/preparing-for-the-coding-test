package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로의_최단거리_통로 {
    static class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static int answer = Integer.MAX_VALUE;
    public static int[][] graph;
    public static int[][] dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        graph[x][y] = 1;
        while(!queue.isEmpty()) {
            Point current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && graph[nx][ny]==0) {
                    graph[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[current.x][current.y] + 1;
                }
            }
        }
    }
    public static int solution(int[][] g) {
        graph = g;
        bfs(1, 1);
        if(dis[7][7] == 0) return -1;
        else {
            return dis[7][7];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        graph = new int[8][8]; // 1~7 인덱스 사용.
        dis = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(graph));
    }
}

package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class 미로의_최단거리_통로_bfs {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static int[][] dis = new int[8][8];
    public static int[][] board = new int[8][8];

    public static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList();
        board[1][1] = 1;
        queue.offer(new Point(1, 1));
        while (!queue.isEmpty()) {
            Point current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    queue.offer(new Point(nx, ny));
                    board[nx][ny] = 1;
                    dis[nx][ny] = dis[current.x][current.y] + 1;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        bfs(1,1);
        if (dis[7][7] == 0) System.out.println("-1");
        else System.out.println(dis[7][7]);
    }
}

package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토_bfs {
    static class Tomato {
        int x;
        int y;

        public Tomato(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int[][] tomato;
    static int[][] dis;
    static int n;  // 상자 세로 칸 수
    static int m;  // 상자 가로 칸 수
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int answer = Integer.MIN_VALUE;

    public static void bfs() {
        Queue<Tomato> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(tomato[i][j] == 1) queue.offer(new Tomato(i, j));
            }
        }
        
        while(!queue.isEmpty()) {
            Tomato current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && tomato[nx][ny] == 0) {
                    tomato[nx][ny] = 1;
                    queue.offer(new Tomato(nx, ny));
                    dis[nx][ny] = dis[current.x][current.y] + 1;
                }
            }
        }
    }

    public static int solution() {
        bfs();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tomato[i][j] == 0) flag = false;
            }
        }
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            return answer;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        tomato = new int[n][m];
        dis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tomato[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution());
    }
}

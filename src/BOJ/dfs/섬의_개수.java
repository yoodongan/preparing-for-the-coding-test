package BOJ.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 섬의_개수 {
    static int[] dx = {-1,0,1,-1,1,-1,0,1};
    static int[] dy = {-1,-1,-1,0,0,1,1,1};
    static int[][] land;
    static boolean[][] visited;
    static int w;
    static int h;

    public static void dfs(int y, int x) {
        // 섬에 근접한 섬들들 모두 방문처리하고 종료한다.

        visited[y][x] = true; // 해당 섬 방문처리

        // 근접 좌표를 돌아준다.
        for (int i = 0; i < dx.length; i++) {
            int nextX = dx[i] + x;
            int nextY = dy[i] + y;

            // 좌표의 범위 체크
            if (nextY < 0 || nextY >= h || nextX < 0 || nextX >= w) {
                continue;
            }

            // 인접한 좌표가 섬이고 방문한 적이 없는 경우
            if(land[nextY][nextX] == 1 && !visited[nextY][nextX]){
                dfs(nextY, nextX);
            }
        }
    }

    public static int findLand() {
        int cnt = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j); // x축으로 이동하는 것은 2차원 배열의 w 부분이다.
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w == 0 && h == 0) break;

            land = new int[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    land[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            System.out.println(findLand());
        }

    }
}

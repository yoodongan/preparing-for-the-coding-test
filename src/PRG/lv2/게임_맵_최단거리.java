package PRG.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임_맵_최단거리 {
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    int[][] maps;
    int[][] visited;
    int answer = Integer.MAX_VALUE;

    public void bfs() {
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cX = cur[0];
            int cY = cur[1];

            for (int i = 0; i < 4; i++) {
                int nX = cX + dx[i];
                int nY = cY + dy[i];

                // 2차원 배열의 범위를 벗어낫을 경우, 다음 반복문으로 넘어간다.
                if (nX < 0 || nX > maps.length - 1 || nY < 0 || nY > maps[0].length - 1) continue;

                if (visited[nX][nY] == 0 && maps[nX][nY] == 1) {
                    visited[nX][nY] = visited[cX][cY] + 1;
                    queue.add(new int[]{nX, nY});
                }

            }
        }
    }


    public int solution(int[][] maps) {
        this.maps = maps;
        this.visited = new int[maps.length][maps[0].length];
        int answer = 0;

        bfs();
        answer = visited[maps.length-1][maps[0].length-1];

        if (answer == 0) {
            answer = -1;
        }

        return answer;
    }
}

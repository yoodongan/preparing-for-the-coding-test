package PRG.lv2;

public class 방문_길이 {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public int solution(String dirs) {
        int answer = 0;
        int[][] map = new int[11][11];
        boolean[][][] visit = new boolean[11][11][4];
        int x = 5, y = 5;
        for (int i = 0; i < dirs.length(); i++) {
            char c = dirs.charAt(i);
            int direction = 0;
            if (c == 'U')
                direction = 0;
            if (c == 'L')
                direction = 1;
            if (c == 'D')
                direction = 2;
            if (c == 'R')
                direction = 3;
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            if (nx < 0 || ny < 0 || nx >= 11 || ny >= 11) continue;
            if(!visit[nx][ny][direction]) {
                visit[nx][ny][direction] = true;
                if(direction % 2 ==0) {
                    direction = 2 - direction;
                } else {
                    direction = 4 - direction;
                }
                visit[x][y][direction] = true;
                answer++;
            }
            x = nx;
            y = ny;

        }
        return answer;
    }
}

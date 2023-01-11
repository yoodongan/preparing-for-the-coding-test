package PRG.exhaustive_search;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int x = 0, y = 0;
        for (int i = 0; i < sizes.length; i++) {
            int tmp = 0;
            if(sizes[i][0] < sizes[i][1]) {
                tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
            x = Math.max(sizes[i][0], x);
            y = Math.max(sizes[i][1], y);
        }
        answer = x * y;
        return answer;
    }
}

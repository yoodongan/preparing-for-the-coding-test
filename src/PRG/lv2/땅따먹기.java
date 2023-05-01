package PRG.lv2;

public class 땅따먹기 {
    int solution(int[][] land) {
        // dp 배열 구하기.
        for(int i=1; i<land.length; i++) {
            land[i][0] += getMax(land[i-1][1], land[i-1][2], land[i-1][3]);
            land[i][1] += getMax(land[i-1][0], land[i-1][2], land[i-1][3]);
            land[i][2] += getMax(land[i-1][0], land[i-1][1], land[i-1][3]);
            land[i][3] += getMax(land[i-1][0], land[i-1][1], land[i-1][2]);
        }
        int answer = 0;

        /* 가장 마지막 행의 최대값을 구하면 끝이다. */
        for (int i = 0; i < land[0].length; i++) {
            if(answer < land[land.length-1][i]) {
                answer = land[land.length-1][i];
            }
        }

        return answer;
    }

    public int getMax(int a, int b, int c) {
        int max1 = Math.max(a, b);
        return Math.max(max1, c);
    }
}

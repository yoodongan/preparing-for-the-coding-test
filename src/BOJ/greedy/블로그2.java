package BOJ.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 블로그2 {
    static int blueCnt = 0;
    static int redCnt = 0;
    static int n;
    static int solution(String str) {
        if (str.charAt(0) == 'B') blueCnt++;
        else redCnt++;

        char prevColor = str.charAt(0);    // 이전 색깔을 저장해놓는다.
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == prevColor) continue;  // 이전 색깔과 현재 색깔이 같다면, 연속된 색(같은 색)이므로 그냥 넘어간다.
            else {
                if (str.charAt(i) == 'B') blueCnt++;
                else redCnt++;
            }
            prevColor = str.charAt(i);
        }
        if (blueCnt > redCnt) {  // 파란색이 더 많다면, 일단 파란색으로 다 칠하고(1) + 나머지 빨간색을 칠한다.
            return redCnt+1;
        } else {
            return blueCnt+1;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String color = br.readLine();
        System.out.println(solution(color));
    }
}

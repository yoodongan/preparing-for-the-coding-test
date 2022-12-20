package PRG.exercise;

import java.util.Arrays;

// 2021 Dev-Matching
public class 로또의_최고_순위와_최저_순위 {
    public static int score = 5;
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt =0;  // 겹치는 로또 숫자
        int max = 0;  // 지워진 수(0) 가 당첨될 경우
        int min = 0;  // 최소 순위를 위한 개수.
        for(int x : lottos) {
            if(x == 0) max++;
            for(int y : win_nums) {
                if(x == y) cnt++;
            }
        }
        max = cnt + max;
        min = cnt;
        max = score(max);
        min = score(min);
        answer[0] = max;
        answer[1] = min;
        return answer;
    }
    public static int score(int number) {
        if(number <2) {
            return 6;
        } else {
            return score - (number-2);
        }
    }
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(solution(lottos, win_nums)));
    }

}

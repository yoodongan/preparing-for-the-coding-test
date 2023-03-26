package PRG.exercise;

import java.util.Arrays;
import java.util.Collections;

public class 과일_장수 {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] s = new Integer[score.length];
        for(int i=0; i<s.length; i++) {
            s[i] = score[i];
        }
        Arrays.sort(s, Collections.reverseOrder());

        int idx = 0;
        while(idx < s.length && idx+m <= s.length) {
            answer+=s[idx+m-1]*m;
            idx+=m;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        int k = 3;
        int m = 4;
        System.out.println(solution(k, m, score));
    }
}

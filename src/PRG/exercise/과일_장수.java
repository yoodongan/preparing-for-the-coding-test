package PRG.exercise;

import java.util.Arrays;
import java.util.Collections;

public class 과일_장수 {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        int index = 0;
        while(true) {
            if(index >= arr.length || index + m > arr.length) {
                break;
            }
            answer += arr[index + m - 1] * m;  // 내림차순이므로 제일 작은 요소가 m번 째 끝에 위치.
            index += m;
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

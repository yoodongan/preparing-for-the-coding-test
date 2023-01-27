package PRG.exercise;

import java.util.Arrays;
import java.util.Collections;

public class 정수_내림차순으로_배치하기 {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        Integer[] arr = new Integer[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - 48;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}

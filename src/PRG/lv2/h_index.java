package PRG.lv2;

import java.util.Arrays;
import java.util.Collections;

public class h_index {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if(citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}

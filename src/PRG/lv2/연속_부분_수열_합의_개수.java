package PRG.lv2;

import java.util.HashSet;
import java.util.Set;

public class 연속_부분_수열_합의_개수 {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int gap = 1;
        while(gap <= elements.length) {
            for(int i=0; i<elements.length; i++) {
                int sum = 0;
                for(int j=i; j<i+gap; j++) {
                    sum += elements[j % elements.length];
                }
                set.add(sum);
            }
            gap++;
        }
        answer = set.size();

        return answer;
    }
}

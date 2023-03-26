package PRG.exercise;

import java.util.HashSet;
import java.util.Set;

// 2021 Dev-Matching
public class 로또의_최고_순위와_최저_순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int minNum = 0;
        int zeroCnt = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<lottos.length; i++) {
            set.add(lottos[i]);
            if(lottos[i] == 0) zeroCnt++;
        }
        for(int i=0; i<win_nums.length; i++) {
            if(set.contains(win_nums[i])) {
                minNum++;
            }
        }
        if(minNum < 2) answer[1] = 6;
        else {
            answer[1] = 7-minNum;
        }
        int maxNum = minNum + zeroCnt;
        if(maxNum < 2) answer[0] = 6;
        else {
            answer[0] = 7-maxNum;
        }
        return answer;
    }
}

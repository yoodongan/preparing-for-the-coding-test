package PRG.exhaustive_search;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {
    public static int[] one = {1,2,3,4,5};
    public static int[] two = {2,1,2,3,2,4,2,5};
    public static int[] three = {3,3,1,1,2,2,4,4,5,5};

    public static int[] solution(int[] answers) {
        int[] answer = {0,0,0};
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == one[i%5]) answer[0]++;
            if(answers[i] == two[i%8]) answer[1]++;
            if(answers[i] == three[i%10]) answer[2]++;
        }
        int max = Math.max(answer[0], Math.max(answer[1], answers[2]));
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < answer.length; i++) {
            if(max == answer[i]) ans.add(i+1);
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }

        return arr;
    }

}

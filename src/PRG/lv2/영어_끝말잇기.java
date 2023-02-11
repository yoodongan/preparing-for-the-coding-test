package PRG.lv2;

import java.util.ArrayList;

public class 영어_끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (arr.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            arr.add(words[i]);
            if(i >= 1 && words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }
        return answer;
    }

}

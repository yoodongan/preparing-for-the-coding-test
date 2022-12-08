package PRG.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 명예의_전당 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> arr = new ArrayList();
        for (int i=0; i<score.length; i++) {
            if (i<k-1){
                arr.add(score[i]);
                arr.sort(Collections.reverseOrder());
                answer[i]=arr.get(arr.size()-1);
            } else if (i>=k-1){
                arr.add(score[i]);
                arr.sort(Collections.reverseOrder());
                answer[i]=arr.get(k-1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {10, 100, 20, 150, 1, 100, 200};
    }
}

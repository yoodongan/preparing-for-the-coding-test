package PRG.stack_queue;

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {
    public static List<Integer> solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(solution(arr));
    }
}

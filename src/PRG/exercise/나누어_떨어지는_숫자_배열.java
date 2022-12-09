package PRG.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {
    public static int[] solution(int[] arr, int divisor) {
        int[] defaultAnswer = {-1};
        List<Integer> answer = new ArrayList<>();
        for(int x : arr) {
            if(x % divisor == 0) answer.add(x);
        }
        if (answer.size() != 0) {
            defaultAnswer = new int[answer.size()];
            for (int i = 0; i < answer.size(); i++) {
                defaultAnswer[i] = answer.get(i);
            }
            Arrays.sort(defaultAnswer);
        }
        return defaultAnswer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(solution(arr, divisor)));
    }
}

package PRG.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 가장_가까운_같은_글자 {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        List<Character> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if(!arr.contains(s.charAt(i))) {
                arr.add(s.charAt(i));
                answer[i] = -1;
            }
            else {
                int index = arr.lastIndexOf(s.charAt(i));
                int value = i - index;
                answer[i] = value;
                arr.add(s.charAt(i));
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String str = "banana";
        System.out.println(Arrays.toString(solution(str)));
    }
}

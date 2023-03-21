package PRG.exercise;

import java.util.*;

public class 가장_가까운_같은_글자 {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                answer[i] = -1;
                map.put(s.charAt(i), i);
            } else {
                int tmp = map.get(s.charAt(i));
                answer[i] = i-tmp;
                map.put(s.charAt(i), i);
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        String str = "banana";
        System.out.println(Arrays.toString(solution(str)));
    }
}

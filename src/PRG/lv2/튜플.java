package PRG.lv2;

import java.util.ArrayList;
import java.util.Arrays;

public class 튜플 {
    public static int[] solution(String s) {
        int[] answer;
        ArrayList<Integer> arr = new ArrayList<>();
        s = s.substring(2, s.length()-2);
        s = s.replace("},{", "-");
        String[] split = s.split("-");

        Arrays.sort(split, (s1, s2) -> s1.length() - s2.length());

        for (String s1 : split) {
            String[] tmp = s1.split(",");
            for (String s2 : tmp) {
                if(!arr.contains(Integer.parseInt(s2))) {
                    arr.add(Integer.parseInt(s2));
                }
            }
        }
        answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(Arrays.toString(solution(s)));
    }
}

package PRG.lv2;

import java.util.*;

public class 튜플 {
    public static int[] solution(String s) {
        int[] answer;
        Set<Integer> set = new LinkedHashSet<>();
        s = s.substring(2, s.length()-2);
        s = s.replace("},{", "-");
        String[] sp = s.split("-");

        Arrays.sort(sp, (s1,s2) -> s1.length() - s2.length());

        for(String str : sp) {
            String[] tmp = str.split(",");
            for(String t : tmp) {
                set.add(Integer.parseInt(t));
            }
        }
        answer = new int[set.size()];
        int idx = 0;
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
            answer[idx++] = iter.next().intValue();
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(Arrays.toString(solution(s)));
    }
}

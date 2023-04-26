package PRG.lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* [3차] 압축 문제 */
public class 압축 {
    public int[] solution(String msg) {
        int[] answer;
        ArrayList<Integer> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        char key = 'A';
        for (int i = 1; i <= 26; i++) {
            map.put(key +"", i);
            key = (char) (key + 1);
        }
        int idx = 0;
        int mapIdx = 27;
        while (idx < msg.length()) {
            String tmp = "";
            while (idx < msg.length()) {
                if(!map.containsKey(tmp+msg.charAt(idx))) break;
                else tmp += msg.charAt(idx);
                idx++;
            }
            ans.add(map.get(tmp));
            if (idx < msg.length()) {
                map.put(tmp + msg.charAt(idx), mapIdx++);
            }

        }
        answer = ans.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}

package PRG.exercise;

import java.util.HashMap;
import java.util.Map;

public class 대충_만든_자판 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] ans = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<keymap.length; i++) {
            for(int j=0; j<keymap[i].length(); j++) {
                char tmp = keymap[i].charAt(j);
                if(map.containsKey(tmp)) {
                    if(map.get(tmp) > j+1) {
                        map.put(tmp, j+1);
                    }
                } else {
                    map.put(tmp, j+1);
                }
            }
        }
        for(int i=0; i<targets.length; i++) {
            int answer = 0;
            for(int j=0; j<targets[i].length(); j++) {
                char tmp = targets[i].charAt(j);
                if(map.containsKey(tmp)) {
                    answer += map.get(tmp);
                } else {
                    ans[i] = -1;
                    break;
                }
                ans[i] = answer;
            }
        }
        return ans;
    }
}

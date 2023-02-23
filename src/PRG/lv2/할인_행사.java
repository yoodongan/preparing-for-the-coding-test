package PRG.lv2;

import java.util.HashMap;
import java.util.Map;

public class 할인_행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int p1 = 0;
        int p2 = 10;
        boolean flag = true;
        while(p1 + 10 <= discount.length) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < want.length; i++) {
                map.put(want[i], number[i]);
            }
            for (int i = p1; i < p2; i++) {
                if(map.get(discount[i]) == null) break;
                map.put(discount[i], map.get(discount[i]) -1);
                if(map.get(discount[i]) < 0) {
                    break;
                }
            }
            for (Integer value : map.values()) {
                if(value < 0) flag = false;
            }
            if(!flag) answer++;
            p1++; p2++;
        }
        return answer;
    }
}

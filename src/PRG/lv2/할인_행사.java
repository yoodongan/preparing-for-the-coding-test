package PRG.lv2;

import java.util.HashMap;
import java.util.Map;

public class 할인_행사 {
    final int STREIGHT = 10;
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<want.length; i++) {
            map.put(want[i], number[i]);
        }
        Map<String, Integer> discountMap = new HashMap<>();
        for(int i=0; i<STREIGHT; i++) {
            discountMap.put(discount[i], discountMap.getOrDefault(discount[i], 0) + 1);
        }
        if(canJoin(map, discountMap)) answer++;

        for(int i=1; i <= discount.length - STREIGHT; i++) {
            discountMap.put(discount[i-1], discountMap.get(discount[i-1]) - 1);
            discountMap.put(discount[i+STREIGHT-1], discountMap.getOrDefault(discount[i+STREIGHT-1], 0) + 1);
            if(canJoin(map, discountMap)) answer++;
        }


        return answer;
    }
    public boolean canJoin(Map<String, Integer> map1, Map<String, Integer> map2) {
        for(String key : map1.keySet()) {
            if(!map2.containsKey(key) || map1.get(key) != map2.get(key)) return false;
        }
        return true;
    }
}

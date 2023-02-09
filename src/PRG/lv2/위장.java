package PRG.lv2;

import java.util.*;

public class 위장 {
    public int solution(String[][] clothes) {
        int answer= 1;
        Map<String, Integer> map = new HashMap<>();

        for (String[] clo : clothes) {
            String c = clo[1];
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Iterator<Integer> iter = map.values().iterator();
        while (iter.hasNext()) {
            answer *= iter.next().intValue()+1;
        }
        return answer-1;

    }
}

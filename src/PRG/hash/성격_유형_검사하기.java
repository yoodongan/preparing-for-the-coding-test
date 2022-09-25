package PRG.hash;

import java.util.HashMap;
import java.util.Map;

class 성격_유형_검사 {
    private static String[] personality = {"RT", "CF", "JM", "AN"};
    private static Map<Character, Integer> map = new HashMap<>();
    public String solution(String[] survey, int[] choices) {
        for (int i = 0; i < survey.length; i++) {
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);
            int number = choices[i];  // 기준
            if(choices[i] >=1 && choices[i] <=3) map.put(first, map.getOrDefault(first, 0) + 4 - number);
            else if(choices[i] >=5 && choices[i] <= 7) map.put(second, map.getOrDefault(second, 0 ) + number -4);
        }
        return new StringBuilder()
                .append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T')
                .append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F')
                .append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M')
                .append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N')
                .toString();
    }
}

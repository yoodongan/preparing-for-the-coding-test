package PRG.hash;


import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        String answer ="";
        Map<String, Integer> players = new HashMap<>();
        for(String player : participant) players.put(player, players.getOrDefault(player, 0) + 1);
        for(String completed : completion) players.put(completed, players.get(completed)-1);
        for (String key : players.keySet()) {
            if(players.get(key) != 0) {  // 0 이 아니면 완주하지 않은 사람.
                answer = key;
            }
        }
        return answer;
    }
}

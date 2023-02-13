package PRG.lv2;

import java.util.LinkedList;

public class _1차_캐시 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize == 0) return 5 * cities.length;
        LinkedList<String> cache = new LinkedList<>();

        for (int i = 0; i < cities.length; i++) {
            String tmp = cities[i].toUpperCase();
            if(cache.remove(tmp)) {
                cache.addFirst(tmp);
                answer += 1;
            } else {
                if(cache.size() == cacheSize){
                    cache.removeLast();
                }
                cache.addFirst(tmp);
                answer += 5;
            }
        }
        return answer;
    }
}

package PRG.lv2;

import java.util.*;

public class 귤_고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> arr = new ArrayList<>(map.values());
        Collections.sort(arr);

        int findNum = tangerine.length - k;

        int sum = 0;
        int idx = 0;
        for(Integer in : arr ) {
            sum += in;
            if(sum > findNum) {
                answer = arr.size() - idx;
                break;
            }
            else if(sum == findNum) {
                answer = arr.size() - (idx+1);
                break;
            }
            idx++;
        }

        return answer;
    }
}


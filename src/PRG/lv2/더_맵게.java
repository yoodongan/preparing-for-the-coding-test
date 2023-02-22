package PRG.lv2;

import java.util.*;

public class 더_맵게 {
    public int solution(int[] scoville, int k) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++) {
            pq.add(scoville[i]);
        }
        while(pq.peek() < k) {
            if(pq.size() == 1) return -1;
            pq.add(pq.poll() + pq.poll() * 2);
            answer++;
        }
        return answer;
    }
}

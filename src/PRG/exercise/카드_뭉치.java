package PRG.exercise;

import java.util.LinkedList;
import java.util.Queue;

public class 카드_뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        boolean flag = true;
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        for(String c : cards1) {
            queue1.add(c);
        }
        for(String c : cards2) {
            queue2.add(c);
        }
        for(String g : goal) {
            while(!queue1.isEmpty() || !queue2.isEmpty()) {
                if(queue1.size()!=0 && queue1.peek().equals(g)) {
                    queue1.poll();
                    break;
                } else if(queue2.size()!=0 &&queue2.peek().equals(g)) {
                    if(queue2.size() != 0) {
                        queue2.poll();
                    }
                    break;
                } else {
                    flag = false;
                    break;
                }
            }
            if(!flag) {
                answer = "No";
                break;
            } else answer = "Yes";
        }
        return answer;
    }
}

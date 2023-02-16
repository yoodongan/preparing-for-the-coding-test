package PRG.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class 프린터 {
    class Print {
        int idx;
        int val;
        public Print(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Print> queue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++) {
            queue.add(new Print(i, priorities[i]));
        }
        while (!queue.isEmpty()) {
            int current = queue.peek().val;

            boolean flag = false;

            for (Print pair : queue) {
                if (pair.val > current) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                Print temp = queue.poll();
                queue.add(temp);
            }
            else {
                answer++;
                Print pair = queue.poll();
                if (pair.idx == location) {
                    return answer;
                }
            }
        }
        return -1;
    }
}

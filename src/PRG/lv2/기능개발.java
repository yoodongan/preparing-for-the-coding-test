package PRG.lv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            double tmp = (100 - progresses[i]) / (double) speeds[i];
            int val = (int) Math.ceil(tmp);
            queue.add(val);
        }
        int ans = 1;
        int cur = queue.poll(); // 수정된 부분
        while (!queue.isEmpty()) {

            if (queue.peek() != null && queue.peek() <= cur) {
                queue.poll();
                ans++;
            } else {
                arr.add(ans);
                ans = 1;
                cur = queue.poll();
            }
        }
        arr.add(ans); // 수정된 부분
        int[] answer = arr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}

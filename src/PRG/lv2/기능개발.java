package PRG.lv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<progresses.length; i++) {
            double tmp = (100-progresses[i])/(double)speeds[i];
            int time = (int)Math.ceil(tmp);

            if(!queue.isEmpty() && queue.peek() < time) {
                arr.add(queue.size());
                queue.clear();
            }
            queue.add(time);

        }
        arr.add(queue.size());
        int[] answer = arr.stream().mapToInt(i->i).toArray();

        return answer;
    }
}

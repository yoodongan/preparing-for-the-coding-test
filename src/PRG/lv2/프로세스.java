package PRG.lv2;

import java.util.*;
public class 프로세스 {
    class Process {
        int number;
        int value;

        public Process(int number, int value) {
            this.number = number;
            this.value = value;
        }
    }

    public int solution(int[] priorities, int location) {
        int ans = 0;
        Queue<Process> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Process(i, priorities[i]));
        }
        while(!queue.isEmpty()) {
            int current = queue.peek().value;

            boolean flag = false;
            for (Process p : queue) {
                if (p.value > current) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                Process process = queue.poll();
                queue.add(process);
            } else {
                ans++;
                Process process = queue.poll();
                if (process.number == location) {
                    return ans;
                }
            }
        }
        return -1;
    }
}

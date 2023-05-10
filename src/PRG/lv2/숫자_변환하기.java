package PRG.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class 숫자_변환하기 {
    public int solution(int x, int y, int n) {
        if(x == y) return 0;
        int[] check = new int[10000001];
        int[] temp = new int[3];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);

        while(!queue.isEmpty()) {
            int current = queue.poll();
            temp[0] = current + n;
            temp[1] = current * 2;
            temp[2] = current * 3;
            for (int i = 0; i < temp.length; i++) {
                int next = temp[i];
                if(check[next] == 0 || check[next] > check[current] + 1) {
                    check[next] = check[current] + 1;   // 최소값으로 바꿔준다.
                    queue.add(next);
                }
            }
        }
        return check[y] != 0 ? check[y] : -1;
    }
}

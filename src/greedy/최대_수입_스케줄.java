package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 최대_수입_스케줄 {
    static class Lecture implements Comparable<Lecture> {
        int price;
        int time;

        public Lecture(int price, int time) {
            this.price = price;
            this.time = time;
        }
        @Override
        public int compareTo(Lecture l) {
            return l.time - this.time;
        }
    }
    public static int solution(int n, ArrayList<Lecture> arr) {
        int answer = 0;
        Collections.sort(arr);
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        int max = arr.get(0).time;
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if(arr.get(j).time < i) break;
                pq.add(arr.get(j).price);
            }
            if(!pq.isEmpty()) answer+=pq.poll();

        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int m=kb.nextInt();
            int d=kb.nextInt();
            arr.add(new Lecture(m, d));
        }
        System.out.println(solution(n, arr));

    }
}
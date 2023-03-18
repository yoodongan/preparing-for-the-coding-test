package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 최대_수입_스케줄 {
    static class Lecture implements Comparable<Lecture>{
        int m;  // 금액
        int d;  // D 일 안에 와서 강연해야 함.
        Lecture(int m, int d) {
            this.m = m;
            this.d = d;
        }
        @Override
        public int compareTo(Lecture l) {
            return l.d - this.d;
        }
    }

    public static int solution(int n, ArrayList<Lecture> arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int answer = 0;
        int day = arr.get(0).d;
        for(int i=day; i>=1; i--) {
            for(Lecture lec : arr) {
                if(lec.d < i) break;
                if(lec.d == i) {
                    pq.add(lec.m);
                }
            }
            if(!pq.isEmpty()) {
                int price = pq.poll();
                answer += price;
            }
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
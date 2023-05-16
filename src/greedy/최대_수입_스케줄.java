package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 최대_수입_스케줄 {
    static class Lecture implements Comparable<Lecture> {
        int m;
        int d;
        public Lecture(int m, int d) {
            this.m = m;
            this.d = d;
        }
        @Override
        public int compareTo(Lecture o) {
            return o.d - this.d;
        }
    }


    public static int solution(int n, ArrayList<Lecture> arr) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int day = arr.get(0).d;
        int answer = 0;
        for (int i = day; i >= 1; i--) {
            for(Lecture lec : arr) {
                if(lec.d < i) break;
                if(lec.d == i) {
                    pQ.add(lec.m);
                }
            }
            answer += pQ.poll();   // 각 날짜 별 최대 수입 강의료를 더한다.
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
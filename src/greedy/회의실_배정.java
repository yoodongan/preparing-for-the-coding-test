package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 회의실_배정 {
    static class Meeting implements Comparable<Meeting>{
        int start;
        int end;
        Meeting(int s, int e) {
            start = s;
            end = e;
        }
        @Override
        public int compareTo(Meeting m) {
            return this.end - m.end;
        }
    }
    public static int solution(int n, ArrayList<Meeting> arr) {
        Collections.sort(arr);
        int endTime = 0;
        int answer = 0;
        for(Meeting m : arr) {
            if(m.start >= endTime) {
                endTime = m.end;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Meeting> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Meeting(sc.nextInt(), sc.nextInt()));
        }
        System.out.println(solution(n, arr));
    }
}

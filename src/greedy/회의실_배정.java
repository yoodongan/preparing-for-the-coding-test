package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Meeting implements Comparable<Meeting>{
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        if(this.end == o.end) return this.start - o.start;
        else return this.end - o.end;
    }
}

public class 회의실_배정 {
    public static int solution(ArrayList<Meeting> arr) {
        int cnt = 0;
        Collections.sort(arr); // 일단 조건에 맞게 정렬.

        int endTime = 0;
        for (Meeting meeting : arr) {
            if (meeting.start >= endTime) {
                cnt++;
                endTime = meeting.end;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Meeting> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Meeting(sc.nextInt(), sc.nextInt()));
        }
        System.out.println(solution(arr));
    }
}

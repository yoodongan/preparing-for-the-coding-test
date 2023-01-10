package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Wedding implements Comparable<Wedding>{
    int start;
    int end;

    public Wedding(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Wedding o) {
        if(this.end == o.end) return this.start - o.start;
        else return this.end - o.end;
    }
}

public class 결혼식 {
    public static int max = Integer.MIN_VALUE;
    public static int solution(ArrayList<Wedding> arr) {
        int cnt = 1;
        Collections.sort(arr);
        int endTime = arr.get(0).end;
        for (Wedding wedding : arr) {
            if(wedding.start < endTime) cnt++;
            else endTime = wedding.end;
        }
        max = Math.max(cnt, max);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Wedding> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Wedding(sc.nextInt(), sc.nextInt()));
        }
        System.out.println(solution(arr));
    }
}

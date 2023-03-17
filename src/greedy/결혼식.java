package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 결혼식 {
    static class Wedding implements Comparable<Wedding>{
        int time;
        char state;
        Wedding(int t, char s) {
            time = t;
            state = s;
        }
        @Override
        public int compareTo(Wedding w) {
            if(this.time == w.time) {
                return this.state - w.state;
            } else {
                return this.time - w.time;
            }
        }
    }

    public static int solution(int n, int[][] arr) {
        ArrayList<Wedding> wed = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            wed.add(new Wedding(arr[i][0], 's'));
            wed.add(new Wedding(arr[i][1], 'e'));
        }
        int cnt = 0;
        int answer = 0;
        Collections.sort(wed);
        for(Wedding w : wed) {
            if(w.state == 's') {
                cnt++;
            } else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        System.out.println(solution(n, arr));
    }
}

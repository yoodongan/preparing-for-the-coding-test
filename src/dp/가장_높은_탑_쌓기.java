package dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 가장_높은_탑_쌓기 {
    static class Castle implements Comparable<Castle>{
        int s, h, w;
        public Castle(int s, int h, int w) {
            this.s = s;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Castle c) {
            return Integer.compare(c.s, this.s);
        }
    }

    public static int solution(ArrayList<Castle> arr, int number) {
        Collections.sort(arr);
        int[] dy = new int[arr.size()];
        dy[0] = arr.get(0).h;
        int answer = dy[0];
        for (int i = 1; i < number; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if(arr.get(i).w < arr.get(j).w && dy[j] > max) max = dy[j];
            }
            dy[i] = max + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Castle> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Castle c = new Castle(sc.nextInt(), sc.nextInt(), sc.nextInt());
            arr.add(c);
        }
        System.out.println(solution(arr, n));
    }
}


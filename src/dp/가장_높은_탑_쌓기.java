package dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 가장_높은_탑_쌓기 {
    static class Castle implements Comparable<Castle> {
        private int s; //넓이
        private int h; //높이
        private int w; //무게

        public Castle(int s, int h, int w) {
            this.s = s;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Castle o) {
            return o.s - this.s;
        }
    }

    public static int solution(ArrayList<Castle> arr, int number) {
        int answer = 0;
        int[] dy = new int[number];
        Collections.sort(arr);
        dy[0] = arr.get(0).h;
        for (int i = 1; i < number; i++) {
            int max = 0;
            for (int j = i-1; j >=0 ; j--) {
                if(arr.get(j).w > arr.get(i).w && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max + arr.get(i).h;
            answer = Math.max(dy[i], max);
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


package greedy;

import java.util.*;

public class 씨름_선수 {
    static class Player implements Comparable<Player> {
        int h; // 키
        int w; // 몸무게

        public Player(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Player p) {
            return Integer.compare(this.h, p.h);
        }
    }

    public static int solution(int n, ArrayList<Player> arr) {
        Collections.sort(arr);
        int answer = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr.get(i).w < arr.get(j).w) {
                    answer++;
                    break;
                }
            }
        }
        return n-answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Player> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Player(sc.nextInt(), sc.nextInt()));
        }
        System.out.println(solution(n, arr));

    }

}

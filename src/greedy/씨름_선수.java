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
            return Integer.compare(p.h, this.h);
        }
    }

    public static int solution(int n, ArrayList<Player> arr) {
        Collections.sort(arr);
        int answer = 1;
        int max = arr.get(0).w;
        for(Player p : arr) {
            if(p.w > max) {
                max = p.w;
                answer++;
            }
        }
        return answer;
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

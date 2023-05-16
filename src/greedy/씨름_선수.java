package greedy;

import java.util.*;

public class 씨름_선수 {
    static class Player implements Comparable<Player>{
        int height;
        int weight;

        public Player(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Player o) {
            return o.height - this.height;
        }
    }

    public static int solution(int n, ArrayList<Player> arr) {
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for(Player p : arr) {
            if(p.weight > max) {
                max = p.weight;
                cnt++;
            }
        }
        return cnt;
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

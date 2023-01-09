package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * n, volunteer(height,weight), max
 *
 */
class Volunteer implements Comparable<Volunteer>{
    int height;
    int weight;

    public Volunteer(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Volunteer o) {
        return o.height - this.height;
    }
}
public class 씨름선수 {
    public static int n;
    public static int solution(ArrayList<Volunteer> arr) {
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        for(Volunteer v : arr) {
            if(v.weight > max) {
                max = Math.max(max, v.weight);
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Volunteer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Volunteer(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr);
        System.out.println(solution(arr));

    }
}

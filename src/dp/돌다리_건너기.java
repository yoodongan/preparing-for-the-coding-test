package dp;

import java.util.Scanner;

public class 돌다리_건너기 {
    public static int solution(int n) {
        int[] dy = new int[n+2];
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n+1; i++) {
            dy[i] = dy[i-1] + dy[i-2];
        }
        return dy[n+1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}

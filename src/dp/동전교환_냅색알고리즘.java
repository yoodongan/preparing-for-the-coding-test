package dp;

import java.util.Arrays;
import java.util.Scanner;

public class 동전교환_냅색알고리즘 {
    public static int solution(int n, int[] coin, int m) {
        int[] dy = new int[m+1];
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j < dy.length; j++) {
                int tmp = dy[j-coin[i]] + 1;
                dy[j] = Math.min(dy[j], tmp);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(solution(n, arr, m));

    }
}

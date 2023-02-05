package dp;

import java.util.Scanner;

public class 최대점수_구하기_냅색알고리즘 {
    public static int solution(int n, int m, int[] ps, int[] pt) {
        // m : 제한 시간. ps : 점수 배열, pt : 소요 시간 배열
        int[] dy = new int[m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = m; j >= pt[i]; j--) {
                dy[j] = Math.max(dy[j], dy[j-pt[i]] + ps[i]);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ps = new int[n];
        int[] pt = new int[n];
        for (int i = 0; i < n; i++) {
            ps[i] = sc.nextInt();
            pt[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, ps, pt));
    }
}

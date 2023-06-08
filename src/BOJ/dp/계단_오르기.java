package BOJ.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단_오르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dy = new int[n+3];
        int[] arr = new int[n+3];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dy[1] = arr[1];
        dy[2] = arr[1] + arr[2];
        dy[3] = Math.max(arr[1] + arr[3], arr[2] + arr[3]);
        for (int i = 4; i <= n; i++) {
            dy[i] = Math.max(dy[i-2], dy[i-3] + arr[i-1]) + arr[i];
        }
        System.out.println(dy[n]);
    }
}

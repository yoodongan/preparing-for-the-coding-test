package BOJ.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 가장_긴_증가하는_부분_수열 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        int dy[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dy[0] = 1;

        for (int i = 1; i < n; i++) {
            dy[i] = 1;  // 현재 위치부터 증가수열이 최대길이가 될 수 도 있기 때문.
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dy[i] <= dy[j]) {
                    dy[i] = dy[j] + 1;
                }
            }
        }
        Arrays.sort(dy);
        System.out.println(dy[n-1]);
    }
}

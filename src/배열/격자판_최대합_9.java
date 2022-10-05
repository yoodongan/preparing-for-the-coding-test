package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 격자판_최대합_9 {
    public static int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;  // sum1 은 행의 합 또는 대각선 합.  sum2 역시 열의 합 또는 대각선 합 을 담는 변수.
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1+=arr[i][j];   // 행의 합.
                sum2+=arr[j][i];   // 열의 합.
            }
            answer = Math.max(sum1, answer);
            answer = Math.max(sum2, answer);

        }
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-1-i];
        }
        answer = Math.max(sum1, answer);
        answer = Math.max(sum2, answer);
        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(n, arr));

    }
}

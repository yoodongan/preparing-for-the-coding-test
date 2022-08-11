package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수_5 {
    public static boolean[] arr;
    public static int cnt = 0;
    public static int solution(int n) {
        arr = new boolean[n+1];
        for (int i = 0; i <= n; i++) {
            arr[i] = true;
        }
        arr[0] = false;  // 소수가 아니다.
        arr[1] = false;  // 소수가 아니다.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for(int j=i*i; j<=n; j+=i) {
                arr[j] = false;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }


}

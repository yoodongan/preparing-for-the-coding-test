import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 배열 - 5번. 에라토스테네스 체
public class Main {
    public static int solution(int n) {
        boolean[] arr = new boolean[n+1];
        for (int i = 0; i < n + 1; i++) {
            arr[i] = true;
        }
        arr[0] = arr[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = i * i; j <= n; j += i) {
                arr[j] = false;
            }
        }
        int cnt =0;
        for (int i = 0; i <= n; i++) {
            if(arr[i]) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));

    }
}
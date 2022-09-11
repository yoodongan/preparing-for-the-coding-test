import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 배열 - 4번. 피보나치 수열
public class Main {
    public static void solution(int n) {
        int[] arr = new int[n];
        arr[0] = arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        for (int x : arr) {
            System.out.print(x+ " ");
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        solution(n);

    }
}
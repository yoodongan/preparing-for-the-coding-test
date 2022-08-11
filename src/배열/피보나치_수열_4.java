package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class 피보나치_수열_4 {
    public static void solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1; arr[1] = 1;
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

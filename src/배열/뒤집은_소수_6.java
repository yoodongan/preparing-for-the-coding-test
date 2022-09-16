package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 뒤집은_소수_6 {
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static String solution() {
        for (int i = 0; i < arr.length; i++) {
            String number = String.valueOf(arr[i]);
            StringBuffer sb = new StringBuffer(number);
            String reverseNum = sb.reverse().toString();
            arr[i] = Integer.parseInt(reverseNum);
        }
        for (int x : arr) {
            if(isPrime(x)) {
                sb.append(x + " ");
            }
        }
        return String.valueOf(sb);
    }
    public static boolean isPrime(int number) {
        if (number == 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;   // 소수가 아니다.
            }
        }
        return true;  // 소수이다.
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.print(solution());
    }
}
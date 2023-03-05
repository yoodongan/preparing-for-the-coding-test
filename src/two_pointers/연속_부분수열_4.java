package two_pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속_부분수열_4 {
    public static int solution(int n, int m, int[] arr) {
        int sum = 0;
        int answer = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            while(sum > m) {
                sum -= arr[lt++];
            }
            if(sum == m) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        int p1=0, p2=0;
        int ans = 0, sum = 0;
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        System.out.println(solution(n, m, arr));
    }
}

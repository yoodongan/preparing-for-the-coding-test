package two_pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대_매출_3 {
    public static int solution(int n, int k, int[] arr) {
        int max = Integer.MIN_VALUE;
        int p = 0;
        while(p <= n-k) {
            int sum = 0;
            for(int i=p; i<=p+k-1; i++) {
                sum += arr[i];
            }
            if(sum > max) max = sum;
            p++;
        }
        return max;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int k = Integer.parseInt(str.nextToken());
        StringTokenizer str2 = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str2.nextToken());
        }
        System.out.println(solution(n, k, arr));
    }
}

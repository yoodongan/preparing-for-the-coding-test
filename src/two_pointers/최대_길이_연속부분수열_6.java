package two_pointers;

import java.util.Scanner;

public class 최대_길이_연속부분수열_6 {
    public static int solution(int n, int k, int[] arr) {
        int lt = 0;
        int cnt = 0;
        int ans = 0;
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) cnt++;
            while(cnt > k) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            ans = Math.max(ans, rt-lt+1);
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }
}

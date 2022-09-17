package 배열;

import java.io.IOException;
import java.util.Scanner;

public class 등수_구하기_8 {
    public static int[] solution(int[] arr, int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if(arr[j] > arr[i]) cnt++;
            }
            ans[i] = cnt;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x : solution(arr, n)) System.out.print(x + " ");
    }
}

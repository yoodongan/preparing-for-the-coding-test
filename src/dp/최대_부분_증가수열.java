package dp;

import java.util.Scanner;

public class 최대_부분_증가수열 {
    public static int solution(int n, int[] arr) {
        int answer = 0;
        int[] dy = new int[n];
        dy[0] = 1;
        if(arr[1] < arr[0]) dy[1] = 1;
        else dy[1] = 0;
        for (int i = 2; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr));

    }
}

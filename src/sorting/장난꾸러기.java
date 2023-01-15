package sorting;

import java.util.Scanner;

public class 장난꾸러기 {
    public static int[] number;
    public static void solution(int[] arr, int n) {
        int chul = 0, partner =0;
        int i;
        for (i = 0; i < n-1; i++) {
            if(arr[i+1] <= arr[i]) {
                chul = i+1;
                break;
            }

        }
        for (int j = i + 1; j < n - 1; j++) {
            if(arr[j+1] < arr[j]) {
                partner = j+1;
                break;
            }

        }
        System.out.println(chul + " " + partner);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        solution(number, n);
    }
}

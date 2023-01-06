package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class 중복_확인 {
    public static int[] number;
    public static boolean flag;
    public static void solution(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]) {
                flag = true;
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        solution(number);
        if(flag) System.out.println("D");
        else System.out.println("U");
    }
}

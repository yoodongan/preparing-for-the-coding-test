package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가위_바위_보_3 {
    public static StringBuilder sb = new StringBuilder();
    public static String solution(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] == b[i]) sb.append("D\n");
            else if(a[i] == 1 && b[i] == 2) sb.append("B\n");
            else if(a[i] == 2 && b[i] == 3) sb.append("B\n");
            else if(a[i] == 3 && b[i] == 1) sb.append("B\n");
            else sb.append("A\n");
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        StringTokenizer aStr = new StringTokenizer(br.readLine());
        StringTokenizer bStr = new StringTokenizer(br.readLine());
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(aStr.nextToken());
            b[i] = Integer.parseInt(bStr.nextToken());
        }
        System.out.println(solution(a, b));


    }
}

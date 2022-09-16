package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 점수계산_7 {
    public static int solution(int[] arr, int n) {
        int sum = 0;
        int plusNum = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                plusNum++;
                sum+=plusNum;
            }
            if (arr[i] == 0) plusNum=0;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr, n));

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

// 배열 - 1번. 큰 수 출력하기.
public class Main {
    public static int n;
    public static StringTokenizer st;
    public static void solution() {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.print(arr[0] + " ");
        for (int i = 1; i < n; i++) {
            if(arr[i] > arr[i-1]) System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        solution();
    }

}
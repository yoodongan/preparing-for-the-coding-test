import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 배열 - 2번. 보이는 학생
public class Main {
    public static StringTokenizer st;
    public static int n;
    public static int solution() {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int maxValue = arr[0];
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                cnt++;
                maxValue = arr[i];
            }
        }
        return cnt;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        System.out.println(solution());

    }

}
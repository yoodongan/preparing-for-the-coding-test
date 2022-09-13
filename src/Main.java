import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 배열 - 6번. 뒤집은 소수
public class Main {
    public static void solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String number = String.valueOf(arr[i]);
            StringBuffer sb = new StringBuffer(number);
            arr[i] = Integer.parseInt(sb.reverse().toString());
        }
        for (int i : arr) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int n){
        if(n==1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        solution(arr);

    }
}
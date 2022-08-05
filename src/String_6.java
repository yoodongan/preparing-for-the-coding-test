import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_6 {
    static StringBuilder sb = new StringBuilder();
    public static String solution(String str) {
        char[] arr = str.toCharArray();
        int[] alphabetCheck = new int[123];
        for (int i = 97; i < 123; i++) {
            alphabetCheck[i] = 0;
        }
        for (int i = 0; i<arr.length; i++) {
            if(alphabetCheck[(int)arr[i]] >= 1) {
                continue;
            } else {
                sb.append(arr[i]);
                alphabetCheck[(int)arr[i]]++;
            }
        }
        return String.valueOf(sb);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));

    }
}

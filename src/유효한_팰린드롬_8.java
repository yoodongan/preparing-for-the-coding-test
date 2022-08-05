import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 유효한_팰린드롬_8 {
    public static String solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reverseStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reverseStr)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));

    }

}

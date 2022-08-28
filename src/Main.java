import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 문자열 - 3번. 문장 속 단어
public class Main {
    public static String solution(String str) {
        String[] strBits = str.split(" ");
        int max = Integer.MIN_VALUE;
        String ans = "";
        for (String x : strBits) {
            if (x.length() > max) {
                max = x.length();
                ans=x;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));

    }

}
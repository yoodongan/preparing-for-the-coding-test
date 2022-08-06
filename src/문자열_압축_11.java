import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열_압축_11 {
    public static String solution(String str) {
        char[] strToChar = new char[str.length() + 1];
        for (int i = 0; i < str.length(); i++) {
            strToChar[i] = str.charAt(i);
        }
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            if (strToChar[i] == strToChar[i + 1]) cnt++;
            else {
                sb.append(strToChar[i]);
                if(cnt > 1) sb.append(String.valueOf(cnt));
                cnt = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class String_1 {
    public static int solution(String str, char t) {
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        int answer = 0;
        for (char x : str.toCharArray()) {
            if (x == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char t = br.readLine().charAt(0);
        System.out.println(solution(str, t));
    }
}

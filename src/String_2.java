import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class String_2 {
    public static String transfer(String str) {
        char[] strChar = str.toCharArray();
        String ans = "";
        for(char x : strChar) {
            if (x >= 65 && x <= 90) {
                ans += (char)(x + 32);
            } else if (x >= 97 && x <= 122) {
                ans += (char)(x - 32);
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(transfer(str));
    }
}

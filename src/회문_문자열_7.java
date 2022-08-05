import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 회문_문자열_7 {
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String word = br.readLine();

        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            stack.push(Character.toUpperCase(arr[i]));
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(stack.pop());
        }
        String ans = String.valueOf(sb);
        word = word.toUpperCase();
        if (word.equals(ans)) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

    }
}

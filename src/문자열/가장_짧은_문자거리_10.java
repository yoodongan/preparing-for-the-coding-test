package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_짧은_문자거리_10 {
    public static int[] solution(String s, char t) {
        int[] ans = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < ans.length; i++) {
            if(s.charAt(i) == t) {
                p = 0;
                ans[i] = 0;
            }
            else {
                p++;
                ans[i] = p;
            }
        }
        p = 1000;
        for (int i = ans.length - 1; i >= 0; i--) {
            if(s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                ans[i] = Math.min(ans[i], p);
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        String str= st.nextToken();
        char t = st.nextToken().charAt(0);

        int[] returnArr = solution(str, t);
        for (int i = 0; i < returnArr.length; i++) {
            System.out.print(returnArr[i] + " ");
        }

    }

}

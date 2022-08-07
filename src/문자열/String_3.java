package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_3 {
    public static String solution(String str) {
        String[] strSplit = str.split(" ");
        int max_length = 0;
        String ans = "";
        for (int i = 0; i < strSplit.length; i++) {
            if(strSplit[i].length() > max_length) max_length = strSplit[i].length();
        }
        for (String x : strSplit) {
            if(x.length() ==max_length) {
                ans += x;
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

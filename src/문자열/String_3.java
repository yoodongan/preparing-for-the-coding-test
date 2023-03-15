package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_3 {
    public static String solution(String str) {
        int max = Integer.MIN_VALUE, pos;
        String answer = "";
        while((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            if(tmp.length() > max) {
                max = tmp.length();
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > max) answer = str;
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}

package 문자열;
/*
[] 7자씩 가져온다. -> 다음 문자로 넘어가기. -> 문자 변환해서 StringBuilder 에 추가.
- return 문자열.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 암호_12 {
    public static StringBuilder sb = new StringBuilder();
    public static String solution(int n, String str) {
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
            int word = Integer.parseInt(tmp, 2);
            str = str.substring(7);
            sb.append((char)word);
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(solution(num, str));


    }

}

package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class String_6 {
    static StringBuilder sb = new StringBuilder();
    public static String solution(String str) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                continue;
            } else {
                sb.append(str.charAt(i));
                map.put(str.charAt(i), 1);
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

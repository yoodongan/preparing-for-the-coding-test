package 문자열;/*
-[] n 숫자, 단어 입력받기.
-[] charAt 로 역순으로 뒤집어서 출력하기.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class String_4 {
    public static void solution(int n, String[] arr) {
        ArrayList<String> ans = new ArrayList<>();
        for(String str : arr) {
            int lt = 0, rt=str.length()-1;
            char[] ch = str.toCharArray();
            while(lt < rt) {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
            ans.add(String.valueOf(ch));
        }
        for(String s : ans) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        solution(n, arr);
    }
}

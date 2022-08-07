package 문자열;/*
-[] n 숫자, 단어 입력받기.
-[] charAt 로 역순으로 뒤집어서 출력하기.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String word = br.readLine();
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.println();
        }
    }
}

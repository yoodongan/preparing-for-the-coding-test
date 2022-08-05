import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
-[] 문자열 입력받고, char arr 에 저장한다.
-[] 첫 번째 와 마지막 교환하기... while 문 사용.
  - [] 조건 : 특수문자는 교환하지 않는다.
-[] 출력은
*/
public class String_5 {
    public static String solution(String str) {
        char[] arr = str.toCharArray();
        int lt = 0, rt = arr.length-1;
        while (lt < rt) {
            if(!Character.isAlphabetic(arr[lt])) lt++;
            else if(!Character.isAlphabetic(arr[rt])) rt--;
            else {
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt++;
                rt--;
            }

        }
        return String.valueOf(arr);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}

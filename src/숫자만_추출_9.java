import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자만_추출_9 {
    public static int solution(String str){
        str = str.replaceAll("[^0-9]", "");
        int onlyNumber = Integer.parseInt(new StringBuilder(str).toString());
        return onlyNumber;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));

    }
}

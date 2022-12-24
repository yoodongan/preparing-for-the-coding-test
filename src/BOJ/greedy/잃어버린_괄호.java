package BOJ.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 잃어버린_괄호 {
    public static int ans = Integer.MAX_VALUE;
    public static int solution(String str) {
        StringTokenizer st = new StringTokenizer(str, "-");
        while(st.hasMoreTokens()) {
            int sum = 0;
            StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");
            while(st2.hasMoreTokens()) {
                sum += Integer.parseInt(st2.nextToken());
            }
            if(ans == Integer.MAX_VALUE) ans = sum;
            else ans -= sum;
        }
        return ans;

    }
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.print(solution(str));
    }
}

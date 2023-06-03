package BOJ.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕_배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dy = new int[n+1];
        dy[3] = 1;
        if(n>=5) {  // n=4 가 될 수도 있기 때문.
            dy[5] = 1;
            for (int i = 6; i <= n; i++) {
                if(i%5 ==0) dy[i] = dy[i-5] + 1;  // 반드시 이게 먼저 와야 한다. dy[15]의 경우, 5kg 으로 3봉지로 담을 수 있기 때문.
                // 만약 3kg을 먼저 빼주게 되면, 15-3 = 12 가 되어 올바른 정답이 나오지 않는다.
                else if(i%3 ==0) dy[i] = dy[i-3] + 1;
                else {
                    if (dy[i - 3] != 0 && dy[i - 5] != 0) {
                        dy[i] = Math.min(dy[i-3], dy[i-5]) + 1;
                    }
                }
            }
        }
        if (dy[n] == 0) {
            System.out.println("-1");
        } else {
            System.out.println(dy[n]);
        }
    }
}

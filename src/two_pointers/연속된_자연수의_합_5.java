package two_pointers;

import java.util.Scanner;

public class 연속된_자연수의_합_5 {
    public static int solution(int n) {
        int lt = 1;
        int sum = 0;
        int ans = 0;
        for(int rt = 1; rt<=n/2 +1; rt++) {
            sum += rt;
            while(sum > n) {
                sum -= lt++;
            }
            if(sum == n) ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}

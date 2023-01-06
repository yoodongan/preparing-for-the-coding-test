package sorting;

import java.util.Scanner;

// Last Recently Used
public class LRU {
    public static int[] ans;
    public static int[] number;

    public static int[] solution(int n) {
        for(int x : number) {
            int idx = -1;
            for (int i = 0; i < n; i++) {
                if(ans[i] == x) idx = i;  // hit.
            }
            if(idx != -1) {  // hit 한 경우
                for (int i = idx; i >= 1; i--) {
                    ans[i] = ans[i-1];
                }
            }
            else {  // miss
                for (int i = n - 1; i >= 1; i--) {
                    ans[i] = ans[i-1];
                }
            }
            ans[0] = x;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        ans = new int[s];
        number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        for (int x : solution(s)) {
            System.out.print(x + " ");
        }
    }
}

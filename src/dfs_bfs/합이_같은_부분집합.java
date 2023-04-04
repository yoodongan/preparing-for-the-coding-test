package dfs_bfs;
import java.util.Scanner;

public class 합이_같은_부분집합 {
    static boolean flag = false;
    static int[] arr;
    static String answer = "";
    static int total;
    public static void dfs(int L, int sum) {
        if(L==arr.length) {
            if(total - sum == sum) flag = true;
        } else {
            dfs(L+1, sum + arr[L]);
            dfs(L+1, sum);
        }
    }
    public static String solution(int n, int[] numbers) {
        for (int i = 0; i < n; i++) {
            total += numbers[i];
        }
        arr = numbers.clone();
        dfs(0, 0);
        if(flag) answer = "YES";
        else answer = "NO";
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(solution(n, numbers));

    }
}

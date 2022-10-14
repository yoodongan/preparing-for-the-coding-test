package two_pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 두_배열_합치기_1 {
    public static ArrayList<Integer> solution(int n, int m, int[] arr, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int p1=0, p2=0;
        while(p1<n && p2<m) {
            if(arr[p1] < arr2[p2]) ans.add(arr[p1++]);
            else ans.add(arr2[p2++]);
        }
        while(p1<n) ans.add(arr[p1++]);
        while(p2<m) ans.add(arr2[p2++]);
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        for (int x : solution(n, m, arr, arr2)) {
            System.out.print(x + " ");
        }

    }
}

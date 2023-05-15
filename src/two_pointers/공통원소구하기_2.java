package two_pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 공통원소구하기_2 {
    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();
        int p1 = 0,p2 = 0;
        while(p1 < n && p2 < m) {
            if(a[p1] == b[p2]) {
                ans.add(a[p1++]);
                p2++;
            } else if (a[p1] > b[p2]) {
                p2++;
            } else {
                p1++;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer str1 = new StringTokenizer(br.readLine());
        int[] arrA = new int[a];
        for (int i = 0; i < a; i++) {
            arrA[i] = Integer.parseInt(str1.nextToken());
        }
        int b = Integer.parseInt(br.readLine());
        StringTokenizer str2 = new StringTokenizer(br.readLine());
        int[] arrB = new int[b];
        for (int i = 0; i < b; i++) {
            arrB[i] = Integer.parseInt(str2.nextToken());
        }
        for(int x : solution(a, b, arrA, arrB)) System.out.print(x+ " ");

    }
}


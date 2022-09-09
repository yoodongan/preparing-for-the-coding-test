import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 배열 - 3번. 가위 바위 보
public class Main {
    public static String solution(int[] arr1, int[] arr2) {
        String answer="";
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == arr2[i]) answer+="D";
            else if(arr1[i]==1 && arr2[i]==3) answer+="A";
            else if(arr1[i]==2 && arr2[i]==1) answer+="A";
            else if(arr1[i]==3 && arr2[i]==2) answer+="A";
            else answer+="B";
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i < n; i++) {
            arrA[i] = Integer.parseInt(stA.nextToken());
            arrB[i] = Integer.parseInt(stB.nextToken());
        }
        for(char x : solution(arrA, arrB).toCharArray()) System.out.println(x);

    }
}
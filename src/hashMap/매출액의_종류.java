package hashMap;

import java.util.*;

public class 매출액의_종류 {

    public static int[] solution(int n, int k, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k-1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }
        int[] ans = new int[answer.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = answer.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(solution(n, k, arr)));

    }
}

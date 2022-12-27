package hashMap;

import java.util.*;

public class 매출액의_종류 {

    public static ArrayList<Integer> solution(int n, int k, int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int lt=0;
        for (int i = 0; i < k-1; i++) {   // k일 째 매출액은 아래 반복문에서 포함시킨다.
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        for(int rt=k-1; rt<arr.length; rt++) {
            hm.put(arr[rt], hm.getOrDefault(arr[rt], 0) + 1);
            ans.add(hm.size());
            hm.put(arr[lt], hm.get(arr[lt])-1);
            if(hm.get(arr[lt]) == 0) hm.remove(arr[lt]);
            lt++;
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
        for (Integer i : solution(n, k, arr)) {
            System.out.print(i + " ");
        }
    }
}

package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 학급_회장_1 {
    public static int n;
    public static String str;
    public static String solution() {
        String answer = "";
        Map<Character, Integer> hashMap = new HashMap<>();
        char[] candidate = str.toCharArray();
        for (int i = 0; i < candidate.length; i++) {
            hashMap.put(candidate[i], hashMap.getOrDefault(candidate[i], 0) + 1);
        }
        int maxValue = Integer.MIN_VALUE;
        for (Integer x : hashMap.values()) {
            if(x > maxValue) maxValue = x;
        }
        for (Character c : hashMap.keySet()) {
            if (hashMap.get(c) == maxValue) {
                answer = String.valueOf(c);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        str = sc.next();
        System.out.println(solution());
    }
}

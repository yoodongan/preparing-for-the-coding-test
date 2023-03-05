package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 학급_회장_1 {
    public static String solution(int n, String str) {
        Map<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        String answer = "";
        for (int i = 0; i < n; i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for(Character key : map.keySet()) {
            if(max < map.get(key)) {
                max = map.get(key);
                answer = key.toString();
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n, str));
    }
}

package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 아나그램 {
    public static String solution(String str1, String str2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        boolean flag = true;

        for (int i = 0; i < str1.length(); i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
        }
        for(Character key : map1.keySet()) {
            if(map1.get(key) == map2.get(key)) continue;
            else flag = false;
        }
        if(!flag) return "NO";
        else return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(solution(str1, str2));
    }
}

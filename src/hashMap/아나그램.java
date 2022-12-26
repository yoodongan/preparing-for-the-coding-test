package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 아나그램 {
    public static String solution(String str1, String str2) {
        Map<Character, Integer> hm1 = new HashMap<>();
        Map<Character, Integer> hm2 = new HashMap<>();
        boolean answer = true;
        char[] char1 = str1.toCharArray();
        for (int i = 0; i < char1.length; i++) {
            hm1.put(char1[i], hm1.getOrDefault(char1[i], 0) + 1);
        }
        char[] char2 = str2.toCharArray();
        for (int i = 0; i < char2.length; i++) {
            hm2.put(char2[i], hm2.getOrDefault(char2[i], 0) + 1);
        }
        for (char c : hm1.keySet()) {
            if(hm1.get(c) != hm2.get(c)) answer = false;
        }
        if(answer) return "YES";
        else return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(solution(str1, str2));
    }
}

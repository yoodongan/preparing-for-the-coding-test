package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 모든_아나그램_찾기 {
    public static int solution(String s, String t) {
        Map<Character, Integer> hm = new HashMap<>();
        int ans = 0;
        boolean include = true;
        char[] charS = s.toCharArray();
        for (int i = 0; i < t.length() - 1; i++) {
            hm.put(charS[i], hm.getOrDefault(charS[i], 0) + 1);
        }
        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            hm.put(charS[rt], hm.getOrDefault(charS[rt], 0) + 1);
            for (Character c : t.toCharArray()) {
                if (!hm.containsKey(c) || hm.get(c) == 0) {
                    include = false;
                    break;
                }
            }
            if(include) ans++;

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(solution(s, t));
    }
}

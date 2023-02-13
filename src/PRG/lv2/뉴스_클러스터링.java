package PRG.lv2;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 뉴스_클러스터링 {
    public long solution(String str1, String str2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        Pattern p = Pattern.compile("[^A-za-z]");
        Matcher m = null;

        int totalSum = 0;
        for (int i = 0; i < str1.length() - 2; i++) {
            String tmp = str1.substring(i, i+2);
            m = p.matcher(tmp);
            if(m.find()) continue;
            map1.put(tmp, map1.getOrDefault(map1.get(tmp), 0) + 1);
            totalSum++;
        }
        for(int i = 0; i <= str2.length()-2; i++){
            String key = str2.substring(i, i+2);
            m = p.matcher(key);
            if(m.find()) continue;
            map2.put(key, map2.getOrDefault(key, 0) + 1);
            totalSum++;
        }
        int interCnt = 0;
        for(String key : map1.keySet()){
            if(map2.get(key) == null) continue;
            interCnt += Math.min(map2.get(key), map1.get(key));
        }

        int unionCnt = totalSum - interCnt;  // 합집합(
        if(unionCnt == 0) return 65536;
        return interCnt * 65536 / unionCnt;

    }

    public static void main(String[] args) {

    }
}

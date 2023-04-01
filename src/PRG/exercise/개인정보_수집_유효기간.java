package PRG.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 개인정보_수집_유효기간 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> arr = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        // 약관종류
        for (int i = 0; i < terms.length; i++) {
            map.put(terms[i].split(" ")[0], terms[i].split(" ")[1]);
        }

        int y = Integer.parseInt(today.split("\\.")[0]);
        int m = Integer.parseInt(today.split("\\.")[1]);
        int d = Integer.parseInt(today.split("\\.")[2]);

        // 개인정보 수집일자
        for (int i = 0; i < privacies.length; i++) {
            String date = privacies[i].split(" ")[0];
            int tmp = Integer.parseInt(map.get(privacies[i].split(" ")[1]))*28;

            int num = (y - Integer.parseInt(date.split("\\.")[0]))*28*12
                    + (m - Integer.parseInt(date.split("\\.")[1]))*28
                    + (d - Integer.parseInt(date.split("\\.")[2]));

            if (num >= tmp) {
                arr.add(i+1);
            }
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }
}

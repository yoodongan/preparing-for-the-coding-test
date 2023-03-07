package PRG.exercise;

import java.util.HashMap;
import java.util.HashSet;

public class 신고_결과_받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {id_list.length};
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, HashSet<String>> reported = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], i);
            reported.put(id_list[i], new HashSet<>());
        }

        for (int i = 0; i < report.length; i++) {
            String[] s = report[i].split(" ");
            reported.get(s[1]).add(s[0]);  // 피신고자가 '신고자'를 HashSet 으로 관리.
        }
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> reportSet = reported.get(id_list[i]);  // 신고한 사람 Set
            if (reportSet.size() >= k) {
                for (String s : reportSet) {
                    answer[map.get(s)]++;
                }
            }
        }
        return answer;
    }


}

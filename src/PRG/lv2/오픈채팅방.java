package PRG.lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class 오픈채팅방 {
    public static String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<record.length; i++) {
            String[] s = record[i].split(" ");
            if(s[0].equals("Enter")) {
                map.put(s[1], s[2]);  // id 와 이름 저장
                arr.add(s[1] +"님이 들어왔습니다.");
            } else if(s[0].equals("Leave")) {
                arr.add(s[1] +"님이 나갔습니다.");
            } else {
                map.put(s[1], s[2]);
            }
        }
        String[] answer = new String[arr.size()];
        for(int i=0; i<answer.length; i++) {
            String id = arr.get(i).substring(0, arr.get(i).indexOf("님"));
            String rest = arr.get(i).substring(arr.get(i).indexOf("님"));
            answer[i] = map.get(id) + rest;
        }
        return answer;
    }

}

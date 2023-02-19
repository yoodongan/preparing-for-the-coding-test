package PRG.lv2;

import java.util.ArrayList;

public class 오픈채팅방 {
    static class Record {
        String type;
        String id;
        String name;
        public Record(String t, String i, String n) {
            this.type = t;
            this.id = i;
            this.name = n;
        }
    }
    public static String[] solution(String[] record) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<Record> arr = new ArrayList<>();
        for (int i = 0; i < record.length; i++) {
            String[] s = record[i].split(" ");
            if(s.length == 2) {
                arr.add(new Record(s[0], s[1], " "));
            } else {
                arr.add(new Record(s[0], s[1], s[2]));
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).type.equals("Change")) {
                String targetId = arr.get(i).id;
                for (int j = 0; j < arr.size(); j++) {
                    if(arr.get(j).id.equals(targetId)) {
                        arr.get(j).name = arr.get(i).name;
                    }
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).type.equals("Enter")) {
                String message = arr.get(i).name +"님이 들어왔습니다.";
                result.add(message);
            }
            if (arr.get(i).type.equals("Leave")) {
                String message = arr.get(i).name +"님이 나갔습니다.";
                result.add(message);
            }
        }
        String[] answer = new String[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(solution(record));
    }
}

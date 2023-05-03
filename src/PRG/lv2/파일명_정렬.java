package PRG.lv2;

import java.util.ArrayList;
import java.util.Collections;

public class 파일명_정렬 {
    public String[] solution(String[] files) {
        String[] answer;
        ArrayList<File> arr = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            arr.add(new File(files[i]));
        }
        Collections.sort(arr);

        answer = new String[arr.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] += arr.get(i).head + arr.get(i).number + arr.get(i).tail;
        }
        return answer;
    }


    static class File implements Comparable<File>{
        String head;
        String number;
        String tail;

        /* 문자열 split 해서 File 생성자에 담아주기. */
        File(String str) {
            int idx = 0;
            while(true) {
                if(str.charAt(idx) >= '0' && str.charAt(idx) <= '9') break;
                idx++;
            }
            this.head = str.substring(0, idx);

            String tmp = "";
            while (true) {
                tmp += str.charAt(idx);
                idx++;
                if(idx >= str.length() || str.charAt(idx) < '0' || str.charAt(idx) > '9') break;
            }
            this.number = tmp;

            if(idx < str.length()) this.tail = str.substring(idx);

        }


        @Override
        public int compareTo(File f) {
            String str1 = this.head.toUpperCase();
            String str2 = f.head.toUpperCase();
            if (str1.equals(str2)) {
                int num1 = Integer.parseInt(number);
                int num2 = Integer.parseInt(f.number);
                return num1 - num2;
            }
            return str1.compareTo(str2);
        }
    }
}

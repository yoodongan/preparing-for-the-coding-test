package PRG.lv2;

public class 이진_변환_반복 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(s.length() > 1) {
            int number = 0;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '0') {
                    answer[1]++;
                } else {
                    number++;
                }
            }
            s = Integer.toBinaryString(number);
            answer[0]++;
        }

        return answer;
    }
}

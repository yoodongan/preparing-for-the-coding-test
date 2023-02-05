package PRG.lv2;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        for(int i=1; i<=yellow; i++) {
            if(yellow%i == 0) {
                int b = (i+2)*2 + (yellow/i)*2;
                if(brown == b) {
                    answer[0] = i+2;
                    answer[1] = yellow/i + 2;
                }
            }
        }
        return answer;
    }
}

package PRG.exercise;

public class x_만큼_간격이_있는 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for(int i=1; i<answer.length; i++) {
            answer[i] = answer[i-1] + x;
        }
        return answer;
    }
}

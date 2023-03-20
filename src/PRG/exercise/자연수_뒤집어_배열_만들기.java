package PRG.exercise;

public class 자연수_뒤집어_배열_만들기 {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        for(int i=0; i<answer.length; i++ ) {
            answer[i] = num.charAt(answer.length-1-i)-48;
        }

        return answer;
    }
}

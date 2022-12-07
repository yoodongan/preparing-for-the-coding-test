package PRG.exercise;

public class 문자열_나누기 {
    public static int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);
        int firstNum = 0;
        int secondNum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (first == s.charAt(i)) {
                firstNum++;
            } else {
                secondNum++;
            }
            if (firstNum == secondNum) {
                answer++;
                first = s.charAt(i);
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("banana"));
    }
}

package PRG.exercise;

public class 문자열_나누기 {
    public static int solution(String s) {
        int answer = 0;
        char first = ' ';
        int num1 = 0;
        int num2 = 0;
        for(char c : s.toCharArray()) {
            if(first == ' ') first = c;
            if(first == c) num1++;
            else num2++;
            if(num1 == num2) {
                answer++;
                first = ' ';
            }
        }
        if(first != ' ') answer++;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("banana"));
    }
}

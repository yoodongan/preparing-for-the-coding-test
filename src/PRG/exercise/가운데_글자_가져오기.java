package PRG.exercise;

public class 가운데_글자_가져오기 {
    public static String solution(String s) {
        String answer = "";
        int length = s.length();
        int index = 0;
        if(length%2 != 0) {
            index = length/2;
            return String.valueOf(s.charAt(index));
        }
        else {
            index = length/2 -1;
            for (int i = index; i <= index + 1; i++) {
                answer += s.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("qwer"));
    }
}

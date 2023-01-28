package PRG.exercise;

public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                c = (char)((c - 65 + n) % 26 + 65);
            } else if (Character.isLowerCase(c)) {
                c = (char)((c - 97 + n) % 26 + 97);
            }
            answer += c;
        }
        return answer;
    }
}

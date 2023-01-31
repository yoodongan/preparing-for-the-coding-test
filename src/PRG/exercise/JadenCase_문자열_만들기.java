package PRG.exercise;

public class JadenCase_문자열_만들기 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");

        for(int i = 0; i < str.length; i++){
            if(str[i].length() == 0) answer += " ";
            else {
                answer += str[i].substring(0, 1).toUpperCase();
                answer += str[i].substring(1, str[i].length()).toLowerCase();
                answer += " ";
            }
        }
        if(s.substring(s.length() -1, s.length()).equals(" ")) return answer;
        return answer.substring(0, answer.length() - 1);
    }
}

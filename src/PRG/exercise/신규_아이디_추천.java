package PRG.exercise;

// 정규표현식 문제.
public class 신규_아이디_추천 {
    public String solution(String new_id) {
        // 1단계.
        String answer = new_id.toLowerCase();
        // 2단계. -, _, ., 알파벳 소문자, 숫자 를 제외한 모든 문자 제외.
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        // 3단계. '.' 이 2번 나오면, '.' 하나로 치환
        answer = answer.replaceAll("[.]{2,}", ".");
        // 4단계  '.' 이 처음이나 마지막에 위치하면 제거
        answer = answer.replaceAll("^[.]|[.]$", "");
        // 5단계
        if (answer.equals("")) {
            answer = "a";
        }
        // 6단계
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$","");
        }
        // 7단계
        if (answer.length() <= 2) {
            while(answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}

package PRG.exercise;

// 2021 카카오 채용연계형 인턴십
public class 숫자_문자열과_영단어 {
    public static int solution(String s) {
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < num.length; i++) {
            s = s.replace(str[i], num[i]);
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String str = "23four5six7";
        System.out.println(solution(str));
    }
}

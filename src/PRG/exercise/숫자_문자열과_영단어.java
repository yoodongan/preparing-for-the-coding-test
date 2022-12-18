package PRG.exercise;

// 2021 카카오 채용연계형 인턴십
public class 숫자_문자열과_영단어 {
    public static int solution(String s) {
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        char[] sToChar = s.toCharArray();
        StringBuilder answer = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < sToChar.length; i++) {
            if((sToChar[i] >= 48 && sToChar[i] <=57)) {
                if (tmp.length() > 0) {
                    for (int j = 0; j < str.length; j++) {
                        if (str[j].equals(tmp.toString())) {
                            int index = j;
                            answer.append(index);
                        }
                    }
                    tmp.setLength(0);
                }
                answer.append(sToChar[i]);


            } else {
                tmp.append(sToChar[i]);
            }
        }
        return Integer.parseInt(String.valueOf(answer));
    }

    public static void main(String[] args) {
        String str = "23four5six7";
        System.out.println(solution(str));
    }
}

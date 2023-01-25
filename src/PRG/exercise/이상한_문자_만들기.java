package PRG.exercise;

public class 이상한_문자_만들기 {
    public static String solution(String s) {
        String[] str = s.split("");
        int idx = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(" ")) idx = 0;
            else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else {
                str[i] = str[i].toLowerCase();
                idx++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String st : str) {
            sb.append(st);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "try hello world";
        System.out.println(solution(str));
    }
}

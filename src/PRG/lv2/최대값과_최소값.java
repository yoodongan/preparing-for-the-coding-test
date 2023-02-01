package PRG.lv2;

public class 최대값과_최소값 {
    public static String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String s1 : str) {
            max = Math.max(Integer.parseInt(s1), max);
            min = Math.min(Integer.parseInt(s1), min);
        }
        answer += String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }

    public static void main(String[] args) {
        String s = "1 2 3 4";
        System.out.println(solution(s));
    }
}

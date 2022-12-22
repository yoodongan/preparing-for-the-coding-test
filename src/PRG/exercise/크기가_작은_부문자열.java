package PRG.exercise;

public class 크기가_작은_부문자열 {
    public static int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        long subNumber = 0;
        int lastIndex = t.length() - p.length()+1; // 반복문에서의 t의 마지막 인덱스 + 1
        String t2 = t + " ";
        for (int i = 0; i < lastIndex; i++) {
            subNumber = Long.parseLong(t2.substring(i, i + length));
            if (subNumber <= Long.parseLong(p)) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        String t = "21421341";
        String p = "13";
        System.out.println(solution(t, p));
    }
}

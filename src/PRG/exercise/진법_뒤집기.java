package PRG.exercise;

public class 진법_뒤집기 {
    public static StringBuilder sb = new StringBuilder();
    public static int solution(int n) {
        int answer = 0;
        dfs(n);
        char[] chars = sb.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            answer += Math.pow(3, i) * (chars[i]-48);
        }
        return answer;
    }
    public static void dfs(int number) {
        if(number == 0) return;
        else  {
            dfs(number/3);
            sb.append(number % 3);
        }
    }

    public static void main(String[] args) {
        int n = 45;
        System.out.println(solution(45));
    }
}

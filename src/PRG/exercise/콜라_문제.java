package PRG.exercise;

public class 콜라_문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(true) {
            if(n<a) break;

            answer += (n/a * b);
            int tmp = n%a;
            n = (n/a) * b + tmp;
        }
        return answer;

    }
}

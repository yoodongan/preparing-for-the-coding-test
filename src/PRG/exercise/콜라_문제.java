package PRG.exercise;

public class 콜라_문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int tmp = 0;
        while(true) {
            if(n % a != 0) tmp+=n%a;
            n = n/a;
            answer += (n * b);
            if(n == 0) break;
        }

        if (tmp > 0) {
            answer += (tmp/a) * b;
        }
        return answer;
    }
}

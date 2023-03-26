package PRG.exercise;

//약수 개수 구하기 문제.
public class 기사단원의_무기 {
    public int count(int number) {
        int cnt = 0;
        for(int i=1; i<=number/2; i++) {
            if(number % i ==0) cnt++;
        }
        return cnt+1;
    }
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] ans = new int[number+1];

        for(int i=1; i<=number; i++) {
            ans[i] = count(i);
            if(ans[i] > limit) answer+=power;
            else answer+=ans[i];
        }
        return answer;
    }
}

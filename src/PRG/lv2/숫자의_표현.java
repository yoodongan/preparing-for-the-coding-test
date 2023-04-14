package PRG.lv2;

public class 숫자의_표현 {
    public int solution(int n) {
        int answer = 1;
        for(int i=1; i<=n/2; i++) {
            int sum = i;
            for(int j=i+1; sum < n; j++) {
                sum += j;
            }
            if(sum == n) answer++;
        }
        return answer;
    }
}

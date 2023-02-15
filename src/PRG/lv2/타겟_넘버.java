package PRG.lv2;

public class 타겟_넘버 {
    int[] numbers;
    int target;
    int answer = 0;

    void dfs(int L, int k) {
        if(L==numbers.length) {
            if(k==target) {
                answer++;
            }
            return;
        } else {
            dfs(L+1, k + numbers[L]);
            dfs(L+1, k - numbers[L]);
        }
    }

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        dfs(0, 0);
        return answer;
    }
}

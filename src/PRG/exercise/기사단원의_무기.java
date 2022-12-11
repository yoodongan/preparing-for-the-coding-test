package PRG.exercise;

//약수 개수 구하기 문제.
public class 기사단원의_무기 {
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (getNumCount(i) <= limit) {
                answer += getNumCount(i);
             } else {
                answer += power;
            }
        }
        return answer;
    }
    public static int getNumCount(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if(i*i == n) count++;
            else if(n%i == 0) count+=2;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(solution(5, 3, 2));
    }
}

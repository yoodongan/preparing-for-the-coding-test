package PRG.exercise;

public class 콜라츠_추측 {
    public int solution(int num) {
        long number = num;
        int answer = 0;

        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
            } else if (number % 2 != 0) {
                number = number*3 +1;
            }
            answer++;

            if (answer > 500) return -1;
        }

        return answer;
    }
}

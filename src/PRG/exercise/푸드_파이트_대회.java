package PRG.exercise;

public class 푸드_파이트_대회 {
    public static String solution(int[] food) {
        String answer = "";
        int number = 0;
        for (int i = 1; i < food.length; i++) {
            number = food[i]/2;
            while (number-- > 0) {
                answer += String.valueOf(i);
            }
        }
        StringBuffer sb = new StringBuffer(answer);
        String reversedStr = sb.reverse().toString();
        answer+="0"+reversedStr;
        return answer;
    }

    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
        System.out.println(solution(food));
    }
}


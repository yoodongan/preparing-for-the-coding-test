package PRG.exercise;

public class _2016년 {
    public static String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
    public static int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};

    public static String solution(int a, int b) {
        int datePlus = 0;
        for (int i = 0; i < a - 1; i++) {
            datePlus += date[i];   // '월' 날짜 모두 더해주기
        }
        datePlus += b -1;  // 날짜 더해주기
        return day[datePlus % 7];
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }

}

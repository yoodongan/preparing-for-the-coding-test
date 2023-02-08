package PRG.lv2;

public class 예상_대진표 {
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        while (a!=b) {
            a = a/2;
            b = b/2+1;
        }
        answer++;
        return answer;
    }


}

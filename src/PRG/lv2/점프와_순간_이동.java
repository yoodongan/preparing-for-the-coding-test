package PRG.lv2;

public class 점프와_순간_이동 {
    public static int solution(int n) {
        int ans = 0;
        while(n != 0) {
            if(n%2 == 0) n/=2;
            else {
                n-=1;
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}

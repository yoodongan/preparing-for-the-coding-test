package PRG.exercise;

public class 소수_만들기 {
    public static int answer = 0;
    public static void dfs(int L, int sum, int s, int[] nums) {
        if(L == 3) {
            for (int i = 2; i * i <= sum; i++) {
                if(sum % i ==0) return;
            }
            answer++;
        } else {
            for(int i=s; i<nums.length; i++) {
                dfs(L+1, sum+nums[i], i+1, nums);
            }
        }
    }
    public int solution(int[] nums) {
        dfs(0, 0, 0, nums);
        return answer;
    }
}

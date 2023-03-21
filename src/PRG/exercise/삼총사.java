package PRG.exercise;

public class 삼총사 {
    static int answer = 0;
    static int[] numbers;
    static boolean[] visited;


    public int solution(int[] numbers) {
        boolean[] visited = new boolean[numbers.length];
        this.numbers = numbers;
        this.visited = new boolean[numbers.length];
        dfs(0, 0, 0);
        return answer;
    }

    private void dfs(int start, int L, int sum) {
        if(L == 3) {
            if(sum == 0) answer++;
            return;
        }

        for(int i=start; i<numbers.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(i+1, L+1, sum+numbers[i]);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        삼총사 ans = new 삼총사();
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println(ans.solution(number));
    }
}

package PRG.lv2;

public class 피로도 {
    int k;
    int[][] d;
    int max = Integer.MIN_VALUE;
    int[] check;

    public void dfs(int L, int k) {
        for(int i=0; i<check.length; i++) {
            if(check[i] == 0 && d[i][0] <= k) {
                check[i] = 1;
                dfs(L+1, k-d[i][1]);
                check[i] = 0;
            }
        }
        max = Math.max(L, max);
    }

    public int solution(int rest, int[][] dungeons) {
        k = rest;
        d = dungeons;
        check = new int[dungeons.length];
        dfs(0, k);
        return max;
    }
}

package PRG.lv2;

public class 피로도 {
    int answer = 0;
    int[][] arr;
    int present;
    int[] check;
    int max = Integer.MIN_VALUE;

    public void dfs(int L, int rest) {
        for (int i = 0; i < arr.length; i++) {
            if(rest >= arr[i][0] && check[i] != 1) {
                check[i] = 1;
                dfs(L+1, rest-arr[i][1]);
                check[i] = 0;
            }
        }
        max = Math.max(max, L);
    }
    public int solution(int k, int[][] dungeons) {
        arr = dungeons.clone();
        present = k;
        check = new int[dungeons.length];
        dfs(0, present);

        return max;
    }
}

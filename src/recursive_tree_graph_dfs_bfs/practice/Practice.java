package recursive_tree_graph_dfs_bfs.practice;

public class Practice {
    static int answer;  // 조합의 답.
    static int[][] arr = new int[34][34];  // memoization 을 위한 배열. ~33까지 써야 하므로.
    public static int dfs(int n, int r) {
        if(arr[n][r] > 0) return arr[n][r];
        if(n == r || r == 1) return 1;
        else {
            return arr[n][r] = dfs(n-1, r-1) + dfs(n-1, r);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        System.out.println(dfs(n, r));
    }
}
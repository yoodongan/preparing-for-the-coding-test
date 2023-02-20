package recursive_tree_graph_dfs_bfs.practice;

public class Practice {
    int n;
    int[] arr;
    int m;
    int min = Integer.MAX_VALUE;

    public void dfs(int L, int sum) {
        if(L >= min) return;
        if(sum == m) {
            min = Math.min(min, L);
        }
        else {
            for (int i = 0; i < n; i++) {
                dfs(L + 1, sum + arr[i]);
            }
        }
    }
    public void solution(int n, int[] arr, int m) {
        this.n = n;
        this.arr = arr;
        this.m = m;
        dfs(0, 0);
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1,2,5};
        int m = 15;
        Practice p = new Practice();
        p.solution(n, arr, m);
        System.out.println(p.min);
    }

}
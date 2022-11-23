package recursive_tree_graph_dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부분집합_구하기_6 {
    public static int number;
    public static int[] check;
    public static void DFS(int L) {
        if(L == number+1) {
            String tmp = "";
            for (int i = 1; i <=number; i++) {
                if (check[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);

            }
        } else {
            check[L] = 1;
            DFS(L+1);
            check[L] = 0;
            DFS(L+1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(br.readLine());
        check = new int[number + 1];
        DFS(1);

    }
}

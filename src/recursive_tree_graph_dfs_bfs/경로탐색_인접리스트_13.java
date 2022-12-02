package recursive_tree_graph_dfs_bfs;

import java.util.ArrayList;
import java.util.Scanner;

public class 경로탐색_인접리스트_13 {
    static int n, m, answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;
    public void dfs(int v){
        if(v==n) answer++;
        else{
            for(int nv : graph.get(v)){
                if(check[nv]==0){
                    check[nv]=1;
                    dfs(nv);
                    check[nv]=0;
                }
            }
        }
    }

    public static void main(String[] args){
        경로탐색_인접리스트_13 T = new 경로탐색_인접리스트_13();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        check =new int[n+1];
        for(int i=0; i<m; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph.get(a).add(b);
        }
        check[1]=1;
        T.dfs(1);
        System.out.println(answer);
    }
}

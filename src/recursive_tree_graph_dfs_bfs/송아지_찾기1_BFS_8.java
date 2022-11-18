package recursive_tree_graph_dfs_bfs;

import java.util.*;
class 송아지_찾기1_BFS_8 {
    int answer=0;
    int[] dis={1, -1, 5};
    int[] check;
    Queue<Integer> queue = new LinkedList<>();
    public int BFS(int s, int e){
        check =new int[10001];
        check[s]=1;
        queue.offer(s);
        int level=0;
        while(!queue.isEmpty()){
            int len= queue.size();
            for(int i=0; i<len; i++){
                int x = queue.poll();
                for(int j=0; j<3; j++){
                    int nx=x+dis[j];
                    if(nx==e){
                        return level+1;
                    }
                    if(nx>=1 && nx<=10000 && check[nx]==0){
                        check[nx]=1;
                        queue.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args){
        송아지_찾기1_BFS_8 main = new 송아지_찾기1_BFS_8();
        Scanner kb = new Scanner(System.in);
        int s=kb.nextInt();
        int e=kb.nextInt();
        System.out.println(main.BFS(s, e));
    }
}
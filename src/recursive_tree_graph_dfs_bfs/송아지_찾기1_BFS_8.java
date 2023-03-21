package recursive_tree_graph_dfs_bfs;

import java.util.*;
class 송아지_찾기1_BFS_8 {
    static int[] arr = {1, -1, 5};
    static int level = 0;
    static int[] check;
    public int BFS(int s, int e) {
//        Queue<Integer> queue = new LinkedList<>();
//        check = new int[10001];
//        check[s] = 1;
//        queue.offer(s);
//        while(!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                int current = queue.poll();
//                for(int j=0; )
//
//
//            }
//        }

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
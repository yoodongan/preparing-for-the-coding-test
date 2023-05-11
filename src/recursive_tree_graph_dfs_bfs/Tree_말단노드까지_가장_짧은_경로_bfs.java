package recursive_tree_graph_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Tree_말단노드까지_가장_짧은_경로_bfs {
    public static int bfs(Node3 root) {
        Queue<Node3> queue = new LinkedList();
        queue.offer(root);
        int level = 0;

        while(!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node3 current = queue.poll();
                if (current.lt == null && current.rt == null) {
                    return level;
                }
                if(current.lt != null) queue.add(current.lt);
                if(current.rt != null) queue.add(current.rt);
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Node3 root = new Node3(1);
        root.lt = new Node3(2);
        root.rt=new Node3(3);
        root.lt.lt=new Node3(4);
        root.lt.rt=new Node3(5);
        System.out.println(bfs(root));
    }
}

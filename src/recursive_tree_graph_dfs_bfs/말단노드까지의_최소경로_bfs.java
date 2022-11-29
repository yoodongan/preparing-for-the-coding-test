package recursive_tree_graph_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class 말단노드까지의_최소경로_bfs {
    Node3 root;
    public static int bfs(Node3 node) {
        Queue<Node3> queue = new LinkedList();
        queue.offer(node);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node3 currentNode = queue.poll();
                if(currentNode.lt == null && currentNode.rt == null) return level;
                if(currentNode.lt != null) queue.offer(currentNode.lt);
                if(currentNode.rt != null) queue.offer(currentNode.rt);
            }
            level++;
        }
        return 0;
    }


    public static void main(String[] args) {
        말단노드까지의_최소경로_bfs tree = new 말단노드까지의_최소경로_bfs();
        tree.root=new Node3(1);
        tree.root.lt=new Node3(2);
        tree.root.rt=new Node3(3);
        tree.root.lt.lt=new Node3(4);
        tree.root.lt.rt=new Node3(5);
        System.out.println(bfs(tree.root));
    }
}

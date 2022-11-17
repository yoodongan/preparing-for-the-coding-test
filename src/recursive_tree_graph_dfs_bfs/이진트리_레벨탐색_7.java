package recursive_tree_graph_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {
    public int data;
    Node2 lt, rt;
    public Node2(int value) {
        this.data = value;
        lt=rt=null;
    }
}

public class 이진트리_레벨탐색_7 {
    Node2 root;
    public void DFS(Node2 root) {
        Queue<Node2> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()) {
            System.out.print(level +" : ");
            int len = queue.size();
            for(int i=0; i< len; i++) {
                Node2 currentNode = queue.poll();
                System.out.print(currentNode.data + " ");
                if(currentNode.lt != null) queue.offer(currentNode.lt);
                if(currentNode.rt != null) queue.offer(currentNode.rt);
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        이진트리_레벨탐색_7 tree = new 이진트리_레벨탐색_7();
        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        tree.root.rt.lt = new Node2(6);
        tree.root.rt.rt = new Node2(7);
        tree.DFS(tree.root);
    }
}

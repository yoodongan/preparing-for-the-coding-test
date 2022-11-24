package recursive_tree_graph_dfs_bfs.practice;


import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int data;
    Node(int val) {
        this.data = val;
    }
    public Node lt, rt;
}

public class bfs_7 {
    Node root;
    public void DFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()) {
            System.out.print(level +" : ");
            int len = queue.size();
            for(int i=0; i< len; i++) {
                Node currentNode = queue.poll();
                System.out.print(currentNode.data + " ");
                if(currentNode.lt != null) queue.offer(currentNode.lt);
                if(currentNode.rt != null) queue.offer(currentNode.rt);
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        bfs_7 tree = new bfs_7();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
